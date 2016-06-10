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

/**
 * @author José Navarro
 *
 */
public class LoginGUI {

	private JFrame frame;
	private JTextField nombreUsuario;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
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

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(163, 24, 46, 14);
		frame.getContentPane().add(lblLogin);

		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setBounds(31, 75, 125, 14);
		frame.getContentPane().add(lblNombreUsuario);

		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(160, 72, 134, 20);
		frame.getContentPane().add(nombreUsuario);
		nombreUsuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(31, 127, 115, 14);
		frame.getContentPane().add(lblContrasea);

		password = new JTextField();
		password.setBounds(160, 124, 134, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);

		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = "jose";
				String contraseña = "123456";
				if (nombreUsuario.getText().equals( usuario) & password.getText().equals(contraseña)) {
					System.out.println("Log in");
				} else {
					System.out.println("log out");
				}
			}
		});
		Login.setBounds(160, 182, 105, 29);
		frame.getContentPane().add(Login);
	}

}
