package week2.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AdancedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
			

	}

}
