package com.cacommunities.org;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Image_Diff_Resources_Test {

	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/");
		System.out.println("\nTest resources Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/publications/");
		System.out.println("\nTest publications Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPFaqImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/media-center/");
		System.out.println("\nTest media-center Image.................................\n");
		Assert.assertEquals(7, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	
	@Test
	
	public void validateRoadImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/resources/meeting-agendas-staff-reports-minutes/");
		System.out.println("\nTest meeting-agendas-staff-reports-minutes Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	

	
}
