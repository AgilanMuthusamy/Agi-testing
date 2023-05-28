package javaprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		String str;

		String file =  ("./data5/buffer.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}
		br.close();
	}

}