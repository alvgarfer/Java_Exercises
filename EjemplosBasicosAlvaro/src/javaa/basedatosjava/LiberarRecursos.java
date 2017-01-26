package javaa.basedatosjava;

// Programa de ejemplo de como operar con una base de datos y liberación de recursos

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LiberarRecursos
{
	public static void liberarRecursos (ResultSet rset, Statement stat)
	{
		if (rset != null)	{ try { rset.close(); } catch (Exception e) { e.printStackTrace(); }}
		if (stat != null)	{ try {	stat.close(); } catch (Exception e) { e.printStackTrace(); }}
	}
	
	public static void liberarConexion (Connection conn)
	{
		if (conn != null) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); }}	
	}

	public static void main(String[] args) throws SQLException
	{
		ResultSet rset = null;
		Statement stat = null;
		Connection conn = null;
		
		try
		{
			// las acciones que quieres realizar
		}
		catch(Exception e) //captura las excepciones
		{
			e.printStackTrace();
		}
		
		finally // libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{		// cierras la conexion con la base de datos
			liberarRecursos(rset, stat);
			liberarConexion(conn);
		} 
	}
}

