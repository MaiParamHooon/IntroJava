package extraTopics.reflection;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c = Class.forName("extraTopics.reflection.A");
		System.out.println(c.getSuperclass());
	}

}
class A{
	
}