package org.frame.generics;

import org.frame.constants.FrameConstants;
import org.frame.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.frame.enums.ExplicitWaitExpectedConditions;


public class ExplicitWaitConditions {
	public static WebElement performExplicitWait(By by, ExplicitWaitExpectedConditions exConditions) {
		WebElement element =null;
		if(exConditions == ExplicitWaitExpectedConditions.VISIBILE)		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameConstants.getExplicitTime()).until(ExpectedConditions.visibilityOfElementLocated(by));
		}else if(exConditions == ExplicitWaitExpectedConditions.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameConstants.getExplicitTime()).until(ExpectedConditions.elementToBeClickable(by));	
		}else if(exConditions == ExplicitWaitExpectedConditions.PRESENSCE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameConstants.getExplicitTime()).until(ExpectedConditions.presenceOfElementLocated(by));	
		}else if(exConditions == ExplicitWaitExpectedConditions.NONE) {
			element = DriverManager.getDriver().findElement(by);	
		}
		return element;
		
	}
}
