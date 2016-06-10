/**
 * 
 */
package cl.curso.java.control_cuatro.jnavarro;

/**
 * @author José Navarro
 *
 */
public class ProgramaAuto {

	/**
	 * @param args
	 */
	
	
	
	/*
	 * Programa para vender autos kia
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto kia = new Auto();
		
		kia.vernderAuto();
		kia.vernderAuto();
		kia.vernderAuto();
		
		try {
			kia.vernderAuto();
		} catch (SinStockException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}

}
