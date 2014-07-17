package com.cacommunities.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Image_Diff_PIC_Test {

	@Test
	
	public void validateImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/post-issuance-compliance/");
		System.out.println("\nTest post-issuance-compliance Image.................................\n");
		Assert.assertEquals(5, action.checkImageDiff(driver)); 
		driver.quit();
	}
	
}
