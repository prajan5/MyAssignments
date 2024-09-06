package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollToElement {

	public static void main(String[] args) {
		//Launch Chrome  
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://www.amazon.in");
		// add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//capture target Element
		WebElement scroll = driver.findElement(By.linkText("About Us"));
		//Perform Action
		Actions obj = new Actions(driver);
		obj.scrollToElement(scroll).perform();
		scroll.click();
		//close the browser
		driver.close();
		
			    

	}

}
