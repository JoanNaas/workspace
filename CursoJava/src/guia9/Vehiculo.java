package guia9;

public class Vehiculo {

	private String codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int cantidadPorVender;
	
	/**
	 * @param codigo
	 * @param marca
	 * @param tipo
	 * @param modelo
	 * @param patente
	 * @param kilometraje
	 * @param precioVenta
	 * @param cantidadPorVender
	 */
	public Vehiculo(String codigo, String marca, String tipo, int modelo, String patente, int kilometraje,
			int precioVenta, int cantidadPorVender) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.cantidadPorVender = cantidadPorVender;
	}
	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}




	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}




	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}




	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}




	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}




	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}




	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}




	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}




	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}




	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}




	/**
	 * @return the precioVenta
	 */
	public int getPrecioVenta() {
		return precioVenta;
	}




	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}




	/**
	 * @return the cantidadPorVender
	 */
	public int getCantidadPorVender() {
		return cantidadPorVender;
	}




	/**
	 * @param cantidadPorVender the cantidadPorVender to set
	 */
	public void setCantidadPorVender(int cantidadPorVender) {
		this.cantidadPorVender = cantidadPorVender;
	}




	public void vender(int cantidadAVender)
	{
		if (this.getCantidadPorVender() > cantidadAVender)
		{
			this.setCantidadPorVender(getCantidadPorVender() - cantidadAVender);
			System.out.println("Se venden " + cantidadAVender + " " + tipo);
		}
		else
		{
			System.out.println("No hay stock");
			System.out.println("El stock maximo es " + getCantidadPorVender());
		}
	}

}
