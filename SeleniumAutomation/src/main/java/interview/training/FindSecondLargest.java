package interview.training;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 8 };
		int length = data.length;
		Arrays.sort(data);
	//	for (int i = 0; i < data.length; i++) {

	//	}
		System.out.println("SecondLargest: " + data[length - 2]);
	}

}
