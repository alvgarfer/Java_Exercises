package javaa.basedatosjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ejercicio
{
	public static void mostrarLista (ArrayList<Jugador> listajug)
	{		
		for (Jugador jug : listajug)
		{
			System.out.println(jug.getNombre());
		}
	}
		
	public static void main(String[] args)
	{
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
		Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		stmt = conn.createStatement();
		//rset = stmt.executeQuery ("SELECT * from JUGADORES ORDER BY SALARIO DESC");
		
		rset = stmt.executeQuery ("SELECT j.NOMBRE , j.SALARIO, e.NOMBRE from JUGADORES j, EQUIPO e where e.EQUIPO_ID = j.EQUIPO_ID");
		
		while (rset.next() )
		{
			//System.out.println ("Nombre: " + rset.getString ("nombre"));
			//System.out.println ("Salario -> " + rset.getString ("salario"));
			System.out.println (rset.getString ("NOMBRE"));
			System.out.println (rset.getInt("SALARIO"));
			System.out.println (rset.getString ("NOMBRE"));
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e4) { e4.printStackTrace(); }}
		}   
	}
}
