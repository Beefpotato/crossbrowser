package com.cacommunities.org;
import com.uscommunities.general.HomePageComponent;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Link_Diff_Homepage_Test {

	@Test
	
	public void validateImageDiff() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/");
		System.out.println("\nTest Home Page Links.................................\n");
		Assert.assertEquals(72, action.checkLinkDiff(driver)); 
		driver.quit();
	}
}
