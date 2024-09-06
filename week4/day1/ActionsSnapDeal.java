package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.OutputType;



public class ActionsSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Initialize ChromeDriver
			ChromeDriver driver = new ChromeDriver();
		
		//1.Load the URL (https://www.snapdeal.com/)
			driver.get("https://www.snapdeal.com");
		// Maximize the browser window
			driver.manage().window().maximize();
		// Add an implicit wait to ensure the webpage elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Go to "Men's Fashion".
			driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']//span)[2]")).click();
			Thread.sleep(30);
			driver.findElement(By.xpath("//div[@id='category1Data']//span[text()='Sports Shoes']")).click();
		
		//4. Get the count of sports shoes.
			System.out.println(driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText());
			
		//5. Click on "Training Shoes".
			driver.findElement(By.xpath("//li[@class='child-cat-list cat-list ']//div[text()='Training Shoes']")).click();
		//6. Sort the products by "Low to High".
			driver.findElement(By.xpath("//span[@class='sort-label']")).click();
			
			driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
			Thread.sleep(3000);
		//7. Check if the displayed items are sorted correctly.
					
			List<WebElement> shoesprice = driver.findElements(By.xpath("//a[@class='dp-widget-link noUdLine']//span[@class='lfloat product-price']"));
			
			
			System.out.println("Total count:"+shoesprice.size());
			String price;
			
			for(int i=0;i<shoesprice.size() ;i++) {
				
				price = shoesprice.get(i).getText();
				System.out.println(price);
			}
			
		//8. Select any price range ex:(500 - 700) from the slider
		WebElement slider = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left-handle')]"));
		Actions obj1 = new Actions(driver);
		obj1.dragAndDropBy(slider, 50, 0).perform();
		
			
		//Get the filtered price range displayed near the slider
		String rssymbol = driver.findElement(By.xpath("(//div[@class='price-text-box'])[1]")).getText();
		String fValue = driver.findElement(By.name("fromVal")).getAttribute("value");
		String tValue = driver.findElement(By.name("toVal")).getAttribute("value");
		String filterrange = rssymbol+" "+fValue+" "+"-"+" "+rssymbol+" "+tValue;
		//System.out.println("filter range"+filterrange);
		
		
		Thread.sleep(3000);
		
		//9. Filter by any colour by checkbox
		WebElement colorfilter = driver.findElement(By.xpath("//input[@value='Black']/following-sibling::label[1]"));
		Actions obj2 = new Actions(driver);
		obj2.scrollToElement(colorfilter).perform();
		colorfilter.click();
			
		
		//verify if applied  filters are correct
		//Get filtered price range displayed on top
		String appliedpricerange =  driver.findElement(By.xpath("(//a[@class='clear-filter-pill'])[1]")).getText();
		System.out.println("applied price range"+appliedpricerange);
		
		if(filterrange==appliedpricerange)
		{
			System.out.println("applied price range is correct");
		}
		else
		{
			
			System.out.println("applied price range is incorrect ");
			
		}
		
		//verify if color is correct
		//get the applied filter displayed on top
		
		String appliedfiltercolor = driver.findElement(By.xpath("(//a[@data-key='Color_s|Color'])[1]")).getText();
		System.out.println("appliedcolorfilter:"+appliedfiltercolor);
		
		if(appliedfiltercolor.equalsIgnoreCase("Black"))
		{
			System.out.println("applied color filter is correct");
		}
		else
		{
			
			System.out.println("applied color filter is not correct");
			
		}
		//11. Mouse hover on the first resulting "Training Shoes".
		WebElement productimage = driver.findElement(By.xpath("//source[@class='product-image']/following-sibling::img[1]"));
		Actions obj3 = new Actions(driver);
		obj3.moveToElement(productimage).perform();
		Thread.sleep(3000);
		
		//12. Click the "Quick View" button.
		WebElement quickview = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
		quickview.click();
		//13. Print the cost and the discount percentage.
		String quickviewprice = driver.findElement(By.xpath("//div/span[@class='payBlkBig']")).getText();
		String quickviewdiscountprice = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]")).getText();
		System.out.println("Quik view price:"+quickviewprice);
		System.out.println("Quik view discount price:"+quickviewdiscountprice);
		
		
		//14. Take a snapshot of the shoes.
		WebElement quickviewimage = driver.findElement(By.id("bx-slider-qv-image-panel"));
		File sourceSnap = quickviewimage.getScreenshotAs(OutputType.FILE);
				
		//path to store snap
		File desSnap = new File("./snaps/shoe.png");
				
		//step 3-combine source and destination
		FileUtils.copyFile(sourceSnap, desSnap);
		
		//15. Close the current window.
		driver.findElement(By.xpath("//div[contains(@class,'close close1')]/i[1]")).click();
		//16. Close the main window.
		driver.close();


	}

}
