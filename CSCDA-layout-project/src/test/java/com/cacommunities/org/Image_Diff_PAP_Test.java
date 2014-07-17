package com.cacommunities.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Image_Diff_PAP_Test {

	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/public-agency-programs/");
		System.out.println("\nTest public-agency-programs Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/public-agency-programs/statewide-community-infrastructure-program-scip/");
		System.out.println("\nTest statewide-community-infrastructure-program-scip Image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPFaqImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/public-agency-programs/statewide-community-infrastructure-program/scip-faqs/");
		System.out.println("\nTest statewide-community-infrastructure-program-scip-faq Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFinanceImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/public-agency-programs/statewide-community-infrastructure-program/scip-finance-team/");
		System.out.println("\nTest scip-finance-team Image.................................\n");
		Assert.assertEquals(8, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateRoadImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/public-agency-programs/total-road-improvement-programs-trip/");
		System.out.println("\nTest road-improvement-programs Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
}
