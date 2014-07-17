package com.cacommunities.org;
import org.openqa.selenium.WebDriver;


public class WebElmtLocator {

	public WebElmtLocator(WebDriver driver) {
		super();
	}
	
	/**
	 * 
	 * Test URL
	 */
	public static String prodURL="http://www.cacommunities.org/";
	public static String test3URL="http://wwwtest.cacommunities.org/";
	
	/**
	 * Test Form URL
	 */
	public static String nonProfit="";
	
	/**
	 * News session of home page
	 */
	public String News="//div[@class='article articletype-0']";
	
	/**
	 * Map session 
	 */
	public String map="http://www.pfauthority.org/pfaappforms/mos/map";
	
	/**
	 * PUBLIC AGENCY PROGRAMS PAGE
	 * AND sub pages
	 */
	public String publicAgency="http://www.cacommunities.org/public-agency-programs/";
	public String SCIP="http://www.cacommunities.org/public-agency-programs/statewide-community-infrastructure-program-scip/";
	public String SCIPFaq="http://www.cacommunities.org/public-agency-programs/statewide-community-infrastructure-program/scip-faqs/";
	public String SCIPFT="http://www.cacommunities.org/public-agency-programs/statewide-community-infrastructure-program/scip-finance-team/";
	public String TRIP="http://www.cacommunities.org/public-agency-programs/total-road-improvement-programs-trip/";
	
	/**
	 * PRIVATE ACTIVITY PROGRAMS PAGE
	 * AND sub pages
	 */
	public String privateProgram="http://www.cacommunities.org/private-activity-programs/";
	public String houseBonds="http://www.cacommunities.org/private-activity-programs/housing-bonds/";
	public String idbs="http://www.cacommunities.org/private-activity-programs/idbs-manufacturing/";
	public String small="http://www.cacommunities.org/private-activity-programs/bonds/small-issue-public-bond-programs/";
	public String exempt="http://www.cacommunities.org/private-activity-programs/exempt-facilities-solid-waste/";

	/**
	 * New Markets Tax Credit Program PAGE
	 * AND sub pages
	 */
	public String taxCreditProgram="http://www.cacommunities.org/new-markets-tax-credit-program/";
	public String NMTC="http://www.cacommunities.org/new-markets-tax-credit-program/nmtc-potential-benefits/";
	public String qualifications="http://www.cacommunities.org/new-markets-tax-credit-program/nmtc-potential-benefits/";
	public String howitWorks="http://www.cacommunities.org/new-markets-tax-credit-program/how-it-works/";
	public String CSCDCProjects="http://www.cacommunities.org/new-markets-tax-credit-program/cscdc-projects/";
	public String westHill="http://www.cacommunities.org/new-markets-tax-credit-program/cscdc-projects/west-hills-community-college-district/";
	public String shastaCommunity="http://www.cacommunities.org/new-markets-tax-credit-program/cscdc-projects/shasta-community-health-center/";
	public String alliance="http://www.cacommunities.org/new-markets-tax-credit-program/cscdc-projects/alliance/";
	public String swans="http://www.cacommunities.org/new-markets-tax-credit-program/cscdc-projects/swans-marketplace/";
	public String about="http://www.cacommunities.org/new-markets-tax-credit-program/about-cscdc/";
	public String resources="http://www.cacommunities.org/new-markets-tax-credit-program/nmtc-resources/";
	public String contact="http://www.cacommunities.org/new-markets-tax-credit-program/contact-us/";
	
	/**
	 * COMMUNITY BENEFITS PAGE
	 * Only one page
	 */
	public String community="http://www.cacommunities.org/community-benefits/";
	
	/**
	 * POST ISSUANCE COMPLIANCE PAGE
	 * Only one page
	 */
	public String PIC="http://www.cacommunities.org/post-issuance-compliance/";
	
	/**
	 * POLICIES AND FEES PAGE
	 * AND sub pages
	 */
	public String PNF="http://www.cacommunities.org/policies-and-fees/";
	public String policies="http://www.cacommunities.org/policies-and-fees/general-policies/";
	public String FPOLICY="http://www.cacommunities.org/policies-and-fees/issuance-policy/";
	public String feeSchedule="http://www.cacommunities.org/policies-and-fees/fee-schedule/";
	public String privateSchool="http://www.cacommunities.org/policies-and-fees/k-12-private-school-policy/";
	public String higherEducation="http://www.cacommunities.org/policies-and-fees/higher-education-policy/";
	public String publicAccess="http://www.cacommunities.org/policies-and-fees/public-access-to-records-policy/";
	
	/**
	 * RESOURCES PAGE
	 * AND sub pages
	 */
	public String calendar="http://www.cacommunities.org/resources/calendar/";
	public String publications="http://www.cacommunities.org/resources/publications/";
	public String mediaCente="http://www.cacommunities.org/resources/media-center/";
	public String mediaRequest="http://www.cacommunities.org/resources/media-center/media-request/";
	public String agendas="http://www.cacommunities.org/resources/meeting-agendas-staff-reports-minutes/";	
	
	/**
	 * about us PAGE
	 * AND sub pages
	 */
	public String aboutus="http://www.cacommunities.org/about-us/";
	public String participants="http://www.cacommunities.org/about-us/program-participants/";
	public String commissioners="http://www.cacommunities.org/about-us/commissioners/";	
	
	/**
	 * 
	 * 501 no-profit forms
	 * 
	 */
	
	
	/**
	 * PFA Form Button
	 *  
	 */
	public String validateBtn="//div[@class='btn_box btn_box_top']//input[@class='validate']"; 
	public String nextBtn="//div[@class='btn_box btn_box_top']//input[@class='next']";
	public String previewBtn="//div[@class='btn_box btn_box_top']//input[@class='preview']";
	public String genPDFBtn="//div[@class='btn_box btn_box_top']//input[@class='genPdf']";  
	public String sbmtBtn="//div[@class='btn_box btn_box_top']//input[@class='submit']";
	
	
	/**
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
	
	/*
	 * Contracts and Suppliers link  
	 */
	public String contactDoc = "//li[@class='trigger']//a[text()='Contract Documents']";
	public String amsan = "http://test3.uscommunities.org/suppliers/amsan-cleansource-janpak/";
	
	
	
	/*
	 * CSCDA site
	 * 
	 * Meeting agenda pdf can't find in IE10 (Christine reported on June 11th, 2014)
	 * 
	 */
	public String mtgScdul = "http://www.cacommunities.org/resources/meeting-agendas-staff-reports-minutes/";
}
