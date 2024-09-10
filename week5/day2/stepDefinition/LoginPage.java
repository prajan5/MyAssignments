package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	
	
	@Given("Launch browser and load the URL")
	public void launch_browser_and_load_the_url() {
	   driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("Enter the user name as {string}")
	public void ente_the_user_nameas_demo_sales_manager(String username) {
	   		driver.findElement(By.id("username")).sendKeys(username);

	}

	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	  
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		   
	}

	@Then("Verify the login is successful")
	public void verify_the_login_is_successful() {
	   System.out.println(driver.getTitle());
	   if (driver.getTitle().contains("Leaftaps"))
		{
			  System.out.println("Login is successful");
			
		}
		else
		{
			 System.out.println("Login is not successful");
		}
	}
	
	@But("Verify the login is not successful")
	public void verify_the_login_is_not_successful() {
	   System.out.println(driver.getTitle());
	   if (driver.getTitle().contains("Leaftaps"))
		{
			  System.out.println("Login is successful");
			
		}
		else
		{
			 System.out.println("Login is not successful");
		}
	}
	
	
		
	
}
