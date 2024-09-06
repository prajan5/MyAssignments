package week4.day3.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button/div/span[text()='App Launcher']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//div/input[@class='slds-input']")).sendKeys("Legal Entities");
		//p[text()=' Entities']
		
		//a/span[text()='Legal Entities']
				
				//a//span[text()='New Legal Entity']
		
		//Name
		
		//CompanyName
		
		
		//driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).click()
		//input-214
		
	
		// Login to https://login.salesforce.com
		// Username: dilip@testleaf.com
		// Password: testleaf@2024
		// Click on the toggle menu button from the left corner
		// Click View All and click Legal Entities from App Launcher
		// Click on the Dropdown icon in the legal Entities tab
		// Click on New Legal Entity
		// Enter the Company name as 'TestLeaf'.
		// Enter Description as 'Salesforces'.
		// Select Status as 'Active'
		// Click on Save
		// Verify the Alert message (Complete this field) displayed for Name
		
		
		

	}

}
