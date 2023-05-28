import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] number = { 10, 24, 32, 64, 85, 37, 12, 10 };
		Set<Integer> unique = new HashSet<Integer>();
		for (int i = 0; i < number.length; i++) {
			if (!unique.add(number[i])) {
				System.out.println("Duplicate value is" + number[i]);

			}
			System.out.println("unique values are" + unique);

		}

	}

}
