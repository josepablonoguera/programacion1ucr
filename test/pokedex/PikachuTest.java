/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pokedex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ucr
 */
public class PikachuTest {
    
    public PikachuTest() {
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
     * Test of atacar method, of class Pikachu.
     */
    @Test
    public void testAtacar() {
        System.out.println("atacar");
        Pikachu instance = new Pikachu();
        instance.atacar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of defender method, of class Pikachu.
     */
    @Test
    public void testDefender() {
        System.out.println("defender");
        Pikachu instance = new Pikachu();
        instance.defender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirNivel method, of class Pikachu.
     */
    @Test
    public void testSubirNivel() {
        System.out.println("subirNivel");
        Pikachu instance = new Pikachu();
        instance.subirNivel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pikachu.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pikachu instance = new Pikachu();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proteccionVida1 method, of class Pikachu.
     */
    @Test
    public void testProteccionVida1() {
        System.out.println("proteccionVida1");
        Pikachu instance = new Pikachu();
        int expResult = 0;
        int result = instance.proteccionVida1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirAtaqueElectrico method, of class Pikachu.
     */
    @Test
    public void testSubirAtaqueElectrico() {
        System.out.println("subirAtaqueElectrico");
        int valorRayo = 0;
        Pikachu instance = new Pikachu();
        instance.subirAtaqueElectrico(valorRayo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
