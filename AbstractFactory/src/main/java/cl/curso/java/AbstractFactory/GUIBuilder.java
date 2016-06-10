/**
 * 
 */
package cl.curso.java.AbstractFactory;

/**
 * @author José Navarro
 *
 */
public class GUIBuilder {
	
	public Windows bueldWindow( AbstractWidgetFactory factory)
	{
		return factory.createWindow();
	}

}
