/**
 * 
 */
package guia10;

/**
 * @author José Navarro
 *
 */
public class Triangulo extends FiguraGeometrica {
	
	private int base;
	private int altura;

	
	public Triangulo()
	{
		this.altura = 5;
		this.base = 5;
	}
	
	
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}



	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}



	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}



	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}



	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("/\\");
		System.out.println("--");
		
	}

	/* (non-Javadoc)
	 * @see guia10.FiguraGeometrica#calcularArea()
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double area = this.getAltura() * this.getBase();
		return area;
	}

	
	
}
