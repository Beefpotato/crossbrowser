package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Link_Diff_Homepage_Test {

	@Test
	
	public void validateLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		action.openProdURL(driver);
		Assert.assertEquals(64, action.checkLinkDiff(driver)); 
		driver.quit();
	}	
	
}
