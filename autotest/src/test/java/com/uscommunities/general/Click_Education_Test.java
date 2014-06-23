package com.uscommunities.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Click_Education_Test {

	/*
	 * validate click Education page 
	 */
	 
	@Test(groups = "www")

		public void validateClickEducation(){
			WebDriver driver = new FirefoxDriver();
			HomePageComponent test= new HomePageComponent(driver);
			test.openProdURL(driver);
			test.clickEducation(driver);
			driver.quit();
	}
}
