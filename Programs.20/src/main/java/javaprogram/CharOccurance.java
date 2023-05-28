package javaprogram;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int a = 0;

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'n') {
				a++;
			}

		}
		System.out.println(a);

	}

}
