package javaprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 67;
		boolean nonPrime = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("is not Prime");
				nonPrime = true;
				break;
			}

		}
		if (!nonPrime) {
			System.out.println("is  Prime");

		}
	}
}
	

