package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		long num = 382378823473748L;
		boolean isPrime = true;

		for (int i = 2; i < num; i++)

		{
			if (num % i == 0) {
				isPrime = false;
				break;

			}

		}

		if (isPrime) {
			System.out.println(num + "is a prime");

		} else {
			System.out.println(num + "is not prime");
		}
	}

}
