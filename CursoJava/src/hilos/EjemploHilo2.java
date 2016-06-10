package hilos;

public class EjemploHilo2 implements Runnable {
	
	public void run(){
		System.out.println("El nombre delthreades : " + Thread.currentThread().getName());
	}
	
	public static void main(String args[]){
		Thread thread = new Thread(new EjemploHilo2());
		thread.start();
		System.out.println("Metodo main; El nombre del thread es : " +
				Thread.currentThread().getName());
		
	}

}
