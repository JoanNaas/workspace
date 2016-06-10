package ventanas;

public class Ejecucion implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		
		Hilo hilo = new Hilo();
		hilo.start();
		hilo.join();
		System.out.println("Fin programa");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
