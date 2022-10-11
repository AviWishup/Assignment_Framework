package org.frame.pages;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.driver.DriverManager;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hire_Page extends BasePage {
	    
	    final static Logger log = LogManager.getLogger(Hire_Page.class.getName());
	
	    //locator for select VA Category
		private By by_VACategory =By.xpath("(//span[text()='virtual assistant'])[1]");
		//locator for apply filter
		private By by_slider = By.className("slider");
		//locator for view profile button 
		private By by_viewProfile =By.xpath("(//button[@class='profile-button'])[1]");
		//locator for search field
		private By by_searchBar = By.id("searchbar");
		//locato to check all profile
		private By by_allprofile = By.xpath("//form[@id='form']/following::div[normalize-space() = 'virtual assistant']");
		//locator to check next page
		private By by_next = By.xpath("//div[@class='page-section']/button[@class='page-next']");


		public Hire_Page selectVACategory() {
			//used to select Virtual assistant category
			click(by_VACategory,ExplicitWaitExpectedConditions.NONE);
			log.info("click on the category");
			return this;
		}
		public Hire_Page applyFourHrFilter() {
			//used to apply filter for 4 hr
			Actions action = new Actions(DriverManager.getDriver());
			action.dragAndDropBy( DriverManager.getDriver().findElement(by_slider), 4, 0).perform();
			log.info("Apply filter for 4 hr");
			return this;
		}
		public Hire_Page applyEightHrFilter() {
			//used to apply filter for 8 hr  
			Actions action = new Actions(DriverManager.getDriver());
			action.dragAndDropBy( DriverManager.getDriver().findElement(by_slider), 8, 0).perform();
			log.info("Apply filter for 8 hr");
			return this;
		}
		public Profile_Page clickOnViewProfile() {
			//used to click on the ViewProfile
			click(by_viewProfile,ExplicitWaitExpectedConditions.NONE);
			log.info("click on the View Profile");
			return new Profile_Page() ;
		}
		public Hire_Page selectSearchField() {
			//used to search tools and skills in search
			DriverManager.getDriver().findElement(by_searchBar).sendKeys("MS Office CRM");
			Actions act= new Actions(DriverManager.getDriver());
			act.sendKeys(Keys.ENTER).perform();
			log.info("enter skills and tools in search Field");
			return this;
		}
		public int validateTotalVA() {
			/*this method is used to validate total VA present on the all the pages
			 * this method return total VA present on the all page */
			int int_totalva = 0;
			for(int i=1;i<7;i++) {
				List<WebElement> allprofiles =DriverManager.getDriver().findElements(by_allprofile);
				int_totalva=int_totalva+allprofiles.size();
				WebElement element = DriverManager.getDriver().findElement(by_next);
				((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",element);
				click(by_next,ExplicitWaitExpectedConditions.NONE);	
			}
			return int_totalva;
		}
}
