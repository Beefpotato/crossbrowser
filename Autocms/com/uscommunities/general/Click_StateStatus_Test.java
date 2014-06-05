package com.uscommunities.general;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Click_StateStatus_Test {

	public String wurl = "http://www.uscommunities.org/resources/state-statutes/"; 
	public String turl = "http://test3.uscommunities.org/resources/state-statutes/";
	
	@Test
	
	public void validateSSlinks() throws MalformedURLException, IOException {
		  WebDriver driver = new FirefoxDriver();
		  //driver.get(turl);
		  driver.get(wurl);
		  HomePageComponent action=new HomePageComponent(driver);
		  //action.openProdURL(driver);
		  
		  action.checkAllLinksPrint(driver);
		  //action.checkAllLinksSaveToText(driver);
		  driver.quit();
	}
}
