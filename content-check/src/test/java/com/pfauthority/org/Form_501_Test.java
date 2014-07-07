package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Form_501_Test {

	@Test
	
	public void validateOpen501FormChrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://wwwtest.pfauthority.org/pfaappforms/form/applicantInformation/561?xcode=58ae749f25eded36f486bc85feb3f0ab");
		driver.quit();
	}
	
}
