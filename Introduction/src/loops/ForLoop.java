package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

//		for(int i = 0; i < 100; i += 1) {
//			System.out.println("hello world " + i);
//		}
//		for(int i = 0; i < 100; i = i + 2) {
//			System.out.println(i);
//		}
//		
//    int sum = 0;
//    int n = 5;
//    for(int i = 1; i <= n; i++) {
//    	sum = sum + i;
//         }
//    System.out.println(sum);
//		int n = 1;
//		for(int i = 100; i >= n; i -= 1 i--) {
//			System.out.println(i);
//			
//		}
//		int tableOf = 4;
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(tableOf * i);
////		}
//		for(int i = 0; i < 1; ) {
//			System.out.println(i);
//		}
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int fact = 1;
//		for(int i = n; i >= 1; i--) {
//			fact = fact * i;
//		}
//		System.out.println(fact);
//			
		
//		}
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int a = 0;
//	System.out.print(a + " ");
//	int b = 1;
//	System.out.print(b + " ");
//	
//	for(int i = 0; i <= n-2; i++) {
//		int c = a + b;
//		System.out.print(c + " ");
//		a=b;
//		b=c;
//	    }
	
//    }
//	Scanner sc = new Scanner(System.in);
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	int result = 1;
//	for(int i = 0; i <= b; i++) {
//		result *= a;
//	}
//	System.out.println(result);
//  } 
//
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		boolean isPrime = true;
//		for(int i = 2; i*i <= n; i++) {
//			if(n % i == 0) {
//				isPrime = false;
//						break;
//			}
//			
//		 }
//			if(n<2) {
//				isPrime = false;
//			}
//			System.out.println("isPRIME " + isPrime);
//		
//    }
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		float result = 0;
//		for(float i=1; i<=n; i++) {
//			result += 1/i;
//			}
//		System.out.println(result);
		Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
		float result = 0;
		for(float i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				result -= 1/i;
				}
			else {
				result += 1/i;
				}
		}
		System.out.println(result);
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
