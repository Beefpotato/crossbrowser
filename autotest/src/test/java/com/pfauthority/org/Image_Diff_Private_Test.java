package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Image_Diff_Private_Test {

	@Test
	
	public void validate501ImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/501c3-nonprofit/");
		System.out.println("\nTest 501c3-Nonprofit Form.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateCSFFImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/charter-school-facilities-financing/");
		System.out.println("\nTest Charter-School-Facilities-Financing Form.................................\n");		
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateAMHBImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/affordable-multifamily-housing-bonds//");
		System.out.println("\nTest Affordable-Multifamily-Housing-Bonds Form.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateIDBIMImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/industrial-development-bonds-idbs-manufacturing/");
		System.out.println("\nTest Industrial-Development-Bonds-Idbs-Manufacturing Form.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateEFSWImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/exempt-facilities-solid-waste/");
		System.out.println("\nTest Exempt-Facilities-Solid-Waste Form.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateABImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/airport-bonds/");
		System.out.println("\nTest Airport-Bonds Form.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateWSBPImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/wisconsin-small-bond-program/");
		System.out.println("\nTest Wisconsin-Small-Bond-Program Form.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	
	
	
}
