package com.uniquindio.trabajogrado.SIODUQ.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
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
        System.out.println("cargarArchivo");
        File file = new File("src\\main\\resources\\test.txt");
        MultipartFile archivo = new MockMultipartFile("test.txt", "test.txt", "text/plain", new FileInputStream(file));
        AlmacenamientoFirebase instance = new AlmacenamientoFirebase();
        instance.inicializarFirebase();
        String[] expResult = {"urlArchivo", "test.txt"};
        String[] result = instance.cargarArchivo(archivo, "prueba");
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descargarArchivo method, of class AlmacenamientoFirebase.
     */
    @Test
    public void testDescargarArchivo() throws Exception {
        System.out.println("descargarArchivo");
        String nombreArchivo = "test.txt";
        AlmacenamientoFirebase instance = new AlmacenamientoFirebase();
        instance.inicializarFirebase();
        ResponseEntity expResult = new ResponseEntity(HttpStatus.OK);
       
        ResponseEntity result = instance.descargarArchivo(nombreArchivo);
        System.out.println(result.getBody());
        assertEquals(expResult.getStatusCode(), result.getStatusCode());
        //fail("The test case is a prototype.");
    }
    
}
