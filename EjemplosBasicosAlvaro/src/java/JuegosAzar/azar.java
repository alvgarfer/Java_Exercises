package java.JuegosAzar;
import java.util.Scanner;

public class azar 
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

	public static void main(String[] args) 
	{
		int numero_usuario = 0;
		int	numero_random = 0;
		int contador = 0;
		int intentos = 5;
		
		boolean acertado = false;
		numero_random = (int) (Math.random () * 100) + 1;
		

		do
		{
			System.out.println ("Introduzca un número: ");
			numero_usuario = pedirNumero();
			
			if (numero_random > numero_usuario)
			{	
				System.out.println ("El número aleatorio es mayor que el introducido");
			}
		
				else if (numero_random < numero_usuario)
				{
					System.out.println("El número aleatorio es menor que el introducido");
				}
				
					else
					{
						System.out.println("Enhorabuena has acertado !!!");
						acertado = true;
					}
			
				contador ++;
				intentos --;
		
					System.out.println("Le quedan: " + intentos + " intentos ");
		
		} while ((contador < 5) && (!acertado));		
	}
}
