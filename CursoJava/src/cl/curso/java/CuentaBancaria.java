package cl.curso.java;

public class CuentaBancaria {

	private int numeroCuenta;
	private int saldo;
	
	
	
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}




	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}




	public int getSaldo() {
		return saldo;
	}




	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}




	public void depositar( int monto)
	{
		System.out.println("Se depositara $ "+ monto);
		this.setSaldo (this.getSaldo() + monto - 300);
	}
	
	public void imprimir()
	{
		System.out.println( this.getNumeroCuenta());
		System.out.println( this.getSaldo());
	}
}
