package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pfauthority.general.HomePageComponent;

public class Image_Diff_Post_Test {

	@Test
	
	public void validateImageDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/post-issuance-compliance/");
		Assert.assertEquals(4, action.checkImageDiff(driver)); 
		driver.quit();
	}
}
