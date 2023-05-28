package interview.training2;

public class IgnoreCase {

	public static void main(String[] args) {
		String text1 = "I am Learning Java";
		String text2 = "I am Learning java?";
		String concat = text2.concat(text1);
		System.out.println(concat);
		if (text1 == text2) {
			System.out.println("both are equal");

		}
		if (text1.equals(text2)) {
			System.out.println("both are equal1");

		}
		if (text1.equalsIgnoreCase(text2)) {
			System.out.println("both are equal2");

		} else {
			System.out.println("not equal");
		}
	}

}
