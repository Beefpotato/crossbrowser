package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Link_Diff_Policy_Test {

	@Test
	
	public void validateIPLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/policies-and-fees/issuance-policy/");
		Assert.assertEquals(53, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFSLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/policies-and-fees/fee-schedule/");
		Assert.assertEquals(54, action.checkLinkDiff(driver)); 
		driver.quit();
	}
}
