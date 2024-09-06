package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;




public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;

	//order can be anything but same variables from xml to be used 
	@Parameters({"url","browser","username","password"})
	
	@BeforeMethod()
	public void precondition(String Url , String Browser, String Username , String Password)
	{		
		
		switch(Browser)
		{
		case "chrome":
			driver=new ChromeDriver();
		case "edge":
			driver=new EdgeDriver();
		case "default":
			System.out.println("No broser found")	;
			break;
			
			
		}
		
	
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(Username);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	
	@AfterMethod()
	public void postcondition()
	{		
		driver.close();
		System.out.println("Closed the browser");
		
		
	}

	}


