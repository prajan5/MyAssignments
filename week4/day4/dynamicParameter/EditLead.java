package week4.day4.dynamicParameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod{

	//will run two times(two set of data)  by two browsers
	@DataProvider(name="getData")
	public String [][] setValue(){
		
		String [][] data = new String [2][2];
		//index is from 0
		data[0][0] = "99";
		data[0][1] = "CTS";
				
		data[1][0] = "98";
		data[1][1] = "TCS";
		
		return data;
	}
	
	
	@Test(dataProvider = "getData")
	public void Edit_lead(String PhNo, String CompanyName) throws InterruptedException {
		System.out.println("Edit Lead Execution");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(CompanyName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not edited");
		}
		
	}	
	
}


