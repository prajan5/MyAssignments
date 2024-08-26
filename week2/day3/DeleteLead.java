package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate browser driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();

		// Enter the Username as and the Password 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on the Login Button.
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the CRM/SFA Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the Leads Button.
		driver.findElement(By.linkText("Leads")).click();
		// Click on Find leads .
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number and Click Find Leads 
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.
		
       	
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();
       	Thread.sleep(3000);
       	System.out.println(leadID);
       	
   
			
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		Thread.sleep(3000);
		// Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(3000);
		// Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		// Enter the captured lead ID.
		//driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		// Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// Verify the presence of the message "No records to display" in the Lead List.
		String sMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(sMessage);
		}

}
