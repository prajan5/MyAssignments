package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDuplicatePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchTxt.sendKeys("ear bud",Keys.ENTER);
		
		//Get Price of the ear bud for all the items 
		List<WebElement> earbudPrice = driver.findElements(By.className("a-price-whole"));
		int size = earbudPrice.size();
		System.out.println("Size before removing the druplicates:"+size);
		
		List<Integer> price = new ArrayList<Integer>();
	
		for (WebElement s : earbudPrice)
		{
			String text = s.getText();
			String replaceAll = text.replaceAll(",","");
			//System.out.println(replaceAll);
			
			//Convert string into Integer
			int parseInt = Integer.parseInt(replaceAll);
			//System.out.println(parseInt);
			price.add(parseInt);
			
			
		}
		//Print converted integer price list
		System.out.println(price);
		
		//List -> TreeSet to remove duplicate values.
		Set<Integer> earbudprice = new TreeSet<Integer>(price);
		System.out.println(earbudprice);
		//System.out.println(earbudprice);
		//get the length of 
		int size1= earbudprice.size();
		System.out.println("Size after removing duplicates:"+size1);
		
		//Compare the two size
		if(size==size1)
		{
			System.out.println("Duplicate values are there");
		}
		else
		{
			System.out.println(" No Duplicate values are there");
		}
		
		
		
		
		

	}

}
