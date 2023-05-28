package interview.training2;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		String replaceAll2 = sentence.replaceAll(sentence.substring(1,4), "abcd");
		System.out.println(replaceAll2);
		String substring = sentence.substring(1, 7);
		System.out.println(substring);
		String replaceAll3 = sentence.replaceAll("\\D", "");
		System.out.println(replaceAll3);
		
		for (int i = 5; i <=14; i++) {
			char charAt = sentence.charAt(i);
			System.out.println("char at "+i+"index is : "+charAt);
			
		}
		/*
		 * 
		 * String text1 = sentence.replaceAll(sentence.substring(1, 4), "abcd");
		 * System.out.println(text1); String text2 = sentence.substring(4, 14);
		 * System.out.println(text2);
		 */
//		String replaceAll = sentence.replaceAll("8", "11");
//		System.out.println(replaceAll);
//		for (int i = 5; i <= 14; i++) {
//			char c = sentence.charAt(i);
//			System.out.println("Char at " + i + " Index is: " + c);
//
//		}
	}

}
