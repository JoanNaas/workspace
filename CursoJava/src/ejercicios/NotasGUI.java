/**
 * 
 */
package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * @author José Navarro
 *
 */
public class NotasGUI {

	private JFrame frame;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField promediotext;
	private JLabel lblPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresarNota = new JLabel("Ingresar nota 1");
		lblIngresarNota.setBounds(43, 54, 98, 14);
		frame.getContentPane().add(lblIngresarNota);
		
		nota1 = new JTextField();
		nota1.setBounds(176, 51, 86, 20);
		frame.getContentPane().add(nota1);
		nota1.setColumns(10);
		
		JLabel lblIngresarNota_1 = new JLabel("Ingresar nota 2");
		lblIngresarNota_1.setBounds(43, 93, 98, 14);
		frame.getContentPane().add(lblIngresarNota_1);
		
		nota2 = new JTextField();
		nota2.setBounds(176, 90, 86, 20);
		frame.getContentPane().add(nota2);
		nota2.setColumns(10);
		
		JLabel lblIngresarNota_2 = new JLabel("Ingresar nota 3");
		lblIngresarNota_2.setBounds(43, 128, 112, 14);
		frame.getContentPane().add(lblIngresarNota_2);
		
		nota3 = new JTextField();
		nota3.setBounds(176, 125, 86, 20);
		frame.getContentPane().add(nota3);
		nota3.setColumns(10);
		
		JButton btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int promedio = ((Integer.parseInt(nota1.getText()) + Integer.parseInt(nota2.getText()) + Integer.parseInt(nota3.getText())) / 3);
				System.out.println( promedio );
				promediotext.setText("" + promedio);
			}
		});
		btnCalcularPromedio.setBounds(132, 179, 178, 33);
		frame.getContentPane().add(btnCalcularPromedio);
		
		promediotext = new JTextField();
		promediotext.setBounds(176, 223, 86, 20);
		frame.getContentPane().add(promediotext);
		promediotext.setColumns(10);
		
		lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(43, 223, 60, 17);
		frame.getContentPane().add(lblPromedio);
	}
}
