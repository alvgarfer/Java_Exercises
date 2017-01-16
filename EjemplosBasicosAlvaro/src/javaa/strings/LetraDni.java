package javaa.strings;

import java.util.Scanner;

public class LetraDni
{
	
	public static String caracteresDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	
	public static Scanner Pedir_numero_dni ()
	{
		Scanner leer_dni = new Scanner (System.in);
		
		return leer_dni;
	}
	
	public static int letra_dni ()
	{
		int dni = Integer.parseInt (Pedir_numero_dni ().next() );
		int calculo_letra = dni % 23;

		return calculo_letra;
	}

	public static void main (String[] args)
	{
		System.out.println ("Introduzca su número de DNI.");

		System.out.println ("Su letra de DNI es: " + caracteresDNI.charAt (letra_dni() ) ); 
	}
}

