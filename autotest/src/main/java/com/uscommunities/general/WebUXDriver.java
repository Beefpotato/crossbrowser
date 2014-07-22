package com.uscommunities.general;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	//import BrowserType;
	//import FirefoxDriverFactory;
	//import WebDriverConfig;

	public class WebUXDriver {
		//private WebDriverConfig config = new WebDriverConfig();
		WebDriver driver = null;
		public WebDriver createRemoteWebDriver(String browser){
			if (browser=="FireFox") {
				driver= new FirefoxDriver();
		}if(browser=="InternetExplore"){
			    driver = new InternetExplorerDriver();
		}if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
				driver = new ChromeDriver();
		}
		
		
		return driver;

	}
	

	
}
