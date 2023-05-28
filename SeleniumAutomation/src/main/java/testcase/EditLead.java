package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		System.out.println("set value before");
		excelFileName = "CreateLead";
		System.out.println("set value aft");

	}
@Test(dataProvider ="provideData")
	public void runEditLead(String companyName, String fName, String lName, String phNumber )  {
		System.out.println("editLead...");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
}
//@DataProvider
//public String[][] provideData() throws IOException {
////	ReadExcel re = new ReadExcel();
////	String[][] readData = re.readData();
////	
//	return ReadExcel.readData("EditLead");
//	
//	
//
//}
}






