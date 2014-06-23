package com.uscommunities.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Head_Alignment_Test {
	 
	@Test(groups = "www")

		public void validateHeadAlignment(){
			WebDriver driver = new FirefoxDriver();
			HomePageComponent test= new HomePageComponent(driver);
			test.openProdURL(driver);
			/*
			 * Print out Y position value of two tags: About and News&Events
			 * To prove horizontally alignment, the Y position value should be same 
			 */
			
			System.out.println("X of About = "+test.XpositionofAbout(driver)+"\n"+
			"X of News and Events = "+test.XpositionofNE(driver)+"\n"+
			"Y of About = "+test.YpositionofAbout(driver)+"\n"+
			"Y of News and Events = "+test.YpositionofNE(driver)+"\n\n");

			Assert.assertEquals(test.YpositionofAbout(driver), test.YpositionofAbout(driver), 
					"About and News&event are not shown on the same line.");
			driver.quit();
		}

}
