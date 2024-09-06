package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	public static void main(String[] args) {
		//Launch Chrome  
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://www.snapdeal.com/");
		// add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//capture target Element
		WebElement mouseOverElectronics = driver.findElement(By.linkText("Electronics"));
		//Move to Electronics
		Actions obj = new Actions(driver);
		obj.moveToElement(mouseOverElectronics).perform();
		
		//mouse over and click 2.0 speaker
		WebElement mouseOverSpeaker = driver.findElement(By.xpath("//span[text()='2.0 Speakers']"));
		//Perform Action
		Actions obj1 = new Actions(driver);
		obj1.moveToElement(mouseOverSpeaker).perform();
		mouseOverSpeaker.click();
		//Close the browser
		driver.close();
				
	
		
		

	}

}
