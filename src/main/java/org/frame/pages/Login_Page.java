package org.frame.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.driver.DriverManager;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.frame.report.ExtentLogger;
import org.openqa.selenium.By;


public class Login_Page extends BasePage {
	
	final static Logger log = LogManager.getLogger(Login_Page.class.getName());
		
		By By_emailField = By.id("email");
		By By_passwordField = By.xpath("//input[@type='password']");
		By By_logInSubmit = By.xpath("//input[@type='submit']");
		
		/*This method will perform login to the application by accepting parameters from test class
		 * input param: String email_Id & String password
		 * return: current url after login operation*/
		public Login_Page enterUserName(String Str_email){
			DriverManager.getDriver().manage().window().maximize();
			//Enter valid email in the field
			enterText(By_emailField, Str_email , ExplicitWaitExpectedConditions.NONE);
			ExtentLogger.pass("username Entered");
			log.info("username entered");
			return this;
		}
		
		public Login_Page enterPassword(String password) {
			enterText(By_passwordField, password,ExplicitWaitExpectedConditions.NONE);
			ExtentLogger.pass("Password Entered");
			log.info("Password Entered");
			return this;
		}
		public WishupDashPage clickLogin() {
			click(By_logInSubmit,ExplicitWaitExpectedConditions.CLICKABLE);
			log.info("click on the login");
			return new WishupDashPage();
		}
		public String getTitle() {
			log.info(getPageTitle());
			return getPageTitle();
		}
		public String getPageURL() {
			return getPageURL();
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//locator for maild Field
//	private By by_enteremail = By.id("email");
//	//locator for password field
//	private By by_enterpassword = By.name("password");
//	//locator for click on the log in button
//	private By by_login = By.xpath("//input[@type='submit']");
//
//	public Login_Page enterUserName(String userName) {
//		DriverManager.getDriver().manage().window().maximize();
//		enterText(by_enteremail,userName, ExplicitWaitExpextecConditions.PRESENSCE);
//		log.info(userName+"is entered as username");
//		return this;
//	}
//	public Login_Page enterPassword(String password) {
//
//		enterText(by_enterpassword, password,ExplicitWaitExpextecConditions.PRESENSCE);
//		ExtentLogger.pass("Password Entered");
//		return this;
//	}
//	public WishupDashPage clickLogin() {
//		WebElement element = DriverManager.getDriver().findElement(by_login);
//
//		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();",element);
//		//click(by_login,ExplicitWaitExpextecConditions.NONE);
//		return new WishupDashPage();
//	}
//	public String getTitle() {
//
//		return getPageTitle();
//	}
}

