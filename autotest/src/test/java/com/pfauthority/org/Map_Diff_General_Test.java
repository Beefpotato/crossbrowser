package com.pfauthority.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Map_Diff_General_Test {

	/*@Test
	
	public void validateMapDiffChromeTest() {
		 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     String url="http://www.pfauthority.org/pfaappforms/mos/map";
	     String path="//*[name()='svg']//*[name()='path']";
	     driver.get(url);
	     List<WebElement> element = driver.findElements(By.xpath("//*[name()='svg']//*[name()='path']"));
	     int y = element.size();
	     
	    		 for(int x=1;x<y;x++){
	    		 String rpath=path.concat(("[" + x +"]").toString()) ;
	    		 WebElement relement = driver.findElement(By.xpath(rpath));
	    		 System.out.println("The state is "+ relement.getAttribute("data-code"));
	    		 relement.click();
	    		 System.out.println("The url is "+ driver.getCurrentUrl());
	    		 driver.get(url);
	    		 
	    		 }
	     
	     driver.close();
	}
	
		@Test

	public void validateMapDiffIE10test(){
		 System.setProperty("webdriver.ie.driver", "d://IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();
	     String url="http://www.pfauthority.org/pfaappforms/mos/map";
	     String path="//*[name()='svg']//*[name()='path']";
	     driver.get(url);
	     List<WebElement> element = driver.findElements(By.xpath("//*[name()='svg']//*[name()='path']"));
	     int y = element.size();
	     
	    		 for(int x=1;x<y;x++) {
	    		 String rpath=path.concat(("[" + x +"]").toString()) ;
	    		 WebElement relement = driver.findElement(By.xpath(rpath));
	    		 System.out.println("The state is "+ relement.getAttribute("data-code"));
	    		 relement.click();
	    		 System.out.println("The url is "+ driver.getCurrentUrl());
	    		 driver.get(url);
	    		 
	    		 }	     

	     driver.close();
	}
	
	*/
	@Test

	public void validateMapDiffFFXtest(){
	     WebDriver driver = new FirefoxDriver();
	     String url="http://www.pfauthority.org/pfaappforms/mos/map";
	     String path="//*[name()='svg']//*[name()='path']";
	     driver.get(url);
	     List<WebElement> element = driver.findElements(By.xpath("//*[name()='svg']//*[name()='path']"));
	     int y = element.size();
	    		 for(int x=1;x<y;x++){
	    		 String rpath=path.concat(("[" + x +"]").toString()) ;
	    		 WebElement relement = driver.findElement(By.xpath(rpath));
	    		 System.out.println("The state is "+ relement.getAttribute("data-code"));
	    		 relement.click();
	    		 System.out.println("The url is "+ driver.getCurrentUrl());
	    		 driver.get(url);
	    		 
	    		 }	     

	     driver.close();
	}
	

	
	
	
}
