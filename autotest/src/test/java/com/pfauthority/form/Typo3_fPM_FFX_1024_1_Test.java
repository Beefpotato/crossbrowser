package com.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Typo3_fPM_FFX_1024_1_Test {

	@Test

	public void validateLineRamp() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		HomePageComponent res1024= new HomePageComponent(driver);
		res1024.openProdSSURL(driver);
		res1024.setBrowserSizeTo1024(driver);
		res1024.checkAllLinksSaveToText(driver); 
		driver.quit();
	}
	
	
	@Test
	
	public void checkDuplicateLink() throws MalformedURLException, IOException{
		WebDriver driver = new FirefoxDriver(); 
		HomePageComponent action =new HomePageComponent(driver);
		action.openProdURL(driver);
		action.setBrowserSizeTo1024(driver);
		action.clickSupplier(driver);
		action.checkDuplicateLinkandPrint(driver);	  
		driver.close();
	}
	
	@Test
	
	public void checkDuplicateImageAmsan() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/amsan-cleansource-janpak/amsan-cleansource-janpak-contract/");
		System.out.println("\nTest Amsan-Cleansource-Janpak Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHaworth() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/haworth/haworth-contract/");
		System.out.println("\nTest Haworth Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
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

	public void checkDuplicateImageGametime() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/gametime/gametime-contract/");
		System.out.println("\nTest GameTime Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	
	}

	@Test

	public void checkDuplicateImageBsnSports() throws MalformedURLException, IOException { 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/bsn-sports-and-us-games/bsn-sportsus-games-contract/");
		System.out.println("\nTest Bsn-Sports-And-US-Games Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}

	@Test
	
	public void checkDuplicateImageCintas() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/cintas/cintas-contract/");
		System.out.println("\nTest Cintas Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageEmpireToday() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/empire-today/empire-today-contract/");
		System.out.println("\nTest Empire-Today Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybarElectrical() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/graybar-electrical/graybar-electrical-contract/");
		System.out.println("\nTest Graybar-Electrical Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybarLed() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/graybar-led/graybar-led-contract/");
		System.out.println("\nTest Graybar-Led Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHermanMiller() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/herman-miller/herman-miller-contract/");
		System.out.println("\nTest Herman-Miller Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHdSupply() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/hd-supply/hd-supply-contract/");
		System.out.println("\nTest Hd-Supply Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageIndependent() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/independent-stationers-office-supplies/independent-stationers-contract-office-supplies/");
		System.out.println("\nTest Independent-Stationers-Office Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageInsightCloud() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/insight-cloud/insight-cloud-contract/");
		System.out.println("\nTest Insight-Cloud Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKnoll() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/knoll/knoll-contract/");
		System.out.println("\nTest Knoll Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKone() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/kone/kone-contract/");
		System.out.println("\nTest Kone Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImagePremier() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/premier-us-foods/premier-us-foods-contract/");
		System.out.println("\nTest Premier-US-Foods Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageSafeware() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/safeware-mallory/safeware-mallory-contract/");
		System.out.println("\nTest Safeware-Mallory Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageTradition() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.uscommunities.org/suppliers/tradition-energy/tradition-energy-contract/");
		System.out.println("\nTest Tradition-Energy Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.setBrowserSizeTo1024(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	

}
