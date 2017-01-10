package java.JuegosAzar;

import java.util.Scanner;

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
	
	public static void main(String[] args) 
	{
		
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
		/**
done		1 llamar metodo math y almacenar el numero aleatorio
			
done		2 llamar metodo PedirNumero
		
done		3 comparar nº introducido y nº generado

done		4 si es > indicarlo		si es < indicarlo (if else)
	
done		5 Usar do while 5 veces. */
		

