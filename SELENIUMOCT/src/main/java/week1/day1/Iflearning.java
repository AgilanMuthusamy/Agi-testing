package week1.day1;

public class Iflearning {

	public static void main(String[] args) {
		int number = 21;

		if (number % 3 == 0) {
			System.out.println("TRIZZ");

		}

		if (number % 5 == 0) {
			System.out.println("FIZZ");

		}

		if (number % 3 == 0 && number % 5 == 0) {

			System.out.println("TRIZZ-FIZZ");
		}

		else {
			System.out.println("not divisible both by 3 or 5");
		}
	}

}
