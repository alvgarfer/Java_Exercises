package javaa.alvaro;
/**
 * Este programa muesta los 50 primeros n�meros naturales (entero positivo) pares
 * @author Administrador
 *
 */
public class Pares50 {
	
	private static boolean esPar (int n)
	{
		boolean b_dev = false;
		
			b_dev = ((n%2)==0);
		
		return b_dev;
	}
	
	public static void main(String[] args) {
		
		int n_pares_aparecidos = 0;
		int contador = 0;
		
		do
		{
			if (esPar(contador))
			{
				System.out.println(contador);
				n_pares_aparecidos++;//incremento el n�mnero de pares aparecidos
			}
			contador++;
	
		} while (n_pares_aparecidos<50); //cuando llegue a 50 pares aparecidos, paro
		
	}

}
