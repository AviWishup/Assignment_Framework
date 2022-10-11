package org.frame.test;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import org.frame.pages.Hire_Page;
import org.frame.pages.Login_Page;
import org.frame.pages.Profile_Page;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Wishup_Test_Class extends BaseTest{
    final static Logger log = LogManager.getLogger(Hire_Page.class.getName());
    
	private Wishup_Test_Class() {

		
	}
	@Test(dataProviderClass=org.frame.utils.ReadExcelwithDP.class,dataProvider="Data")
	public void loginLogoutTest(Map<String, String> map) {
		 System.out.println(map.get("Username") +"   "+map.get("Password"));
		
		 String str_Title = new Login_Page()
				.enterUserName(map.get("Username") )
				.enterPassword(map.get("Password"))
				.clickLogin()
				.clickOnProfile()
				.clickLogout()
				.getTitle();
       
		Assertions.assertThat(str_Title).isEqualTo("Wishup");
		
	}
//		@Test(dataProviderClass=org.frame.dataprovider.Dataprovider.class,dataProvider="Test_data")
//		public void createTask(String userName, String password) {
//		String str_Title= new Login_Page()
//					.enterUserName(userName)
//					.enterPassword(password)
//					.clickLogin()
//					.clickOnCreateTask()
//					.enterTaskName()
//					.enterDescription()
//					.EnterDueDate()
//					.SelectFrequency()
//					.selectTeamMember()
//					.clickOnCreateTaskBtn()
//					.selectCategory()
//					.selectSubCategory()
//					.enterStepsToDoTask()
//					.ProvideImpLink()
//					.clickOnSaveDetailsButton()
//					.getTitle();
//		log.info("Title of the page after creation of new task is " +str_Title);
//		}
//		@Test(dataProviderClass=org.frame.dataprovider.Dataprovider.class,dataProvider="Test_data")
//		public void giveFeedBack(String userName,String password) {
//		String str_Successmsg= new Login_Page()
//					.enterUserName(userName)
//					.enterPassword(password)
//					.clickLogin()
//					.clickOnFeedbackBtn()
//					.clickOnCreateFeedbackBtn()
//					.clickOnGiveFeedbackBtn()
//					.selectFromDate()
//					.selectToDate()
//					.ProvideRating()
//					.ProvideFeedBackMessage()
//					.clickOnSubmitButton()
//					.getText();					
//		Assertions.assertThat(str_Successmsg).isEqualTo("Feedback recorded successfully");
//					
//		}
//		
//		@Test(dataProviderClass=org.frame.dataprovider.Dataprovider.class,dataProvider="Test_data")
//		public void validateTotalVA(String userName,String password) {
//		int int_Total_VA= new Login_Page()
//					.enterUserName(userName)
//					.enterPassword(password)
//					.clickLogin()
//					.clickOnHireMeBtn()
//					.selectVACategory()
//					.validateTotalVA();
//		Assertions.assertThat(int_Total_VA).isEqualTo(99);
//		}	
//		@Test(dataProviderClass=org.frame.dataprovider.Dataprovider.class,dataProvider="Test_data")
//		public void verifyResources(String userName,String password) {
//	     String stractualplan =  new Login_Page()
//					.enterUserName(userName)
//					.enterPassword(password)
//					.clickLogin()
//					.clickOnHireMeBtn()
//					.selectVACategory()
//					.applyFourHrFilter()
//					.clickOnViewProfile()
//					.selectPlanForHalfday().get_Availability();
//	     Assertions.assertThat(stractualplan).isEqualTo("4 hrs/d");
//					
//}
//		@Test(dataProviderClass=org.frame.dataprovider.Dataprovider.class,dataProvider="Test_data")
//		public void HireResources(String userName , String password) {
//			  String Str_payStatus =  new Login_Page()
//						.enterUserName(userName)
//						.enterPassword(password)
//					    .clickLogin()
//					   .clickOnHireMeBtn()
//					   .selectSearchField()
//					   .selectVACategory()
//					   .applyEightHrFilter()
//					   .clickOnViewProfile()
//					   .selectQuarterlyPlanToggler()
//					   .selectPlanForHalfday()
//					   .select_cart()
//					   .selectTermsOfUse()
//					   .proceedToPay()
//					   .selectPaymentMode()
//					   .enterCardDetails().completeThePayment();
//			  Assertions.assertThat(Str_payStatus).isEqualTo("paid");
//		}
//		@Test(dataProviderClass=org.frame.dataprovider.Dataprovider.class,dataProvider="Test_data")
//		public void verifyTools_Skills(String userName , String password) {
//			  String strSkills =  new Login_Page()
//						.enterUserName(userName)
//						.enterPassword(password)
//					    .clickLogin()
//					   .clickOnHireMeBtn()
//					   .selectSearchField()
//					   .selectVACategory()
//					   .applyFourHrFilter()
//					   .clickOnViewProfile()
//					   .selectTechSkills()
//					   .viewSkills()
//					   .verifySkillSet();
//			  
//			  String strTools = new Profile_Page()
//					  .selectToolExpertise()
//					  .verifyToolExperties();
//			  
//			  Assertions.assertThat(strSkills).contains("MS Office");
//			  Assertions.assertThat(strTools).contains("CRM");
//}
}