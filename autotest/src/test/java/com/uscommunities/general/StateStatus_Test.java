package com.uscommunities.general;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StateStatus_Test {

	
	@Test
	
	public void validateSSlinks() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		  HomePageComponent action=new HomePageComponent(driver);
		  action.openProdSSURL(driver);
		  action.checkAllLinksSaveToText(driver);
	}
}
