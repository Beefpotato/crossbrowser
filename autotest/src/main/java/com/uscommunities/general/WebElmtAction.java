package com.uscommunities.general;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.FileUtils;

/**

 * Contains methods that allow to perform most of the actions on page.

 * 

 * @author acui@uscommunities.org (Alan Cui)

 * 

 */

public class WebElmtAction {

	  private static final String TIME_FORMAT = "HH_mm_ss_SSS";
	  private static final String DATE_FORMAT = "yyyy_MM_dd";
	  private static final String SCREEN_SHOT_DIR = "target/surefire-reports/screenshots/";
	  private static final String FORWARD_SLASH = "/";
	  private static final String SCREEN_SHOT_EXTENSION = ".jpg";
	
	public WebElmtAction() {
		super();
	}

	public static void Click(final WebDriver driver, final By locator)
		      throws RuntimeException {
		    WebElement element = getElement(driver, locator);
		    element.click();
		    
		  }

	 public static WebElement getElement(WebDriver driver, By locator)
		      throws RuntimeException {
		    return driver.findElement(locator);
		  }
	 
	  /**

	   * Returns true if element is present. Use this if your element should be present immediately.

	   * @param driver

	   * @param locator

	   * @return true if element is present.

	   */
	 
	 public static boolean isElementPresent(WebDriver driver, By locator) {
		    try {
		      driver.findElement(locator);
		      return true;
		    } catch (Exception e) {
		      return false;
		    }
		  }
	 
	  /**

	   * Polls for a element and gets text from it.

	   * @param driver

	   * @param locator

	   * @param failureMsgToShowIfEmntNotFound

	   */
	 
	 public static String getText(final WebDriver driver, final By locator) {
		    if (isElementPresent(driver, locator)) {
		      return driver.findElement(locator).getText();
		    }
		   return null; 
		    //throw new ElementNotFoundException(locator, "Could not getText", driver);
		  }

	
	/**
	 * Go through the page and store all the links
	 * 
	 * @param driver
	 */
	 
	public List<String> createLinkList(WebDriver driver) {
		List<String> hrefs = new ArrayList<String>();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = links.iterator();
			while(iterator.hasNext()) {
				WebElement link = iterator.next();
				hrefs.add(link.getAttribute("href"));
			}
				return hrefs;
		}
	
	/**
	 * Go through stored link list and validate each list is workable
	 * 
	 * @param driver
	 */
		
	public void iterateTroughLinkList(WebDriver driver, List<String> hrefs) {	
		Iterator<String> iterator = hrefs.iterator();
		while(iterator.hasNext()) {
			String href = iterator.next();			
			WebElement link = driver.findElement(By.cssSelector("a[href=" +href + "]"));
			link.click();
			
			driver.navigate().back();  
		
		}
	}
	  /**

	   * Returns the X location of the element.

	   * @param driver

	   * @param locator

	   * @return

	   */
	 public static int getElementPositionX(WebDriver driver, By locator) {
		    WebElement element = driver.findElement(locator);
		    return element.getLocation().getX();
		  }
	 
	  /**

	   * Returns the Y location of the element.

	   * @param driver

	   * @param locator

	   * @return

	   */

	  public static int getElementPositionY(WebDriver driver, By locator) {
		    WebElement element = driver.findElement(locator);
		    return element.getLocation().getY();
		  
	  }
	  
	  /**

	   * Resizes the browser to the size specified and refreshes the page. 

	   * @param driver

	   * @param int windowWidth

	   * @param int windowHeight

	   */

	  public static void resizeBrowserAndRefresh(WebDriver driver, int windowWidth,

	      int windowHeight) {

	    driver.manage().window().setPosition(new Point(0, 0));

	    driver.manage().window().setSize(new Dimension(windowWidth, windowHeight));

	    System.out.println("<b>Actual Browser Size:</b> " + getBrowserSize(driver));

	    driver.navigate().refresh();

	    System.out.println("Refreshed page");

	  }
	  
	  /**

	   * Returns the size of the current browser used by the test.

	   * @param driver

	   * @return browser size as {@link String} eg:"W:1600 H:900"

	   */

	  public static String getBrowserSize(WebDriver driver) {

	    return "W: " + driver.manage().window().getSize().getWidth() + " H: "

	        + driver.manage().window().getSize().getHeight();

	  }
	  
	  /**

	   * Opens the url.

	   * @param driver

	   */

	  public static void open(final WebDriver driver, String url) {

		  	 driver.get(url);

	  }
	
	  
	  public static int linkcheck(String url) throws MalformedURLException, IOException {
		   URL u= new URL(url);
		   HttpURLConnection con = (HttpURLConnection)  u.openConnection();
		   int responseCode = con.getResponseCode();
		   return responseCode;
		   
	   }
	  
	  public static int Httpslinkcheck(String url) throws MalformedURLException, IOException {
		   URL u= new URL(url);
		   HttpsURLConnection con = (HttpsURLConnection)  u.openConnection();
		   int responseCode = con.getResponseCode();

		   return responseCode;
		   
	   }
	  
	  //public static void writeToTextFile(String link, int number) throws IOException {
		  public static File writeToTextFile() throws IOException {
		  Calendar cal = Calendar.getInstance();
		  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH:mm");
		  String fileName = format.format(cal.getTime());
		  System.out.println(fileName);

		  File file = new File("c:\\Users\\acui\\Documents\\Logfile" +fileName+ ".txt");
		  /**
		   * create a file if doesn't exist
		   */
          try {
    		  if (!file.exists()) {
  				file.createNewFile();
  				}
                 //file.createNewFile();
          } catch (IOException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
          }

          return file; 

	  }
	
		  /**

		   * Captures the screenshot of the current page when the SCREENSHOT system

		   * property is set to 'on'. eg:SCREENSHOT=ON in bat and your pom.xml should

		   * have the SCREENSHOT property defined.

		   * <b>USAGE:</b>

		   * @param driver

		   */
		  public static String captureScreenShot(WebDriver driver) {

			    if ("on".equalsIgnoreCase(System.getProperty("SCREENSHOT"))) {

			        final DateFormat df = new SimpleDateFormat(TIME_FORMAT);
			        final DateFormat dfFolder = new SimpleDateFormat(DATE_FORMAT);
			        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			        String fileName = SCREEN_SHOT_DIR + dfFolder.format(new Date())
			            + FORWARD_SLASH + df.format(new Date()) + SCREEN_SHOT_EXTENSION;
			        String link = "  <b><a href='" + fileName
			            + "' onclick=\"window.open('" + fileName
			            + "','popup','"
			            + "width=800,height=1500,toolbar=no,directories=no,location=no,"
			            + "menubar=no,status=no,left=0,top=0'); return false\">"
			            + "screenshot" + "</a></b>  <a href='" + driver.getCurrentUrl()
			            + "' target='_blank' >" + "    url " + "</a>";

			        return link;
			      } 
			    return "";
			  }		  

		  /**
		   * clear web browser cookie
		   * 
		   * @param driver
		   */
		  public static void clearAllCookies(WebDriver driver) {
			    driver.manage().deleteAllCookies();
			  }
		  
		  public static void sendKeys(final WebElement webElement, final String textToBeTyped) {
			    webElement.sendKeys(textToBeTyped);
			  }
		  
		  /**

		   * Select the 'optionOfDropDownList' in the specified webElement.

		   * 

		   * @param webElement

		   * @param optionValue

		   */
		  public static void dropDown(final Select select, final String optionValue) {
			  select.selectByValue(optionValue);
		  }
}
