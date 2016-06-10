package clase185;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		boolean numeroValido = false;
		
		
		do
		{
			try {
				int dividendo = Integer.parseInt(JOptionPane.showInputDialog("ingresa dividendo"));
				int divisor =Integer.parseInt(JOptionPane.showInputDialog("Ingresar divisor"));
				numeroValido = !numeroValido;
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Error, no ingreso un numero" + e.getMessage() + JOptionPane.ERROR_MESSAGE);
				
				
			}
		}while( !numeroValido);
		
		
	}

}
