package week8.day1;

public class LearnThrow {

	public static void division(int num1, int num2) {

		if (num1 < num2) {
			throw new ArithmeticException("Invalid Input : num1 is smaller");

		} else {
			System.out.println(num1 / num2);
		}

	}

	public static void main(String[] args) {
		division(5, 10);
	}

}
