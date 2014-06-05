package com.uscommunities.general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageComponent extends WebElmtLocator {
	
	public HomePageComponent(WebDriver driver){
		super(driver);
	}
	
	public boolean Aboutshowup(WebDriver driver) {
		
		return WebElmtAction.isElementPresent(driver,By.xpath(Header_About));
	
	}
	
	public int XpositionofAbout(WebDriver driver){
	
		return WebElmtAction.getElementPositionX(driver, By.xpath(Header_About));
	}
	
	public int XpositionofNE(WebDriver driver){
		
		return WebElmtAction.getElementPositionX(driver, By.xpath(Header_NE));
	}
	
	public int YpositionofAbout(WebDriver driver){
		
		return WebElmtAction.getElementPositionY(driver, By.xpath(Header_About));
	}
	
	public int YpositionofNE(WebDriver driver){
		
		return WebElmtAction.getElementPositionY(driver, By.xpath(Header_NE));
	}
	
    public int XpositionofED(WebDriver driver){
		
		return WebElmtAction.getElementPositionX(driver, By.xpath(ED_Icon));
	}
	
	public int YpositionofED(WebDriver driver){
		
		return WebElmtAction.getElementPositionY(driver, By.xpath(ED_Icon));
	}
	
	public void clickEducation(WebDriver driver){
		WebElmtAction.Click(driver, By.xpath(ED_Icon));
	}
	
	public void clickStateMap(WebDriver driver){
		WebElmtAction.Click(driver, By.xpath(State_Status));
	}
	
	public void setBrowserSizeTo760(WebDriver driver){
		WebElmtAction.resizeBrowserAndRefresh(driver, 760, 760);
	}
	
	public void setBrowserSizeTo960(WebDriver driver){
		WebElmtAction.resizeBrowserAndRefresh(driver, 960, 720);
	}

	public void setBrowserSizeTo1024(WebDriver driver){
		WebElmtAction.resizeBrowserAndRefresh(driver, 1024, 768);
	}
	
	public void openProdURL(WebDriver driver) {
		WebElmtAction.open(driver, prodURL);
	}
	
	public void openTest3URL(WebDriver driver) {
		WebElmtAction.open(driver, test3URL);
	}
	
	public boolean elementIsPresent(WebDriver driver) {
		return WebElmtAction.isElementPresent(driver, By.xpath(EventDetails));
	}
	
	public String getTextValue(WebDriver driver) {
			return WebElmtAction.getText(driver, By.xpath(EventTime));
	}
	
	public void checkAllLinksPrint(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//*[@href]"));
		  System.out.println(alllinks.size());
		  
		  for (int i=0; i<alllinks.size();i++){
			  String x = alllinks.get(i).getAttribute("href");
			  int y=WebElmtAction.linkcheck(x);
			  System.out.println(x+"is "+y);
		  }
	}
	
	public void checkAllLinksSaveToText(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//*[@href]"));
		  System.out.println(alllinks.size());
		  
		  for (int i=0; i<alllinks.size();i++){
			  String x = alllinks.get(i).getAttribute("href");
			  int y=WebElmtAction.linkcheck(x);
			  WebElmtAction.writeToTextFile(x, y); 
		  }
	}

	
}
