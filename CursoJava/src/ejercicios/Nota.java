package ejercicios;

public class Nota {

	private String nombre;
	private double valorNota;
	private double porcentaje;
	private static int cantidadInstancia;//clase
	private int cantidadInstanciasnoStatic;//instancia
	
	public Nota()
	{
		cantidadInstancia++;
	}

	/**
	 * @param nombre
	 * @param valorNota
	 * @param porcentaje
	 * @param cantidadInstanciasnoStatic
	 */
	public Nota(String nombre, double valorNota, double porcentaje, int cantidadInstanciasnoStatic) {
		super();
		this.nombre = nombre;
		this.valorNota = valorNota;
		this.porcentaje = porcentaje;
		this.cantidadInstanciasnoStatic = cantidadInstanciasnoStatic;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public static int getCantidadInstancia() {
		return cantidadInstancia;
	}

	public static void setCantidadInstancia(int cantidadInstancia) {
		Nota.cantidadInstancia = cantidadInstancia;
	}

	public int getCantidadInstanciasnoStatic() {
		return cantidadInstanciasnoStatic;
	}

	public void setCantidadInstanciasnoStatic(int cantidadInstanciasnoStatic) {
		this.cantidadInstanciasnoStatic = cantidadInstanciasnoStatic;
	}
	
	
}
