package javaa.basedatosjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ActualizacionSalario
{
	public static void main(String[] args)
	{
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
	try
	{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		stmt = conn.createStatement();		
		
		stmt.execute("UPDATE JUGADORES j SET j.SALARIO = ROUND ( j.SALARIO * 1.20 )");
		rset = stmt.executeQuery ("SELECT j.NOMBRE, j.SALARIO from JUGADORES j where j.EQUIPO_ID = " + 2);
		
		while (rset.next() )
		{
			System.out.println ("Nombre: " + rset.getString ("NOMBRE") );
			System.out.println ("Salario -> " + rset.getInt ("SALARIO") );
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