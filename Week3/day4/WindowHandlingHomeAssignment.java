package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
//initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
//Maximize the browser window
		driver.manage().window().maximize();
//Add Implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).submit();
// Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
// Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
// Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
// Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> childwindow = new ArrayList<String>(allwindows);
		driver.switchTo().window(childwindow.get(1));
		Thread.sleep(3000);
		// Click on the first resulting contact.
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();		
		Thread.sleep(3000);
		//Switch to the main window
		driver.switchTo().window(childwindow.get(0));
	// Click on the widget of the "To Contact".
		driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
		Set<String> allwindows1 = driver.getWindowHandles();
		//Convert Set to List
		List<String> window1 = new ArrayList<String>(allwindows1);
		driver.switchTo().window(window1.get(1));
		Thread.sleep(3000);
	
// Click on the second resulting contact.
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[3]")).click();		
		Thread.sleep(3000);
		//Switch to the main window
		driver.switchTo().window(window1.get(0));
// Click on the Merge button.
		driver.findElement(By.linkText("Merge")).click();
		Thread.sleep(3000);
// Accept the alert.
		Alert alert = driver.switchTo().alert();
		alert.accept();
// Verify the title of the page.
		System.out.println(driver.getTitle());
		
		
		

	}

}
