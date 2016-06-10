package clase195;

public class Verde extends EstadoSemaforo {
	
	public void siguienteColor(Semaforo semaforo)
	{
		semaforo.setEstadoSemaforo(new Amarillo());
	}

}
