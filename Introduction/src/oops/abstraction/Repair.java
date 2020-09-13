package oops.abstraction;

public class Repair {
	
	
	public static void repairCar(Car car) {
		
		System.out.println("car is repaired " + car);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ciaz ciaz = new Ciaz();
		Audi audi = new Audi();
//		Car car = new car();
		repairCar(audi);
		
	}

}
