package seleniuminterview;

import java.util.Iterator;

public class ivyMobility {

	public static void main(String[] args) {
//		String text ="words then";
//		
//		String[] split = text.split(" ");
//		for (int i = 0; i < split.length; i++) {
//			String string = split[i];
//			System.out.print(string);
//		}
//		for (String string : split) {
//			System.out.print(string);
//		}
//String replace = text.replace(" ", "");
//System.out.println(replace);
//String substring = replace.substring(0, 5);
//System.out.println(substring);
		String test = "Agi is a hero for my world";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i%2==0) {
				char[] charArray = split[i].toCharArray();
			//	System.out.println(charArray);
				for (int j = charArray.length-1; j>=0 ; j--) {
					System.out.println(charArray[j]);
					
				}
				
			}else {
				System.out.println(split[i]);
			}
		}
	}

}
