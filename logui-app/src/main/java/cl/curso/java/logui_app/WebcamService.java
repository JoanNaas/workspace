/**
 * 
 */
package cl.curso.java.logui_app;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * @author José Navarro
 *
 */
public class WebcamService {
	
	
	public static void tomarFoto() throws IOException
	{
		Webcam webcam = Webcam.getDefault();
	    webcam.setViewSize(WebcamResolution.VGA.getSize());
	    webcam.open();
	    ImageIO.write(webcam.getImage(), "PNG", new File("C:/Users/usuario/Desktop/" + new Date().getTime()+".png"));
	}
	
    

}
