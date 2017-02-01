package javaa.json;

public class Persona
{
	private String nombre;
	private int hijos;
	private boolean casado;
	private boolean parado;
	
		
		public Persona (String nombre, int hijos, boolean casado, boolean parado)
		{
		//super();
		this.nombre = nombre;
		this.hijos = hijos;
		this.casado = casado;
		this.parado = parado;
	}

		public String getNombre()
		{
			return nombre;
		}

		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}

		public int getHijos()
		{
			return hijos;
		}

		public void setHijos(int hijos)
		{
			this.hijos = hijos;
		}

		public boolean isCasado()
		{
			return casado;
		}

		public void setCasado(boolean casado)
		{
			this.casado = casado;
		}

		public boolean isParado()
		{
			return parado;
		}
		
		public void setParado(boolean parado)
		{
			this.parado = parado;
		}
}
		