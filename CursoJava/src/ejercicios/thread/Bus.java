package ejercicios.thread;

public class Bus {
	
		private String nombre;
		private Asiento [] asientos = new Asiento [10];
		
		public Bus(String nombre, Asiento[] asientos) {
			super();
			this.nombre = nombre;
			this.asientos = asientos;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the asientos
		 */
		public Asiento[] getAsientos() {
			return asientos;
		}
		/**
		 * @param asientos the asientos to set
		 */
		public void setAsientos(Asiento[] asientos) {
			this.asientos = asientos;
		} 
		
		public synchronized void reservarAsiento (int numeroAsiento)
		{
			if (!this.getAsientos()[numeroAsiento].isAsiento()){
			this.getAsientos()[numeroAsiento].setAsiento(true);	
			System.out.println("El asss!!");
			}
			else
			{			
				System.out.println("El asiento está reservado");
			}
		}

}
