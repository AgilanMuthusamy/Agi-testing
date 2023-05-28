package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
Properties prop = new Properties();
File file = new File("src/main/resources/en.properties");
FileInputStream fs = new FileInputStream(file);

prop.load(fs);
String val = prop.getProperty("MyLeads_CreateLead");
System.out.println(val);
	}

}
