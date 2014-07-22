package com.cacommunities.org;
import com.uscommunities.general.HomePageComponent;
import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_Diff_AU_Test {

	@Test
	
	public void validateImageDiff() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/about-us/");
		System.out.println("\nTest about-us Image.................................\n");
		Assert.assertEquals(53, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFaqImageDiff() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/about-us/faqs/");
		System.out.println("\nTest about-us Faq Image.................................\n");
		Assert.assertEquals(67, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validatePPImageDiff() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/about-us/program-participants/");
		System.out.println("\nTest about-us program-participants Image.................................\n");
		Assert.assertEquals(54, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateAUCPPImageDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/about-us/commissioners/");
		System.out.println("\nTest about-us commissioners Image.................................\n");
		Assert.assertEquals(54, action.checkLinkDiff(driver));  
		driver.quit();
	}
	
}
