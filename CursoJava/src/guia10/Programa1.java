/**
 * 
 */
package guia10;


/**
 * @author José Navarro
 *
 */
public class Programa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuadrado = new Cuadrado(3);
		cuadrado.dibujar();
		System.out.println(cuadrado.calcularArea());
		
		Triangulo triangulo = new Triangulo(4, 4);
		triangulo.dibujar();
		System.out.println(triangulo.calcularArea());
		
		Circulo circulo = new Circulo(5);
		circulo.dibujar();
		System.out.println(circulo.calcularArea());
		
	}

}
