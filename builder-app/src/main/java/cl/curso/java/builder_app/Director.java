/**
 * 
 */
package cl.curso.java.builder_app;

/**
 * @author José Navarro
 *
 */
public class Director {
	
	private BuilderAuto builder;

	/**
	 * @param builder
	 */
	public Director(BuilderAuto builder) {
		super();
		this.builder = builder;
	}

	/**
	 * @return the builder
	 */
	public BuilderAuto getBuilder() {
		return builder;
	}

	/**
	 * @param builder the builder to set
	 */
	public void setBuilder(BuilderAuto builder) {
		this.builder = builder;
	}
	
	
	public Auto ConstruirAuto()
	{
		
		return null;
	}

}
