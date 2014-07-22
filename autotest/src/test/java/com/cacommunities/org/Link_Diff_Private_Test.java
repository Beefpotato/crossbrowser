package com.cacommunities.org;
import com.uscommunities.general.HomePageComponent;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Link_Diff_Private_Test {

	@Test
	
	public void validateLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/");
		System.out.println("\nTest private-activity-programs Link.................................\n");
		Assert.assertEquals(60, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/501c3-nonprofit/");
		System.out.println("\nTest 501c3-nonprofit Link.................................\n");
		Assert.assertEquals(60, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSCIPFaqLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/");
		System.out.println("\nTest small-issue-public-bond-programs Link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFinanceLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/housing-bonds/");
		System.out.println("\nTest housing-bonds Link.................................\n");
		Assert.assertEquals(60, action.checkLinkDiff(driver));  
		driver.quit();
	}
	
	@Test
	
	public void validateRoadLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/idbs-manufacturing/");
		System.out.println("\nTest idbs-manufacturing Link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSmaillIssueLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/");
		System.out.println("\nTest small-issue-public-bond-programs Link.................................\n");
		Assert.assertEquals(62, action.checkLinkDiff(driver));  
		driver.quit();
	}
	
	@Test
	
	public void validateExemptLinkDiff() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/exempt-facilities-solid-waste/");
		System.out.println("\nTest exempt-facilities-solid-waste Link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateSIPBPLinkDiff() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/");
		System.out.println("\nTest small-issue-public-bond-programs Link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver));  
		driver.quit();
	}
}
