/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package myKalkulator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usernob
 */
public class KalkulatorTest {
    
    public KalkulatorTest() {
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
     * Test of precedence method, of class Kalkulator.
     */
    @Test
    public void testPrecedence() {
        System.out.println("precedence");
        char c = ' ';
        int expResult = 0;
        int result = Kalkulator.precedence(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infixToPostfix method, of class Kalkulator.
     */
    @Test
    public void testInfixToPostfix() {
        System.out.println("infixToPostfix");
        String infix = "";
        String expResult = "";
        String result = Kalkulator.infixToPostfix(infix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluatePostfix method, of class Kalkulator.
     */
    @Test
    public void testEvaluatePostfix() {
        System.out.println("evaluatePostfix");
        String postfix = "";
        double expResult = 0.0;
        double result = Kalkulator.evaluatePostfix(postfix);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayOutput method, of class Kalkulator.
     */
    @Test
    public void testDisplayOutput() {
        System.out.println("displayOutput");
        String num = "";
        Kalkulator instance = new Kalkulator();
        instance.displayOutput(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToInfix method, of class Kalkulator.
     */
    @Test
    public void testAddToInfix() {
        System.out.println("addToInfix");
        String str = "";
        boolean isOperator = false;
        Kalkulator instance = new Kalkulator();
        instance.addToInfix(str, isOperator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBracketToInfix method, of class Kalkulator.
     */
    @Test
    public void testAddBracketToInfix() {
        System.out.println("addBracketToInfix");
        boolean isEndBracket = false;
        Kalkulator instance = new Kalkulator();
        instance.addBracketToInfix(isEndBracket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Kalkulator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Kalkulator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
