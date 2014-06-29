package com.uscommunities.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Click_Education_Test {

	/**
	 * 
	 * validate click Education page 
	 */
	 
	@Test

		public void validateClickEducation(){
			WebDriver driver = new FirefoxDriver();
			HomePageComponent action= new HomePageComponent(driver);
			action.openProdURL(driver);
			action.clickEducation(driver);
			driver.quit();
	}
}
