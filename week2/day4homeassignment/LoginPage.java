package week2.day4homeassignment;

public class LoginPage extends BasePage {

	void performCommonTasks()
	{
		System.out.println("performCommonTasks method from LoginPage class");
	}
	
	public static void main(String[] args) {
		
		LoginPage obj = new LoginPage();
		obj.clickElement();
		obj.findElement();
		obj.enterText();
		obj.performCommonTasks();//from current class
	}

	//output
	//clickElement method from BasePage class
	//findElement method from BasePage class
	//enterText method from BasePage class
	//performCommonTasks method from LoginPage class
}
