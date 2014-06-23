package com.uscommunities.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Line_Ramp_Test {

	/*
	 * validate x position value of About and News and Events label 
	 * from beginning point of browser, the difference should be same
	 * by different browser res
	 * 
	 *   prove there is no line ramp at browser 
	 */
	
	@Test

		public void validateLineRamp(){
			WebDriver driver = new FirefoxDriver();
			HomePageComponent res960= new HomePageComponent(driver);
			/*
			 * set browser res to 960, width to 960
			 */
			res960.openProdURL(driver);
			res960.setBrowserSizeTo960(driver);
			System.out.println("When browser res is 960 x 720 "+"X of Above = "+res960.XpositionofAbout(driver)+", "+
					"X of News and Events = " +res960.XpositionofNE(driver)+"\n");
			int temp = res960.XpositionofNE(driver) - res960.XpositionofAbout(driver); 
			
			WebDriver driver1 = new FirefoxDriver();
			HomePageComponent res1024= new HomePageComponent(driver1);
			/*
			 * set browser res to 1024, width to 1024
			 */
			res960.openProdURL(driver1);
			res1024.setBrowserSizeTo1024(driver1);
			System.out.println("When browser res is 1024 x 768 "+"X of Above = "+res1024.XpositionofAbout(driver)+", "+
					"X of News and Events = "+res1024.XpositionofNE(driver)+"\n");
			int temp1 = res1024.XpositionofNE(driver) - res1024.XpositionofAbout(driver); 
			
			Assert.assertEquals(temp, temp1, "About and News&event are line wraped.");
			driver.quit();
			driver1.quit();
		}

}
