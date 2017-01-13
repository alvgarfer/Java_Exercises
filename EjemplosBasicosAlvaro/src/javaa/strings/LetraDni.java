package javaa.strings;

import java.util.Scanner;

public class LetraDni
{
	
	public static String caracteresDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static int letra_dni ()
	{
		char letra_dni = 0;

		Scanner leer_dni = new Scanner (System.in);

		int dni = Integer.parseInt (leer_dni.next() );
		int calculo = dni % 23;

		return calculo;
	}

	public static void main (String[] args)
	{
		System.out.println ("Introduzca su número de DNI.");

		System.out.println ("Su letra de DNI es: " + caracteresDNI.charAt (letra_dni() )); 
	}
}

