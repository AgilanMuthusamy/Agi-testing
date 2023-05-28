package javaprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
     int number =0;
     int reverse =0;
     System.out.println("enter ur num");
     Scanner scan = new Scanner(System.in);
     number = scan.nextInt();
     
     
     while (number>0) {
    	 reverse = reverse*10;
    	 reverse =reverse+number%10;
    	 number=number/10;
    	 
    	 		
	}
     System.out.println(reverse);
     
	}

}
