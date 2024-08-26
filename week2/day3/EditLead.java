package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		// Click on Create Lead.
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("WFH");
		// Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ragul");
		// Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vimal");
		// Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ragul");
		// Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.name("departmentName")).sendKeys("JOG");
		// Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Edit Lead");
		// Enter your email in the E//mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ragul@gmail.com");
		
		// Select State/Province as NewYork Using Visible Text.
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select optstate = new Select(stateDropdown);
		optstate.selectByVisibleText("New York");
		
		// Click on the Create Button.
		driver.findElement(By.name("submitButton")).click();
		// Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		// Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("ImportantNotes");
		// Click on the update button.
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		// Get the Title of the Resulting Page.
		String title1 = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(title1);
		if (title1.equals("View Lead"))
		{
			System.out.println("Title:"+title1);
		}
		else
		{
			System.out.println("Title is not "+title1);
		}
		// Close the browser window.
		driver.close();
		

	}

}
