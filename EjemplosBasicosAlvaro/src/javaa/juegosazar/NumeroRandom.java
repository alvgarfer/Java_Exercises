package javaa.juegosazar;

import java.util.Scanner;
import org.apache.log4j.Logger;


public class NumeroRandom 
{
		@SuppressWarnings("resource")
		
	public static int pedirNumero()
	{
		int numero_introducido = 0;
		Scanner scanner = null;
		
			scanner = new Scanner (System.in);
			numero_introducido = scanner.nextInt();
		
		return numero_introducido;
	}
		
	public static int generarAleatorio ()
	{
		int num_aleatorio = 0;
			
			num_aleatorio = (int) (Math.random() * 100) + 1;
				
		return num_aleatorio;
	}
	
	private static Logger log = Logger.getLogger("mlog");
	
	
	public static void main(String[] args) 
	{
		try
		{
			if (log.isTraceEnabled() )
			{
				log.trace("Mensaje de trace");
			}
			
			if (log.isDebugEnabled() )
			{
				log.debug("Mensaje de debug");
			}
			
			if (log.isInfoEnabled())
			{
				log.info("Mensaje de info");
			}
			
		}	catch (Exception e)
			{
				log.warn("Mensaje de warn", e);
				log.error("Mensaje de error", e);
				log.fatal("Mensaje de fatal", e);
			}
		
		int numero_random = generarAleatorio ();
		
		int numero_usuario = 0;
		int contador = 0;
		int intentos = 5;
		
		boolean acertado = false;
		
			do
			{
				System.out.println("Introduzca un número: ");
				numero_usuario = pedirNumero();
				
				if (numero_random > numero_usuario)
				{
					System.out.println("El número del sistema es mayor");
				}
					else if (numero_random < numero_usuario)
					{
						System.out.println("El número del sistema es menor");
					}
						else
						{
							System.out.println("Enhorabuena, has acertado el número !!");	
							acertado = true;
						}
				
				contador ++;
				intentos --;
					
					System.out.println("Le quedan " + intentos + " intentos");
					
			} while ((contador < 5) && (!acertado));
	}
}	