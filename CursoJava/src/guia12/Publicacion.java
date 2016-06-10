/**
 * 
 */
package guia12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author José Navarro Astudillo
 *
 *
 */
public class Publicacion {

	private int identificador;
	private String password;
	private Usuario owner;
	private List<Like> likes;
	private List<Comentario> comentarios;

	/**
	 * @param identificador
	 * @param password
	 * @param owner
	 * @param likes
	 * @param comentarios
	 */
	public Publicacion(int identificador, String password, Usuario owner, List<Like> likes,
			List<Comentario> comentarios) {
		super();
		this.identificador = identificador;
		this.password = password;
		this.owner = owner;
		this.likes = likes;
		this.comentarios = comentarios;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador
	 *            the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the owner
	 */
	public Usuario getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(Usuario owner) {
		this.owner = owner;
	}

	/**
	 * @return the likes
	 */
	public List<Like> getLikes() {
		return likes;
	}

	/**
	 * @param likes
	 *            the likes to set
	 */
	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

	/**
	 * @return the comentarios
	 */
	public List<Comentario> getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios
	 *            the comentarios to set
	 */
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public void agregarComentario(Comentario comentario) {
		this.comentarios.add(comentario);
	}

	public void eliminarComentario(Comentario comentario) {
		if (this.comentarios.contains(comentario)) {
			this.comentarios.remove(comentario);
		}
	}

	public void ordenarComentariosPorUsuario() {
		
		Collections.sort(this.comentarios, new Comparator<Comentario>() {
			
			@Override
			public int compare(Comentario o1, Comentario o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}

	public void ordenarLikesPorUsuario() {

		Collections.sort(likes, new Comparator<Like>() {

			@Override
			public int compare(Like o1, Like o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

	}

	public void agregarLike(Like like) {

		if (!(this.likes.contains(like))) {
			this.likes.add(like);
		} else {
			System.out.println("solo puedes dar like una vez");
		}
	}

	public void elimarLike(Like like) {

		if (this.likes.contains(like)) {
			this.likes.remove(like);
		}
		else
		{
			System.out.println("No se puede eliminar un like que no ha sido agregado");
		}
	}
}
