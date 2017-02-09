package javaa.cosa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaa.basedatosjava.ActBaseDatos;

public class Cosa
{	
	Connection conn = null;
	ResultSet rset = null;
	Statement stat = null;
	
	public List <CosaDto> consultarJugadoresPorEquipos (int Equipo_id)
	{
		List <CosaDto> lista = null;
		lista = new ArrayList <CosaDto>();
		
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		
		stat = conn.createStatement();
		String consulta = "SELECT j.NOMBRE from JUGADORES j where j.EQUIPO_ID =" + Equipo_id;
		//String consulta2 = "SELECT j.NOMBRE, q.NOMBRE FROM JUGADORES j, EQUIPO q WHERE q.EQUIPO_ID = j.EQUIPO_ID AND j.EQUIPO_ID =" + Equipo_id;
		rset = stat.executeQuery(consulta);
	
		while (rset.next() )
		{
			System.out.println (rset.getString (1));
		//	System.out.println (rset.getString (2));
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		finally
		{
			ActBaseDatos.liberarRecursos(stat, rset);
			ActBaseDatos.liberarConexion(conn);		
		}
	
	return lista;
	}
}
