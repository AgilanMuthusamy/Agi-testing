package interview.training;

public class Day1 {

	public static void main(String[] args) {
		int num = 15;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("divisble by both 3 nd 5");

		} else if (num % 3 == 0) {
			System.out.println("divisible by 3");

		} else if (num % 5 == 0) {
			System.out.println("divisble bye 5");

		} else if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("divisble by both 3 nd 5");

		} else {
			System.out.println("not divisible by num");
		}
		
	}

}
