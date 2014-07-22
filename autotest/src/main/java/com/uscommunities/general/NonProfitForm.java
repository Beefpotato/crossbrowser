package com.uscommunities.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.uscommunities.general.HomePageComponent;
import com.uscommunities.general.WebElmtAction;

public class NonProfitForm extends HomePageComponent {

	public NonProfitForm(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Page one contents 
	 * @param driver
	 */
	
	public void set501FormPageOne(WebDriver driver){
		WebElement nameofOrganization = driver.findElement(By.id("usc_organizationName")); 		
		WebElmtAction.sendKeys(nameofOrganization, "ClubSport");
		WebElement TIN = driver.findElement(By.id("usc_taxIdNumber")); 		
		WebElmtAction.sendKeys(TIN, "112203198");
		WebElement firstName = driver.findElement(By.id("usc_primaryContactFirstName")); 		
		WebElmtAction.sendKeys(firstName, "Richard");
		WebElement lastName = driver.findElement(By.id("usc_primaryContactLastName")); 		
		WebElmtAction.sendKeys(lastName, "Talyon");
		WebElement title = driver.findElement(By.id("usc_primaryContactTitle")); 		
		WebElmtAction.sendKeys(title, "Software Engineer");
		WebElement street = driver.findElement(By.id("usc_primaryContactStreet")); 		
		WebElmtAction.sendKeys(street, "101 Rose Blvd");
		WebElement city = driver.findElement(By.id("usc_primaryContactCity")); 		
		WebElmtAction.sendKeys(city, "San Francisco");
		Select stateDropDown = new Select(driver.findElement(By.id("usc_primaryContactState"))); 		
		WebElmtAction.dropDown(stateDropDown, "CA");
		WebElement zip = driver.findElement(By.id("usc_primaryContactZip")); 		
		WebElmtAction.sendKeys(zip, "98712");
		WebElement phone = driver.findElement(By.id("usc_primaryContactPhone")); 		
		WebElmtAction.sendKeys(phone, "678-888-9911");
		WebElement phoneExt = driver.findElement(By.id("usc_primaryContactPhoneExt")); 		
		WebElmtAction.sendKeys(phoneExt, "12345");
		WebElement emailAddress = driver.findElement(By.id("usc_primaryContactEmail")); 		
		WebElmtAction.sendKeys(emailAddress, "dummy@email.com");
		WebElement date = driver.findElement(By.id("usc_dateOrganized")); 		
		WebElmtAction.sendKeys(date, "07/09/2014");
		WebElement billContact = driver.findElement(By.id("usc_sameAsAbove")); 	
		billContact.click();		
		
	}
	
	public void clear501FormPageOne(WebDriver driver){
		WebElement nameofOrganization = driver.findElement(By.id("usc_organizationName")); 		
		nameofOrganization.clear();
		WebElement TIN = driver.findElement(By.id("usc_taxIdNumber")); 		
		TIN.clear();
		WebElement firstName = driver.findElement(By.id("usc_primaryContactFirstName")); 		
		firstName.clear();
		WebElement lastName = driver.findElement(By.id("usc_primaryContactLastName")); 		
		lastName.clear();
		WebElement title = driver.findElement(By.id("usc_primaryContactTitle")); 		
		title.clear();
		WebElement street = driver.findElement(By.id("usc_primaryContactStreet")); 		
		street.clear();
		WebElement city = driver.findElement(By.id("usc_primaryContactCity")); 		
		city.clear();
		Select stateDropDown = new Select(driver.findElement(By.id("usc_primaryContactState"))); 		
		WebElmtAction.dropDown(stateDropDown, "CA");
		WebElement zip = driver.findElement(By.id("usc_primaryContactZip")); 		
		zip.clear();
		WebElement phone = driver.findElement(By.id("usc_primaryContactPhone")); 		
		phone.clear();
		WebElement phoneExt = driver.findElement(By.id("usc_primaryContactPhoneExt")); 		
		phoneExt.clear();
		WebElement emailAddress = driver.findElement(By.id("usc_primaryContactEmail")); 		
		emailAddress.clear();
		WebElement date = driver.findElement(By.id("usc_dateOrganized")); 		
		date.clear();
		WebElement billContact = driver.findElement(By.id("usc_sameAsAbove")); 	
		billContact.click();		
		
	}
	
	/**
	 * Page two contents 
	 * @param driver
	 */
	
	public void clear501FormPageTwo(WebDriver driver){
		Select projectDropDown = new Select(driver.findElement(By.id("usc_projectType"))); 		
		WebElmtAction.dropDown(projectDropDown, "Healthcare: Clinic");
		WebElement projectName = driver.findElement(By.id("usc_projectName")); 		
		projectName.clear();
		WebElement facilityName = driver.findElement(By.id("usc_facility_1_facilityName")); 		
		facilityName.clear();
		WebElement bondAmt = driver.findElement(By.id("usc_facility_1_facilityBondAmount")); 		
		bondAmt.clear();
		WebElement facilityAddress = driver.findElement(By.id("usc_facility_1_facilityStreet")); 		
		facilityAddress.clear();
		WebElement facilityCity = driver.findElement(By.id("usc_facility_1_facilityCity")); 		
		facilityCity.clear();
		Select facilityState = new Select(driver.findElement(By.id("usc_facility_1_facilityState"))); 		
		WebElmtAction.dropDown(facilityState, "CA");
		WebElement facilityZip = driver.findElement(By.id("usc_facility_1_facilityZip")); 		
		facilityZip.clear();
		WebElement facilityCounty = driver.findElement(By.id("usc_facility_1_facilityCounty")); 		
		facilityCounty.clear();
		WebElement countyUnincorporated = driver.findElement(By.id("usc_facility_1_countyUnincorporated_N")); 		
		countyUnincorporated.click();
		WebElement paContactAgencyName = driver.findElement(By.id("usc_facility_1_paContactAgencyName")); 		
		paContactAgencyName.clear();
		WebElement paContactFirstName = driver.findElement(By.id("usc_facility_1_paContactFirstName")); 		
		paContactFirstName.clear();
		WebElement paContactLastName = driver.findElement(By.id("usc_facility_1_paContactLastName")); 		
		paContactLastName.clear();
		WebElement paContactTitle = driver.findElement(By.id("usc_facility_1_paContactTitle")); 		
		paContactTitle.clear();
		WebElement paContactPhone = driver.findElement(By.id("usc_facility_1_paContactPhone")); 		
		paContactPhone.clear();
		WebElement paContactPhoneExt = driver.findElement(By.id("usc_facility_1_paContactPhoneExt")); 		
		paContactPhoneExt.clear();
		WebElement paContactEmail = driver.findElement(By.id("usc_facility_1_paContactEmail")); 		
		paContactEmail.clear();
		WebElement congressionalDistrict = driver.findElement(By.id("usc_facility_1_congressionalDistrict")); 		
		congressionalDistrict.clear();
		WebElement stateSenateDistrict = driver.findElement(By.id("usc_facility_1_stateSenateDistrict")); 		
		stateSenateDistrict.clear();
		WebElement stateAssemblyDistrict = driver.findElement(By.id("usc_facility_1_stateAssemblyDistrict")); 		
		stateAssemblyDistrict.clear();	
		
	}
	
	public void set501FormPageTwo(WebDriver driver){
		Select projectDropDown = new Select(driver.findElement(By.id("usc_projectType"))); 		
		WebElmtAction.dropDown(projectDropDown, "Healthcare: Clinic");
		WebElement projectName = driver.findElement(By.id("usc_projectName")); 		
		WebElmtAction.sendKeys(projectName, "TestforFun");
		WebElement facilityName = driver.findElement(By.id("usc_facility_1_facilityName")); 		
		WebElmtAction.sendKeys(facilityName, "Fremont Club");
		WebElement bondAmt = driver.findElement(By.id("usc_facility_1_facilityBondAmount")); 		
		WebElmtAction.sendKeys(bondAmt, "6500000");
		WebElement facilityAddress = driver.findElement(By.id("usc_facility_1_facilityStreet")); 		
		WebElmtAction.sendKeys(facilityAddress, "202 Rose Blvd");
		WebElement facilityCity = driver.findElement(By.id("usc_facility_1_facilityCity")); 		
		WebElmtAction.sendKeys(facilityCity, "San Jose");
		Select facilityState = new Select(driver.findElement(By.id("usc_facility_1_facilityState"))); 		
		WebElmtAction.dropDown(facilityState, "CA");
		WebElement facilityZip = driver.findElement(By.id("usc_facility_1_facilityZip")); 		
		WebElmtAction.sendKeys(facilityZip, "65421");
		WebElement facilityCounty = driver.findElement(By.id("usc_facility_1_facilityCounty")); 		
		WebElmtAction.sendKeys(facilityCounty, "USA");
		WebElement countyUnincorporated = driver.findElement(By.id("usc_facility_1_countyUnincorporated_N")); 		
		countyUnincorporated.click();
		WebElement paContactAgencyName = driver.findElement(By.id("usc_facility_1_paContactAgencyName")); 		
		WebElmtAction.sendKeys(paContactAgencyName, "Brusher Shop");
		WebElement paContactFirstName = driver.findElement(By.id("usc_facility_1_paContactFirstName")); 		
		WebElmtAction.sendKeys(paContactFirstName, "Woodbery");
		WebElement paContactLastName = driver.findElement(By.id("usc_facility_1_paContactLastName")); 		
		WebElmtAction.sendKeys(paContactLastName, "Charley");
		WebElement paContactTitle = driver.findElement(By.id("usc_facility_1_paContactTitle")); 		
		WebElmtAction.sendKeys(paContactTitle, "Testing Engineer");
		WebElement paContactPhone = driver.findElement(By.id("usc_facility_1_paContactPhone")); 		
		WebElmtAction.sendKeys(paContactPhone, "6549876655");
		WebElement paContactPhoneExt = driver.findElement(By.id("usc_facility_1_paContactPhoneExt")); 		
		WebElmtAction.sendKeys(paContactPhoneExt, "111");
		WebElement paContactEmail = driver.findElement(By.id("usc_facility_1_paContactEmail")); 		
		WebElmtAction.sendKeys(paContactEmail, "dummy@email.com");
		WebElement congressionalDistrict = driver.findElement(By.id("usc_facility_1_congressionalDistrict")); 		
		WebElmtAction.sendKeys(congressionalDistrict, "111");
		WebElement stateSenateDistrict = driver.findElement(By.id("usc_facility_1_stateSenateDistrict")); 		
		WebElmtAction.sendKeys(stateSenateDistrict, "222");
		WebElement stateAssemblyDistrict = driver.findElement(By.id("usc_facility_1_stateAssemblyDistrict")); 		
		WebElmtAction.sendKeys(stateAssemblyDistrict, "333");	
		
	}
	
	/**
	 * Page three contents 
	 * @param driver
	 */
	
	public void set501FormPageThree(WebDriver driver){
		WebElement financingTaxExempt = driver.findElement(By.id("usc_financingTaxExempt")); 		
		WebElmtAction.sendKeys(financingTaxExempt, "111333");
		WebElement financingTaxable = driver.findElement(By.id("usc_financingTaxable")); 		
		WebElmtAction.sendKeys(financingTaxable, "3344");
		WebElement ProposedClosingDate = driver.findElement(By.id("usc_financingProposedClosingDate")); 		
		WebElmtAction.sendKeys(ProposedClosingDate, "01/01/2019");
		WebElement financingMaturityYears = driver.findElement(By.id("usc_financingMaturityYears")); 		
		WebElmtAction.sendKeys(financingMaturityYears, "2");
		WebElement interestRateFixed = driver.findElement(By.id("usc_interestRateFixed")); 		
		interestRateFixed.click();
		WebElement denominations = driver.findElement(By.id("usc_denominations")); 		
		WebElmtAction.sendKeys(denominations, "22211");
		WebElement privatePlacement = driver.findElement(By.id("usc_privatePlacement")); 		
		privatePlacement.click();
		WebElement developmentType = driver.findElement(By.id("usc_financingDevelopmentType_A")); 		
		developmentType.click();
		WebElement creditNone = driver.findElement(By.id("usc_creditEnhancement_none")); 		
		creditNone.click();
		WebElement Moodys = driver.findElement(By.id("usc_expectedMoodys")); 		
		WebElmtAction.sendKeys(Moodys, "Suspect01");
		WebElement expectedSP = driver.findElement(By.id("usc_expectedSP")); 		
		WebElmtAction.sendKeys(expectedSP, "Preview01");
		WebElement expectedFitch = driver.findElement(By.id("usc_expectedFitch")); 		
		WebElmtAction.sendKeys(expectedFitch, "Pending01");			
	}
	
	public void clear501FormPageThree(WebDriver driver){
		WebElement financingTaxExempt = driver.findElement(By.id("usc_financingTaxExempt")); 		
		financingTaxExempt.clear();
		WebElement financingTaxable = driver.findElement(By.id("usc_financingTaxable")); 		
		financingTaxable.clear();
		WebElement ProposedClosingDate = driver.findElement(By.id("usc_financingProposedClosingDate")); 		
		ProposedClosingDate.clear();
		WebElement financingMaturityYears = driver.findElement(By.id("usc_financingMaturityYears")); 		
		financingMaturityYears.clear();
		WebElement interestRateFixed = driver.findElement(By.id("usc_interestRateFixed")); 		
		interestRateFixed.click();
		WebElement denominations = driver.findElement(By.id("usc_denominations")); 		
		denominations.clear();
		WebElement privatePlacement = driver.findElement(By.id("usc_privatePlacement")); 		
		privatePlacement.click();
		WebElement developmentType = driver.findElement(By.id("usc_financingDevelopmentType_A")); 		
		developmentType.click();
		WebElement creditNone = driver.findElement(By.id("usc_creditEnhancement_none")); 		
		creditNone.click();
		WebElement Moodys = driver.findElement(By.id("usc_expectedMoodys")); 		
		Moodys.clear();
		WebElement expectedSP = driver.findElement(By.id("usc_expectedSP")); 		
		expectedSP.clear();
		WebElement expectedFitch = driver.findElement(By.id("usc_expectedFitch")); 		
		expectedFitch.clear();			
	}

	/**
	 * Page four contents 
	 * @param driver
	 */
	
	public void set501FormPageFour(WebDriver driver){
		WebElement sourcesTaxExempt = driver.findElement(By.id("usc_sourcesTaxExemptProceeds")); 		
		WebElmtAction.sendKeys(sourcesTaxExempt, "700000");
		WebElement sourcesTaxable = driver.findElement(By.id("usc_sourcesTaxableProceeds")); 		
		WebElmtAction.sendKeys(sourcesTaxable, "500000");
		WebElement usesLandAcquisition = driver.findElement(By.id("usc_usesLandAcquisition")); 		
		WebElmtAction.sendKeys(usesLandAcquisition, "500000");
		WebElement usesBuilding = driver.findElement(By.id("usc_usesBuildingAcquisition")); 				
		WebElmtAction.sendKeys(usesBuilding, "700000");
				
	}
	
	public void clear501FormPageFour(WebDriver driver){
		WebElement sourcesTaxExempt = driver.findElement(By.id("usc_sourcesTaxExemptProceeds")); 		
		sourcesTaxExempt.clear();
		WebElement sourcesTaxable = driver.findElement(By.id("usc_sourcesTaxableProceeds")); 		
		sourcesTaxable.clear();
		WebElement usesLandAcquisition = driver.findElement(By.id("usc_usesLandAcquisition")); 		
		usesLandAcquisition.clear();
		WebElement usesBuilding = driver.findElement(By.id("usc_usesBuildingAcquisition")); 				
		usesBuilding.clear();
				
	}
	
	/**
	 * Page five contents 
	 * @param driver
	 */
	
	public void set501FormPageFive(WebDriver driver){
		/*Bond Counsel*/
		WebElement firmName = driver.findElement(By.id("usc_bondCounselFirmName")); 		
		WebElmtAction.sendKeys(firmName, "ITF");
		WebElement firstName = driver.findElement(By.id("usc_bondCounselPrimaryFirstName")); 		
		WebElmtAction.sendKeys(firstName, "Johnson");
		WebElement lastName = driver.findElement(By.id("usc_bondCounselLastName")); 		
		WebElmtAction.sendKeys(lastName, "Hua");
		WebElement title = driver.findElement(By.id("usc_bondCounselTitle")); 				
		WebElmtAction.sendKeys(title, "Instructor");
		WebElement street = driver.findElement(By.id("usc_bondCounselStreet")); 		
		WebElmtAction.sendKeys(street, "111 First Street");
		WebElement city = driver.findElement(By.id("usc_bondCounselCity")); 		
		WebElmtAction.sendKeys(city, "Haiwi");
		Select bondstateDropDown = new Select(driver.findElement(By.id("usc_bondCounselState"))); 		
		WebElmtAction.dropDown(bondstateDropDown, "CA");
		WebElement zip = driver.findElement(By.id("usc_bondCounselZip")); 		
		WebElmtAction.sendKeys(zip, "97453");
		WebElement phone = driver.findElement(By.id("usc_bondCounselPrimaryPhone")); 		
		WebElmtAction.sendKeys(phone, "6705891235");
		WebElement extension = driver.findElement(By.id("usc_bondCounselPrimaryExt")); 		
		WebElmtAction.sendKeys(extension, "256");
		WebElement email = driver.findElement(By.id("usc_bondCounselPrimaryEmail")); 		
		WebElmtAction.sendKeys(email, "dummy@email.com");			
		
		/*Bank/Underwriter/Bond Purchaser*/
		WebElement underwriterFirmName = driver.findElement(By.id("usc_underwriterFirmName")); 		
		WebElmtAction.sendKeys(underwriterFirmName, "National ITF");
		WebElement underwriterfirstName = driver.findElement(By.id("usc_underwriterPrimaryFirstName")); 		
		WebElmtAction.sendKeys(underwriterfirstName, "Senior Johnson");
		WebElement underwriterlastName = driver.findElement(By.id("usc_underwriterLastName")); 		
		WebElmtAction.sendKeys(underwriterlastName, "Hua");
		WebElement underwritertitle = driver.findElement(By.id("usc_underwriterTitle")); 				
		WebElmtAction.sendKeys(underwritertitle, "Instructor");
		WebElement underwriterstreet = driver.findElement(By.id("usc_underwriterStreet")); 		
		WebElmtAction.sendKeys(underwriterstreet, "112 First Street");
		WebElement underwritercity = driver.findElement(By.id("usc_underwriterCity")); 		
		WebElmtAction.sendKeys(underwritercity, "Haiwi");
		Select underwriterstateDropDown = new Select(driver.findElement(By.id("usc_underwriterState"))); 		
		WebElmtAction.dropDown(underwriterstateDropDown, "CA");
		WebElement underwriterZip = driver.findElement(By.id("usc_underwriterZip")); 		
		WebElmtAction.sendKeys(underwriterZip, "97453");
		WebElement underwriterPrimaryPhone = driver.findElement(By.id("usc_underwriterPrimaryPhone")); 		
		WebElmtAction.sendKeys(underwriterPrimaryPhone, "6705891235");
		WebElement underwriterPrimaryExt = driver.findElement(By.id("usc_underwriterPrimaryExt")); 		
		WebElmtAction.sendKeys(underwriterPrimaryExt, "256");
		WebElement underwriterPrimaryEmail = driver.findElement(By.id("usc_underwriterPrimaryEmail")); 		
		WebElmtAction.sendKeys(underwriterPrimaryEmail, "dummy@email.com");			
	
		/*Financial Advisor*/
		WebElement financialAdvisorFirmName = driver.findElement(By.id("usc_financialAdvisorFirmName")); 		
		WebElmtAction.sendKeys(financialAdvisorFirmName, "Financial ITF");
		WebElement financialAdvisorfirstName = driver.findElement(By.id("usc_financialAdvisorPrimaryFirstName")); 		
		WebElmtAction.sendKeys(financialAdvisorfirstName, "Junior Johnson");
		WebElement financialAdvisorLastName = driver.findElement(By.id("usc_financialAdvisorLastName")); 		
		WebElmtAction.sendKeys(financialAdvisorLastName, "HuaMing");
		WebElement financialAdvisorTitle = driver.findElement(By.id("usc_financialAdvisorTitle")); 				
		WebElmtAction.sendKeys(financialAdvisorTitle, "Inside Instructor");
		WebElement financialAdvisorStreet = driver.findElement(By.id("usc_financialAdvisorStreet")); 		
		WebElmtAction.sendKeys(financialAdvisorStreet, "342 Second Blv");
		WebElement financialAdvisorCity = driver.findElement(By.id("usc_financialAdvisorCity")); 		
		WebElmtAction.sendKeys(financialAdvisorCity, "Husdon");
		Select financialstateDropDown = new Select(driver.findElement(By.id("usc_financialAdvisorState"))); 		
		WebElmtAction.dropDown(financialstateDropDown, "CA");
		WebElement financialAdvisorZip = driver.findElement(By.id("usc_financialAdvisorZip")); 		
		WebElmtAction.sendKeys(financialAdvisorZip, "82453");
		WebElement financialAdvisorPrimaryPhone = driver.findElement(By.id("usc_financialAdvisorPrimaryPhone")); 		
		WebElmtAction.sendKeys(financialAdvisorPrimaryPhone, "6705891235");
		WebElement financialAdvisorPrimaryExt = driver.findElement(By.id("usc_financialAdvisorPrimaryExt")); 		
		WebElmtAction.sendKeys(financialAdvisorPrimaryExt, "2256");
		WebElement financialAdvisorPrimaryEmail = driver.findElement(By.id("usc_financialAdvisorPrimaryEmail")); 		
		WebElmtAction.sendKeys(financialAdvisorPrimaryEmail, "dummy@email.com");			
	
		/*Rebate Analyst*/
		WebElement rebateAnalystFirmName = driver.findElement(By.id("usc_rebateAnalystFirmName")); 		
		WebElmtAction.sendKeys(rebateAnalystFirmName, "Rebate Counsel");
		WebElement rebateAnalystPrimaryFirstName = driver.findElement(By.id("usc_rebateAnalystPrimaryFirstName")); 		
		WebElmtAction.sendKeys(rebateAnalystPrimaryFirstName, "Mary");
		WebElement rebateAnalystLastName = driver.findElement(By.id("usc_rebateAnalystLastName")); 		
		WebElmtAction.sendKeys(rebateAnalystLastName, "Juson");
		WebElement rebateAnalystTitle = driver.findElement(By.id("usc_rebateAnalystTitle")); 				
		WebElmtAction.sendKeys(rebateAnalystTitle, "Assitant PM");
		WebElement rebateAnalystStreet = driver.findElement(By.id("usc_rebateAnalystStreet")); 		
		WebElmtAction.sendKeys(rebateAnalystStreet, "425 Champion Blv");
		WebElement rebateAnalystCity = driver.findElement(By.id("usc_rebateAnalystCity")); 		
		WebElmtAction.sendKeys(rebateAnalystCity, "Las Vegas");
		Select rebateAnalystState = new Select(driver.findElement(By.id("usc_rebateAnalystState"))); 		
		WebElmtAction.dropDown(rebateAnalystState, "CA");
		WebElement rebateAnalystZip = driver.findElement(By.id("usc_rebateAnalystZip")); 		
		WebElmtAction.sendKeys(rebateAnalystZip, "85463");
		WebElement rebateAnalystPrimaryPhone = driver.findElement(By.id("usc_rebateAnalystPrimaryPhone")); 		
		WebElmtAction.sendKeys(rebateAnalystPrimaryPhone, "9735124698");
		WebElement rebateAnalystPrimaryExt = driver.findElement(By.id("usc_rebateAnalystPrimaryExt")); 		
		WebElmtAction.sendKeys(rebateAnalystPrimaryExt, "2233");
		WebElement rebateAnalystPrimaryEmail = driver.findElement(By.id("usc_rebateAnalystPrimaryEmail")); 		
		WebElmtAction.sendKeys(rebateAnalystPrimaryEmail, "dummy@email.com");			
	
	}
	
	public void clear501FormPageFive(WebDriver driver){
		/*Bond Counsel*/
		WebElement firmName = driver.findElement(By.id("usc_bondCounselFirmName")); 		
		firmName.clear();
		WebElement firstName = driver.findElement(By.id("usc_bondCounselPrimaryFirstName")); 		
		firstName.clear();
		WebElement lastName = driver.findElement(By.id("usc_bondCounselLastName")); 		
		lastName.clear();
		WebElement title = driver.findElement(By.id("usc_bondCounselTitle")); 				
		title.clear();
		WebElement street = driver.findElement(By.id("usc_bondCounselStreet")); 		
		street.clear();
		WebElement city = driver.findElement(By.id("usc_bondCounselCity")); 		
		city.clear();
		Select bondstateDropDown = new Select(driver.findElement(By.id("usc_bondCounselState"))); 		
		WebElmtAction.dropDown(bondstateDropDown, "CA");
		WebElement zip = driver.findElement(By.id("usc_bondCounselZip")); 		
		zip.clear();
		WebElement phone = driver.findElement(By.id("usc_bondCounselPrimaryPhone")); 		
		phone.clear();
		WebElement extension = driver.findElement(By.id("usc_bondCounselPrimaryExt")); 		
		extension.clear();
		WebElement email = driver.findElement(By.id("usc_bondCounselPrimaryEmail")); 		
		email.clear();			
		
		/*Bank/Underwriter/Bond Purchaser*/
		WebElement underwriterFirmName = driver.findElement(By.id("usc_underwriterFirmName")); 		
		underwriterFirmName.clear();
		WebElement underwriterfirstName = driver.findElement(By.id("usc_underwriterPrimaryFirstName")); 		
		underwriterfirstName.clear();
		WebElement underwriterlastName = driver.findElement(By.id("usc_underwriterLastName")); 		
		underwriterlastName.clear();
		WebElement underwritertitle = driver.findElement(By.id("usc_underwriterTitle")); 				
		underwritertitle.clear();
		WebElement underwriterstreet = driver.findElement(By.id("usc_underwriterStreet")); 		
		underwriterstreet.clear();
		WebElement underwritercity = driver.findElement(By.id("usc_underwriterCity")); 		
		underwritercity.clear();
		Select underwriterstateDropDown = new Select(driver.findElement(By.id("usc_underwriterState"))); 		
		WebElmtAction.dropDown(underwriterstateDropDown, "CA");
		WebElement underwriterZip = driver.findElement(By.id("usc_underwriterZip")); 		
		underwriterZip.clear();
		WebElement underwriterPrimaryPhone = driver.findElement(By.id("usc_underwriterPrimaryPhone")); 		
		underwriterPrimaryPhone.clear();
		WebElement underwriterPrimaryExt = driver.findElement(By.id("usc_underwriterPrimaryExt")); 		
		underwriterPrimaryExt.clear();
		WebElement underwriterPrimaryEmail = driver.findElement(By.id("usc_underwriterPrimaryEmail")); 		
		underwriterPrimaryEmail.clear();		
	
		/*Financial Advisor*/
		WebElement financialAdvisorFirmName = driver.findElement(By.id("usc_financialAdvisorFirmName")); 		
		financialAdvisorFirmName.clear();
		WebElement financialAdvisorfirstName = driver.findElement(By.id("usc_financialAdvisorPrimaryFirstName")); 		
		financialAdvisorfirstName.clear();
		WebElement financialAdvisorLastName = driver.findElement(By.id("usc_financialAdvisorLastName")); 		
		financialAdvisorLastName.clear();
		WebElement financialAdvisorTitle = driver.findElement(By.id("usc_financialAdvisorTitle")); 				
		financialAdvisorTitle.clear();
		WebElement financialAdvisorStreet = driver.findElement(By.id("usc_financialAdvisorStreet")); 		
		financialAdvisorStreet.clear();
		WebElement financialAdvisorCity = driver.findElement(By.id("usc_financialAdvisorCity")); 		
		financialAdvisorCity.clear();
		Select financialstateDropDown = new Select(driver.findElement(By.id("usc_financialAdvisorState"))); 		
		WebElmtAction.dropDown(financialstateDropDown, "CA");
		WebElement financialAdvisorZip = driver.findElement(By.id("usc_financialAdvisorZip")); 		
		financialAdvisorZip.clear();
		WebElement financialAdvisorPrimaryPhone = driver.findElement(By.id("usc_financialAdvisorPrimaryPhone")); 		
		financialAdvisorPrimaryPhone.clear();
		WebElement financialAdvisorPrimaryExt = driver.findElement(By.id("usc_financialAdvisorPrimaryExt")); 		
		financialAdvisorPrimaryExt.clear();
		WebElement financialAdvisorPrimaryEmail = driver.findElement(By.id("usc_financialAdvisorPrimaryEmail")); 		
		financialAdvisorPrimaryEmail.clear();	
	
		/*Rebate Analyst*/
		WebElement rebateAnalystFirmName = driver.findElement(By.id("usc_rebateAnalystFirmName")); 		
		rebateAnalystFirmName.clear();
		WebElement rebateAnalystPrimaryFirstName = driver.findElement(By.id("usc_rebateAnalystPrimaryFirstName")); 		
		rebateAnalystPrimaryFirstName.clear();
		WebElement rebateAnalystLastName = driver.findElement(By.id("usc_rebateAnalystLastName")); 		
		rebateAnalystLastName.clear();
		WebElement rebateAnalystTitle = driver.findElement(By.id("usc_rebateAnalystTitle")); 				
		rebateAnalystTitle.clear();
		WebElement rebateAnalystStreet = driver.findElement(By.id("usc_rebateAnalystStreet")); 		
		rebateAnalystStreet.clear();
		WebElement rebateAnalystCity = driver.findElement(By.id("usc_rebateAnalystCity")); 		
		rebateAnalystCity.clear();
		Select rebateAnalystState = new Select(driver.findElement(By.id("usc_rebateAnalystState"))); 		
		WebElmtAction.dropDown(rebateAnalystState, "CA");
		WebElement rebateAnalystZip = driver.findElement(By.id("usc_rebateAnalystZip")); 		
		rebateAnalystZip.clear();
		WebElement rebateAnalystPrimaryPhone = driver.findElement(By.id("usc_rebateAnalystPrimaryPhone")); 		
		rebateAnalystPrimaryPhone.clear();
		WebElement rebateAnalystPrimaryExt = driver.findElement(By.id("usc_rebateAnalystPrimaryExt")); 		
		rebateAnalystPrimaryExt.clear();
		WebElement rebateAnalystPrimaryEmail = driver.findElement(By.id("usc_rebateAnalystPrimaryEmail")); 		
		rebateAnalystPrimaryEmail.clear();			
	
	}
	
	
	
}
