package com.uniquindio.trabajogrado.SIODUQ.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.util.IOUtils;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.ReadChannel;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.net.HttpHeaders;
import com.google.firebase.cloud.StorageClient;
import com.uniquindio.trabajogrado.SIODUQ.logica.CredencialesFirebase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.channels.Channels;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.jdbc.ReaderInputStream;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class AlmacenamientoFirebase {

    private StorageOptions opcionesAlmacenamiento;
    private String nombreCanal;
    private String idProyecto;

    public AlmacenamientoFirebase() {
    }

    public void inicializarFirebase() throws FileNotFoundException, IOException {
        Properties propiedades = new Properties();
        propiedades.load(new FileReader("src\\main\\resources\\application.properties"));

        nombreCanal = propiedades.getProperty("FIREBASE_BUCKET_NAME");
        idProyecto = propiedades.getProperty("FIREBASE_PROJECT_ID");

        InputStream cuentaServicio = crearCredencialesFirebase();
        this.opcionesAlmacenamiento = StorageOptions.newBuilder()
                .setProjectId(idProyecto)
                .setCredentials(GoogleCredentials.fromStream(cuentaServicio)).build();

    }

    private File convertirMultipartesArchivo(MultipartFile archivo) throws FileNotFoundException, IOException {
        File archivoConvertido = new File(Objects.requireNonNull(archivo.getOriginalFilename()));
        FileOutputStream fos = new FileOutputStream(archivoConvertido);
        fos.write(archivo.getBytes());
        fos.close();

        return archivoConvertido;
    }

    private String generarNombreArchivo(MultipartFile archivo) {
        return Objects.requireNonNull(archivo.getOriginalFilename()).replace(" ", "_");
    }

    public String[] cargarArchivo(MultipartFile archivo) throws IOException {
        inicializarFirebase();

        File archivoCargar = convertirMultipartesArchivo(archivo);
        String nombreArchivo = generarNombreArchivo(archivo);

        Storage almacenamiento = opcionesAlmacenamiento.getService();
        Map<String, String> map = new HashMap<>();
        map.put("firebaseStorageDownloadTokens", UUID.randomUUID().toString());

        BlobId blobId = BlobId.of(nombreCanal, nombreArchivo);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setMetadata(map).setContentType(archivo.getContentType()).build();
        almacenamiento.create(blobInfo, archivo.getBytes());

        log.info("Archivo " + archivoCargar.toPath() + " se cargo al bucket " + nombreCanal + " como " + nombreArchivo);

        return new String[]{"urlArchivo", nombreArchivo};
    }

    public ResponseEntity<Object> descargarArchivo(String nombreArchivo) throws IOException {
        Storage almacenamiento = opcionesAlmacenamiento.getService();

        Blob blob = almacenamiento.get(BlobId.of(nombreCanal, nombreArchivo));
        ReadChannel lector = blob.reader();
        InputStream flujoEntrada = Channels.newInputStream(lector);

        byte[] contenido = null;
        log.info("Descarga del archivo EXITOSA");

        contenido = IOUtils.deserialize(flujoEntrada);
        final ByteArrayResource arregloRecursos = new ByteArrayResource(contenido);

        return ResponseEntity.ok()
                .contentLength(contenido.length)
                .header("Content-type", "application/octet-stream")
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + nombreArchivo + "\"")
                .body(arregloRecursos);
    }

    private InputStream crearCredencialesFirebase() throws FileNotFoundException, IOException {
        CredencialesFirebase credenciasFirebase = new CredencialesFirebase();

        Properties propiedades = new Properties();
        propiedades.load(new FileReader("src\\main\\resources\\application.properties"));

        String llavePrivada = propiedades.getProperty("FIREBASE_PRIVATE_KEY").replace("\\n", "\n");

        credenciasFirebase.setType(propiedades.getProperty("FIREBASE_TYPE"));
        credenciasFirebase.setProject_id(idProyecto);
        credenciasFirebase.setPrivate_key_id(propiedades.getProperty("FIREBASE_PRIVATE_KEY_ID"));
        credenciasFirebase.setPrivate_key(llavePrivada);
        credenciasFirebase.setClient_email(propiedades.getProperty("FIREBASE_CLIENT_EMAIL"));
        credenciasFirebase.setClient_id(propiedades.getProperty("FIREBASE_CLIENT_ID"));
        credenciasFirebase.setAuth_uri(propiedades.getProperty("FIREBASE_AUTH_URI"));
        credenciasFirebase.setToken_uri(propiedades.getProperty("FIREBASE_TOKEN_URI"));
        credenciasFirebase.setAuth_provider_x509_cert_url(propiedades.getProperty("FIREBASE_AUTH_PROVIDER_X509_CERT_URL"));
        credenciasFirebase.setClient_x509_cert_url(propiedades.getProperty("FIREBASE_CLIENT_X509_CERT_URL"));

        ObjectMapper mapeado = new ObjectMapper();
        String json = mapeado.writeValueAsString(credenciasFirebase);
        StringReader lectorJson = new StringReader(json);

        InputStream respuesta = new ReaderInputStream(lectorJson);
        System.out.println("Respuesta credenciales: " + respuesta.toString());
        return respuesta;

    }
}
