package week3.day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL
	    driver.get("www.google.com");

	}

}
