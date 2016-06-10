package herencia;

import java.util.Date;

public abstract class TNE extends TarjetaBip{
	
	private String nombre;
	private Date fechaExp;
	
	
	
	/**
	 * 
	 */
	public TNE() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param saldo
	 * @param nTarjeta
	 * @param color
	 */
	public TNE(int saldo, int nTarjeta, String color, String nombre, Date fecDate) {
		super(saldo, nTarjeta, color);
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaExp() {
		return fechaExp;
	}

	public void setFechaExp(Date fechaExp) {
		this.fechaExp = fechaExp;
	}
	
	
}
