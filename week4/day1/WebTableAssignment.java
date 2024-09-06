package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		
		//Launch Chrome  
		 ChromeDriver driver = new ChromeDriver();
		//Load the url // https://finance.yahoo.com/
		 driver.get("https://finance.yahoo.com/");
		// Maximize the browser window
		 driver.manage().window().maximize();
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click Markets ->Crypto
		 driver.findElement(By.xpath("//li/a/span[text()='Markets']")).click();
		 driver.findElement(By.xpath("//li/a[text()='Crypto']")).click();
		// Locate the table in the dom page
		//find no of rows
			List<WebElement> rowValue = driver.findElements(By.xpath("//table/tbody/tr"));
			int rowSize = rowValue.size();
			System.out.println("row count :"+rowSize);
		//find no of collumns
			List<WebElement> colValue = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr[1]/td"));
			int colSize = colValue.size();
			System.out.println("Col count :"+ colSize);
			
		// Locate the cryptocurrency names in the table using specific row and column.
			// Print the cryptocurrency names(column1)
			
			for (int i = 1; i <=rowSize; i++) {
				
			String crytocurrency= driver.findElement(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(crytocurrency);
			}
		 
		
		 
		
		

	}

}
