package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
	// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	// Load the URL
		driver.get("https://dev186929.service-now.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
	//Shadow
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(5);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		//switch to iframe
		WebElement frame1 = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		sh.findElementByXPath("//h2[contains(text(),'Mobiles')]").click();
		sh.findElementByXPath("//h2//strong[(text()='Apple iPhone 13')]").click();
		
	//Apple iphone 13 page
		//select the replacement option as "yes"
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[text()='Yes']")).click();
		
		//Type Original phone number
		driver.findElement(By.xpath("(//div[contains(@class,'input_controls')]/input)[3]")).sendKeys("1234567890");
		//select Monthly Data Allowance
		WebElement monhtlyDataDp = driver.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option')]"));
		Select option = new Select(monhtlyDataDp);
		option.selectByValue("Unlimited");
		
		//select color option as "Blue"
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[text()='Blue']")).click();
		
		//select the Storage option as "512 GB"
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[text()='512 GB [add $300.00]']")).click();
		//Clcik Order now button
		driver.findElement(By.id("oi_order_now_button")).click();
		
		//print order placed and request number:
		String orderplaced =  driver.findElement(By.xpath("(//div[@class='order_summary']//dd//b)[1]")).getText();
		System.out.println("Order Placed:"+orderplaced);
		
		String reqNumber =  driver.findElement(By.xpath("(//div[@class='order_summary']//dd//b)[2]")).getText();
		System.out.println("Request Number:"+reqNumber);
		
		//Take a snap of the Order page. 
	
		File sourceSnap = driver.getScreenshotAs(OutputType.FILE);
		//path to store snap
		File desSnap = new File("./snaps/phone.png");

		FileUtils.copyFile(sourceSnap, desSnap);

		//close current window;
		driver.close();
		

		
		
		
		
		
	
		
		
	
	
	}
	
}
