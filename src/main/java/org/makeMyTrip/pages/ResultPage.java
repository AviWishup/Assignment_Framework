package org.makeMyTrip.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;

public class ResultPage extends BasePage {

	final static Logger log = LogManager.getLogger(ResultPage.class.getName());
	
	private By by_RefundableFare = By.xpath("//span[@class='customCheckbox']/following-sibling::span[text()='Refundable Fares']");
	private By by_DepartureFilter = By.xpath("(//span[@class='appendBottom2 checkBlockIcon'])[1]");
	private By by_ArrivalFilter = By.xpath("(//span[@class='appendBottom2 checkBlockIcon'])[3]");
	
	private By by_SelectBtn = By.xpath("//div[@id='flight_list_item_5_RKEY:ff4e45c2-f616-4c00-872b-322539de3617:5_0']//button[text()='SELECT']");
	private By by_viewFlightDetails = By.xpath("//div[@id='flight_list_item_5_RKEY:1579dec8-674d-4299-af7e-cae3f8d97c4c:5_0']//span[@class='linkText ctaLink']");
	
	private By by_From_To_City =By.xpath("//p[@class='flightDetailsHead']");
	private By by_Flight_details = By.xpath("//div[@id='flight_list_item_5_RKEY:1579dec8-674d-4299-af7e-cae3f8d97c4c:5_0']//span[@class='linkText ctaLink']");
	
	public ResultPage applyFilter() {
		click(by_RefundableFare, ExplicitWaitExpectedConditions.NONE);
		log.info("Click on the Checkbox to select the filter as Refundable Fare");
		return this;
	}
	public ResultPage applyDepartureFilter() {
		click(by_DepartureFilter, ExplicitWaitExpectedConditions.NONE);
		log.info("select Departure Filter");
		return this;
	}
	public ResultPage applyArrivalFilter() {
		click(by_ArrivalFilter, ExplicitWaitExpectedConditions.NONE);
		log.info("click on the Arrival Filter");
		return this;
	}
	public ResultPage ClickOnSelectBtn() {
		click(by_SelectBtn, ExplicitWaitExpectedConditions.NONE);
		log.info("click on the select Button to select Flight");
		return this;
	}
	public ResultPage ClickOnViewFlight() {
		click(by_viewFlightDetails, ExplicitWaitExpectedConditions.NONE);
		log.info("click on the View Flight Button");
		return this;
	}
	public String getCityDetails() {
		getText(by_From_To_City, ExplicitWaitExpectedConditions.NONE);
		log.info("searching Flight between "+toString()+"cities.");
		return toString();
	}
	public String getFlightDetails() {
		getText(by_Flight_details, ExplicitWaitExpectedConditions.NONE);
		log.info("Details Of Flight is "+toString());
		return toString();
	}
}
