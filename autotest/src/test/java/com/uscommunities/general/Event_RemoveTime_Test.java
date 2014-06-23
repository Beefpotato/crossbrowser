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
		HomePageComponent test= new HomePageComponent(driver);
		test.openProdURL(driver);
		
		Assert.assertEquals(false, test.elementIsPresent(driver)); 	
		driver.quit();
	}	

}
