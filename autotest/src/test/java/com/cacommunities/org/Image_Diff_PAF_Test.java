package com.cacommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.BaseTest;
import com.uscommunities.general.HomePageComponent;

@Test(groups = "CSCDA")
public class Image_Diff_PAF_Test extends BaseTest {
	
	public void validateImageDiff() throws MalformedURLException, IOException{
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/");
		System.out.println("\nTest policies-and-fees Image.................................\n");
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	public void validateGPImageDiff() throws MalformedURLException, IOException{
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/general-policies/");
		System.out.println("\nTest general-policies Image.................................\n");
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	
	public void validateIPImageDiff() throws MalformedURLException, IOException{
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/issuance-policy/");
		System.out.println("\nTest issuance-policy Image.................................\n");
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	
	public void validateFSImageDiff() throws MalformedURLException, IOException {
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/fee-schedule/");
		System.out.println("\nTest fee-schedule Image.................................\n");
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	public void validateK12ImageDiff() throws MalformedURLException, IOException{
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/k-12-private-school-policy/");
		System.out.println("\nTest k-12 Image.................................\n");
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	
	public void validateHEPImageDiff() throws MalformedURLException, IOException {
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/higher-education-policy/");
		System.out.println("\nTest higher-education-policy Image.................................\n");
		action.checkDuplicateImageandPrint(driver); 
		driver.quit();
	}	
	
	public void validatePARPImageDiff() throws MalformedURLException, IOException{
		WebDriver driver = driverThread.get();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.cacommunities.org/policies-and-fees/public-access-to-records-policy/");
		System.out.println("\nTest public-access-to-records-policy Image.................................\n");
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
		
}
