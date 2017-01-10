package java.IMC;

import java.util.Scanner;

public class EntradaSalida
{
	
			@SuppressWarnings("resource")
			
	public static double obtenerPeso ()
	{
		double peso = 0;
		Scanner scaner = null;
		
			System.out.println("Introduce tu peso (kg): ");
			
			scaner = new Scanner(System.in);
			peso = scaner.nextDouble();

		return peso;
	}
	
	
			@SuppressWarnings("resource")
			
	public static double obtenerAltura ()
	{
		double altura = 0;
		Scanner scaner = null;
		
			
			System.out.println("Introduce tu altura (m): ");
			
			scaner = new Scanner(System.in);
			altura = scaner.nextDouble();
			
		return altura;
	}
	
	public static void mostrarIMC (double imc)
	{
		
		TipoIMC tipo = TipoIMC.traduceIMC(imc);
		
		System.out.println("Su IMC es " + imc + " que es " + tipo);
	}
}
