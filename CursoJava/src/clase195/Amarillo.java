package clase195;

public class Amarillo extends EstadoSemaforo {
	
	public void siguienteColor(Semaforo semaforo)
	{
		semaforo.setEstadoSemaforo( new Rojo());
	}
	

}
