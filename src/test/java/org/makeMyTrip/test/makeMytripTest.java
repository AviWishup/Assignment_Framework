package org.makeMyTrip.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.makeMyTrip.pages.Multi_City_Page;
import org.makeMyTrip.pages.SearchPage;
import org.testng.annotations.Test;

public class makeMytripTest extends BaseTest {
	final static Logger log = LogManager.getLogger(makeMytripTest.class.getName());

	private makeMytripTest() {


	}
	@Test
	public void searchFlight_ForOneWay() {
		String Title  = new SearchPage()
				.clickOnOneWayBtn()
				.SearchFromCity()
				.selectFromCity()
				.searchToCity()
				.selectToCity()
				.ClickOnDeparture()
				.selectDepartureDate()
				.ClickOnTraveller_Class()
				.selectAdults()
				.selectChildren()
				.selectInfants()
				.clickOnApplyBtn()
				.selectFareType()
				.ClickOnSearchBtn()
				.getTitle();
		System.out.println(Title);
		Assertions.assertThat(Title).isEqualTo("MakeMyTrip");
	} 

	@Test 
	public void check_Multicity() {
		String str_FromCityName = new SearchPage()
				.clickOnMulticity()
				.select_FromAnotherCity()
				.selectFromCity()
				.select_ToAnotherCity()
				.selectToCity()
				.select_ToAnotherCity1()
				.selectToCity1()
				.clickOnAddAnotherCity()
				.checkFromCity();
		String str_ErrorMessage = new Multi_City_Page()
				.ClickOnDepartureIcon()
				.selectDepartureDate()
				.selectAdults()
				.selectChildren()
				.selectInfants()
				.selectClass()
				.clickOnApplyBtn()
				.getTravellerErrorMsg();
		System.out.println(str_FromCityName);
		System.out.println(str_ErrorMessage);

	}

	@Test
	public void searchFlight_ForRoundTrip() {
		String Title  = new SearchPage()
				.clickOnRoundTrip()
				.SearchFromCity()
				.selectFromCity()
				.searchToCity()
				.selectToCity()
				.ClickOnDeparture()
				.selectDepartureDateforRoundTrip()
				.ClickOnTheReturn()
				.selectReturnDate()
				.ClickOnTraveller_Class()
				.selectAdults()
				.selectChildren()
				.selectInfants()
				.clickOnApplyBtn()
				.selectFareType()
				.ClickOnSearchBtn()
				.getTitle();
		System.out.println(Title);
		Assertions.assertThat(Title).isEqualTo("MakeMyTrip");
	}
} 


