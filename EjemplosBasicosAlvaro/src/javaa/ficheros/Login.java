package javaa.ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Login
{
			/** Método para guardar el nombre de usuario al registrarse
			 * @return User name  */
	public static String register_Name ()
	{
		String user_name = null; //	nombre de usuario, elegido por el cliente
		Scanner texto_introducido = null;
	
			texto_introducido = new Scanner (System.in); // lee por la entrada estandar el nombre de usuario introducido por el cliente

			user_name = texto_introducido.nextLine(); // almacena el nombre de usuario en el String user_name

		return user_name;
	}
	
			/** Método para guardar la contraseña del usuario al registrarse
			 * @return Password */
	public static String register_Password ()
	{
		String user_pass = null;	//	contraseña, elegida por el cliente
		Scanner texto_introducido = null;

			texto_introducido = new Scanner (System.in); // lee por la entrada estandar la contraseña introducida por el cliente

			user_pass = texto_introducido.nextLine(); // almacena la contraseña en el String user_pass

		return user_pass;
	}

			/** Método que guarda en un fichero el Username y la Password
			 * @return Ok si correcto o error 
			 * @throws IOException */
	public static void escribir_En_Fichero (String name, String pass) throws IOException
	{
		File username = new File ("Username");
		FileWriter escribir_username = new FileWriter (username);

			BufferedWriter bfw = new BufferedWriter (escribir_username);
			bfw.write(name);

		bfw.close();
		escribir_username.close();


		File password = new File ("Password");
		FileWriter escribir_password = new FileWriter (password);

			BufferedWriter bww = new BufferedWriter (escribir_password);
			bww.write(pass);

		bww.close();
		escribir_password.close();
	}

			/** Método que muestra un menu con dos opciones y guarda la opcion elegida
			 * @return elegir_opcion  */
	public static int menu() throws InputMismatchException
	{
		int elegir_opcion = 0;
		boolean opcion_correcta = false;
		
			System.out.println ("Para registrarse pulse 1.");
			System.out.println ("Para logearse pulse 2.\n");
	
		do
		{	
			try
			{
				Scanner introducido = new Scanner(System.in);
				elegir_opcion = introducido.nextInt();
					
				opcion_correcta = (elegir_opcion == 1 || elegir_opcion == 2);
				
			}	catch (InputMismatchException e)
				{
					System.out.println ("Introduzca un numero entre 1 y 2");
				}
				
		}	while (!opcion_correcta);
		
		return elegir_opcion;
	}

			/** Método que permite al usuario logear
			 * @return Ok si correcto o Pedir de nuevo si error 
			 * @throws IOException */
	public static boolean login (String register_name, String register_password) throws IOException
	{
		boolean correcto = false;

		String username_leido = null;
		String password_leida = null;
		String username_login = null;
		String password_login = null;
		Scanner texto_introducido = null;
		
			File username = new File ("Username");
			FileReader leer_username = new FileReader(username);

			BufferedReader bfr = new BufferedReader(leer_username);
			username_leido = bfr.readLine();


			File password = new File ("Password");
			FileReader leer_password = new FileReader(password);

			BufferedReader brr = new BufferedReader(leer_password);
			password_leida = brr.readLine();
			
			
			System.out.println("Introduzca el nombre de usuario: ");
				texto_introducido = new Scanner (System.in); // lee por la entrada estandar el texto introducido

			username_login = texto_introducido.nextLine(); // almacena el nombre de usuario en el String username_login


				if ( username_leido.equals(username_login) )	//compara el nombre de usuario a registrarse con el nombre introducido para logearse
				{												//sino coincide el usuario, no entra al 2º if, y dice usuario no coincide
					System.out.println("Usuario correcto \n");
	
					System.out.println("Introduzca su contraseña: ");	//si coinciden los nombres de usuario, accede al if y pide la contraseña
						texto_introducido = new Scanner(System.in);		//si la contraseña coincide entra al if sino al else y dice que no coincide
	
					password_login = texto_introducido.nextLine();
					
					if ( password_leida.equals(password_login) )
					{
						System.out.println("Contraseña correcta. \n");
						correcto = true;
					}	
						else
						{
							System.out.println("La Contraseña no coincide. \n");
							correcto = false;
						}
				}	
					else
					{
						System.out.println("El Usuario no coincide. \n");
						correcto = false;
					}
			
			return correcto; 
	}
	
	public static void main(String[] args) throws IOException
	{
		String register_name = null;
		String register_password = null;
		
		int opcion_elegida = menu();
		
			if (opcion_elegida == 1)
			{
		
				System.out.println("Introduzca el nombre de usuario deseado: ");
					register_name = register_Name ();
	
				System.out.println("Introduzca la contraseña deseada: ");
					register_password = register_Password ();
	
				escribir_En_Fichero (register_name, register_password);
	
					System.out.println("Enhorabuena, el registro ha sido realizado con éxito. \n");
			}
				else
				{									
					if (login (register_name, register_password) )
					{
						System.out.println ("Login correcto.");
					}
				}
	}
}
