package javaa.daodto;

import java.util.List;

public class MainJugadores
{

	public static void main(String[] args)
	{
		
		JugadoresDao jugadores = new JugadoresDao();
		List<JugadoresDto> Listajugadores = jugadores.consultarJugadoresPorEquipos(2);
				
		for (JugadoresDto jugadoresDto : Listajugadores)
		{
			System.out.println(jugadoresDto.getName());
		}
	}
}
