package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id ='j_idt88:j_idt90']/span[text()='Click']")).click();
		
		String getTitle = driver.findElement(By.className("route-bar-breadcrumb")).getText();
		if(getTitle.contains("Dashboard"))
		{
			System.out.println("Title:Dasboard is displayed");
		}
		else
			System.out.println("Title is not Dasboard");
		
		//Navigate back 
		driver.navigate().back();
		
		if(driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled()==true)
		{
			System.out.println("Confirm button is disabled");
		}
		else
			System.out.println("Confirm button is not dsabled");
		
		//Position of the Submit button
		System.out.println("Position of the Submit button: "+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
		
		//Color of the Save button
		System.out.println("Color of the Save button: "+driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("Color"));
				
		//Height and Weight  button
		System.out.println("Height and weight of the button: "+driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize());
				
		driver.close();
		
		

	}

}
