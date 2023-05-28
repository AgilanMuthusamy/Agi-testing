package week1.day1;

public abstract class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		int num = 10;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("factorial is" + factorial);

	}

}
