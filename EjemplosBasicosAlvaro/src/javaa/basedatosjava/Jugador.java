package javaa.basedatosjava;

public class Jugador
{
	private int id;
	private String nombre;
	private int salario;
	private int equipo_id;
	
	
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public Jugador(int id, String nombre, int salario, int equipo_id)
	{
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.equipo_id = equipo_id;
	}

	public int getSalario()
	{
		return salario;
	}
	
	public void setSalario (int salario)
	{
		this.salario = salario;
	}
	
	public int getEquipo_id()
	{
		return equipo_id;
	}
	
	public void setEquipo_id (int equipo_id)
	{
		this.equipo_id = equipo_id;
	}
}
