package exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
//		try {
//		int a = 5;
//		int b = 4;
//		int c = a/b; 
//		int m[] = new int[4];
//		System.out.println(m[6]);
//		
//		
// 		System.out.println(c);
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("check index");
//		} catch(IllegalArgumentException e) {
//			System.out.println("check your casting");
//		} finally {
//			System.out.println("sorry for the inconvenience");
//		}
		
		fun1();
		
		
//		System.out.println("imp needs to run");
//		fun1();
	}
	static void fun1() {
		int a = 5;
		int b = 3;
		int c = a/b; 
		System.out.println(c);
//		boolean isDanger = true;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("danger");
//			}
		try {
//		fun2();
			Thread.sleep(1000);
		} catch(InterruptedException e) {
//			System.out.println(e.getMessage() + " bleh");
			e.printStackTrace();
		}
		System.out.println("3");
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger");
		}
		
	}
}


