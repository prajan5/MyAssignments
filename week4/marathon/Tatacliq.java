package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
	// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	// Load the URL (https://www.amazon.in/)
		driver.get("https://www.tatacliq.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//2. MouseHover on 'Brands'
		WebElement brand= driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(brand).perform();
		
	//3. MouseHover on 'Watches & Accessories'
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions obj1 = new Actions(driver);
		obj1.moveToElement(watch).perform();
		
	//4. Choose the first option from the 'Featured brands'.
	    driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
	//5. Select sortby: New Arrivals
	    WebElement sortbydp = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
	    Select newarrival = new Select(sortbydp);
	    newarrival.selectByVisibleText("New Arrivals");
	 
	//6. choose men from catagories filter.
	     driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckboxBlock']/div[text()='Men']")).click();
	//7. print all price of watches
	     Thread.sleep(3000);
	     List<WebElement> priceAllitems = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
	
		for(WebElement price: priceAllitems)
	   {
			String pricetext = price.getText();
			System.out.println(pricetext);
		}
		
		Thread.sleep(3000);
	 //Get the price of the first product 
		 String priceFirstProduct = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)[1]")).getText();
		 priceFirstProduct = priceFirstProduct+".00";
		 System.out.println("Price of the first product :"+priceFirstProduct);
		 
	//8. click on the first resulting watch
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		
	//9. click Add to Bag   and  get count from the Bag cart icon.
		Set<String> allwindows = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(allwindows);
		driver.switchTo().window(win.get(1));
		driver.findElement(By.xpath("//div[@class='Button__base']/span[text()='ADD TO BAG']")).click();
		
		String Bagcount = driver.findElement(By.xpath("//div/span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Bagcount:"+Bagcount);
	
		
	//10. Click on the Bag cart icon"
	
		 driver.findElement(By.xpath("//div/span[@class='DesktopHeader__cartCount']")).click();
			
	//11. compare two price are similar
			String Checkoutprice = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();
			System.out.println("BagProductPrice:"+Checkoutprice);
			if (priceFirstProduct.equalsIgnoreCase(Checkoutprice))
			{
				System.out.println("Checkout price is correct");
			}
			else
			{
				System.out.println("Checkout price is not correct");
			}
	
	//12. Take a snap of the resulting page. 
			WebElement souresnap = driver.findElement(By.xpath("//div[@class='CartPage__base']"));
			File sourceSnap = souresnap.getScreenshotAs(OutputType.FILE);
					
			//path to store snap
			File desSnap = new File("./snaps/watch.png");
	
			FileUtils.copyFile(sourceSnap, desSnap);
	//13. Close All the opened windows one by one.	
			//close current window;
			driver.close();
			//Close parent window
			driver.switchTo().window(win.get(0));
			driver.close();
	
	}
	
}
