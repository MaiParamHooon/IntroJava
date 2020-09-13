package extraTopics.innerClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A obj = new A();
//		obj.i = 5;
//		A.B obj1 = obj.new B();
//		obj1.j = 4;
		
//		A.i = 5;
//		A.B obj1 = new A.B();
//		obj1.j = 4;
		
//		A a = new A() {
//			public void AB() {
//				System.out.println("B");
//			}
//		};
//		a.AB();
//		
//	}
		A a = () -> {
			System.out.println("b");
			};
			a.AB();
			
			A b = () -> System.out.println("c");
				b.AB();	
			
	}
}
//class A{
//	int i = 0;
//	class B{
//		int j;
//	}
//}
//class A{
//	static int i = 0;
//	static class B{
//		int j;
//	}
//}
//class A{
//	public void AB() {
//		System.out.println("A");
//	}
//}

//interface A{
//	public default void AB() {
//	}
//}
@FunctionalInterface
interface A {
	void AB();
}

	