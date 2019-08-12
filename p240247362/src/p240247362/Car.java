/**
 * 
 */
package p240247362;

/**
 * @author matthew class about creating a car UML
 */
public class Car {

	// instance vars
	private String make;

	private String model;

	private int horsePower;

	// constructors

	public Car() {

	}

	public Car(String make, String model, int horsePower) {
		super();
		this.make = make;
		this.model = model;
		this.setHorsePower(horsePower);
	}

	// getters and setters
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower > 0 && horsePower < 1001) {
			this.horsePower = horsePower;
		} else {
			this.horsePower = -999;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", horsePower=" + horsePower + "]";
	}

	public void displayAll() {

		System.out.println("Make: \t" + this.make);
		System.out.println("Model: \t" + this.model);
		System.out.println("HorsePower: \t" + this.horsePower);

	}

}
