package javaa.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearFichero
{

	public static String leer_archivo ()
	{
		String nombre_archivo = null;
		Scanner nombre_carpeta = null;
		
			nombre_carpeta = new Scanner(System.in);
			nombre_archivo = nombre_carpeta.nextLine();
					
		return nombre_archivo;
	}
	
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
		System.out.println("Hola Wey, elige un nombre para crear un archivo.");
		
			String carpeta_donde = null;
			File localizacion = new File (leer_archivo());
			
		System.out.println("Hola Wey, elige donde guardar el archivo.");
		
			String nombre_carpeta = null;
			File carpeta = new File (elegir_carpeta());
		
			carpeta.createNewFile();
	}
}
