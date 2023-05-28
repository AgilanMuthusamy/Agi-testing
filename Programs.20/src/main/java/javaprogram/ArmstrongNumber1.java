package javaprogram;

import base.BaseTestng;

public class ArmstrongNumber1 extends BaseTestng {

	public static void main(String[] args) {
		
		

		int n = 153;

		int calculated = 0, reminder, original;
		original = n;
		while (n > 0) {
			reminder = n % 10;
			n = n / 10;
			calculated = calculated + (reminder * reminder * reminder);
		}
		
		if (original == calculated)
			System.out.println("It is armstrong number");
		else
			System.out.println("It is not armstrong number");

	}

}
