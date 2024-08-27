package week3.day1homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com");

		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//span[text()='MEN']")).click();
		
		Thread.sleep(3000);
		
		// To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//strong[text()='WESTERN WEAR']")).click();
		
		// Print the count of the items found.
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		
		// Get the list of brand of the products displayed in the page and print the list.
		
		
		
		// Get the list of names of the bags and print it

	}

}
