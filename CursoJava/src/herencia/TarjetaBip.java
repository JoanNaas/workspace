package herencia;

public abstract class TarjetaBip {

	private int saldo;
	private int nTarjeta;
	private String color;
	
	public TarjetaBip()
	{
		this.saldo =0;
		this.nTarjeta = 123456789;
		
	}

	/**
	 * @param saldo
	 * @param nTarjeta
	 * @param color
	 */
	public TarjetaBip(int saldo, int nTarjeta, String color) {
		super();
		this.saldo = saldo;
		this.nTarjeta = nTarjeta;
		this.color = color;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getnTarjeta() {
		return nTarjeta;
	}

	public void setnTarjeta(int nTarjeta) {
		this.nTarjeta = nTarjeta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void recargar( int recarga );
	
	public abstract void pagarViaje();
	
	public void imprimir()
	{
		System.out.println(this.getnTarjeta());
		System.out.println(this.getSaldo());
		System.out.println(this.getColor());
	}
	
	
}
