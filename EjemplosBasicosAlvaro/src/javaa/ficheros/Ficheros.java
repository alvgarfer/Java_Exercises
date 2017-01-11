package javaa.ficheros;

import java.io.File;

public class Ficheros
{
	/**Crear una carpeta en la raíz de nuestro proyecto Java dentro
	 *  de Eclipse e introducir algunos ficheros. 
	 * Hacer después un programa, para que liste el directorio y los ficheros.
	 * 
	 *  Hacer un programa para que desde el directorio actual (“.”), 
	 *  recorra el arbol de directorios y muestre todos los directorios, 
	 *  subdirectorios y sus respectivos archivos 
	 *  */

	/**public static void main(String[] args)
	{
		//String carpeta_raiz = "C:/Users/Alvaro/EjemplosBasicosAlvaro/EjemplosBasicosAlvaro";
		File carpeta = new File ("C:/Users/Alvaro/EjemplosBasicosAlvaro/EjemplosBasicosAlvaro");
		
		File [] ficheros = carpeta.listFiles();
				
			if (ficheros == null)
			{
				System.out.println ("No hay ficheros en la carpeta");	
			}
				else
				{
					for (int i = 0; i < ficheros.length; i ++)
					{
						System.out.println (ficheros[i]);
					}
				}
	}
}
*/

public static void main(String[] args)
{
	//String carpeta_raiz = "C:/Users/Alvaro/EjemplosBasicosAlvaro/EjemplosBasicosAlvaro";
	File carpeta = new File (".");
	
	File [] ficheros = carpeta.listFiles();
			
		if (ficheros == null)
		{
			System.out.println ("No hay ficheros en la carpeta");	
		}
			else
			{
				for (int i = 0; i < ficheros.length; i ++)
				{
					if ( ficheros [i].isHidden() )
						System.out.println ( ficheros[i].getName() );
				}
			}
}
}