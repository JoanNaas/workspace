/**
 * 
 */
package guia111;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author José Navarro
 *
 */
public class AnimalGUI {

	private JFrame frame;
	private JTextField velocidad;
	private JTextField posicion;
	private JTextField velocidad2;
	private JTextField posicion2;
	private JTextField descanso;
	private JTextField descanso2;
	private JLabel lblDescanso;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI window = new AnimalGUI();
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
	public AnimalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Tigre = new JLabel("Tigre");
		Tigre.setBounds(26, 55, 46, 14);
		frame.getContentPane().add(Tigre);
		
		velocidad = new JTextField();
		velocidad.setBounds(94, 52, 86, 20);
		frame.getContentPane().add(velocidad);
		velocidad.setColumns(10);
		
		posicion = new JTextField();
		posicion.setBounds(201, 52, 86, 20);
		frame.getContentPane().add(posicion);
		posicion.setColumns(10);
		
		JButton Comenzar = new JButton("Comenzar");
		Comenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				boolean carreraFinallizada = false;
				
				Thread leopardo = new Thread(new Animal("Tigre", Integer.parseInt(velocidad.getText()), Integer.parseInt(descanso.getText()) , Integer.parseInt(posicion.getText()), carreraFinallizada));
				Thread tigre = new Thread(new Animal("Leopardo", Integer.parseInt(velocidad2.getText()),  Integer.parseInt(descanso2.getText()) , Integer.parseInt(posicion2.getText()) , carreraFinallizada));
				
				tigre.start();
				leopardo.start();
					
				}
				
				
				
			
		});
		Comenzar.setBounds(171, 213, 89, 23);
		frame.getContentPane().add(Comenzar);
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		lblVelocidad.setBounds(109, 27, 46, 14);
		frame.getContentPane().add(lblVelocidad);
		
		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setBounds(217, 27, 46, 14);
		frame.getContentPane().add(lblPosicion);
		
		JLabel Leopardo = new JLabel("Leopardo");
		Leopardo.setBounds(26, 109, 46, 14);
		frame.getContentPane().add(Leopardo);
		
		velocidad2 = new JTextField();
		velocidad2.setBounds(94, 106, 86, 20);
		frame.getContentPane().add(velocidad2);
		velocidad2.setColumns(10);
		
		posicion2 = new JTextField();
		posicion2.setBounds(201, 106, 86, 20);
		frame.getContentPane().add(posicion2);
		posicion2.setColumns(10);
		
		descanso = new JTextField();
		descanso.setBounds(318, 52, 86, 20);
		frame.getContentPane().add(descanso);
		descanso.setColumns(10);
		
		descanso2 = new JTextField();
		descanso2.setBounds(318, 106, 86, 20);
		frame.getContentPane().add(descanso2);
		descanso2.setColumns(10);
		
		lblDescanso = new JLabel("Descanso");
		lblDescanso.setBounds(335, 27, 46, 14);
		frame.getContentPane().add(lblDescanso);
	}
}
