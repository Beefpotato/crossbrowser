package com.cacommunities.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cacommunities.org.HomePageComponent;

public class Image_Diff_Homepage_Test {

	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/");
		System.out.println("\nTest Home Page Image.................................\n");
		Assert.assertEquals(13, action.checkImageDiff(driver)); 
		driver.quit();
	}
}
