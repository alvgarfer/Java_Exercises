package javaa.ordenar;

import javaa.juegosazar.NumeroRandom;

public class EnterosOrdenados
{
	
	public static void ordenaBurbuja ( int a_ent_a [] )
	{
		int aux = 0;
		
		for (int i = 0; i < a_ent_a.length; i ++)
		{
			for (int j = 0; j < a_ent_a.length - i - 1; j ++)
			{
				if (a_ent_a [j] > a_ent_a [j + 1])
				{
					aux = a_ent_a [j];
					a_ent_a [j] = a_ent_a [j + 1];
					a_ent_a [j + 1] = aux;
				}
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int a_ent_a [] = new int[10];
		
		//inicio el array con numeros aleatorios
		
		for (int i = 0; i < a_ent_a.length; i ++)
		{
			a_ent_a [i] = NumeroRandom.generarAleatorio();
		}
		ordenaBurbuja(a_ent_a);
			//muestro
		
			for (int i = 0; i < a_ent_a.length; i ++)
			{
			System.out.println("Num en pos " + i + " " + a_ent_a [i]);
			}
	}

}
