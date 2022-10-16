/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.uniquindio.trabajogrado.SIODUQ.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author natal
 */
public class DocumentoTest {
    
    public DocumentoTest() {
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
     * Test of getIdDocumento method, of class Documento.
     */
    @Test
    public void testGetIdDocumento() {
        System.out.println("getIdDocumento");
        Documento instance = new Documento();
        Integer expResult = null;
        Integer result = instance.getIdDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolicitud method, of class Documento.
     */
    @Test
    public void testGetSolicitud() {
        System.out.println("getSolicitud");
        Documento instance = new Documento();
        Solicitud expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Documento.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Documento instance = new Documento();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccionURL method, of class Documento.
     */
    @Test
    public void testGetDireccionURL() {
        System.out.println("getDireccionURL");
        Documento instance = new Documento();
        String expResult = "";
        String result = instance.getDireccionURL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCarga method, of class Documento.
     */
    @Test
    public void testGetFechaCarga() {
        System.out.println("getFechaCarga");
        Documento instance = new Documento();
        String expResult = "";
        String result = instance.getFechaCarga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdDocumento method, of class Documento.
     */
    @Test
    public void testSetIdDocumento() {
        System.out.println("setIdDocumento");
        Integer idDocumento = null;
        Documento instance = new Documento();
        instance.setIdDocumento(idDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolicitud method, of class Documento.
     */
    @Test
    public void testSetSolicitud() {
//        System.out.println("setSolicitud");
//        Solicitud solicitud = null;
//        Documento instance = new Documento();
//        instance.setSolicitud(solicitud);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Documento.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Documento instance = new Documento();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccionURL method, of class Documento.
     */
    @Test
    public void testSetDireccionURL() {
        System.out.println("setDireccionURL");
        String direccionURL = "";
        Documento instance = new Documento();
        instance.setDireccionURL(direccionURL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCarga method, of class Documento.
     */
    @Test
    public void testSetFechaCarga() {
        System.out.println("setFechaCarga");
        String fechaCarga = "";
        Documento instance = new Documento();
        instance.setFechaCarga(fechaCarga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Documento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Documento instance = new Documento();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Documento.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Documento instance = new Documento();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Documento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Documento instance = new Documento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Documento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Documento instance = new Documento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
