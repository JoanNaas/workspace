package clase195;

public class Rojo extends EstadoSemaforo {

	public void siguienteColor( Semaforo semaforo)
	{
		semaforo.setEstadoSemaforo( new Verde ());
	}
	
	
}
