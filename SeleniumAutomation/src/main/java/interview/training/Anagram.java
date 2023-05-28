package interview.training;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		String a = "";
		String b = "";
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		a = String.valueOf(charArray);
		b = String.valueOf(charArray2);
		if (a.equals(b)) {
			System.out.println("the values are same");

		} else {
			System.out.println("the values are different");
		}

	}

}
