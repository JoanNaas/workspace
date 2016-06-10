package ventanas;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		JFrame ventana = new JFrame();
//		JLabel label = new JLabel("Hola Mundo");
//		ventana.getContentPane().add(label);
//		ventana.setSize(400, 400);
//		ventana.setVisible(true);
		
//		Ventana ventana2 = new Ventana();
		Hilo hilo = new Hilo();
		
		Thread thread =new Thread(new Ejecucion());
		
		Thread threadx =new Thread( new Runnable()
		{
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for ( int i= 1; i < 10; i++)
				{
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		hilo.start();
		threadx.start();
		thread.start();
		
		System.out.println("Fin programa");

		
	}

}
