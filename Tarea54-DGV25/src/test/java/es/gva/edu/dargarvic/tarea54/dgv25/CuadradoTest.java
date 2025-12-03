/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.gva.edu.dargarvic.tarea54.dgv25;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dario
 */
public class CuadradoTest {
    
    public CuadradoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of toString method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Cuadrado instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLado method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testGetLado() {
        System.out.println("getLado");
        Cuadrado instance = null;
        int expResult = 0;
        int result = instance.getLado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLado method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testSetLado() {
        System.out.println("setLado");
        int lado = 0;
        Cuadrado instance = null;
        instance.setLado(lado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Cuadrado instance = null;
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPerimetro method, of class Cuadrado.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Cuadrado instance = null;
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
