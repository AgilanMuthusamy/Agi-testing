package javaprogram;

import java.util.Scanner;

public class PrintingTriangle {

	public static void main(String[] args) {
//		int n = 3;
//
//		int i, j;
//		// outer loop to handle number of rows
//		// n in this case
//		for (i = 0; i < n; i++) {
//			// inner loop to handle number of columns
//			// values changing according to outer loop
//			for (j = 0; j <= i; j++) {
//				// printing stars
//				System.out.print("* ");
//			}
//
//			// ending line after each row
//			System.out.println();
//		}
		int number=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		
	int limit = scan.nextInt();
	
	for (int i = 0; i < limit; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print(number+" ");
			number=number+1;
			
		}
		System.out.println();
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
