package com.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Https_Link_Test {
	
	@Test
	  
	public void checkHttpsProdPageLinks() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		  HomePageComponent action=new HomePageComponent(driver);
		  action.checkAllHttpsLinksPrint(driver);
		  driver.quit();
	}
	
	@Test
	  
	public void checkHttpsProdPageLinksIE() throws MalformedURLException, IOException{
		System.setProperty("webdriver.ie.driver", "d://IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();   
		  HomePageComponent action=new HomePageComponent(driver);
		  action.checkAllHttpsLinksPrint(driver);
		  driver.quit();
	}
	


}
