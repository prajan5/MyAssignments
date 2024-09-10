package stepDefinition;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	@When("Click on crmsfa button")
	public void click_on_crmsfa_button() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}

	@When("Click on Leads tab")
	public void click_on_leads_tab() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on Create Lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	 
	}

	@When("Enter the companyname as {string}")
	public void enter_the_companyname_as_test_leaf(String comName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
	   
	}

	@When("Enter the firstname as {string}")
	public void enter_the_firstname_as_dilip(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	   
	}

	@When("Enter the lastname as {string}")
	public void enter_the_lastname_as_kumar(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	  
	}

	@When("Click Submit button")
	public void click_Submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify Lead is created")
	public void verify_lead_is_created() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		driver.close();

	   
	}


}
