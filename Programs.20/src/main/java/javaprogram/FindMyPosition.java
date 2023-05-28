package javaprogram;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter ur char : ");
char charAt = scan.next().charAt(0);
charAt = Character.toLowerCase(charAt);

//a=97,A=65;
int asciValue = (int)charAt;
System.out.println(asciValue);
int position = asciValue-96;
System.out.println(position);









	}

}
