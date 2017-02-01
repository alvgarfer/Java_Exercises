package javaa.json;

import com.google.gson.Gson;

public class JsonPrueba
{

	public static void main(String[] args)
	{
		Gson gson = new Gson();
		Persona p = new Persona ("Charlie", 1, false, false);
		
		String jsonpersona = gson.toJson(p);
		
		System.out.println (jsonpersona);
		System.out.println (" ---- ");
		
		Persona p2 = gson.fromJson(jsonpersona, Persona.class);
		
		System.out.println ("\nHijos = "  + p2.getHijos());
		System.out.println ("Nombre = " + p2.getNombre());
		System.out.println ("Casado = " + p2.isCasado());		
		System.out.println ("Parado = " + p2.isParado());
		
	}

}
