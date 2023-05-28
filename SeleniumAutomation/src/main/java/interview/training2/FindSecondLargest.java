package interview.training2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int size = data.length;
		Arrays.sort(data);
		System.out.println("sorted"+Arrays.toString(data));
		int res = data[size-2];
		System.out.println("2nd largets"+res);
	}

}
