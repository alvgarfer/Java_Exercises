package javaa.daodto;

import java.util.List;

public class MainJugadores
{

	public static void main(String[] args)
	{
		int equipo_id = 2;
		
		JugadoresDao jugadores = new JugadoresDao();
		List<JugadoresDto> Listajugadores = jugadores.consultarJugadoresPorEquipos(equipo_id);
				
		for (JugadoresDto jugadoresDto : Listajugadores)
		{
			System.out.println(jugadoresDto.getName());
		}
	}
}