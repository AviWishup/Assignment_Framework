package org.makeMyTrip.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.frame.pages.WishupDashPage;
import org.openqa.selenium.By;

public class Multi_City_Page extends BasePage {

	final static Logger log = LogManager.getLogger(Multi_City_Page.class.getName());
	
	private By by_traveller_classMulticity = By.id("travellers 0");
	private By by_passengerErrorMsg = By.xpath("//p[@id='smallErrorMessage']");
	
	private By by_FromAnotherCity = By.id("fromAnotherCity0");
	private By by_FromCityName =By.id("react-autowhatever-1-section-0-item-0");
	private By by_ToAnotherCity = By.id("toAnotherCity0");
	private By by_tocityname = By.xpath("//p[text()='New Delhi, India']");
	private By by_ToAnotherCity1 = By.id("toAnotherCity1");
	private By by_tocityname1 = By.xpath("//p[text()='Mumbai, India']");
	private By by_Departure = By.xpath("//span[text()='DEPARTURE']");
	private By by_Departure_date = By.xpath("//p[text()='31']");
	private By by_add_another_city = By.className("btnAddCity");
	private By by_Check_from_city =By.id("fromAnotherCity2");//to check add another city working or not
	private By by_Remove_icon = By.xpath("//span[@class='landingSprite cursorPointer commonRemoveIcon']");
	private By by_adults = By.xpath("//li[text()='5']");
	private By by_children =By.xpath("//div[@class='makeFlex column childCounter']//li[text()='6']");
	private By by_Infants =By.xpath("//div[@class='makeFlex column pushRight infantCounter']//li[text()='6']");
	
	private By by_travErrorMsg = By.xpath("//p[@id='smallErrorMessage']");

	private By by_Class =By.xpath("//ul[@class='guestCounter classSelect font12 darkText']//child::li[2]");
	private By by_Applybtn =By.xpath("//button[text()='APPLY']");
	
	public SearchPage selectTraveller_Class() {
		//This method is Used to Select the traveller Class 
		click(by_traveller_classMulticity,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on the traveller class");
		return new SearchPage();
	}
	public String getErrorMessage() {
		getText(by_passengerErrorMsg, ExplicitWaitExpectedConditions.NONE);
		log.info("get error message"+toString());
		return toString();
	}
	public Multi_City_Page select_FromAnotherCity() {
		enterText(by_FromAnotherCity,"Mumbai",ExplicitWaitExpectedConditions.NONE);
		log.info("search from city");
		return this;
	}
	public Multi_City_Page selectFromCity() {
		click(by_FromCityName,ExplicitWaitExpectedConditions.NONE);
		log.info("select from city");
		return this;
	}
	public Multi_City_Page select_ToAnotherCity() {
		enterText(by_ToAnotherCity,"delhi",ExplicitWaitExpectedConditions.CLICKABLE);
		log.info("search to city");
		return this;
	}
	public Multi_City_Page selectToCity() {
		click(by_tocityname,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("select to city");
		return this;
	}
	public Multi_City_Page select_ToAnotherCity1() {
		enterText(by_ToAnotherCity1,"Mumbai",ExplicitWaitExpectedConditions.CLICKABLE);
		log.info("Search another To City");
		return this;
	}
	public Multi_City_Page selectToCity1() {
		click(by_tocityname1,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Select to city");
		return this;
	}
	public Multi_City_Page clickOnAddAnotherCity() {
		click(by_add_another_city,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on Add Another City");
		return this;
	}
	public String checkFromCity() {
		getAttributeValue(by_Check_from_city,ExplicitWaitExpectedConditions.NONE);
		log.info("Check from city name After click on add another city");
		return toString();
	}
	public Multi_City_Page clickOnRemoveIcon() {
		click(by_Remove_icon,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on Remove Icon");
		return this;
	}
	public Multi_City_Page ClickOnDepartureIcon() {
		click(by_Departure,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Click on the Departure");
		return this;
	}
	public Multi_City_Page selectDepartureDate() {
		click(by_Departure_date,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Select Departure Date");
		return this;
	}
	public Multi_City_Page selectAdults() {
		click(by_adults,ExplicitWaitExpectedConditions.NONE);
		log.info("Select no of Adults");
		return this;
	}
	public Multi_City_Page selectChildren() {
		click(by_children,ExplicitWaitExpectedConditions.NONE);
		log.info("Select No of Children");
		return this;
	}
	public Multi_City_Page selectInfants() {
		click(by_Infants,ExplicitWaitExpectedConditions.NONE);
		log.info("select no of Infants");
		return this;
	}
	public Multi_City_Page selectClass() {
		click(by_Class,ExplicitWaitExpectedConditions.NONE);
		log.info("select traveller class");
		return this;
	}
	public SearchPage clickOnApplyBtn() {
		click(by_Applybtn,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on the Apply Button");
		return new SearchPage();
	}

}
