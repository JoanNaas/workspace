package ejercicios.thread;

public class ProgramaBus {

	public static void main(String[] args) {

		Asiento[] asientos = {new Asiento(), new Asiento(), new Asiento()};
		Bus bus = new Bus ("k", asientos);
		ReservaThread hilo1 = new ReservaThread(bus, "hola",1);
		ReservaThread hilo2 = new ReservaThread(bus, "hola",1);
		
		hilo1.start();
		hilo2.start();
		
		bus.reservarAsiento(1);
		
	}

}
