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
public class BuilderAutoTesla implements BuilderAuto {

	/* (non-Javadoc)
	 * @see cl.curso.java.builder_app.BuilderAuto#construir()
	 */
	public Auto construir() {
		// TODO Auto-generated method stub
		
		GPS gps = new GPS("OS", "2.5");
		Motor motor = new Motor(100);
		List<Rueda> ruedas = new ArrayList<Rueda>(4);
		ruedas.add(new Rueda(20));
		ruedas.add(new Rueda(20));
		ruedas.add(new Rueda(20));
		ruedas.add(new Rueda(20));
		Auto auto = new Auto("Tesla", "Model S", ruedas, gps, motor);
		return auto;
	}

}
