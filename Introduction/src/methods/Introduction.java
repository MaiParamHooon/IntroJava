package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 20;
		int secondNumber = 30;
		
		int result = maxOf(firstNumber, secondNumber);
		System.out.println(result);

		sayHi();
	}
	
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
	}

}
