package org.college;

public class Justify {

	public static void main(String[] args) {
		String str3 = new String("kutty");

		String str4 = new String("kutty");
		if (str3.equals(str4)) {
			System.out.println("samr text");

		} else {
			System.out.println("differnt text");
			/*
			 * //since new operator is used the value kutty is stored in a new location
			 * //==equates the address of the value the output becomes different text //if u
			 * use if(str1.equals(str2))then the result would be same text//
			 * 
			 */

			System.out.println("****");
			
		}

	}
}