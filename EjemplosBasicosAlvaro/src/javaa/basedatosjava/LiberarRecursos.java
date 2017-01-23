package javaa.basedatosjava;

public class LiberarRecursos 
{
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
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e4) { e4.printStackTrace(); }}
	}   
}
