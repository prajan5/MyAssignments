package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdancedXpathAmazonParentToChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub''
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		//username Relative XPath for Parent->Child releationship
		
		//div[@class='nav-search-field ']/input
		driver.findElement(By.xpath("//div[@class='nav-search-field']/input)"));

		
		//Other advance xpath
		
		

	}

}
