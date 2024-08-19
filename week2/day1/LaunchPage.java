package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPage {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://www.facebook.com");
		//Enter the email id 
		driver.findElement(By.id("email")).sendKeys("rjeyapriya@gmail.com");
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys("XXXXXXXXX");
		//click login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//Get Title and verify
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		if(getTitle.contains("Facebook"))
		{
			System.out.println("Login is sucessful");
		}
		else
		{
			System.out.println("Login is not sucessful");
		
		}
		//Close the broswer
		driver.close();
		
	}

}
