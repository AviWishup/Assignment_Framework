package org.frame.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.driver.DriverManager;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class Profile_Page extends BasePage {
	
	final static Logger log = LogManager.getLogger(CreateTask_Page.class.getName());
	
	   public String strSkills;
	    //locator for check technical skills 
		private By by_techSkills = By.xpath("//span[text()='Technical Skills']");
		//locator to vie all skills
		private By by_viewSkills = By.xpath("//div[contains(text(),'View all skills')]");
		//locator to get all skill set
		private By by_skillSet = By.xpath("//div[@class='more-skills']");
		//locator to check tool expertise
		private By by_toolExp = By.xpath("//span[text()='Tool Expertise']");
		//locator to get all tools
		private By by_tools = By.xpath("//div[@class='top-tools tool-names']");
		//locator to selectplan button
		private By by_selectThisPlanButton = By.xpath("(//span[@class='select-popular-text'])[2]");
		//locator to select plan 
		private By by_PlanToggler = By.id("toggler");
		//locator to select plan for halfday
		private By by_selectThisPlanButtonforhalfday = By.xpath("//a[@class='half-url']//span[@class='select-popular-text']");
		//locator to click on the hire me button
		private By by_hireMeBtn = By.xpath("//div[@class='container-fluid']//a[@class='hire-me-button']");
		//locator tocheck availability of resources
		private By by_available = By.xpath("(//div[text()='4 hrs/d'])[1]");
		//locator to check message
		private By by_successMsg = By.xpath("//h3[text() = 'Plan is added to the cart!']");
		//locator for click on the gotocart
		private By by_goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
		//locator for ok button
		private By by_alreadyAdded_Ok = By.xpath("//button[@class='ui button deny']");//button[contains(text(),'Ok')]
		//locator for Cart icon
		private By by_Cart = By.xpath("//a[@class='cart-icon']");

		
		public Profile_Page selectTechSkills() {
			//this method is used to click on the technical skills 
			click(by_techSkills,ExplicitWaitExpectedConditions.NONE);
			log.info("click on the technical skills");
			return this;
		}
		public Profile_Page viewSkills () {
			//this method is used to click on view all skills
			
			click(by_viewSkills,ExplicitWaitExpectedConditions.NONE);

			log.info("click on the view skills");
			return this;
		}
		public String verifySkillSet() {
			//This method is used to verify skill set 
			 strSkills =DriverManager.getDriver().findElement(by_skillSet).getText();
			log.info(strSkills);
			//boolean bl_SkillResult = strSkills.contains("MS Office");
			return this.strSkills;
		}
		public Profile_Page selectToolExpertise() {
			//this method is used to select the tools 
	
			click(by_toolExp,ExplicitWaitExpectedConditions.NONE);
			log.info("click on the tool expertise");
			return this;		
		}
		public String verifyToolExperties() {
			// this method is used to verify the tools
			String strTools = DriverManager.getDriver().findElement(by_tools).getText();
			log.info(strTools);
			//boolean bl_ToolsResult =strTools.contains("CRM");
			return strTools;
		}
		public Profile_Page selectQuarterlyPlanToggler() {
			//this method is used to select he quarterly plan toggler
			click(by_PlanToggler,ExplicitWaitExpectedConditions.NONE);

			log.info("select toggler");
			return this;
		}
		public Profile_Page selectPlanForHalfday() {
			//this method is used to select plan for half day
			
			click(by_selectThisPlanButtonforhalfday,ExplicitWaitExpectedConditions.NONE);
			log.info("select Plan For Halfday ");
			return this;
		}

		public Profile_Page clickOnHireMeBtn() {
			//this method is used to click on the hireme button
	
			click(by_hireMeBtn,ExplicitWaitExpectedConditions.NONE);
			log.info("click on the Hire me button");
			return this;
		}

		public String get_Availability() {
			//this method is used to check the availability of resources , and its return the availability of the resources in hr
			
			String stractualplan = DriverManager.getDriver().findElement(by_available).getText();
			log.info("verifyAvailability");
			return stractualplan;
		}
		public Cart_Page select_cart() {

			WebElement element = DriverManager.getDriver().findElement(by_goToCart);

			((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",element);
			click(by_goToCart,ExplicitWaitExpectedConditions.CLICKABLE);
			log.info("click on the GO TO Cart");
			return new Cart_Page();
		}
		
}
