package com.uscommunities.general;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Event_RemoveTime_Test {
	
	@Test
	
	public void validateEventTime(){
		WebDriver driver = new FirefoxDriver();
		HomePageComponent action= new HomePageComponent(driver);
		action.openProdURL(driver);		
		Assert.assertEquals(false, action.elementIsPresent(driver)); 	
		driver.quit();
	}	

}
