package oops; 

class Vehicle {
	int wheels;
	int headlight;
	String color;
	
		Vehicle(int wheels) {
//		wheels = noOfWheels;
		this.wheels = wheels;
		headlight =2;
		}
		
		Vehicle(int wheels, String color){
			this.wheels = wheels;
			this.color = color;
			headlight = 2;
		}
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
//		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2, "green");
		System.out.println(car.wheels + " " + scooty.wheels + " " + scooty.color);

	}

}
