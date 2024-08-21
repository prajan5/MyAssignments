package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
				// Click on the "Accounts" tab.
				driver.findElement(By.linkText("Accounts")).click();
				// Click on the "Create Lead" button.
				driver.findElement(By.linkText("Create Account")).click();
				// Enter a Account Name.
				driver.findElement(By.id("accountName")).sendKeys("HPPP");
				// Enter a Description.
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				//industry
				WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
				Select optIndustry = new Select(industryDropdown);
				optIndustry.selectByIndex(3);
				
				//ownership
				WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
				Select optOwnership = new Select(ownershipDropdown);
				optOwnership.selectByVisibleText("S-Corporation");
				
                //source
				WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
				Select optSource = new Select(sourceDropdown);;
				optSource.selectByValue("LEAD_EMPLOYEE");
				
				//MktCampaign
				WebElement mktCampaignDropdown = driver.findElement(By.id("marketingCampaignId"));
				Select optMktCampaign = new Select(mktCampaignDropdown);;
				optMktCampaign.selectByIndex(6);
				Thread.sleep(3000);
				
				//StateProvince
				WebElement mktStateProvinceDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select optStProvince = new Select(mktStateProvinceDropdown);;
				optStProvince.selectByValue("TX");
				
				
				//Click the "Create account" button.
				driver.findElement(By.className("smallSubmit")).click();
				Thread.sleep(3000);
				
				String accName = driver.findElement(By.xpath("//span[contains(text(),'HPPP')]")).getText();
				System.out.println(accName);
			
				//Close the browser
				driver.close();
				

	}

}
