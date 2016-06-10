/**
 * 
 */
package guia11;

import java.util.Scanner;

/**
 * @author José Navarro
 *
 */
public class Rut {

	public void validad()
	{
			
			Scanner in = new Scanner(System.in);
			String rut;
			String subrut;
			String dver;
			int multiplicador;
			int suma = 0;
			int checknum;

			while (true) {
				System.out.println("ingrese su rut (xxxxxxxx-x)");
				rut = in.next();

				if (rut.length() <= 10 && rut.contains("-") && rut.length() >= 3) {
						subrut = rut.split("-")[0];
						dver = rut.split("-")[1].toUpperCase();

						multiplicador = 2;
						for (int i = subrut.length() - 1; i >= 0; i--) {
							suma = suma + (Integer.parseInt("" + subrut.charAt(i)) * multiplicador);
							if (multiplicador == 7) {
								multiplicador = 1;
							}
							multiplicador++;

						}
						System.out.println();
						checknum = 11 - (suma % 11);

						if (checknum == 11 && dver.equals("0")) {
							System.out.println("rut correcto\n");
						} else {
							if (checknum == 10 && dver.equals("K")) {
								System.out.println("rut correcto\n");
							} else {
								if (checknum == Integer.parseInt(dver)) {
									System.out.println("rut correcto\n");
							
							} else {
								throw new RutNoValidoException("Rut invalido");
							}

						}
					System.exit(0);
					break;
						}
						in.close();
			}
		}
	}
}

