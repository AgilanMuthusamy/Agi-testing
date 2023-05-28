package javaprogram;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinInGivenArray {

	public static void main(String[] args) {
		Integer[] array = { 1, 45, 77, 88, 33, 23, 4 };
		Integer max = Collections.max(Arrays.asList(array));
		System.out.println("Maximum array of number is " + max);
		Integer min = Collections.min(Arrays.asList(array));
		System.out.println("Maximum array of number is " + min);
	}

}
