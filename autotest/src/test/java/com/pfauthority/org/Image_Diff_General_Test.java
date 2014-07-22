package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Image_Diff_General_Test {
	
	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/");
		System.out.println("\nTest general-information image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateWNImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/whats-new/");
		System.out.println("\nTest whats-new image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateCUImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/contact-us/");
		System.out.println("\nTest contact-us image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFaqImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/faqs/");
		System.out.println("\nTest faqs image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validatePbmImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/pfa-board-meetings/");
		System.out.println("\nTest pfa-board-meetings image.................................\n");
		Assert.assertEquals(6, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateBdsImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/board-of-directors-and-sponsors/");
		System.out.println("\nTest board-of-directors-and-sponsors image.................................\n");
		Assert.assertEquals(10, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateIBImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/pfaappforms/mos/generalInfo");
		System.out.println("\nTest generalInfo image.................................\n");
		Assert.assertEquals(10, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
}
