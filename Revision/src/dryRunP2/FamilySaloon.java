/**
 * 
 */
package dryRunP2;

/**
 * @author matthew
 *
 */
public class FamilySaloon extends Car {
	
	private boolean metallicPaint;

	/**
	 * Default constructor
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with arguments
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}
	
	/**
	 * @return the metalicPaint
	 */
	public boolean MetalicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metalicPaint the metalicPaint to set
	 */
	public void setMetalicPaint(boolean metalicPaint) {
		this.metallicPaint = metallicPaint;
	}

	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("Metallic paint \t:" +this.metallicPaint);
		
	}

}
