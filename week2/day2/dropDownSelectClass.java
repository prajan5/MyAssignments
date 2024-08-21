package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSelectClass {
	
	public static void main (String[] args) throws InterruptedException 
	{
		//Instantiate browser driver
				ChromeDriver driver = new ChromeDriver();
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/");
				//Maximize the browser window
				driver.manage().window().maximize();
				//Enter Username and Password
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// Click the "Login" button.
				driver.findElement(By.className("decorativeSubmit")).click();
				// Click on the "CRM/SFA" link.
				driver.findElement(By.linkText("CRM/SFA")).click();
				// Click on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				// Click on the "Create Lead" button.
				driver.findElement(By.linkText("Create Lead")).click();
				//select source
				WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select optSource = new Select(sourceDropdown);
				optSource.selectByIndex(5);
				Thread.sleep(3000);
				//select marketing campaing
				WebElement mktCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select optMktCampaign = new Select(mktCampaignDropdown);
				optMktCampaign.selectByValue("CATRQ_AUTOMOBILE");
				
				Thread.sleep(3000);
				//select preferred currency
				WebElement currencyDropdown = driver.findElement(By.name("currencyUomId"));
				Select optCurrency = new Select(currencyDropdown);
				optCurrency.selectByVisibleText("KPW - North Korean Won") ;
				
				//Close the browser
				driver.close();
				
				
				
						
				
		
		
	}

}
