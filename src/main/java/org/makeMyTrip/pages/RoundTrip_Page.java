package org.makeMyTrip.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;

public class RoundTrip_Page extends BasePage {
	final static Logger log = LogManager.getLogger(RoundTrip_Page.class.getName());
	
	private By by_Return = By.id("return");
	private By by_Return_date = By.xpath("(//p[text()='10'])[1]");
	
	
	private By by_Departure = By.xpath("//span[text()='DEPARTURE']");
	private By by_Departure_date = By.xpath("//p[text()='31']");
	
	
	public RoundTrip_Page ClickOnDeparture() {
		click(by_Departure,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Click on the Departure");
		return this;
	}
	public SearchPage selectDepartureDate() {
		click(by_Departure_date,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Select Departure Date");
		return new SearchPage();
	}
	public RoundTrip_Page selectDepartureDateforRoundTrip() {
		click(by_Departure_date,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Select Departure Date");
		return this;
	}
	
	public RoundTrip_Page ClickOnTheReturn () {
		click(by_Return,ExplicitWaitExpectedConditions.NONE);
		log.info("click to select the return date");
		return this;
	}
	public SearchPage selectReturnDate () {
		click(by_Return_date,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the return date");
		return new SearchPage();
	}
}
