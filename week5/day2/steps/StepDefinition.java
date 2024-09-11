package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	    public ChromeDriver driver;
	
		@Given("Launch browser and load the URL")
		public void launch_browser_and_load_the_url() {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			 driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		@When("Enter the user name as dilip@testleaf.com")
		public void enter_the_user_name_as_dilip_testleaf_com() {
			driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		    
		}
		@When("Enter the password as August@2024")
		public void enter_the_password_as_august() {
			driver.findElement(By.id("password")).sendKeys("August@2024");
		 
		}
		@When("Click on Login button")
		public void click_on_login_button() {
			driver.findElement(By.id("Login")).click();
		  
		}
		@Then("Verify the login is successful")
		public void verify_the_login_is_successful() {
			
		 
		}
		@When("Click on toggle menu button from left corner")
		public void click_on_toggle_menu_button_from_left_corner() {
			 WebElement applauncher = driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-context-bar__button slds-icon-waffle')]"));
			//Perform Action
				Actions obj2 = new Actions(driver);
				obj2.moveToElement(applauncher).perform();
				applauncher.click();
				}
		@When("Click view All")
		public void click_view_all() {
			driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
				  
		}
		@When("Click Sales from App Launcher")
		public void click_sales_from_app_launcher() {
			driver.findElement(By.xpath("//span/p[text()='Sales']")).click();
		}
		@When("Click on Accounts tab")
		public void click_on_accounts_tab() {
			WebElement acc=	driver.findElement(By.xpath("//span[text()='Accounts']/ancestor::one-app-nav-bar-item-root"));
			acc.click();
		}
		@When("Click on New button")
		public void click_on_new_button() {
			driver.findElement(By.xpath("//a/div[@title='New']")).click();
			
		}		
		@When("Enter yourname as priyarajan")
		public void enter_yourname_as_priyarajan() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div/input[@name='Name']")).sendKeys("PriyaRajan");
		}
		@When("Select Ownership as Public")
		public void select_ownership_as_public() {
			driver.findElement(By.xpath("//div/label[text()='Ownership']")).click();
			driver.findElement(By.xpath("//span[text()='Public']")).click();
					}
		   
		@When("Click save button")
		public void click_save_button() {
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			
		}
		 
		@Then("Verify Account name")
		public void verify_account_name() {
			String accname = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
			if (accname.equals("PriyaRajan"))
					{
				  System.out.println("AccountName"+accname);
					
					}
					else
					{
						 System.out.println("AccountName is not correct");
					}
					
		}
}