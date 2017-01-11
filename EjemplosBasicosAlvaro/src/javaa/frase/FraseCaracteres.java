package javaa.frase;

import java.util.Scanner;

public class FraseCaracteres
{
	/** Método que permite leer una frase introducica por teclado
	 *
	 * @return la frase introducida por el usuario
	 */
	public static String frase ()
	{
		String frase_usuario = null;
		Scanner leer_frase = null; //creo una variable llamada leer_frase,
		// usando la clase Scanner, inicializada en null
		
			leer_frase = new Scanner(System.in);
			// almacenas en la variable leer_frase lo introducido 
			// por teclado haciendo uso de la clase Scanner
			
			frase_usuario = leer_frase.nextLine();
			// Asignas a la variable "frase_usuario" lo almacenado por el Scanner
			// sino pones nextLine() no tendria en cuenta los espacios en blanco
			
		return frase_usuario; 
		//devuelve la frase del usuario
	}
	
	public static void main(String[] args)
	{
		String frase_leida = null;
				
			System.out.println ("Introduzca una frase: ");
			
			 frase_leida = frase ();
			 // A la variable String frase_leida se asigna el metodo frase ()
			 
			 String frase_junta = frase_leida.replace (" ","");
			 // en la nueva variable frase_junta se guarda la frase leida por teclado
			 // pero remplazando los espacios por no espacios(es decir, quitandolos)
			 
			 System.out.println (frase_junta);
	}
}
