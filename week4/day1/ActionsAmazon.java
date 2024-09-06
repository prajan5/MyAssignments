package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException {
		// Initialize ChromeDriver
			ChromeDriver driver = new ChromeDriver();
		// Load the URL (https://www.amazon.in/)
			driver.get("https://www.amazon.in/");
		// Maximize the browser window
			driver.manage().window().maximize();
		// Add an implicit wait to ensure the webpage elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Search for "oneplus 9 pro".
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		//3. Get the price of the first product.
			String priceSymbol = driver.findElement(By.xpath("(//span[@class='a-price-symbol'])[1]")).getText();
			String phonePrice =driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
			System.out.println("PhonePrice:"+priceSymbol+phonePrice);
			String price = priceSymbol.concat(phonePrice).concat(".00");
		//4. Print the number of customer ratings for the first displayed product.
			WebElement ratings= driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]"));
			ratings.click();
		   //get the rating from the popup
			Actions obj1 = new Actions(driver);
			obj1.moveToElement(ratings).perform();
			System.out.println(driver.findElement(By.id("acr-popover-title")).getText());
		//click first image 
			driver.findElement(By.xpath("(//div/img[@class='s-image'])[1]")).click();
		//7. Click the 'Add to Cart' button.
			Set<String> allwindows = driver.getWindowHandles();
			List<String> childwindow = new ArrayList<String>(allwindows);
			driver.switchTo().window(childwindow.get(1));
		//Add Cart Button	
			driver.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(3000);
		//verify if subtotal is correct.	
			String subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
			if (price==subtotal)
			{
			System.out.println("Subtotal is correct");
			}
			else
			{
			System.out.println("Subtotal is incorrect");
			}
		//Close the browser
			driver.close();
			
			
			 
		
	}

}
