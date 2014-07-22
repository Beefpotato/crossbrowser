package com.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.BaseTest;
import com.uscommunities.general.HomePageComponent;

public class CSCDA_Page_MeetingAgenda_Test extends BaseTest {

	@Test
	  
	public void checkAllProdPageLinks() throws MalformedURLException, IOException{		
		WebDriver driver = driverThread.get(); 
		HomePageComponent action=new HomePageComponent(driver);
		action.openCSCDAMtgURL(driver); 
		action.checkAllLinksSaveToText(driver);   
		driver.quit();
	}
	
}
