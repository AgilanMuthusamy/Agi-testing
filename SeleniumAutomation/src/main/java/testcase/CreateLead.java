package testcase; 


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		System.out.println("cr....................");
		excelFileName = "CreateLead";

	}
@Test(dataProvider ="provideData")
	public  void runCreateLead(String companyName, String fName, String lName, String phNumber) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNumber);
		driver.findElement(By.name("submitButton")).click();
		
}
//@DataProvider
//public String[][] provideData() throws IOException {
////	ReadExcel re = new ReadExcel();
////	String[][] readData = re.readData();
//	
//	return ReadExcel.readData("CreateLead");
//	
//	
//
//}
}






