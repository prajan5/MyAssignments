package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//load URL
		driver.get("https://leafground.com/radio.xhtml");
		//Select Radio button Chrome 
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		System.out.println(("Chrome selection: "+driver.findElement(By.xpath("//input[@id ='j_idt87:console1:0']")).isSelected()));
		
		//Select Firefox
	    driver.findElement(By.xpath("(//label[text()='Firefox'])[1]")).click();	
	   	System.out.println(("Firefox selection: "+driver.findElement(By.xpath("//input[@id ='j_idt87:console1:1']")).isSelected()));
	   	
		//Now, Verify the state of the Chrome radio option
	    System.out.println(("Chrome selection: "+driver.findElement(By.xpath("//input[@id ='j_idt87:console1:0']")).isSelected()));
		
	    //check if Safari is selected by default
	    
	    boolean defaultBroswer = driver.findElement(By.xpath("//input[@id ='j_idt87:console2:2']")).isSelected();
	    if (defaultBroswer== true)
			  {
		  System.out.println("Default browser is Safari");
			  }
	    else 
	  	  System.out.println("Default browser is not Safari");
	    
	    //Select the age group if not already selected 
	    boolean agegroupSelection = driver.findElement(By.xpath("//input[@id ='j_idt87:age:1']")).isSelected();
	    if (agegroupSelection== false)
			  {
	    	driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
	    	System.out.println("Age group 21-40 years is  selected");
	    	
			  }
	    else 
	    {
	  	  System.out.println("Age group 21-40 years already selected");
	    }
	    
	    driver.close();
	    //Output:
	    //Chrome selection: true
	    //Firefox selection: true
	    //Chrome selection: false
	    //Default browser is Safari
	   //Age group 21-40 years already selected
	  
		
		
	}

}
