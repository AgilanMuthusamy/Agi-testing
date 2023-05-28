package javaprogram;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
//		int[] data = {3,2,11,4,6,7};
//		Arrays.sort(data);
//		System.out.println(data[1]);
		int[] data = { 3, 2, 11, 4, 6, 7 };
		if (data.length < 2) {
			System.out.println("invalid input");

		} else {
			Arrays.sort(data);
			System.out.println(data[1]);
		}

	}

}
