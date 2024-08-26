package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdancedXpathParentToChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		//username Relative XPath for Parent->Child releationship
		driver.findElement(By.xpath("//div[@id='username_container']/input)"));

		
			

	}

}
