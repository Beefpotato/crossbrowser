package com.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Typo3_fPM_FFX_1024_2_Test {

	@Test
	
	public void checkDuplicateImageHaworth() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.uscommunities.org/suppliers/haworth/");
		System.out.println("\nTest Haworth Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageAcro() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.uscommunities.org/suppliers/acro-service-corporation/acro-service-corporation-contracts/");
		System.out.println("\nTest Acro-Service-Corporation Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	  
	public void checkAllProdPageLinks() throws MalformedURLException, IOException{
		WebDriver driver = new FirefoxDriver(); 
		  HomePageComponent action=new HomePageComponent(driver);
		  action.openProdURL(driver);
		  action.setBrowserSizeTo960(driver);
		  action.checkAllLinksSaveToText(driver); 
		  driver.quit();
	}
	
	@Test
	
	public void validateSSlinks() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		  HomePageComponent action=new HomePageComponent(driver);
		  action.openProdSSURL(driver);
		  action.setBrowserSizeTo1024(driver);
		  action.checkAllLinksSaveToText(driver);
		  driver.quit();
	}
	

	
}
