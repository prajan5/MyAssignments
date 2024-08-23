package week2.day4;

public class MethodOverloading {
	
	void reportStep(String message, String status)
	{
		
		System.out.println("Message:"+message);
		System.out.println("status:"+status);
		
	}
	void reportStep(String message, String status, boolean snap)
	{
		
		System.out.println("Message:"+message);
		System.out.println("status:"+status);
		System.out.println("snap:"+snap);
		
		
	}

	
	public static void main(String[] args) {
		
		MethodOverloading objoverload = new MethodOverloading();
		objoverload.reportStep("2argumentmethod","Pass");
		objoverload.reportStep("3argumentmethod","Warning",true);
		
		
		
		//

	}

}
