package com.cacommunities.org;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_Diff_Resources_Test {

	@Test
	
	public void validateLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/");
		System.out.println("\nTest resources Link.................................\n");
		Assert.assertEquals(50, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/publications/");
		System.out.println("\nTest publications Link.................................\n");
		Assert.assertEquals(60, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPFaqLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/media-center/");
		System.out.println("\nTest media-center Link.................................\n");
		Assert.assertEquals(183, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFinanceLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/housing-bonds/http://www.cacommunities.org/resources/media-center/media-request/");
		System.out.println("\nTest media-request Link.................................\n");
		Assert.assertEquals(68, action.checkLinkDiff(driver));  
		driver.quit();
	}
	
	@Test
	
	public void validateRoadLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/meeting-agendas-staff-reports-minutes/");
		System.out.println("\nTest meeting-agendas-staff-reports-minutes Link.................................\n");
		Assert.assertEquals(67, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	

}
