package loops;

import java.util.Scanner;

public class AdvancedPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int number = 1;
//		
//			for(int i = 1; i <= n; i++) {
//				for(int j = 1; j <= n-i; j++) {
//					System.out.print("  ");
//				}
//				for(int j = 1; j<=i; j++) {
//      			System.out.println("* ");
//					System.out.print(number++ + "  ");
//				}
//			System.out.println();
//			}
//		
//	}
//		for(int i=1; i<=2*n-1; i++) {
//			if(i<=n) {
//				for(int j=1; j<=i; j++) {
//					System.out.print("* ");
//				}
//			}
//				
//			else {
//				for(int j=1; j <= 2*n-1-i+1; j++) {
//					System.out.print("* ");
//				}
//					
//				}
//			System.out.println();
//			}
		System.out.println("* ");
			for(int i=0; i<n-2; i++) {
				System.out.print("* ");	
				for(int j=0; j<i; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			
			System.out.println();
			}
				if(n>1) {
					
				for(int i=1; i<=n; i++) {
				System.out.print("* ");
					}
				}
		}
	}

