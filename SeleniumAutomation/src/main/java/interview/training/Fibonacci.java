package interview.training;

public class Fibonacci {

	public static void main(String[] args) {
//   int num1 = 0;
//   int num2 = 1;
//   int nextNum;
//   int lengthOfSeries = 5;
//   for (int i = 0; i <lengthOfSeries; i++) {
//	   System.out.println(num1);
//	   nextNum = num1+num2;
//	   num1 = num2;
//	   num2 = nextNum;
	int n1 = 0, n2 = 1, n3,i,count=10;
	System.out.println(n1);
	System.out.println(n2);
	for ( i = 2; i < count; i++) {
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		
	}
	
}
	}


