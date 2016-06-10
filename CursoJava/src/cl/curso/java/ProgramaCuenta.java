package cl.curso.java;

public class ProgramaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.setLineaCredito(2000);
		cta1.setNumeroCuenta(123456789);
		cta1.setSaldo(1000);
		
		cta1.imprimir();
		System.out.println("-------------------------");
		
		CuentaVista cuentaVista = new CuentaVista();
		cuentaVista.setNumeroCuenta(1234567890);
		cuentaVista.setSaldo(2000);
		cuentaVista.imprimir();
		
		
	}
	

}
