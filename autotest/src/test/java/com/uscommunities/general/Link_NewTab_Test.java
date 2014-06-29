package com.uscommunities.general;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_NewTab_Test {

	@Test
	
	  public void checkAllLinksOpenNewTab() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action =new HomePageComponent(driver);
		action.openProdURL(driver);
		action.checkAllNewTabsSaveToText(driver);	  
	}
}
