/**
 * 
 */
package guia10;

/**
 * @author José Navarro
 *
 */
public class Cuadrado extends FiguraGeometrica {
	
	private int lado;

	/**
	 * @param lado
	 */
	
	public Cuadrado()
	{
		this.lado = 5;
	}
	
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	/* (non-Javadoc)
	 * @see guia10.FiguraGeometrica#dibujar()
	 */
	@Override
	
	
	
	
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println(" __");
		System.out.println(" | |");
		System.out.println(" --");
	}

	
	/* (non-Javadoc)
	 * @see guia10.FiguraGeometrica#calcularArea()
	 */
	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		
		double area = this.getLado()*this.getLado();
		return area;
	}

	
	
	
}
