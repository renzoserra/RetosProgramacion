package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    App test = new App();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @org.testng.annotations.Test
    void testEsPalindromo(){
        test.esPalindromo();
    }

    @org.testng.annotations.Test
    void testFizzBuzz(){
        test.fizzBuzz();
    }

    @org.testng.annotations.Test
    void testEsAnagrama(){
        test.esAnagrama("cuaderno", "educaron");
    }

    @org.testng.annotations.Test
    void testSucesionFibonacci(){
        test.sucesionFibonacci();
    }

    }
