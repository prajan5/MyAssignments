package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		//click try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		//dismiss the alert
		alert.dismiss();
		//print the text displayed on the frame
		System.out.println(driver.findElement(By.id("demo")).getText());
		//click try it again
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1 = driver.switchTo().alert();
		//Accept the alert
		alert1.accept();
		//print the text displayed on the frame
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.switchTo().defaultContent();
		
	}

}
