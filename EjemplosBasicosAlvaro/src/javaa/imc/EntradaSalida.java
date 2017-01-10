package javaa.imc;

import java.util.Scanner;

public class EntradaSalida
{
	
			@SuppressWarnings("resource")
			
	public static double obtenerPeso ()
	{
		double peso = 0;
		Scanner scanner = null;
		
			System.out.println("Introduce tu peso (kg): ");
			
			scanner = new Scanner(System.in);
			peso = scanner.nextDouble();

		return peso;
	}
	
	
			@SuppressWarnings("resource")
			
	public static double obtenerAltura ()
	{
		double altura = 0;
		Scanner scanner = null;
		
			
			System.out.println("Introduce tu altura (m): ");
			
			scanner = new Scanner(System.in);
			altura = scanner.nextDouble();
			
		return altura;
	}
	
	public static void mostrarIMC (double imc)
	{
		
		TipoIMC tipo = TipoIMC.traduceIMC(imc);
		
		System.out.println("Su IMC es " + imc + " que es " + tipo);
	}
}
