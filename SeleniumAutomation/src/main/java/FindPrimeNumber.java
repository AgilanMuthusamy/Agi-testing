import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the number to validate it as prime or not:");
		
		/*
		 * if ((number != 2 && number != 3 && number != 5 && number != 7) && (number % 2
		 * == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0)) {
		 * System.out.println("not prime number");
		 * 
		 * } else { System.out.println("prime number");
		 * 
		 * }
		 */		
		
		
		int number1 = 17;
		if ((number1 !=2 && number1 !=3 && number1 !=5 && number1 !=7)
			&& (number1 %2 == 0 ||number1 %3 == 0 || number1 %5 == 0 || number1 %7 == 0)) {
			System.out.println("no prime");
		}else {
			System.out.println("prime");
		}
			
	}

}
