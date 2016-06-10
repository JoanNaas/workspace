/**
 * 
 */

/**
 * @author José Navarro
 *
 */
public class programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "buenos dias buenos dias";
		texto.split(" ");
		String[] palabra = texto.split(" ");
		int cantidad = 0;
		for (int i = 0; i < palabra.length; i++) {
			System.out.println(palabra[i]);
			if (palabra[i].contains("buenos")) {
				cantidad++;
			}
		}
		System.out.println(cantidad);

	}

}
