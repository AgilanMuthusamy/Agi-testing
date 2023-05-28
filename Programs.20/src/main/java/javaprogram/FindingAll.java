package javaprogram;

public class FindingAll {

	public static void main(String[] args) {
		String test = "$$ Welcome to 1st Automation Interview $$ ";
		char[] charArray = test.toCharArray();
		int letter = 0, num = 0, space = 0, specialChar = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter++;

			} else if (Character.isDigit(charArray[i])) {
				num++;

			} else if (Character.isSpaceChar(charArray[i])) {
				space++;

			} else {
				specialChar++;
			}

		}
		System.out.println("$$ Welcome to 1st Automation Interview $$ ");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}	
		
		
		
		
	