package org.frame.pages;

import java.util.Set;

import org.frame.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page extends BasePage {
	
	       WebDriver driver ;
	      //locator for check TermOFuse 
			@FindBy(xpath = "//input[@type='checkbox']/following::label[text()='I agree to the ']")
			private WebElement WE_termsOfUse;
		//locator for Proceed to pay button
			@FindBy(xpath = "//input[@type='submit']")
			private WebElement WE_proceedToPay;
		//locator for select payment mode 
			@FindBy(xpath = "//button[text()='Pay via Razorpay']")
			private WebElement WE_paymentMode_Razorpay;
		//locator to handle iframe
			@FindBy(xpath = "//iframe[@class='razorpay-checkout-frame']")
			private WebElement we_iframe ;
		//locator for email field on the frame 
			@FindBy(xpath = "//input[@id='email']")
			private WebElement WE_emailCart;
		//locator for selecting payment option via card
			@FindBy(xpath = "//div[@role='button']")
			private WebElement WE_payUsingCard;
		//locator for click on the card 
			@FindBy(xpath = "//button[@method='card']")
			private WebElement WE_card;
		//locator for cardno field 
			@FindBy(xpath = "card_number")
			private WebElement WE_cardNo;
		//locator for  card expiry
			@FindBy(xpath = "card_expiry")
			private WebElement WE_expiry;
		//locator for card cvv
			@FindBy(xpath = "card_cvv")
			private WebElement WE_cvv;
		//locator for pay button
			@FindBy(xpath = "//div[@role='button']")
			private WebElement WE_pay;
		//locator for success button present on the new childwindow
			@FindBy(xpath = "//button[text()='Success']")
			private WebElement WE_success;
		//locator for check payment status
			@FindBy(xpath = "//div[@class='ui olive small top right attached label']")
			private WebElement WE_payStatus;
			
			public Cart_Page()
			{
				this.driver = DriverManager.getDriver();
				PageFactory.initElements(driver, this);
			}
			
			public Cart_Page selectTermsOfUse()
			{//this method is used to click on the term of use check box
				try {
					JavascriptExecutor Obj_js =(JavascriptExecutor)driver;
					Obj_js.executeScript("arguments[0].click();", WE_termsOfUse);
					Thread.sleep(1000);
					log.info("select term of use button");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				return this;
			}
			public Cart_Page proceedToPay()
			{
				//this method is used to Click on proceed to pay button
				WE_proceedToPay.click();
				log.info("click on the proceed to pay");
				return this;
			}
			public Cart_Page selectPaymentMode()
			{
				//this method is used to Select payment mode
				WE_paymentMode_Razorpay.click();
				log.info("click on the razorpay");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return this;
			}
			public Cart_Page enterCardDetails()
			{
				
				//used to click handle iframe
				driver.switchTo().frame(we_iframe);
				log.info("select iframe");
				//used to enter mail in the mail field present on the frame
				WE_emailCart.sendKeys("avinash.avi@wishup.co");
				log.info("enter mail id ");
				//used to Click on pay button
				WE_payUsingCard.click();
				log.info("click on the pay using card");
				//used to Select card for payment
				WE_card.click();
				log.info("click on the card");
				//used to Enter card number
				WE_cardNo.sendKeys("4242 4242 4242 4242");
				log.info("enter card number");
				//used to Enter expiry date
				WE_expiry.sendKeys("424");
				log.info("enter expiry date");
				//used to Enter cvv
				WE_cvv.sendKeys("424");
				log.info("enter CVV");
				
				return this;
			}
			public String completeThePayment()
			{
				//used to Click on pay button
				WE_pay.click();
				log.info("click on the pay button");
				
				/*this method is used to handle the window and also used to Click on success for payment confirmation*/
				String Str_parentWindowID = driver.getWindowHandle();
				log.info("handle window");
				Set<String> SetStr_windowhandles = driver.getWindowHandles();
				for(String childwdw : SetStr_windowhandles)
				{
					if(!childwdw.equals(Str_parentWindowID))
					{
						driver.switchTo().window(childwdw);
						WE_success.click();
						log.info("click on the success button");
						driver.switchTo().window(Str_parentWindowID);
					}		
				}
				/*Used to Verify payment status . it returns status of the payment */
				String Str_payStatus = WE_payStatus.getText();
				log.info("fetching paystatus");
				return Str_payStatus;
			}

}
