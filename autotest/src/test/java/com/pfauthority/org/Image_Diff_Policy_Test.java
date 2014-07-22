package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Image_Diff_Policy_Test {

	
	@Test
	
	public void validateImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/policies-and-fees/general-policies/");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/policies-and-fees/general-policies/");
		Assert.assertEquals(56, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	/**
	 * There is no image on 
	 * http://www.pfauthority.org/policies-and-fees/issuance-policy/
	 */
	
}
