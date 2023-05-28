package week8.day1;

import java.util.Date;

public class GenerateRandomNumber {

//	public static void main(String[] args) {
//		int ranNum = (int) (Math.random() * 999999 + 999999);
//System.out.println(ranNum);
//	}
	
	
	public static void main(String[] args) {
		
		Date date = new Date();
		  String strDate = date.toString();
		  String newDate = strDate.replaceAll(":", "_");

		System.out.println(newDate);
		
	}

}
