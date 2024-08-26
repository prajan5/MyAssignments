package week2.day4homeassignment;

public class CheckBoxButton extends Button {
	
	void clickCheckButton()
	{
		System.out.println("ClickCheckbutton method from checkboxbutton class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton obj = new CheckBoxButton();
		obj.clickCheckButton();
		obj.click();
		obj.setText("print");
		obj.submit();
		

	}

	
	//output
	//ClickCheckbutton method from checkboxbutton class
	//Clickmethod from WebElement class
	//setText Mehtod from WebElement classprint
	//Submit method from button class

}
