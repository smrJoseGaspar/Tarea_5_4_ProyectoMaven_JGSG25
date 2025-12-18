/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.tarea54.jgsg25;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jg.sanchezgarcia
 */
public class TrianguloTest {
    
    public TrianguloTest() {
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
     * Test of getBase method, of class Triangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangulo instance = new Triangulo(2, 5);
        int expResult = 2;
        int result = instance.getBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Triangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        int base = 0;
        Triangulo instance = null;
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Triangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Triangulo instance = null;
        int expResult = 0;
        int result = instance.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Triangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        int altura = 0;
        Triangulo instance = null;
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Triangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangulo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea method, of class Triangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Triangulo instance = null;
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPerimetro method, of class Triangulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Triangulo instance = null;
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
