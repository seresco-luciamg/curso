package es.seresco.milena.pruebaMavenUno;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info("Traza desde logger");    
        
        logger.info("Patata devuelve {}", devuelvePatata());
    }
    
    public static String devuelvePatata()
	{
		return("...");
	}

    public static String devuelvePiloro()
	{
		return("Piloro");
	}

}
