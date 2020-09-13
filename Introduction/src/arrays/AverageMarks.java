package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos of students");
		int n = sc.nextInt();
		int[] marks = new int[n];
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("Enter Marks of student no. " + (i+1));
			marks[i] = sc.nextInt();
		}
		
		int averageMarks = 0;
		
		for(int i=0; i<marks.length; i++) {
			averageMarks += marks[i];
		
		}
			averageMarks /= n;
			System.out.println("Average marks of students are " + averageMarks);
	}

}
