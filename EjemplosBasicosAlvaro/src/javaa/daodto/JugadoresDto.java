package javaa.daodto;

public class JugadoresDto
{
    private int id;
    private String name;
	private int salario;
	private int equipo;
	private int equipo_id;

	public JugadoresDto (int id, String name, int salario, int equipo_id)
	{
		this.id = id;
		this.name = name;
		this.equipo_id = equipo;
		this.salario = salario;
	}
	
    public int getId() 
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

	public int getEquipo_id()
	{
		return equipo_id;
	}

	public void setEquipo(int equipo_id)
	{
		this.equipo = equipo_id;
	}
	public int getSalario()
	{
		return salario;
	}

	public void setSalario(int salario)
	{
		this.salario = salario;
	}
}