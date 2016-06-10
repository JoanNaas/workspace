/**
 * 
 */
package mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author José Navarro
 *
 */
public class ProgramaMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<String, String> libro = new HashMap<String, String>();
//		String texto = "buenos dias buenos dias buenos";
//		String[] palabra = texto.split(" ");
//		int cantidad = 0;
//		for (int i = 0; i < palabra.length; i++) {
//			libro.put("1", palabra[i]);
//			if (libro.containsValue("buenos")) {
//				cantidad++;
//			}
//		}
//		System.out.println(cantidad);
//		
		
		
		
		
		
		
		
		
		Map<String, Integer> contador = new HashMap<String, Integer>();
		String texto = "buenos dias buenos dias buenos";
		String[] palabra = texto.split(" ");
		for (int i = 0; i < palabra.length; i++) {
			if (contador.containsKey(palabra[i])) {
				contador.put(palabra[i], contador.get(palabra[i])+1);
			}
			else {
				contador.put(palabra[i], 1);
			}
		}
		
		Iterator<Entry<String, Integer>> it = contador.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			
			
			
		}
		

	}

}
