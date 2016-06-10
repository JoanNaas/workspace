/**
 * 
 */
package ejercicioCanciones;

import java.util.ArrayList;

/**
 * @author José Navarro
 *
 */
public class ProgramaSpoty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cancion c1 = new Cancion("lalala","asdasd" , 12.30);
        Cancion c2 = new Cancion("qewqwe","bvnbvn" , 10.30);
        
        Cancion c3 = new Cancion("akalak","yy" , 7.30);
        Cancion c4 = new Cancion("ijkhjk","ey" , 6.30);

        
        ArrayList<Cancion>canciones1 = new ArrayList<Cancion>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
            add(c1);
            add(c2);
            add(c3);
            add(c4);
        }};
  
        
        PlayList p1 = new PlayList("Playlist1",canciones1, null);

        
        ArrayList<PlayList>play1 = new ArrayList<PlayList>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
            
            add(p1);
        }};

        
        Usuario u1 = new Usuario("Usuario1",play1);
        p1.eliminarCancion(c3);
        
        p1.ordenarAleatorio();
        System.out.println();
        System.out.println(u1.getPlayList());
    }

		
	

}
