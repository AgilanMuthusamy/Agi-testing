package javaprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		String fileName= "data5/buffer.txt";
		
		try {
			FileOutputStream writer  = new FileOutputStream(fileName);
			writer.write("agilan".getBytes());
			writer.write("\r\n".getBytes());
			writer.write("selenium king".getBytes());
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
