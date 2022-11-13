package com.uniquindio.trabajogrado.SIODUQ.service;

import java.io.File;
import java.io.FileInputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

@SpringBootTest
public class AlmacenamientoFirebaseTest {
    
    public AlmacenamientoFirebaseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cargarArchivo method, of class AlmacenamientoFirebase.
     */
    @Test
    public void testCargarArchivo() throws Exception {
        System.out.println("Prueba de carga de archivo test.txt");
        File file = new File("src\\main\\resources\\test.txt");
        MultipartFile archivo = new MockMultipartFile("test.txt", "test.txt", "text/plain", new FileInputStream(file));
        AlmacenamientoFirebase instance = new AlmacenamientoFirebase();
        instance.inicializarFirebase();
        String[] expResult = {"urlArchivo", "test.txt"};
        String[] result = instance.cargarArchivo(archivo, "prueba");
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of descargarArchivo method, of class AlmacenamientoFirebase.
     */
    @Test
    public void testDescargarArchivo() throws Exception {
        System.out.println("Descarga de archivo test.txt");
        String nombreArchivo = "test.txt";
        AlmacenamientoFirebase instance = new AlmacenamientoFirebase();
        instance.inicializarFirebase();
        ResponseEntity expResult = new ResponseEntity(HttpStatus.OK);
       
        ResponseEntity result = instance.descargarArchivo(nombreArchivo);
        assertEquals(expResult.getStatusCode(), result.getStatusCode());
    }
    
}
