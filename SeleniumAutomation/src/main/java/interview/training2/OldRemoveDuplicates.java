package interview.training2;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;

public class OldRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			
			set.add(split[i]);
			
		}
		for (String str : set) {
			System.out.println(str);

		}
		

	}

}
