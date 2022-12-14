package com.uniquindio.trabajogrado.SIODUQ.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilidadesTest {

    public UtilidadesTest() {
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
     * Test of calcularPuntajeArticulos method, of class Utilidades.
     */
    @Test
    public void testCalcularPuntajeArticulos() {
        System.out.println("Calculos de puntaje de articulos");
        String categoria = "A1";
        String expResult = "15";
        String result = Utilidades.calcularPuntajeArticulos(categoria);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularPuntajeAudiovisual method, of class Utilidades.
     */
    @Test
    public void testCalcularPuntajeAudiovisual() {
        System.out.println("Calculos de puntaje de Audiovisual");
        String difusion = "Nacional";
        String expResult = "12";
        String result = Utilidades.calcularPuntajeAudiovisual(difusion);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularPuntajePonencia method, of class Utilidades.
     */
    @Test
    public void testCalcularPuntajePonencia() {
        System.out.println("Calculos de puntaje de Ponencia");
        String difusion = "Nacional";
        String expResult = "48";
        String result = Utilidades.calcularPuntajePonencia(difusion);
        assertEquals(expResult, result);
    }

    /**
     * Test of realizarCodigo method, of class Utilidades.
     */
    @Test
    public void testRealizarCodigo() {
        System.out.println("Realizar codigo que va a una solicitud");
        long numeroSolicitudes = 2L;
        String tipoSolicitud = "PRODUCTIVIDAD ACADEMICA";
        String expResult = "PA3";
        String result = Utilidades.realizarCodigo(numeroSolicitudes, tipoSolicitud);
        assertEquals(expResult, result);
    }

}
