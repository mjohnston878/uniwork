/**
 * 
 */
package p240247362;

/**
 * @author matthew
 * UML class for family saloon
 */
public class FamilySaloon extends Car{
	
	// instance vars
	private boolean metallicPaint;
	
	//constructors
	public FamilySaloon() {
		
	}

	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}


	//getters and setters
	
	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FamilySaloon [metallicPaint=" + metallicPaint + ", getMake()=" + getMake() + ", getModel()="
				+ getModel() + ", getHorsePower()=" + getHorsePower() + "]";
	}
	
	/**
	 * 
	 */
	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("MetallicPaint: \t"+this.metallicPaint);
	}
	

}
