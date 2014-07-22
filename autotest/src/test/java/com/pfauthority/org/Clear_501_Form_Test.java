package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;
import com.uscommunities.general.NonProfitForm;

public class Clear_501_Form_Test {
	
@Test
	
	public void validateClear501FormChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		NonProfitForm form = new NonProfitForm(driver);
		action.open501Form(driver);
		form.clear501FormPageOne(driver);
		action.clickNext(driver);
		
		form.clear501FormPageTwo(driver);
		action.clickNext(driver);
		
		form.clear501FormPageThree(driver);
		action.clickNext(driver);
		
		form.clear501FormPageFour(driver);
		action.clickNext(driver);
		
		form.clear501FormPageFive(driver);
		action.clickNext(driver);
		
		action.clickNext(driver);		
		action.clearBrowserCookie(driver);
		
		driver.quit();	

	}

}
