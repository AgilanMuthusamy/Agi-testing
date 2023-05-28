package week3.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class FindTrain {

	public static void main(String[] args) {

		
		ArrayList<String> trainName = new ArrayList<String>();
		
		trainName.add("vallavan");
		trainName.add("vaigai");
		trainName.add("chennaiexpress");
		trainName.add("sbs expresss");
		trainName.add("indianexpress");
		
		Collections.sort(trainName);
		System.out.println(trainName);
		int size=trainName.size();
		System.out.println(trainName.get(size-2));
		
	}

}
