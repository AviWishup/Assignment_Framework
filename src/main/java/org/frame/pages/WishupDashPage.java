
package org.frame.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;

public class WishupDashPage extends BasePage {
	final static Logger log = LogManager.getLogger(WishupDashPage.class.getName());

	private By by_usernamedropdn = By.xpath("//div[@class='right menu']//div[@class='ui simple dropdown item']");
	
	private By by_logout =By.xpath("//div[@class='ui navbar computer only tablet only grid']//a[contains(text(),'Logout')]");
	//locator for createTask button on the Dashboard Page
	private By by_createTask =By.xpath("//a[@class='ui create_task_button_desktop  circular button']");
	//locator for HireButton on dashboard page
	private By by_hireBtnDashPage = By.xpath("//div[@class='ui navbar computer only tablet only grid']//a[@class='ui blue hiring_button button']");
	//locator for FeedBackButton on dashBoard Page
	private By by_feedbackbutton =By.xpath("//div[@class='side-menu-label']//span[text()='Feedback']");


	public WishupDashPage clickOnProfile() {
		click(by_usernamedropdn,ExplicitWaitExpectedConditions.PRESENSCE);
		return this;
	}
	public Login_Page clickLogout() {
		click(by_logout,ExplicitWaitExpectedConditions.NONE);
		return new Login_Page();
	}
	public CreateTask_Page clickOnCreateTask() {
		/*used to create task first click on the create task button present on the homepage*/
		click(by_createTask,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("Click on the create task");
		return new CreateTask_Page();
	}
	public Hire_Page clickOnHireMeBtn() {
		//used to click on the hireMe button present on the homepage
		click(by_hireBtnDashPage,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("click on hireMe button on the homepage");
		return new Hire_Page();
	}
	public FeedBack_Page clickOnFeedbackBtn() {
		//used to click on the feedback button present on the HomePage 
		click(by_feedbackbutton,ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("click on the Feedback button");
		return new FeedBack_Page();
	}
}
