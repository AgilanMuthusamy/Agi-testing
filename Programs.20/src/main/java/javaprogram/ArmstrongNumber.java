package javaprogram;

import base.BaseTestng;

public class ArmstrongNumber extends BaseTestng {
	// An Armstrong number of three digits is an integer such that the sum of the
	// cubes of its digits is equal to the number itself.
	// For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371

	int n = 153;// Input number

	public void arm() {
		int calculated = 0, reminder, original;
		original = n;
		while (n > 0) {
			reminder = n % 10;
			n = n / 10;
			original = calculated + (reminder * reminder * reminder);

		}
		if (original == calculated) {
			System.out.println("It is armstrong number");

		} else {
			System.out.println("It is not armstrong number");
		}

	}

}
