package interfaces;

public class Lecturer extends Employee implements IPayable {

	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payWage(double hours, double rate) {
		System.out.println("Lecturer pay:" + hours*rate*2.1);
	}

}
