package javaprogram;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 208, n, remainder, SumOfDigits = 0;
		n = input;
		while (n > 0) {
			remainder = n % 10;
		//	SumOfDigits = SumOfDigits + remainder;
			n = n / 10;
			SumOfDigits = SumOfDigits + remainder;

		}
		System.out.println("Sum of digits is " + SumOfDigits);
	}
}
