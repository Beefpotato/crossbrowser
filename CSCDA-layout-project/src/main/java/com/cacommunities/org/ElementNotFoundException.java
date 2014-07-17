package com.cacommunities.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class ElementNotFoundException extends RuntimeException {
  
 
  private static final long serialVersionUID = -4818029531365715529L;

  /**
   * Constructs a failure reason like
   * <p>Sign in button missing.
   * <br> Could not find element using By.id(#sgnBtn)</p>
   * @param locator {@link By} eg:By.id(#sgnBtn)
   * @param failure {@link String} eg:Sign in button missing.
   */
  public ElementNotFoundException(By locator, String failure) {
    super("\n" + failure + " \n Could not find element using " + locator);
  }

  
  public ElementNotFoundException(By locator, String failure, WebDriver driver) {
    super("\n" + failure + " \n Could not find element using " + locator + " \n");
  }

  
  public ElementNotFoundException(String failure, WebDriver driver) {
    super("\n" + failure + " \n Could not find element.\n" );
  }

}

