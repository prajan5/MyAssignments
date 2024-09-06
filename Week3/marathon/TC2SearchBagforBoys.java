package week3.marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2SearchBagforBoys {

	public static void main(String[] args) throws InterruptedException {
	//01) Launch Chrome  
		ChromeDriver driver = new ChromeDriver();
	//02) Load URL
		driver.get("https://www.amazon.in");
	    // add  implicitlyWait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//03) Type "Bags for boys" in the Search box
	    WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	    txtSearch.sendKeys("bags for boys",Keys.ENTER);
	   
	//05) Print the total number of results (like 50000)/1-48 of over 50,000 results for "bags for boys"
	    String stext1 = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//span)[1]")).getText();
	    String stext2 = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//span)[3]")).getText();
	    System.out.println(stext1+" "+stext2);
	    Thread.sleep(3000);
	    
	//06) Select the first 2 brands in the left menu
	    //WebElement chkbox1 = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]"));
	 	WebElement chkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[3]"));
	    chkbox1.click();
	    Thread.sleep(3000);
	    WebElement chkbox2 =driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]//i)[4]"));
	    chkbox2.click();
	    
	 //Select New arrivals 
	   WebElement dp = driver.findElement(By.id("s-result-sort-select"));
	   Select optNewArrival= new Select(dp);
	   Thread.sleep(3000);
	   optNewArrival.selectByVisibleText("Newest Arrivals");
	   
	 //08) Print the first resulting bag info (name, discounted price)
	    System.out.println(driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//h2)[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//h2)[2]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());
	  //09) Get the page title and close the browser(driver.close())
	    System.out.println(driver.getTitle());
	   //close the browser
	    //driver.close();
	
	}
	  //


	

}
