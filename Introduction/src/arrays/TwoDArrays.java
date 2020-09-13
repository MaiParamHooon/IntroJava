package arrays;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
//		int a[][] = new int[3][5];
//		System.out.println(a[2][4]);
		
//		int a[][] = {
//				{3, 4, 6},
//				{1, 2, 5, 4},
//				{5,2,4}
//				
//		};
//			System.out.println(a[2][1]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter no. of cols ");
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			System.out.println("You are in Row no. " + (i+1));
			for(int j=0; j<cols; j++) {
			System.out.println("enter col no. " + (j+1));
			a[i][j] = sc.nextInt();	
			}
		}
		
		for(int i=0; i<rows; i++) {
			System.out.println("You are in Row no. " + (i+1));
			for(int j=0; j<cols; j++) {
			System.out.println("enter col no. " + (j+1));
			b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix is ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			 c[i][j] = a[i][j] + b[i][j];
			 System.out.print(c[i][j] + " ");
			
			}
			System.out.println();
		}
		
	}

}
