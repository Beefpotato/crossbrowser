package com.cacommunities.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Image_Diff_Private_Test {

	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/");
		System.out.println("\nTest private-activity-programs Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/501c3-nonprofit/");
		System.out.println("\nTest 501c3-nonprofit Image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPFaqImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/");
		System.out.println("\nTest small-issue-public-bond-programs Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFinanceImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/housing-bonds/");
		System.out.println("\nTest housing-bonds Image.................................\n");
		Assert.assertEquals(8, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateRoadImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/idbs-manufacturing/");
		System.out.println("\nTest idbs-manufacturing Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSmaillIssueImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/");
		System.out.println("\nTest small-issue-public-bond-programs Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateExemptImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/exempt-facilities-solid-waste/");
		System.out.println("\nTest exempt-facilities-solid-waste Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSIPBPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/");
		System.out.println("\nTest small-issue-public-bond-programs Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
}
