package interview.training;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		String revValue = "";
		int length = value.length();
		char[] charArray = value.toCharArray();
		char[] charArray1 = revValue.toCharArray();
		for (int i = length - 1; i >= 0; i--) {
			revValue = revValue + charArray[i];

		}
		if (value.equals(revValue)) {
			System.out.println("palindrome");

		} else {
			System.out.println("not a palindrome");
		}
	}

}
