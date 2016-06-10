/**
 * 
 */
package repaso;

/**
 * @author José Navarro
 *
 */
public class Libro {

	int isbn = 123456789;
	int multi = 2;
	int suma = 0;
	{
	for( int i = 1 ; i <= 9 ; i++)
	{
		int n = isbn % 10;
		suma = suma + ( n * multi );
		multi++;
		isbn = isbn / 10;
	}
	
	boolean DV = suma % 11 == 0;
	int r = suma % 11;
	int DV2 = 11 - r;
	
	
	
}
}
