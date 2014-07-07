package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pfauthority.general.HomePageComponent;

public class News_Diff_Homepage_Test {

	@Test
	
	public void validateNewsDiffFromChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		action.openProdURL(driver);
		Assert.assertEquals(2, action.checkNewsSessionPrint(driver)); 
		driver.quit();
	}	
	
}
