package javaa.daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaa.basedatosjava.ActBaseDatos;

public class JugadoresDao
{

	interface JugadoresDAO
	{
	    List <JugadoresDao> findAll();
	    List <JugadoresDao> findById();
	    List <JugadoresDao> findByName();
	    boolean insertJugadores (JugadoresDao jugadores);
	    boolean updateJugadores (JugadoresDao jugadores);
	    boolean deleteJugadores (JugadoresDao jugadores);
	}
	
	Connection conn = null;
	ResultSet rset = null;
	Statement stat = null;
	
	public List <JugadoresDto> consultarJugadoresPorEquipos (int Equipo)
	{
		List <JugadoresDto> lista = null;
		lista = new ArrayList <JugadoresDto>();
		
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		
		stat = conn.createStatement();
		rset = stat.executeQuery("SELECT j.NOMBRE , j.SALARIO, e.NOMBRE from JUGADORES j, EQUIPO e where e.EQUIPO_ID = j.EQUIPO_ID" + 2);
	
		while (rset.next() )
		{
			System.out.println (rset.getString ("nombre"));
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

	
