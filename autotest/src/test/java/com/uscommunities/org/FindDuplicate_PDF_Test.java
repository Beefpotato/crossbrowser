package com.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class FindDuplicate_PDF_Test {

	/*@Test
	
	public void checkDuplicateImage() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		HomePageComponent action =new HomePageComponent(driver);
		action.openTest3URL(driver);
		action.clicksuppliers(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	*/
	
	@Test
	
	public void checkDuplicateImageAmsan() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/amsan-cleansource-janpak/amsan-cleansource-janpak-contract/");
		System.out.println("\nTest Amsan-Cleansource-Janpak Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHaworth() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/haworth/haworth-contract/");
		System.out.println("\nTest Haworth Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageAcro() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/acro-service-corporation/acro-service-corporation-contracts/");
		System.out.println("\nTest Acro-Service-Corporation Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}

	@Test

	public void checkDuplicateImageGametime() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/gametime/gametime-contract/");
		System.out.println("\nTest GameTime Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	
	}

	@Test

	public void checkDuplicateImageBsnSports() throws MalformedURLException, IOException { 
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/bsn-sports-and-us-games/bsn-sportsus-games-contract/");
		System.out.println("\nTest Bsn-Sports-And-US-Games Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}

	@Test
	
	public void checkDuplicateImageCintas() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/cintas/cintas-contract/");
		System.out.println("\nTest Cintas Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageEmpireToday() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/empire-today/empire-today-contract/");
		System.out.println("\nTest Empire-Today Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybarElectrical() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/graybar-electrical/graybar-electrical-contract/");
		System.out.println("\nTest Graybar-Electrical Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybarLed() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/graybar-led/graybar-led-contract/");
		System.out.println("\nTest Graybar-Led Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHermanMiller() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/herman-miller/herman-miller-contract/");
		System.out.println("\nTest Herman-Miller Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHdSupply() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/hd-supply/hd-supply-contract/");
		System.out.println("\nTest Hd-Supply Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageIndependent() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/independent-stationers-office-supplies/independent-stationers-contract-office-supplies/");
		System.out.println("\nTest Independent-Stationers-Office Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageInsightCloud() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/insight-cloud/insight-cloud-contract/");
		System.out.println("\nTest Insight-Cloud Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKnoll() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/knoll/knoll-contract/");
		System.out.println("\nTest Knoll Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKone() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/kone/kone-contract/");
		System.out.println("\nTest Kone Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImagePremier() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/premier-us-foods/premier-us-foods-contract/");
		System.out.println("\nTest Premier-US-Foods Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageSafeware() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/safeware-mallory/safeware-mallory-contract/");
		System.out.println("\nTest Safeware-Mallory Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageTradition() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/tradition-energy/tradition-energy-contract/");
		System.out.println("\nTest Tradition-Energy Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageUnicom() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/unicom-government/unicom-contract/");
		System.out.println("\nTest Unicom-Government Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageVirco() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/virco/virco-contract/");
		System.out.println("\nTest Virco Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageApplied() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/applied-industrial-technologies/applied-industrial-technologies-contract/");
		System.out.println("\nTest Applied-Industrial-Technologies Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageBi() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/bi-incorporated/bi-incorporated-contract/");
		System.out.println("\nTest Bi-Incorporated Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageCarquest() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/carquest/carquest-contract/");
		System.out.println("\nTest Carquest Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageDlt() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/dlt-solutions/dlt-solutions-contract/");
		System.out.println("\nTest Dlt-Solutions Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageFisher() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/fisher-science-education/fisher-science-education-contract/");
		System.out.println("\nTest Fisher-Science-Education Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGarlanddbs() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/garlanddbs-inc/garlanddbs-inc-contract/");
		System.out.println("\nTest Garlanddbs-Inc Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybar() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/graybar-telecommunications/graybar-telecommunications-contract/");
		System.out.println("\nTest Graybar-Telecommunications Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}

	@Test
	
	public void checkDuplicateImageHome() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/the-home-depot/the-home-depot-contract/");
		System.out.println("\nTest Home-Depot Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHertz() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/hertz-equipment-rental/hertz-equipment-rental-contract/");
		System.out.println("\nTest Hertz-Equipment-Rental Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageUnicomCloud() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/unicom-government-cloud-solutions/unicom-cloud-solutions-contract/");
		System.out.println("\nTest Unicom-Government-Cloud-Solutions Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageStationers() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/independent-stationers-school-supplies/independent-stationers-contract-school-supplies/");
		System.out.println("\nTest Independent-Stationers-School Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageInsight() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/insight-public-sector/insight-public-sector-contract/");
		System.out.println("\nTest Insight-Public-Sector Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKompan() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/kompan/kompan-contract/");
		System.out.println("\nTest Kompan Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKronos() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/kronos/kronos-contract/");
		System.out.println("\nTest Kronos Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageRicoh() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/ricoh/ricoh-contract/");
		System.out.println("\nTest Ricoh Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageServicewear() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/servicewear-apparel/servicewear-apparel-contract/");
		System.out.println("\nTest Servicewear-Apparel Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageTraffic() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uscommunities.org/suppliers/traffic-and-parking-control-co/tapco-contract/");
		System.out.println("\nTest Traffic-And-Parking-Control Contract PDF.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicatePDFandPrint(driver);
		driver.quit();
	}

	
}
