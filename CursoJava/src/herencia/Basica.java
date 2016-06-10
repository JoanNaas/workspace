package herencia;

public class Basica extends TNE{
	

	@Override
	public void recargar(int recarga) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() + recarga);
	}

	@Override
	public void pagarViaje() {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() - 740); 
	}
	
}
