package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp = n;
//	int sum = 0;
//	
//	
//	while(temp > 0) {
//		int lastDigit = temp % 10;
//		temp /= 10;
//		sum += lastDigit;
//		}
//	System.out.println("the sum is" + sum);
//	
//		int numberOfDigit = (int)Math.log10(n) + 1;
//		System.out.println(numberOfDigit);
//	
	int reversedNumber = 0;
	
		while(temp>0) {
			int lastDigit = temp % 10;
			reversedNumber = reversedNumber*10 + lastDigit;
			temp /= 10;
			}
			if(reversedNumber==n) {
				System.out.println("Is a Palindrome");
		}
			else {
				System.out.println("Is not a Palindrome");
			}
	}
}
