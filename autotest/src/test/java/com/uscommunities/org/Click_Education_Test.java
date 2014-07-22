package com.uscommunities.org;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.BaseTest;
import com.uscommunities.general.HomePageComponent;

public class Click_Education_Test extends BaseTest {

	/**
	 * 
	 * validate click Education page 
	 */
	 
	@Test

		public void validateClickEducation(){
			//WebDriver driver = new FirefoxDriver();
		WebDriver driver = driverThread.get();	
		HomePageComponent action= new HomePageComponent(driver);
			action.openProdURL(driver);
			action.clickEducation(driver);
			driver.quit();
	}
}
