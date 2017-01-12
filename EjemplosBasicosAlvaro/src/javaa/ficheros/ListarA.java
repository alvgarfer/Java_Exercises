package javaa.ficheros;

import java.io.File;
import java.io.FilenameFilter;

public class ListarA
{
	
	public static void main(String[] args)
	{
		File listarConA = new File ("C:/Program Files");
		File [] archivos = listarConA.listFiles();
	
		
		//((FilenameFilter) archivos[i]).accept(listarConA, "a");
		if (archivos == null)
		{
			System.out.println("No hay archivos en esa carpeta");
		}
			else
			{
				for (int i = 0; i < archivos.length; i ++)
				{
					if (  ( (FilenameFilter) archivos[i]).accept(listarConA, "a") )
						System.out.println ( archivos[i].getName());
				}
			}
	}
}
