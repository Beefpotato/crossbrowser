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
		/*
		 * System.setProperty("webdriver.IE.driver", "c://IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();   
		File file = new File("c://IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		DesiredCapabilities caps = DesiredCapabilities
				.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		WebDriver driver = new InternetExplorerDriver(caps);
		*
		*/
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();
		  HomePageComponent action=new HomePageComponent(driver);
		  action.openCSCDAMtgURL(driver); 
		  action.checkAllLinksSaveToText(driver);        
	}
	
}
