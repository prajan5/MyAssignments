package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args)throws InterruptedException { 
		//Instantiate browser driver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		// Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		// Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajan");
		// Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
		//Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Speicialist");
		Thread.sleep(3000);
		//Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println(title);
		
		String title1 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(title1);
		Thread.sleep(3000);
		if (title1.equals("View Lead"))
		{
			System.out.println("Lead is created succesfully");
		}
		else
		{
			System.out.println("Lead is not created");
		}
		//Close the browser window
		driver.close();
		
		

	}

}
