package week2.day4;

public class MethodOverridingChildClass extends MethodOverridingSuperClass{
	
	
	void takeSnap()
	{
		
			System.out.println("taking snap from child class");
		
		
	}
	

	public static void main(String[] args) {
		
		MethodOverridingChildClass obj = new MethodOverridingChildClass();
		
		obj.takeSnap();
		obj.reportSnap();
		
				

	}

}
