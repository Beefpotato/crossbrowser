package com.uscommunities.general;

	import java.lang.reflect.Method;

	import org.openqa.selenium.WebDriver;
	import org.testng.ITestContext;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.xml.XmlTest;

	public class BaseTest {
		public static ThreadLocal<WebDriver> driverThread = new ThreadLocal<WebDriver>();
		String browser= System.getProperty("BROWSER");
		
		WebUXDriver driver = new WebUXDriver();
		@BeforeMethod(alwaysRun = true)
		  public  void openbrowser() {
			//String browser= System.getProperty("BROWSER");
		
			 if (browser == null) {
			   
			      System.setProperty("BROWSER", "FireFox");
			      browser = System.getProperty("BROWSER");
			 } 
		    // super.beforeTestMethod(parameters, method, testContex, xmlTest);
			// WebUXDriver driver = new WebUXDriver();
			//driver.createRemoteWebDriver(browser);
			 System.out.println(browser);
			 if(driver.createRemoteWebDriver(browser) == null){
				 System.out.println("~~~null");
			 }else{
				 System.out.println("~~~not null");
			 }
			 driverThread.set(driver.createRemoteWebDriver(browser));
//		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~browser:"+System.getProperty("browser"));

	    }
		
		@AfterMethod
		public void closeBrowser(){
		
			driver.createRemoteWebDriver(browser).quit();
		
		}

	
}
