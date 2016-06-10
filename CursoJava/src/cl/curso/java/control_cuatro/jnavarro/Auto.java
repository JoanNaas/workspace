/**
 * 
 */
package cl.curso.java.control_cuatro.jnavarro;

/**
 * @author José Navarro
 *
 */

/*
 * clase para crear un objeto tipo auto
 */
public class Auto {
	
	private String marca;
	private String modelo;
	private int anio;
	private int stock;
	
	
	public Auto()
	{
		this.marca = "Kia";
		this.modelo = "Rio5";
		this.anio = 2016;
		this.stock = 3;
	}
	
	/**
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param stock
	 */
	public Auto(String marca, String modelo, int anio, int stock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
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
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}




	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}




	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}




	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}




	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

/*
 * Metodo para vender autos
 */


	public void vernderAuto()
	{
		if (getStock() > 0) {
			this.setStock(getStock() - 1);
			System.out.println("Un auto vendido !!!");
			System.out.println("Cantidad en stock : " + getStock());
		}
		else
		{
			throw new SinStockException("No es posible vender auto. No hay stock");
		}
		
	}

}
