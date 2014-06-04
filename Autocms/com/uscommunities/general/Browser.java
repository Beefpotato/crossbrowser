package com.uscommunities.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
	public WebDriver driver = null; 
	
	public Browser(WebDriver driver) {
		super();
	}
	
	public void createFFBrowser() {
		WebDriver driver = new FirefoxDriver();
	}
	
	public void createChromeBrowser() {
		WebDriver driver = new ChromeDriver();
	}
	
	public void createSafariBrowser() {
		WebDriver driver = new SafariDriver();
	}
	
	public void createIE7Browser() {
		  DesiredCapabilities ieCapabilities = null;
		  ieCapabilities = DesiredCapabilities.internetExplorer();
		  ieCapabilities.setBrowserName("internet explorer");
		  ieCapabilities.setVersion("7");
		  driver = new InternetExplorerDriver(ieCapabilities);
	}
	
	public void createIE8Browser() {
		  DesiredCapabilities ieCapabilities = null;
		  ieCapabilities = DesiredCapabilities.internetExplorer();
		  ieCapabilities.setBrowserName("internet explorer");
		  ieCapabilities.setVersion("8");
		  driver = new InternetExplorerDriver(ieCapabilities);
	}
	
	public void createIE9Browser() {
		  DesiredCapabilities ieCapabilities = null;
		  ieCapabilities = DesiredCapabilities.internetExplorer();
		  ieCapabilities.setBrowserName("internet explorer");
		  ieCapabilities.setVersion("9");
		  driver = new InternetExplorerDriver(ieCapabilities);
	}
	
	public void createIE10Browser() {
		  DesiredCapabilities ieCapabilities = null;
		  ieCapabilities = DesiredCapabilities.internetExplorer();
		  ieCapabilities.setBrowserName("internet explorer");
		  ieCapabilities.setVersion("10");
		  driver = new InternetExplorerDriver(ieCapabilities);
	}
	
	public void createIE11Browser() {
		  DesiredCapabilities ieCapabilities = null;
		  ieCapabilities = DesiredCapabilities.internetExplorer();
		  ieCapabilities.setBrowserName("internet explorer");
		  ieCapabilities.setVersion("11");
		  driver = new InternetExplorerDriver(ieCapabilities);
	}
	

}
