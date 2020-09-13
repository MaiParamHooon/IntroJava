package conditionalStatements;

public class ElseIf {

	public static void main(String[] args) {
//		int x = 20;
//		if(x < 10) {
//			System.out.println("A");
//		}else if(x > 10 && x <= 20) {
//			System.out.println("B");
//		}else if( x > 20 && x <= 30) {
//			System.out.println("C");
//		}else {
//			System.out.println("D");
//		}
		int a = 8;
		int b = 9;
		int maxOfBothNumbers = 0;
		
		maxOfBothNumbers = a > b ? a : b;
		
		System.out.println("max of both numbers " + maxOfBothNumbers);
		
	}

}
