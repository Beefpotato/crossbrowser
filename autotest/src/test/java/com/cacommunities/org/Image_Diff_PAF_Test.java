package com.cacommunities.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.uscommunities.general.HomePageComponent;

public class Image_Diff_PAF_Test {

	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/");
		System.out.println("\nTest policies-and-fees Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateGPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/general-policies/");
		System.out.println("\nTest general-policies Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateIPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/issuance-policy/");
		System.out.println("\nTest issuance-policy Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFSImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/fee-schedule/");
		System.out.println("\nTest fee-schedule Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateK12ImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/k-12-private-school-policy/");
		System.out.println("\nTest k-12 Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateHEPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/higher-education-policy/");
		System.out.println("\nTest higher-education-policy Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validatePARPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/public-access-to-records-policy/");
		System.out.println("\nTest public-access-to-records-policy Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
		
}
