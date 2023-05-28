package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 5, 3, 2, 1, 2, 3 };
		int target = 3;
		
		int[] out = removeElement(nums, target);
		Assert.assertTrue(Arrays.equals(out, new int[] { 5, 2, 1, 2 }));
	}

	public static int[] removeElement(int[] nums, int target) {
	List<Integer> removedList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=target) {
				
				removedList.add(nums[i]);
			}
			
		}
		System.out.println(removedList);
		int[] array = new int[removedList.size()];
	      for(int i=0;i<array.length;i++) {
	         array[i] = removedList.get(i);
	         
	      }
	      return array;

	}

}
