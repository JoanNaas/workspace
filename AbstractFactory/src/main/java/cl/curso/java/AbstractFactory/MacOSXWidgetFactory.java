/**
 * 
 */
package cl.curso.java.AbstractFactory;

/**
 * @author José Navarro
 *
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	/* (non-Javadoc)
	 * @see cl.curso.java.AbstractFactory.AbstractWidgetFactory#createWindow()
	 */
	public Windows createWindow() {
		// TODO Auto-generated method stub
		
		return new MacOSXWindows();
	}

}
