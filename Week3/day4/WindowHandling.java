package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.irctc.co.in");
		//Maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click Flights
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		//Convert to List
		List<String> childWindow = new ArrayList<String>(allWindows);
		//Switch to child window
		driver.switchTo().window(childWindow.get(1));
		//Get title of child window
		System.out.println(driver.getTitle());
		//Switch to parent window
		//driver.switchTo().window(childWindow.get(0));
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//Get the parent window title
		System.out.println(driver.getTitle());
		driver.close();
		
	
		
}
}
