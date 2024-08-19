package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//create object to access methods in Chromedriver class
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//open the site
		driver.get("http://www.facebook.com");
		//Close the browser
		driver.close();
		
		
		

	}

}
