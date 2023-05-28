package javaprogram;

public class LengthOfString {

	public static void main(String[] args) {
		
		String value = "Agilan";
		char[] charArray = value.toCharArray();
		//System.out.println(value.length());
		
		int length=0;
		for (char c: charArray) {
			length++;
			
		}
		System.out.println(length);
		

	}

}
