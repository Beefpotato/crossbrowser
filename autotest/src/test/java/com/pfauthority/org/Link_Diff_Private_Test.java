package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Link_Diff_Private_Test {

	@Test
	
	public void validate501LinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/501c3-nonprofit/");
		System.out.println("\nTest 501c3-Nonprofit Link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateCSFFLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/charter-school-facilities-financing/");
		System.out.println("\nTest Charter-School-Facilities-Financing Link................................\n");		
		Assert.assertEquals(60, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateAMHBLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/affordable-multifamily-housing-bonds//");
		System.out.println("\nTest Affordable-Multifamily-Housing-Bonds Link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver));  
		driver.quit();
	}
	
	@Test
	
	public void validateIDBIMLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/industrial-development-bonds-idbs-manufacturing/");
		System.out.println("\nTest Industrial-Development-Bonds-Idbs-Manufacturing Link.................................\n");
		Assert.assertEquals(60, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateEFSWLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/exempt-facilities-solid-waste/");
		System.out.println("\nTest Exempt-Facilities-Solid-Waste Link.................................\n");
		Assert.assertEquals(60, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateABLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/airport-bonds/");
		System.out.println("\nTest Airport-Bonds Link.................................\n");
		Assert.assertEquals(59, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateWSBPLinkDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/private-activity-programs/wisconsin-small-bond-program/");
		System.out.println("\nTest Wisconsin-Small-Bond-Program Link.................................\n");
		Assert.assertEquals(59, action.checkLinkDiff(driver)); 
		driver.quit();
	}	
	
}
