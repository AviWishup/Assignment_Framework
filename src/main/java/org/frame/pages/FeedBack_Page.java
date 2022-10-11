package org.frame.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.driver.DriverManager;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;

public class FeedBack_Page extends BasePage {

	final static Logger log = LogManager.getLogger(FeedBack_Page.class.getName());
	
	//locator for create feedback button
	 private By by_createfeedbackbtn =By.xpath("//div[@class='ui workspace thirteen wide column']//a[@class='ui basic right floated circular button']");
	
	//locator for giveFeedBack Button
	 private By by_givefeedbackbtn =By.xpath("(//div[@class='ui client_dashboard computer only grid']//a[@class='ui basic  assign_task button'])[1]");
	//Locator for From Date
	 private By by_fromdate =By.cssSelector("div[id='slot_start_date'] input");
	//Locator for TO date
	 private By by_todate =By.cssSelector("div[id='slot_end_date'] input");
	//locator for Rating
	 private By by_Rating =By.xpath("(//i[@class='star icon'])[5]");
	//locator for feedback message
	 private By by_msg =By.name("message");
	//locator for SubmitFeedback button
	 private By by_submitbutton =By.xpath("//div[@type='submit']");
	//locator for Successful message
	 private By by_Successmsg =By.xpath("//div[@class='ui positive message']");
	
	public FeedBack_Page clickOnCreateFeedbackBtn() {
		//used to click on the create feedback 
		click(by_createfeedbackbtn,ExplicitWaitExpectedConditions.NONE);
		//log.info("click onn the create feedback");
		return this;
	}
	public FeedBack_Page clickOnGiveFeedbackBtn() {
		//used to click on the Give feedback button 
		
		click(by_givefeedbackbtn,ExplicitWaitExpectedConditions.NONE);
		//log.info("click on the give feedback button ");
		return this;

	}
	public FeedBack_Page selectFromDate() {
		//used to select from date
		
		enterText(by_fromdate, "August 6, 2022",ExplicitWaitExpectedConditions.PRESENSCE);
		//log.info("select from date");
		return this;
		
	}
	public FeedBack_Page selectToDate() {
		//used to select to date
		enterText(by_todate, "August 25, 2022",ExplicitWaitExpectedConditions.PRESENSCE);
		//log.info("select to date");
		return this;
	}
	public FeedBack_Page ProvideRating() {
		//used to give rating
	
		click(by_Rating,ExplicitWaitExpectedConditions.NONE);
		//log.info("give rating");
		return this;
	}
	public FeedBack_Page ProvideFeedBackMessage() {
		//used to enter feed back message
		enterText(by_msg, "Excellent",ExplicitWaitExpectedConditions.PRESENSCE);
		//log.info("enter feed back message");
		return this;
	}
	public FeedBack_Page clickOnSubmitButton() {
		//used to click on the submit button
		click(by_submitbutton,ExplicitWaitExpectedConditions.NONE);
		//log.info("click on the submit button");
		return this;
	}
	public String getText() {
		//used to fetch success message to checkfeedback recorded or not 
	
		String strText = DriverManager.getDriver().findElement(by_Successmsg).getText();
		//log.info("feedback recorded successfully");
		return strText;
	}	
}
