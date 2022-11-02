package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;

import utilities.CommonMethods;
import utilities.GetScreenShot;

public class CheckoutPage extends CommonMethods{

ExtentTest test;
	
	public CheckoutPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
//	
//	@FindBy(xpath = "//a[@href=\"https://www.printworksbd.com/product-category/bangla-books/\"]")
//	public WebElement bangla;
	
		@FindAll({
			@FindBy(xpath = "//input[@id='createaccount']")
		})
		 WebElement checkbox;
	
		@FindAll({
			@FindBy(xpath = "//input[@id='account_password']")
		})
		 WebElement password;
		
		@FindAll({
			@FindBy(xpath = "//input[@id='billing_first_name']")
		})
		 WebElement name;
		
		@FindAll({
			@FindBy(xpath = "//input[@id='billing_phone']")
		})
		 WebElement phoneNumber;
		
		@FindAll({
			@FindBy(xpath = "//input[@id='billing_email']")
		})
		 WebElement email;
		
		@FindAll({
			@FindBy(xpath = "//span[@id='select2-billing_state-container']")
		})
		 WebElement state;
		
		@FindAll({
			@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[13]")
		})
		 WebElement Dhaka;
		
		@FindAll({
			@FindBy(xpath = "//select[@id='billing_area']")
		})
		 WebElement area;
		
		@FindAll({
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/p[7]/span[1]/select[1]/option[93]")
		})
		 WebElement mohammadpur;
		
		@FindAll({
			@FindBy(xpath = "//textarea[@id='billing_address_1']")
		})
		 WebElement billingAddress;
		
		@FindAll({
			@FindBy(xpath = "//textarea[@id='order_comments']")
		})
		 WebElement orderComments;
		
		
		public void clickOnCheckbox() throws IOException {
			test.info("Click on checkbox");
			try {
				if (checkbox.isDisplayed()) {
					checkbox.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>checkbox clicked.</b></p>");
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>checkbox location is not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "checkbox");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "checkbox";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(checkbox.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		
		public void fillPassword() throws IOException {
			test.info("fill password ");
			try {
				if (password.isDisplayed()) {
					password.clear();
				    password.sendKeys("#$%^7890Mehedi");
					test.pass("<p style=\"color:green; font-size:13px\"><b>password provided.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>password field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "password");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "password.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(password.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void fillName() throws IOException {
			test.info("fill name ");
			try {
				if (name.isDisplayed()) {
					name.clear();
				    name.sendKeys("Mehedi");
					test.pass("<p style=\"color:green; font-size:13px\"><b>name provided.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>name field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "name");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "name.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(name.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
	
		public void fillPhoneNumber() throws IOException {
			test.info("fill PhoneNumber ");
			try {
				if (phoneNumber.isDisplayed()) {
					phoneNumber.clear();
					phoneNumber.sendKeys("01868354285");
					test.pass("<p style=\"color:green; font-size:13px\"><b>phoneNumber provided.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>phoneNumber field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phoneNumber");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phoneNumber.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(phoneNumber.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void fillEmail() throws IOException {
			test.info("fill Email ");
			try {
				if (email.isDisplayed()) {
					email.clear();
					email.sendKeys("mehedi19989@gmail.com");
					test.pass("<p style=\"color:green; font-size:13px\"><b>email provided.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>email field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "email");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "email.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(email.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void clickOnStateContainer() throws IOException {
			test.info("click On State Container ");
			try {
				if (state.isDisplayed()) {
					state.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>state container clicked.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>state container field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "stateContainer");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "stateContainer.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(state.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void selectState() throws IOException {
			test.info("select State ");
			try {
				if (Dhaka.isDisplayed()) {
					Dhaka.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>state selected.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>state field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "dhaka");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "dhaka.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Dhaka.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void clickOnArea() throws IOException {
			test.info("click on area ");
			try {
				if (area.isDisplayed()) {
					area.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>area clicked.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>billing_area field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_area");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_area.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(area.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void selectArea() throws IOException {
			test.info("select area ");
			try {
				if (mohammadpur.isDisplayed()) {
					mohammadpur.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>mohammadpur clicked.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>mohammadpur field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "mohammadpur");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "mohammadpur.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(mohammadpur.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void fillBillingAddrees() throws IOException {
			test.info("fill Billing Address ");
			try {
				if (billingAddress.isDisplayed()) {
					billingAddress.clear();
					billingAddress.sendKeys("House 3,Road 12,block c");
					test.pass("<p style=\"color:green; font-size:13px\"><b>billingAddress provided.</b></p>");
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>billingAddress field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billingAddress");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billingAddress.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(billingAddress.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		public void fillOrderComments() throws IOException {
			test.info("fill Order Comments ");
			try {
				if (orderComments.isDisplayed()) {
					orderComments.clear();
					orderComments.sendKeys("no extra information");
					test.pass("<p style=\"color:green; font-size:13px\"><b>orderComments provided.</b></p>");
					
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderComments");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderComments.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(2000);
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>orderComments field not avilabe.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderComments");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderComments.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(orderComments.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(1000);
		}
		
		
}
