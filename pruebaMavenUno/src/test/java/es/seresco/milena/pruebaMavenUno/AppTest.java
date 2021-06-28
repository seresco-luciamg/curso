package es.seresco.milena.pruebaMavenUno;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testDevuelvePatata()
    {    	
    	assertFalse(App.devuelvePatata().toUpperCase().equals("PATATA")); 
    	assertTrue(App.devuelvePatata().toUpperCase().equals("..."));
    	assertEquals(App.devuelvePatata().toUpperCase(), "...");
    }

}
