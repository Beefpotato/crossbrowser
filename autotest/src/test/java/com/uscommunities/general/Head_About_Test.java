package com.uscommunities.general;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Head_About_Test {

	/*
	 * Validate Head tag "About" text value 
	 * 
	 * from Chrome browser
	 */
	@Test(groups = "www")
	
	public void validateAboutTextFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		action.openProdURL(driver);
		Assert.assertEquals(true, action.Aboutshowup(driver)); 
		System.out.println(action.Aboutshowup(driver));
		driver.quit();
	}
	
	/*
	 * Validate Head tag "About" text value 
	 * 
	 * from FireFox browser
	 */
	@Test(groups = "www")
	
	public void validateAboutTextFromFF() {
		WebDriver driver = new FirefoxDriver();
		HomePageComponent action=new HomePageComponent(driver);
		action.openProdURL(driver);
		Assert.assertEquals(true, action.Aboutshowup(driver)); 
		System.out.println(action.Aboutshowup(driver));
		driver.quit();
	}

	
	@Test
	
	public void validateAboutTextFromIE11() {
		System.setProperty("webdriver.ie.driver", "c://IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		  HomePageComponent action=new HomePageComponent(driver);
			action.openProdURL(driver);
			System.out.println(action.Aboutshowup(driver));
			Assert.assertEquals(true, action.Aboutshowup(driver)); 
			
			driver.quit();		  
	}
	
}
