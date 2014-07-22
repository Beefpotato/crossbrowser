package com.cacommunities.org;
import com.uscommunities.general.HomePageComponent;
import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_Diff_PIC_Test {

	@Test
	
	public void validateLinkDiff() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/post-issuance-compliance/");
		System.out.println("\nTest post-issuance-compliance Link.................................\n");
		Assert.assertEquals(55, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
}
