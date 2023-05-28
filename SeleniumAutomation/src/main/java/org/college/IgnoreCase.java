package org.college;

public class IgnoreCase {

	public static void main(String[] args) {
		String text1 = "I am Learning Java";
		String text2 = "I am Learning Java";
		if (text1 == text2) {
			System.out.println("both r equal");
		}
		if (text1.equals(text2)) {
			System.out.println("equals");

		}
		if (text1.equalsIgnoreCase(text2)) {
			System.out.println("ignorecase r equal");

		} else {
			System.out.println("not equal");
		}
	}

}
