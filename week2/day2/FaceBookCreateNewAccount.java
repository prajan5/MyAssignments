package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateNewAccount {
	
	public static void main (String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click Create Account		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//firstname
		WebElement txtFirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		txtFirstname.sendKeys("riya");
		
		//last name
		WebElement txtLastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		txtLastname.sendKeys("Rajan");
		
		//Email
		WebElement txtEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		txtEmail.sendKeys("Rajan@gmail.com");
		
		//Password
		WebElement txtNewPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		txtNewPassword.sendKeys("1230988");
		
		
		//Select Date of Birth
		WebElement dpDay = driver.findElement(By.xpath("//select[@id='day']"));
		Select optDay = new Select(dpDay);
		optDay.selectByIndex(2);
		
		WebElement dpMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select optMonth = new Select(dpMonth);
		optMonth.selectByValue("7");
		
		WebElement dpyear = driver.findElement(By.xpath("//select[@id='year']"));
		Select optYear = new Select(dpyear);
		optYear.selectByVisibleText("1990");
		
		
		//Gender
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		
		//Click sign up 
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		//Close the browser
		driver.close();

		
		
	}

}
