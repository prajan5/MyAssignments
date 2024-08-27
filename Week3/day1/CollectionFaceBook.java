package week3.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionFaceBook {

	public static void main(String[] args) {
				
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//get the size of all the elements
		List<WebElement> sizeCount = driver.findElements(By.tagName("a"));
		int size = sizeCount.size();
		System.out.println("Size of the elements"+size);
		
		//Print all the text presented in a tag
		for (int i= 0 ;i<sizeCount.size();i++)
			{
			String text = sizeCount.get(i).getText();
			System.out.println(text);
		}
		
	}
}
