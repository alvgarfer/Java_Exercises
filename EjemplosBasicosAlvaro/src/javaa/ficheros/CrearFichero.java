package javaa.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearFichero
{

		@SuppressWarnings("resource")
	public static String leer_archivo ()
	{
		String nombre_archivo = null;
		Scanner nombre_carpeta = null;
		
			nombre_carpeta = new Scanner(System.in);
			nombre_archivo = nombre_carpeta.nextLine();
					
		return nombre_archivo;
	}
	
		@SuppressWarnings("resource")
	public static String elegir_carpeta ()
	{
		String carpeta_donde = null;
		Scanner nombre_carpeta = null;
		
			nombre_carpeta = new Scanner(System.in);
			carpeta_donde = nombre_carpeta.nextLine();
					
		return carpeta_donde;
	}
		
		
	public static void main(String [] args) throws IOException
	{
		System.out.println("Hola Wey, elija un nombre para crear un archivo.");
		
			System.out.println("Hola Man, elija donde guardar el archivo.");
		
			File carpeta = new File (elegir_carpeta());
		
			carpeta.createNewFile();
	}
}
