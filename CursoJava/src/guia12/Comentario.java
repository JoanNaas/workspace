package guia12;

import java.util.Date;

public class Comentario {

	private int identificador;
	private Usuario owner;
	private String comentario;
	private Date fecha;
	/**
	 * @param identificador
	 * @param owner
	 * @param comentario
	 * @param fecha
	 */
	public Comentario(int identificador, Usuario owner, String comentario, Date fecha) {
		super();
		this.identificador = identificador;
		this.owner = owner;
		this.comentario = comentario;
		this.fecha = fecha;
	}
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the owner
	 */
	public Usuario getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Usuario owner) {
		this.owner = owner;
	}
	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}
	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
