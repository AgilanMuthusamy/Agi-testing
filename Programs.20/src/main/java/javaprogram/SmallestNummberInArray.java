package javaprogram;

import java.util.Arrays;

public class SmallestNummberInArray {
	int[] num= {3,9,5,2};
	
	
	
	
	public void findSmallest() {
		
		int small = Integer.MAX_VALUE;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]<small) {
				small=num[i];
				
				
			}
			
		}System.out.println(small);
		

	}
	
	
	public void findSmallestUsingArray() {
		Arrays.sort(num);
		System.out.println(num[0]);

	}
	
public static void main(String[] args) {
	SmallestNummberInArray obj = new SmallestNummberInArray();
	obj.findSmallest();
	obj.findSmallestUsingArray();
	
}
}
