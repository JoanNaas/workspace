package herencia;

public class Universitaria extends TNE {

	private int recarga;
	

	public Universitaria() {
		// TODO Auto-generated constructor stub
		
		this.recarga = 0;
		
	}
	
	/**
	 * @param recarga
	 */
	
	public Universitaria(int recarga) {
		super();
		this.recarga = recarga;
	}



	public int getRecarga() {
		return recarga;
	}



	public void setRecarga(int recarga) {
		this.recarga = recarga;
	}



	@Override
	public void recargar(int recarga) {
		// TODO Auto-generated method stub
		
		
	}
	

	@Override
	public void pagarViaje() {
		// TODO Auto-generated method stub
		
		setSaldo(getSaldo() - 740);
		
	}





}
