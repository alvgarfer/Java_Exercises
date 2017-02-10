package javaa.strings;

public class CodificarDecodificar
{
	public static String codificar (String mensaje, int clave)
		{
			String mensaje_cifrado = null;
			char caracter_cifrado = 0;
			char caracter_actual = 0;

			int pos_caracter = 0;
			int lenght = mensaje.length();

				mensaje_cifrado = new String();

				for (int pos = 0; pos < lenght; pos ++)
				{
					caracter_actual = mensaje.charAt (pos);

					if (caracter_actual != ' ')
					{
						pos_caracter = (int) caracter_actual;
						pos_caracter = pos_caracter + clave;

						caracter_cifrado = (char) pos_caracter;
						mensaje_cifrado = mensaje_cifrado + caracter_cifrado;

					}	else
						{
							mensaje_cifrado = (mensaje_cifrado + caracter_actual);
						}
					}

			return mensaje_cifrado;
	}
	
	public static String decodificar (String mensaje_decodificado, int clave)
	{
		String mensaje_cifrado = null;
		char caracter_cifrado = 0;
		char caracter_actual = 0;

		int pos_caracter = 0;
		int lenght = mensaje_decodificado.length();
		
		for (int pos = 0; pos > lenght; pos --)
		{
			caracter_actual = mensaje_decodificado.charAt (pos);

			if (caracter_actual != ' ')
			{
				pos_caracter = (int) caracter_actual;
				pos_caracter = pos_caracter - clave;

				caracter_cifrado = (char) pos_caracter;
				mensaje_cifrado = mensaje_cifrado + caracter_cifrado;
				
			}	else
				{
				mensaje_cifrado = (mensaje_cifrado + caracter_actual);
				}
			}

	return mensaje_decodificado;
	}

		@SuppressWarnings("static-access")
	public static void main (String[] args)
	{

		CodificarDecodificar texto_cifrado = null;
		texto_cifrado = new CodificarDecodificar();

		String texto_resultado = texto_cifrado.codificar (" a b c d e", 1);
		System.out.println(texto_resultado);

		CodificarDecodificar texto_descifrado = null;
		texto_descifrado = new CodificarDecodificar();
		
		String texto_res = texto_descifrado.decodificar (texto_resultado, 1);
		System.out.println(texto_res);
	}
}
