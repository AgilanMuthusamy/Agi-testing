package interview.training2;

public class Justify {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			// if(str3.equals(str4))
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");
		// since new operator is used the value kutty is stored in a new location
		// ==equates the address of the value the output becomes different text
		// if u use if(str1.equals(str2))then the result would be same text//

		System.out.println("***");

	}
}
