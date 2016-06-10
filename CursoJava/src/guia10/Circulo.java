/**
 * 
 */
package guia10;

/**
 * @author José Navarro
 *
 */
public class Circulo extends FiguraGeometrica {

	private double radio;
	
	public Circulo()
	{
		this.radio = 5;
	}
	
	
	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}



	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}



	public void dibujar() {
		// TODO Auto-generated method stub
		
		System.out.println("()");

	}

	/* (non-Javadoc)
	 * @see guia10.FiguraGeometrica#calcularArea()
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (Math.PI * (this.getRadio()*this.getRadio()));
	}

}
