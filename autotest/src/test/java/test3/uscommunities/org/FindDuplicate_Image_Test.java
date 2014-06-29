package test3.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class FindDuplicate_Image_Test {

	/*@Test
	
	public void checkDuplicateImage() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		HomePageComponent action =new HomePageComponent(driver);
		action.openTest3URL(driver);
		action.clickSupplier(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	*/
	
	@Test
	
	public void checkDuplicateImageAmsan() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/amsan-cleansource-janpak/");
		System.out.println("\nTest Amsan-Cleansource-Janpak Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHaworth() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/haworth/");
		System.out.println("\nTest Haworth Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageAcro() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/acro-service-corporation/");
		System.out.println("\nTest Acro-Service-Corporation Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}

	@Test

	public void checkDuplicateImageGametime() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/gametime/");
		System.out.println("\nTest GameTime Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	
	}

	@Test

	public void checkDuplicateImageBsnSports() throws MalformedURLException, IOException { 
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/bsn-sports-and-us-games/");
		System.out.println("\nTest Bsn-Sports-And-US-Games Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}

	@Test
	
	public void checkDuplicateImageCintas() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/cintas/");
		System.out.println("\nTest Cintas Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageEmpireToday() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/empire-today/");
		System.out.println("\nTest Empire-Today Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybarElectrical() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/graybar-electrical/");
		System.out.println("\nTest Graybar-Electrical Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybarLed() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/graybar-led/");
		System.out.println("\nTest Graybar-Led Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHermanMiller() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/herman-miller/");
		System.out.println("\nTest Herman-Miller Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHdSupply() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/hd-supply/");
		System.out.println("\nTest Hd-Supply Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageIndependent() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/independent-stationers-office-supplies/");
		System.out.println("\nTest Independent-Stationers-Office Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageInsightCloud() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/insight-cloud/");
		System.out.println("\nTest Insight-Cloud Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKnoll() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/knoll/");
		System.out.println("\nTest Knoll Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKone() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/kone/");
		System.out.println("\nTest Kone Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImagePremier() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/premier-us-foods/");
		System.out.println("\nTest Premier-US-Foods Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageSafeware() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/safeware-mallory/");
		System.out.println("\nTest Safeware-Mallory Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageTradition() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/tradition-energy/");
		System.out.println("\nTest Tradition-Energy Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageUnicom() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/unicom-government/");
		System.out.println("\nTest Unicom-Government Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageVirco() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/virco/");
		System.out.println("\nTest Virco Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageApplied() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/applied-industrial-technologies/");
		System.out.println("\nTest Applied-Industrial-Technologies Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageBi() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/bi-incorporated/");
		System.out.println("\nTest Bi-Incorporated Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageCarquest() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/carquest/");
		System.out.println("\nTest Carquest Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageDlt() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/dlt-solutions/");
		System.out.println("\nTest Dlt-Solutions Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageFisher() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/fisher-science-education/");
		System.out.println("\nTest Fisher-Science-Education Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGarlanddbs() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/garlanddbs-inc/");
		System.out.println("\nTest Garlanddbs-Inc Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageGraybar() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/graybar-telecommunications/");
		System.out.println("\nTest Graybar-Telecommunications Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}

	@Test
	
	public void checkDuplicateImageHome() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/the-home-depot/");
		System.out.println("\nTest Home-Depot Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageHertz() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/hertz-equipment-rental/");
		System.out.println("\nTest Hertz-Equipment-Rental Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageUnicomCloud() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/unicom-government-cloud-solutions/");
		System.out.println("\nTest Unicom-Government-Cloud-Solutions Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageStationers() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/independent-stationers-school-supplies/");
		System.out.println("\nTest Independent-Stationers-School Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageInsight() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/insight-public-sector/");
		System.out.println("\nTest Insight-Public-Sector Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKompan() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/kompan/");
		System.out.println("\nTest Kompan Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageKronos() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/kronos/");
		System.out.println("\nTest Kronos Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageRicoh() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/ricoh/");
		System.out.println("\nTest Ricoh Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageServicewear() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/servicewear-apparel/");
		System.out.println("\nTest Servicewear-Apparel Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}
	
	@Test
	
	public void checkDuplicateImageTraffic() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test3.uscommunities.org/suppliers/traffic-and-parking-control-co/");
		System.out.println("\nTest Traffic-And-Parking-Control Supplier.................................\n");
		HomePageComponent action =new HomePageComponent(driver);
		action.checkDuplicateImageandPrint(driver);
		driver.quit();
	}

	
}
