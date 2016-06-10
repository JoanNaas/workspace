package cl.curso.java.AbstractFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String platform = System.getProperty("os.name").toLowerCase();
        System.out.println(platform);
        
        GUIBuilder builder = new GUIBuilder();
        
        if ( platform.startsWith("win")) {
        	builder.bueldWindow(new MSWindowsWidgetFactory());
		}
        else
        {
        	builder.bueldWindow(new MacOSXWidgetFactory());
        }
    }
}
