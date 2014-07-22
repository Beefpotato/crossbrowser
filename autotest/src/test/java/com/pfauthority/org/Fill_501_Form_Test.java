package com.pfauthority.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uscommunities.general.HomePageComponent;
import com.uscommunities.general.NonProfitForm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fill_501_Form_Test {

	@Test
	
	public void validateFill501FormChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		NonProfitForm form = new NonProfitForm(driver);
		action.open501Form(driver);
		form.set501FormPageOne(driver);
		action.clickValidate(driver);
		action.clickNext(driver);
		
		form.set501FormPageTwo(driver);
		action.clickValidate(driver);
		action.clickNext(driver);
		
		form.set501FormPageThree(driver);
		action.clickValidate(driver);
		action.clickNext(driver);
		
		form.set501FormPageFour(driver);
		action.clickValidate(driver);
		action.clickNext(driver);
		
		form.set501FormPageFive(driver);
		action.clickValidate(driver);
		action.clickNext(driver);
		
		action.clickNext(driver);
		//action.clickSubmit(driver);
		
		//action.clearBrowserCookie(driver);
		//driver.quit();	

	}
	
}
