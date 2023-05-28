package week1.day1;

public class Palindrome {

	public static void main(String[] args) {

		String word = "madam";
		
		String word1 = "";
		for (int i = word.length()-1; i >= 0; i--) {
			word1 = word1 + word.charAt(i);
		}
			if (word.equals(word1)) {
				System.out.print("The String is a Palindrome");

			} else {
				System.out.print("is not a Palindrome");
			}
		

	}

}
