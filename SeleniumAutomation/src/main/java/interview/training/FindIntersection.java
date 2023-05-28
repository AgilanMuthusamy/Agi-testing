package interview.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int array[] = { 3, 2, 11, 4, 6, 7 };
		int array1[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array[i] == array1[j]) {

					arrayList.add(array[i]);
					// System.out.println("intersection number is: " + array[i]);

				}

			}

		}
		Collections.sort(arrayList);
		System.out.println("intersection number is: " + arrayList);

	}

}
