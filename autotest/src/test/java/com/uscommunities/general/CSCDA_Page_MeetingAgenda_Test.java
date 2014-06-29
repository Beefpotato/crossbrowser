package com.uscommunities.general;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class CSCDA_Page_MeetingAgenda_Test {

	@Test
	  
	public void checkAllProdPageLinks() throws MalformedURLException, IOException{		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		 
		HomePageComponent action=new HomePageComponent(driver);
		action.openCSCDAMtgURL(driver); 
		action.checkAllLinksSaveToText(driver);   
		driver.quit();
	}
	
}
