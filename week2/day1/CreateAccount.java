package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		// Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		// Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Account")).click();
		// Enter a Account Name.
		driver.findElement(By.id("accountName")).sendKeys("HP");
		// Enter a Description.
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Enter a CompanyName.
		driver.findElement(By.id("numberEmployees")).sendKeys("11");
		//Enter a Title .
		driver.findElement(By.id("officeSiteName")).sendKeys("HP");
		Thread.sleep(3000);
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println(title);
		
		String title1 = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		System.out.println(title1);
		Thread.sleep(3000);
		if (title1.equals("Account Details"))
		{
			System.out.println("Account is created succesfully");
		}
		else
		{
			System.out.println("Account is not created");
		}
		//Close the browser window
		driver.close();
		
		

	}

}
