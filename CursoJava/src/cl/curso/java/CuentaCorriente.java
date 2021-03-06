package cl.curso.java;

public class CuentaCorriente extends CuentaBancaria {

	private int lineaCredito;
	
	public void lineaCredito()
	{
		System.out.println("Constructor de la cuenta corriente");
	}

	public int getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
	
	/**
	 * 
	 */

	public void girar( int monto ){
		if( monto <= this.getSaldo() + this.getLineaCredito())
		{
			if ( monto <= this.getSaldo())
			{
				this.setSaldo( this.getSaldo() - monto );
			}
			else
			{
				int resto = monto - this.getSaldo();
				this.setLineaCredito(this.getLineaCredito() - resto );
				this.setSaldo(0);
			}
		}
		
		else
		{
			System.out.println("Saldo insuficiente");	
		}
		}
		
		public void imprimir()
		{
			super.imprimir();
			System.out.println( this.getLineaCredito());
			
		}
	}
	
	
	
