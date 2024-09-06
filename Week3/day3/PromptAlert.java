package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		//switch to alert
		Alert alert = driver.switchTo().alert();
		//send keys
		alert.sendKeys("Prompt Alert");
		//dismiss the alert
		alert.dismiss();
		//type the text displayed.		
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		
		
		
		
		
		
	 

	}

}
