package week1.day1;

public class MissingElementInAnArray {

	public static void main(String[] args) {
    int[] arr = {1,2,3,4,7,6,8};
    
   int a = arr.length+1;
   int result = (a*(a+1))/2;
    for (int i = 0; i < arr.length; i++) {
		result = result - arr[i];
		
		
	}
   System.out.println("THE MISSING NUMBER IS:"+ result);
   
	} 
}
