package interview.training2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "PayPal India";
		String company1 = company.replace(" ", "");
		char[] charArray = company1.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupSet = new LinkedHashSet<Character>();
		

		for (int i = 0; i < charArray.length; i++) {
			if (!charSet.add(charArray[i])) {
				dupSet.add(charArray[i]);
			}
			if (dupSet.contains(charArray[i])) {
				charSet.remove(charArray[i]);
			}
		}
		System.out.println("before removing duplicates");
		System.out.println(company1);
		System.out.println("after removing the duplicates");
		for (Character character : charSet) {
			if (!charSet.isEmpty()) {
				System.out.print(character);
			} else {
				System.out.println("the charset is empty");
			}
		}

		}

	}


