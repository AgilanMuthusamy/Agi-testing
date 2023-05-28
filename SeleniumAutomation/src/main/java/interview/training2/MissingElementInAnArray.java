package interview.training2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		
		for (int i = 1; i <= arr.length; i++) {
			if (i!=arr[i]) {
				System.out.println(i);
break;
				
			}
			
			
		}
	
	}

}
