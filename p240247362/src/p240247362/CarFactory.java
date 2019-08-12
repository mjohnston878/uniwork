/**
 * 
 */
package p240247362;

/**
 * @author Matthew Johnston 
 * Student no: 40247362
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FamilySaloon fs1 = new FamilySaloon("Audi", "A3", 130, true);
		F1 f11 = new F1("Ferrari", "Maranello", 333, 1.24);
		F1 f12 = new F1("McLaren", "MCL2016", 998, 1.12);
		RallyCar r1 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, true);		
	
	
	
		Car [] cars = {fs1, f11, f12, r1, fs2};
		showAllCarDetails(cars);
		System.out.println();
		outputLeastHP(cars);
	}
	
	public static void showAllCarDetails(Car[] cars) {
		
		for (Car car: cars) {
			System.out.println();
			car.displayAll();
		}
	}
	
	public static void outputLeastHP(Car[] cars) {
		
		int min = cars[0].getHorsePower();
		String leastHPModel = cars[0].getModel();
		
		for (Car c : cars) {
			
			if (c.getHorsePower()<min) {
				min=c.getHorsePower();
				leastHPModel = c.getModel();
			}
			
		}
		
		System.out.println("Minimum Horse Power is: "+leastHPModel);

	}
	

}
