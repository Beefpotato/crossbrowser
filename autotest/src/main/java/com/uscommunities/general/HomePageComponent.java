package com.uscommunities.general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

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
	
	public void clickSupplier(WebDriver driver){
		WebElmtAction.Click(driver, By.xpath(contactDoc));
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
	
	public void openTest3SSURL(WebDriver driver) {
		WebElmtAction.open(driver, t3ssurl);
	}
	
	public void openProdSSURL(WebDriver driver) {
		WebElmtAction.open(driver, wssurl);
	}
	
	/**
	 * Open CSCDA meeting agenda link by IE10
	 * @param driver
	 * @return
	 */
	public void openCSCDAMtgURL(WebDriver driver) {
		WebElmtAction.open(driver, mtgScdul);
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
	
	public void checkAllHttpsLinksPrint(WebDriver driver) throws MalformedURLException, IOException{
		try{
		    File file = new File("c:\\Users\\acui\\Documents\\Logfile\\Httpslink.txt");
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    String line;
		    	while ((line = br.readLine()) != null) {	    		
		    		URL u = new URL(line);
		    		HttpsURLConnection con = (HttpsURLConnection)  u.openConnection();
		 		   	int responseCode = con.getResponseCode();
		 		    System.out.println(line+"is "+responseCode);
		    	}
		    	br.close();
			}
		    	catch(IOException e){
    	  			e.printStackTrace();
		    	}

	}
	
	public void checkAllLinksSaveToText(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//*[@href]"));
		int number = alllinks.size();
		System.out.println(number);
		  
		  Calendar cal = Calendar.getInstance();
		  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH:mm");
		  String fileName = format.format(cal.getTime());
		  System.out.println(fileName);
		  /**
		   * create a file if doesn't exist
		   */
        	  try{
        		    File file = new File("c:\\Users\\acui\\Documents\\Logfile\\Link_log_"+fileName+".txt");
        		    BufferedWriter output = new BufferedWriter(new FileWriter(file));
        		    
        		    for (int i=0; i<alllinks.size();i++) {
        		    	String x = alllinks.get(i).getAttribute("href");
        		    	int y=WebElmtAction.linkcheck(x);
        		    	output.write(x+"is "+y +'\n'); 
        		    	}        		    
        		    	output.close();
        		   	}
        	  			catch(IOException e){
        	  			e.printStackTrace();
        		   	   }

	  }
	
	public void checkAllNewTabsSaveToText(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//*[@href]"));
		int number = alllinks.size();
		  System.out.println(number);
		  
		  Calendar cal = Calendar.getInstance();
		  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH:mm");
		  String fileName = format.format(cal.getTime());
		  System.out.println(fileName);

		  /**
		   * create a file if doesn't exist
		   */
        	  try{
        		    File file = new File("c:\\Users\\acui\\Documents\\Logfile\\Link_log_"+fileName+".txt");
        		    BufferedWriter output = new BufferedWriter(new FileWriter(file));
        		    
        		    for (int i=0; i<alllinks.size();i++) {
        		    	String x = alllinks.get(i).getAttribute("href");
        		    	int y=WebElmtAction.linkcheck(x);
        		    		
        		    		if (y !=200) {
        		    			output.write(x+"is "+y +'\n'); 
        		    		}
        		    	}        		    
        		    	output.close();
        		   	}
        	  			catch(IOException e){
        	  			e.printStackTrace();
        		   	   }
        		  
        		   driver.quit();
	  }
	
	/**
	 * check duplicate external links 
	 */
	public void checkDuplicateLinkandPrint(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//*[@href]"));
		System.out.println("Total the number of links is:" + alllinks.size()); 
		Set<String> set = new HashSet<String>(); 
		  
		  for (int i=0; i<alllinks.size();i++){
			  String x = alllinks.get(i).getAttribute("href");
			  for (int j=0; j<alllinks.size(); j++) {
				  String y = alllinks.get(j).getAttribute("href");
				  if (x.equals(y) && i!=j) {
					  set.add(x); 
				  }
			  }
		  }
		
		  for (String str: set) {
				System.out.println("Find duplicate link is:" + str);
		  }
		  System.out.println("Total number of duplicate link is:" + set.size());
	}
	
	/**
	 * check duplicate image files
	 * Print out duplicate image src file 
	 */
	
	public void checkDuplicateImageandPrint(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//img[@src]"));
		System.out.println("Total the number of image is:" + alllinks.size());
		Set<String> set = new HashSet<String>(); 
		
		/*
		 * Print out all the links of target pages
		 * 
		 * for (int i=0; i<alllinks.size();i++) {
			  String x = alllinks.get(i).getAttribute("src");
			  System.out.println("Image url is:" + x);
		}
		*/
		
		for (int i=0; i<alllinks.size();i++){
			  String x = alllinks.get(i).getAttribute("src");
			  for (int j=0; j<alllinks.size(); j++) {
				  String y = alllinks.get(j).getAttribute("src");
				  if (x.equals(y) && i!=j) {
					  set.add(x); 
				  }
			  }
		  }
		System.out.println("Total number of duplicate image is:" + set.size() +"\n");
		
		for (String str: set) {
			System.out.println("Print duplicate image is:" + str);
		}
		  
	}
	
	/**
	 * Return duplicate image src locations as a array
	 * 
	 * Open each src link from driver
	 */
	public Set<String> findDuplicateImageandReturn(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//img[@src]"));
		System.out.println("Total the number of image is:" + alllinks.size());
		Set<String> set = new HashSet<String>(); 
		
		for (int i=0; i<alllinks.size();i++) {
			  String x = alllinks.get(i).getAttribute("src");
			  System.out.println("Image url is:" + x);
		}
		
		for (int i=0; i<alllinks.size();i++){
			  String x = alllinks.get(i).getAttribute("src");
			  for (int j=0; j<alllinks.size(); j++) {
				  String y = alllinks.get(j).getAttribute("src");
				  if (x.equals(y) && i!=j) {
					  set.add(x); 
				  }
			  }
		  }
		System.out.println("Total number of duplicate image is:" + set.size());

		return set; 
		  
	}
	
	public void checkDuplicatePDFandPrint(WebDriver driver) throws MalformedURLException, IOException{
		WebElmtAction.getElement(driver, By.xpath(link)); 
		List<WebElement> alllinks = driver.findElements(By.xpath("//li[@class='pdf']//a"));
		System.out.println("Total the number of PDF links is:" + alllinks.size()); 
		Set<String> set = new HashSet<String>(); 
		  
		  for (int i=0; i<alllinks.size();i++){
			  String x = alllinks.get(i).getAttribute("href");
			  for (int j=0; j<alllinks.size(); j++) {
				  String y = alllinks.get(j).getAttribute("href");
				  if (x.equals(y) && i!=j) {
					  set.add(x); 
				  }
			  }
		  }
		
		  for (String str: set) {
				System.out.println("Find duplicate PDF is:" + str);
		  }
		  System.out.println("Total number of duplicate PDF is:" + set.size());
	}
}
