package guia9;

public class Persona {

	private String nombre;
	private String apellido;
	private long telefono;
	
	public Persona()
	{
		this.nombre = "José";
		this.apellido ="Navarro";
		this.telefono =961202143;
	}

	public Persona(String nombre, String apellido, long telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public boolean validarNumero()
	{
		
		if (this.getTelefono() >= 100000000 && this.getTelefono() <= 999999999  )
		{
			return true;
		}
		else
		{
			setTelefono(0);
			
			return false;
		}
	}
	
	public void imprimir()
	{
		System.out.println(getNombre());
		System.out.println(getApellido());
		
		if (validarNumero())
		{
			System.out.println(getTelefono());
		}
		else
		{
			System.out.println("Numero incorrecto");
		}
		
	}
	
}
