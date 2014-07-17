package com.cacommunities.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Link_Diff_PAF_Test {

	@Test
	
	public void validateLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/");
		System.out.println("\nTest policies-and-fees Link.................................\n");
		Assert.assertEquals(57, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateGPLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/general-policies/");
		System.out.println("\nTest general-policies Link.................................\n");
		Assert.assertEquals(57, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateIPLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/issuance-policy/");
		System.out.println("\nTest issuance-policy Link.................................\n");
		Assert.assertEquals(56, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFSLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/fee-schedule/");
		System.out.println("\nTest fee-schedule Link.................................\n");
		Assert.assertEquals(58, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateK12LinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/k-12-private-school-policy/");
		System.out.println("\nTest k-12 Link.................................\n");
		Assert.assertEquals(56, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateHEPLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/higher-education-policy/");
		System.out.println("\nTest higher-education-policy Link.................................\n");
		Assert.assertEquals(55, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validatePARPLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/public-access-to-records-policy/");
		System.out.println("\nTest public-access-to-records-policy Link.................................\n");
		Assert.assertEquals(58, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
}
