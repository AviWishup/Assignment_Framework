package org.makeMyTrip.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.driver.DriverManager;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {
	final static Logger log = LogManager.getLogger(SearchPage.class.getName());
	
	private By by_one_wayBtn = By.xpath("//li[text()='OneWay']");
	private By by_round_TripBtn = By.xpath("//li[text()='Round Trip']");
	private By by_MulicityBtn = By.xpath("//li[text()='Multi City']"); 
	private By by_FromCity = By.id("fromCity");
	private By by_FromcityName = By.xpath("//p[text()='Mumbai, India']");
	private By by_ToCity = By.id("toCity");
	private By by_ToCityName = By.xpath("//p[text()='New Delhi, India']");

	private By by_Departure_price_on_date = By.xpath("//p[text()='31']/following-sibling::p[@class=' todayPrice']");

	private By by_Nextmonth = By.xpath("//span[@aria-label='Next Month']");
	private By by_previousMonth = By.xpath("//span[@aria-label='Previous Month']");
	private By by_swip_icon = By.xpath("//span[@class='swipCircle']");

	private By by_RecentSearch =By.xpath("//ul[@class='recentSearches']");
	private By by_traveller_class = By.xpath("//span[@class='lbl_input latoBold appendBottom5']");
	private By by_adults = By.xpath("//li[text()='5']");
	private By by_children =By.xpath("//div[@class='makeFlex column childCounter']//li[text()='6']");
	private By by_Infants =By.xpath("//div[@class='makeFlex column pushRight infantCounter']//li[text()='2']");
	
	private By by_travErrorMsg = By.xpath("//p[@id='smallErrorMessage']");

	private By by_Class =By.xpath("//ul[@class='guestCounter classSelect font12 darkText']//child::li[2]");
	private By by_Applybtn =By.xpath("//button[text()='APPLY']");

	private By by_Fare_Type = By.xpath("//p[text()='Regular ']");
	private By by_search = By.xpath("//a[text()='Search']");


	public SearchPage clickOnOneWayBtn () {
        DriverManager.getDriver().manage().window().maximize();
		click(by_one_wayBtn,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the One Way button");
		return this;
	}
	public SearchPage clickOnRoundTrip () {
	    DriverManager.getDriver().manage().window().maximize();
		click(by_round_TripBtn,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on the Round Trip");
		return this;
	}
	public Multi_City_Page clickOnMulticity () {
		DriverManager.getDriver().manage().window().maximize();
		click(by_MulicityBtn,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the MultiCity");
		return new Multi_City_Page();
	}
	public SearchPage SearchFromCity() {
		enterText(by_FromCity,"Mumbai", ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Search From City");
		return this;
	}
	public SearchPage selectFromCity () {
		click(by_FromcityName,ExplicitWaitExpectedConditions.NONE);
		log.info("Select From City");
		return this;
	}
	public SearchPage searchToCity() {
		enterText(by_ToCity,"Delhi", ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("search TO City");
		return this;
	}
	public RoundTrip_Page selectToCity () {
		click(by_ToCityName,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("select TO City ");
		return new RoundTrip_Page();
	}

	public String CheckPriceOnSelectedDate() {
		getText(by_Departure_price_on_date,ExplicitWaitExpectedConditions.CLICKABLE);
		log.info("");
		return toString();
	}
	public SearchPage ClickOnNextmonthNavIcon() {
		click(by_Nextmonth,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the next month");
		return this;
	}
	public SearchPage ClickOnPreviousMonthNavIcon() {
		click(by_previousMonth,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the Previous monthe navigate button");
		return this;
	}
	public SearchPage ClickOnSwipeIcon() {
		click(by_swip_icon,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on the Swipe Icon");
		return this;
	}
	public String checkRecentSearch() {
		getText(by_RecentSearch,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Check Recent Search");
		return toString();
	}
	public SearchPage ClickOnTraveller_Class() {
		click(by_traveller_class,ExplicitWaitExpectedConditions.NONE);
		log.info("Click TO Select the Traveller And Class");
		return this;
	} 
	public SearchPage selectAdults() {
		click(by_adults,ExplicitWaitExpectedConditions.NONE);
		log.info("Select no of Adults");
		return this;
	}
	public SearchPage selectChildren() {
		click(by_children,ExplicitWaitExpectedConditions.NONE);
		log.info("Select No of Children");
		return this;
	}
	public SearchPage selectInfants() {
		click(by_Infants,ExplicitWaitExpectedConditions.NONE);
		log.info("select no of Infants");
		return this;
	}
	public SearchPage selectClass() {
		click(by_Class,ExplicitWaitExpectedConditions.NONE);
		log.info("select traveller class");
		return this;
	}
	public SearchPage clickOnApplyBtn() {
		click(by_Applybtn,ExplicitWaitExpectedConditions.NONE);
		log.info("Click on the Apply Button");
		return this;
	}
	public SearchPage selectFareType() {
		click(by_Fare_Type,ExplicitWaitExpectedConditions.NONE);
		log.info("Select Fare type");
		return this;
	} 
	public SearchPage ClickOnSearchBtn() {
		click(by_search,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the search button");
		return this;
	} 
	public String getTitle() {
		log.info("Title of the Page is "+getPageTitle());
		return getPageTitle();
	}
	public String getTravellerErrorMsg() {
		
		getText(by_travErrorMsg,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("get error message"+toString());
		return toString();	
	}
}
