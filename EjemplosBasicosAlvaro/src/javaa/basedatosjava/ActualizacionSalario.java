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
		//conn.setAutoCommit(false);
		
		stmt = conn.createStatement();
		stmt.execute("UPDATE JUGADORES j SET j.SALARIO = ROUND ( j.SALARIO * 1.20 )");
		//conn.commit(); //conn.rollback();
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
	
		// CONEXION 2, para mostar las tablas actualizadas
	
	Connection conn2 = null;
	ResultSet rset2 = null;
	Statement stmt2 = null;

	try
	{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
		conn2 = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		stmt2 = conn2.createStatement();
		rset2 = stmt2.executeQuery ("SELECT j.NOMBRE, j.SALARIO from JUGADORES j where j.EQUIPO_ID = " + 2);
							// equipo_id = 2 (atletico de madrid)
		while (rset2.next() )
		{
		System.out.println ("Nombre: " + rset2.getString ("NOMBRE") );
		System.out.println ("Salario -> " + rset2.getInt ("SALARIO") );
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset2 != null) 	{ try { rset2.close(); } catch (Exception e) { e.printStackTrace(); }}
			if (stmt2 != null)	{ try {	stmt2.close(); } catch (Exception e) { e.printStackTrace(); }}
			if (conn2 != null) 	{ try { conn2.close(); } catch (Exception e) { e.printStackTrace(); }}
		}   
	}
}