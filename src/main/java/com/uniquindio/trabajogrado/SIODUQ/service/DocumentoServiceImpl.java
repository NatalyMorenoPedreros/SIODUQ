package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IDocumentoDao;
import com.uniquindio.trabajogrado.SIODUQ.model.Documento;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class DocumentoServiceImpl implements DocumentoService{

    @Autowired
    private IDocumentoDao documentoDao;
    
    @Override
    public List<Documento> listarDocumentos() {
        return (List<Documento>) documentoDao.findAll();
    }

    @Override
    public void guardar(Documento documento) {
        documentoDao.save(documento);
    }

    @Override
    public void eliminar(Documento documento) {
        documentoDao.delete(documento);
    }

    @Override
    public Documento encontrarDocumento(Documento documento) {
        return documentoDao.findById(documento.getIdDocumento()).orElse(null);
    }

    @Override
    public void persistirDocumento(Solicitud solicitud, MultipartFile archivo){
        AlmacenamientoFirebase almacenamiento = new AlmacenamientoFirebase();
        
        try {
            String[] variables = almacenamiento.cargarArchivo(archivo);
            
            Documento documento = new Documento();
            documento.setSolicitud(solicitud);
            documento.setDireccionURL(variables[0]);
            documento.setNombre(variables[1]);
            documento.setFechaCarga(new Timestamp(System.currentTimeMillis()));
            
            guardar(documento);
            
        } catch (IOException ex) {
            log.error("Sucede un error con la carga del documento");
        }
        
    }
}
