package org.frame.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.frame.enums.ExplicitWaitExpectedConditions;
import org.openqa.selenium.By;

public class CreateTask_Page extends BasePage {

	final static Logger log = LogManager.getLogger(CreateTask_Page.class.getName());
	//locator for create task button
	private By by_createTask =By.xpath("//a[@class='ui create_task_button_desktop  circular button']");
	//locator for enter taskname
	private By by_taskName =By.xpath("//div[@class='ui twelve wide column']//input[@name='name']");
	//locator to enter task description
	private By by_taskDisc =By.xpath("//trix-editor[@input='task_details']");
	//locator for select due date 
	private By by_dueDate =By.xpath("//div[@class='ui computer tablet only grid']//input[@placeholder='Date/Time']");
	//locator to set frequency
	private By by_frequency =By.xpath("//div[@class='ui radio checkbox checked']");
	//locator to select team member
	private By by_teamMember =By.xpath("(//div[@class='ui computer tablet only grid']//div[contains(text(),'Avinash')])");
	//locator to click on the create task button
	private By by_createTaskButton =By.xpath("//div[@class='ui twelve wide column']// button[@type='submit']");
	//locator to select category
	private By by_category =By.xpath("//input[@class='search']");
	//locator to select subcategory
	private By by_subcategory =By.xpath("//input[@list='sub_categories']");
	//locator to add step to do task 
	private By by_steps =By.xpath("trix-editor");
	//locator to provide some important links required to complete task
	private By by_link =By.xpath("//input[@name='links']");
	//locator to click on the save detail button
	private By by_saveDetailsButton = By.xpath("//div[@class='ui computer tablet only grid']//form[@class='ui form']//button[text()=' Save Details']");

//	public CreateTask_Page clickOnCreateTask() {
//		/*to create task first click on the create task button present on the homepage*/
//
//		click(by_createTask,ExplicitWaitExpextecConditions.NONE);
//		log.info("Click on the create task");
//		return this ;
//	}
	public CreateTask_Page enterTaskName() {
		//Used to Enter name of the task in the TaskName Field

		enterText(by_taskName, "Automation testing",ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("enter task name");
		return this;

	}
	public CreateTask_Page enterDescription() {
		//used to enter the description of the task in the 

		enterText(by_taskDisc,"Automation",ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("enter task description");
		return this;
	}
	public CreateTask_Page EnterDueDate() {
		//used to select due to date for the task
		enterText(by_dueDate,"August 12, 2022",ExplicitWaitExpectedConditions.PRESENSCE);

		log.info("due date selected ");
		return this;
	}
	public CreateTask_Page SelectFrequency() {
		//used to select frequency
		click(by_frequency,ExplicitWaitExpectedConditions.NONE);

		log.info("set Frequency");
		return this;
	}
	public CreateTask_Page selectTeamMember() {
		// used to select team member for the task


		click(by_teamMember,ExplicitWaitExpectedConditions.NONE);
		log.info("selecting Team member");
		return this;
	}
	public CreateTask_Page clickOnCreateTaskBtn() {
		//used to click on the CreateTaskButton


		click(by_createTaskButton,ExplicitWaitExpectedConditions.NONE);
		log.info("click on the createtask button");
		return this ;
	}
	public CreateTask_Page  selectCategory() {
		//used to select the category  i.e Project Management
		enterText(by_category,"Project Management", ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("select category");
		return this;

	}
	public CreateTask_Page selectSubCategory() {
		//used to select the subcategory i.e Project plan

		enterText(by_subcategory,"Project plan", ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("select subcategory");
		return this;
	}
	public CreateTask_Page enterStepsToDoTask() {
		// Used to enter the steps to complete the task in StepsToDoTask field

		enterText(by_steps,"QA  Assignment", ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("enter stpes to do task");
		return this;
	}
	public CreateTask_Page ProvideImpLink() {
		// used to enter the required link in the Important link Field


		enterText(by_link,"Wishup.co", ExplicitWaitExpectedConditions.PRESENSCE);
		log.info("enter important link");
		return this;
	}
	public Login_Page clickOnSaveDetailsButton() {
		//used to click on the Save Details Button

		click(by_saveDetailsButton,ExplicitWaitExpectedConditions.NONE);
		log.info("click on th save details button");
		return new Login_Page();
	}

}
