package interview.training;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 5, 8 };
		int a = arr.length+1;
	int	b =( a*(a+1))/2;
	for (int i = 0; i < arr.length; i++) {
	b= b-arr[i];
		
		
	}
	System.out.println("Missing number: "+ b);	
		

			

		

	}

}
