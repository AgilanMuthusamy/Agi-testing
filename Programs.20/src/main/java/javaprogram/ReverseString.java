package javaprogram;

public class ReverseString {
	

	public static void main(String[] args) {
		 String  data = "i am going good";
String reversed="";
		//String data = "i am going good";
		
		// Using StringBuilder class
//		StringBuilder input = new StringBuilder(data);
//		System.out.println(input.reverse());
//		
		String[] split = data.split(" ");
		int length = split.length;
		System.out.println(length);
		for (int i = length-1; i >=0; i--) {
			
			reversed=reversed+split[i]+" ";
			
			
		}
		
		System.out.println(reversed);
		
		
	}
//public void buffer() {
// StringBuffer br = new StringBuffer(data);
// System.out.println(br.reverse());
// 
// 
//}
	}


