package javaa.frase;

import java.util.Scanner;

public class QuitarEspacios
{
	/** Método que recibe una frase y quita los espacios
	 *
	 * @return la frase sin spacios
	 */
	public static String quitarEspacios (String frase_usuario)
	{
				
		String frase_junta = frase_usuario.replace (" ","");
			 
		return frase_junta;
		
	}
	
	public static void main(String[] args)
	{	
			System.out.println ("Introduzca una frase: ");
			
			Scanner leer_frase = null; 			
			
			leer_frase = new Scanner(System.in);
		
			String frase_usuario = leer_frase.nextLine();
				
			System.out.println (quitarEspacios(frase_usuario));
	}
}
