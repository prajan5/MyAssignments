package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL
	    driver.get("https://www.leafground.com/window.xhtml");
	    //Click open with delay button
	    driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
	    //Create object 
	    WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
	    //wait until 3 windows opened 
	    boolean unitil = wt.until(ExpectedConditions.numberOfWindowsToBe(3));
	    //print the confirmation 'true'
	    System.out.println(unitil);	
	    //Close all the windows
	    driver.quit();
		

	}

}
