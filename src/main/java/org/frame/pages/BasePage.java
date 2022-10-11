package org.frame.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.driver.DriverManager;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.frame.generics.ExplicitWaitConditions;
import org.frame.report.ExtentLogger;


public class BasePage {

	final static Logger log = LogManager.getLogger(BasePage.class.getName());

	protected void click(By by, ExplicitWaitExpectedConditions expectedCondition) {
		WebElement element= ExplicitWaitConditions.performExplicitWait(by, expectedCondition);
		element.click();
		ExtentLogger.pass("Clicked on "+by+"Succesfully");
	}

	protected void enterText(By by, String strText , ExplicitWaitExpectedConditions expectedCondition) {

		WebElement element= ExplicitWaitConditions.performExplicitWait(by, expectedCondition);
		element.sendKeys(strText);
		ExtentLogger.pass("Entered text "+strText+" in the Locator "+by);
	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();

	}

}
