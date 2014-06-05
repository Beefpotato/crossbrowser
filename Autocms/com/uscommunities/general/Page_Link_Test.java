package com.uscommunities.general;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Page_Link_Test {
	
	@Test
	  
	public void checkAllProdPageLinks() throws MalformedURLException, IOException{
		  WebDriver driver = new FirefoxDriver();
		  HomePageComponent action=new HomePageComponent(driver);
		  action.openProdURL(driver);
		  action.checkAllLinksPrint(driver);
		  //action.checkAllLinksSaveToText(driver);
		  driver.quit();
	}
	
	@Test
	  
	public void checkAllTest3PageLinks() throws MalformedURLException, IOException{
		  WebDriver driver = new FirefoxDriver();
		  HomePageComponent action=new HomePageComponent(driver);
		  action.openTest3URL(driver);
		  action.checkAllLinksPrint(driver);
		  //action.checkAllLinksSaveToText(driver);
		  driver.quit();
	}
		  
}
