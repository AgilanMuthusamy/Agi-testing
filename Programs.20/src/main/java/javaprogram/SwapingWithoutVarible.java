package javaprogram;

public class SwapingWithoutVarible {

	public static void main(String[] args) {
		int x = 89;
		int y = 99;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		
//		x = x*y;
//		y = x/y;
//		x = x/y;
		
		
//		x = x+y;
//		y=x-y;
//		x=x-y;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}
}
