package excepciones;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import cl.curso.java.Fecha;

public class Programa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String fecha = JOptionPane.showInputDialog("ingrese una fecha");
		SimpleDateFormat sFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Fecha hoy = new Fecha(23, 13, 2016);
			hoy.validarDia();
			hoy.validarMes();
			Date date = sFormat.parse(fecha);
		} catch (DiaNoValidoException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error", "La fecha no es correcta", JOptionPane.ERROR_MESSAGE);
		} catch (MesNoValidoException e) {
			System.out.println("Mes no valido " + e.getMessage());
		}

	}

}
