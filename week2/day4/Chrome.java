package week2.day4;

public class Chrome extends Browser{
		
	void openIncognito()
	{
		System.out.println("opening icognito from Chrome");
			
	}
	
	void clearCache()
	{
		System.out.println("clear cache  from Chrome");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome objBrowser1 = new Chrome();
		
		//From super class
		objBrowser1.openURL();
		objBrowser1.closeBrowser();
		objBrowser1.navigateBack();
		
		//From Current Class- Chrome
		objBrowser1.openIncognito();
		objBrowser1.clearCache();
		
						
		System.out.println(objBrowser1.browserName);
		
		System.out.println(objBrowser1.browserVersion);
		
		
		
		
		

	}

}
