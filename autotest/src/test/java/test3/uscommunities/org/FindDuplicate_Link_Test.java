package test3.uscommunities.org;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class FindDuplicate_Link_Test {

	@Test
	
	public void checkDuplicateLink() throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action =new HomePageComponent(driver);
		action.openTest3URL(driver);
		action.clickSupplier(driver);
		action.checkDuplicateLinkandPrint(driver);	  
		driver.close();
	}
}
