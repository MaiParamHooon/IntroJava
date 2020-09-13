package oops;

class Cat {
	
	boolean hasPhurr;
	String breed, color;
	int legs, eyes;


public void walk() {
	System.out.println("walking");
		}

public void description() {
	System.out.println(" my cat has " + legs + " leg ");
	
}
}
public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		
		cat1.legs = 3;
		
		cat1.walk();
		cat1.description();
		

	}

}
