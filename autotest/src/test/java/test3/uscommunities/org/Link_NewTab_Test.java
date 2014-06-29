package test3.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Link_NewTab_Test {
	
	@Test
	
	  public void checkAllLinksOpenNewTab() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action =new HomePageComponent(driver);
		action.openTest3URL(driver);
		action.checkAllNewTabsSaveToText(driver);	  
	}
	
}


