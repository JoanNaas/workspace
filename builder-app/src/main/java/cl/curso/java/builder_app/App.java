package cl.curso.java.builder_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Director juan = new Director(new BuilderAutoToyota());
       
       
      juan.construirAuto();
      
      System.out.println(juan.construirAuto().getMarca());
    }   
}
