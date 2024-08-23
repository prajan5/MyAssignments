package week2.day4;

public class Safari extends Browser{
	
	

	void  readerMode()
	{
		System.out.println("readerMode from safari");
	}

	
	void  fullScreenMode()
	{
		System.out.println("full screen mode from safari");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari objBrowser1 = new Safari();
		//From super class
		objBrowser1.openURL();
		objBrowser1.closeBrowser();
		objBrowser1.navigateBack();
		
		//From Current Class- safari
		objBrowser1.readerMode();
		objBrowser1.fullScreenMode();
		
						
		System.out.println(objBrowser1.browserName);
		
		System.out.println(objBrowser1.browserVersion);
		

	}

}
