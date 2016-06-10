/**
 * 
 */
package cl.curso.java.builder_app;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Navarro
 *
 */
public class BuilderAutoToyota implements BuilderAuto {

	/* (non-Javadoc)
	 * @see cl.curso.java.builder_app.BuilderAuto#construir()
	 */
	public Auto construir() {
		// TODO Auto-generated method stub
		GPS gps = new GPS("win", "2.0");
		Motor motor = new Motor(100);
		List<Rueda> ruedas = new ArrayList<Rueda>(4);
		ruedas.add(new Rueda(30));
		ruedas.add(new Rueda(30));
		ruedas.add(new Rueda(30));
		ruedas.add(new Rueda(30));
		Auto auto = new Auto("Toyota", "Corolla", ruedas, gps, motor);
		return auto;
	}

}
