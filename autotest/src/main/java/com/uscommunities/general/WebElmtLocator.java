package com.uscommunities.general;
import org.openqa.selenium.WebDriver;


public class WebElmtLocator {

	public WebElmtLocator(WebDriver driver) {
		super();
	}
	
	/*
	 * Test URL
	 */
	public static String prodURL="http://www.uscommunities.org";
	public static String test3URL="http://test3.uscommunities.org";
	
	/*
	 * Head tag 
	 */
	public String Header_About="//ul[@id='utility-menu']//a[text()='About']";
	public String Header_NE="//ul[@id='utility-menu']//a[text()='News & Events']";
	public String Header_Resources="//ul[@id='utility-menu']//a[text()='Resources']";
	public String Header_ContactUS="//ul[@id='utility-menu']//a[text()='Contact Us']";
	
	/*
	 * Drop down list under Head tag - "About" 
	 */
	public String Header_diff="//ul[@id='utility-menu']//a[@href='/about/what-makes-us-different/']";
	
	/*
	 * Drop down list under Head tag - "Resources" 
	 */
	public String State_Status="//ul[@id='utility-menu']//ul//li//a[text()='State Statutes']";
	
	/*
	 * Three major button name of main screen, redirector to sub page
	 * "K-12 School Districts", 
	 */
	public String ED_Icon="//div[@id='content-block-1']//a[text()='K-12 School Districts']";
	
	/*
	 * Education Purchasing page
	 * Below Head session
	 * 	Home > Education Purchasing 
	 */
	public String EducationPurchase = "//div[@id='breadcrumb']//a[text()='Education Purchasing']";

	/*
	 * Page URl: http://www.uscommunities.org/news-events/events/
	 * Events summary time
	 * purpose: remove the summary time and let user to check details
	 * regarding different user location has different time zone
	 */
	public String EventDetails = "//div[@id='summary']//a[text()='event-details']";
	public String EventTime = "//div[@id='summary']//a";
	
	/*
	 * page link
	 */
	public String link = "//*[@href]"; 
	
	/*
	 * State Status link
	 */
	public String wssurl = "http://www.uscommunities.org/resources/state-statutes/"; 
	public String t3ssurl = "http://test3.uscommunities.org/resources/state-statutes/";
	
	/**
	 * CSCDA site
	 * 
	 * Meeting agenda pdf can't find in IE10 (Christine reported on June 11th, 2014)
	 * 
	 */
	public String mtgScdul = "http://www.cacommunities.org/resources/meeting-agendas-staff-reports-minutes/";
}
