package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//Select Basic checkbox
		WebElement basicChkbox = driver.findElement(By.xpath("((//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[1])"));
		basicChkbox.click();
		
		//Notification: Select ajax and verify the message 
		WebElement ajaxChkbox = driver.findElement(By.xpath("((//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[2])"));
		ajaxChkbox.click();
		
		WebElement ajaxMessage= driver.findElement(By.xpath("//div[@class='ui-growl-message']/span"));
				
		if (ajaxMessage.getText().equals("Checked"))
		{
	      System.out.println("Notification is"+ajaxMessage.getText());
		}
        else
        {
	      System.out.println("Notification confirmation message is not displayed ");
        }

		//Select Language as Java
		WebElement javaChkbox = driver.findElement(By.xpath("((//div[contains(@class,'ui-chkbox-box ui-widget')])[3])"));
		javaChkbox.click();
		
		
		//Select Tristate and verify the confirmation message
		WebElement tristateChkbox = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]"));
		tristateChkbox.click();
			
		
		WebElement tristateMessage = driver.findElement(By.xpath("//p[text()='State = 1']"));
		
		if (tristateMessage.getText().equals("State = 1"))
				{
			      System.out.println("Trisate is :"+tristateMessage.getText());
				}
		else
		{
			System.out.println("Tristate state confirmation message is not displayed ");
		}
		
		
	//Select toggle switch and verify the message
		
		Thread.sleep(3000);
		
		WebElement toggleswitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggleswitch.click();
		
		WebElement toggelswitchMessage= driver.findElement(By.xpath("//span[text()='Checked']"));
				
		if (toggelswitchMessage.getText().equals("Checked"))
		{
	      System.out.println("toggleswitch is:"+toggelswitchMessage.getText());
		}
        else
        {
	      System.out.println("Toggleswitch confirmation message is not displayed ");
        }

		//Verify if checkbox is disabled.
	
	
		WebElement checkbox = driver.findElement(By.xpath("((//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3])"));
		
		boolean chkboxState = checkbox.isEnabled();
		
		System.out.println(chkboxState);
	
		//Select cities and Verify the selected cities 
		
	    driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	    
	    Thread.sleep(3000);
	
	    driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		
	    
	    driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	   
	    driver.findElement(By.xpath("//a[contains(@class,'ui-corner-all')]/span")).click();

	    
        WebElement menuMiami = driver.findElement(By.xpath("(//span[text()='Miami'])[1]"));
		System.out.println(menuMiami.getText());
        
        
        WebElement menuParis= driver.findElement(By.xpath("(//span[text()='Paris'])[1]"));
        System.out.println(menuParis.getText());
	    
		System.out.println();
		driver.close();
	
		//Output:
		//Notification isChecked
		//Trisate is :State = 1
		//toggleswitch is:Checked
		//true
		//Miami
		//Paris
		
	}

}
