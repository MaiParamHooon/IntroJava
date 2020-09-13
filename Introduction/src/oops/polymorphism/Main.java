package oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Pet p = d;
		Animal a = p;
		
		d.walk();
		p.walk();
		
//		a.walk();
		greetings("k");
		
		System.out.println(d.name);
		System.out.println(p.name);

	}
	
	public static void greetings() {
		System.out.println("Hi, there");
		
	}
	
	public static void greetings(String s){
		System.out.println(s);
	}
}
