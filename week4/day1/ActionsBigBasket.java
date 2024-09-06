package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Initialize ChromeDriver
			ChromeDriver driver = new ChromeDriver();
		// Load the URL (https://www.amazon.in/)
			driver.get("https://www.bigbasket.com/");
		// Maximize the browser window
			driver.manage().window().maximize();
		// Add an implicit wait to ensure the webpage elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Clcik Shop catergory button
			driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
						Thread.sleep(3000);
		//3.Mouse over "Foodgrains, Oil & Masala"
			WebElement Food = driver.findElement(By.xpath("(//li/a[text()='Foodgrains, Oil & Masala'])[2]"));
			
			//Perform Action
			Actions obj1 = new Actions(driver);
			obj1.moveToElement(Food).perform();
			
			Thread.sleep(3000);
			//Mouse over rice&rice products
			WebElement Rice = driver.findElement(By.xpath("(//li/a[text()='Rice & Rice Products'])[1]"));
			//Rice.click();
			
			//Perform Action
			Actions obj2 = new Actions(driver);
			obj2.moveToElement(Rice).perform();
			
			WebElement BoiledRice = driver.findElement(By.xpath("(//li/a[text()='Boiled & Steam Rice'])[1]"));
			BoiledRice.click();
			
			
			driver.findElement(By.xpath("//span[text()='Product Rating']")).click();
			Thread.sleep(3000);
			
			//Filter items by BB Royal brand
			driver.findElement(By.xpath("(//input[@placeholder='Search here'])[1]")).sendKeys("bb Royal");
			Thread.sleep(3000);
			
			WebElement chbox = driver.findElement(By.id("i-BBRoyal"));
			
			//Perform Action
			Actions obj3 = new Actions(driver);
			obj3.moveToElement(chbox).perform();
			chbox.click();
			
			Thread.sleep(3000);
			//Click Tamil Ponni Boiled Rice
			driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
			
			
			Set<String> allwindows = driver.getWindowHandles();
			List<String> childwindow = new ArrayList<String>(allwindows);
			driver.switchTo().window(childwindow.get(1));
			
			
			//Select 5 Kg bag//need help here
			Thread.sleep(3000);
			WebElement packsize = driver.findElement(By.xpath("//section[contains(@class,'PackSizeSelector')]//div//span[text()='5 kg']"));
			
			//Perform Action
			Actions obj4 = new Actions(driver);
			obj4.moveToElement(packsize).perform();
			packsize.click();
					
			//Print the price			
			System.out.println(driver.findElement(By.xpath("//table/tr[1]/td[1]")).getText());
		
			
			//10. Click "Add basket" to add the bag to your cart.
			driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
			
			//11. Verify the success message that confirms the item was added to your cart.
		
			System.out.println(driver.findElement(By.xpath("//div[@class='self-center']/following-sibling::p[1]")).getText());
			
			//Take a snapshot of the current page
		
			WebElement souresnap = driver.findElement(By.id("confetti-container"));
			File sourceSnap = souresnap.getScreenshotAs(OutputType.FILE);
					
			//path to store snap
			File desSnap = new File("./snaps/ricebag.png");
					
			//step 3-combine source and destination
			FileUtils.copyFile(sourceSnap, desSnap);
			
			//close current window;
			driver.close();
			//Close parent window
			driver.quit();
			
			
			
		
	
		

			 
		
	}

}
