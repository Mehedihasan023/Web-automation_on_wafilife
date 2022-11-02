
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

public class HomePage extends CommonMethods{

	
	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
//	
//	@FindBy(xpath = "//a[@href=\"https://www.printworksbd.com/product-category/bangla-books/\"]")
//	public WebElement bangla;
	
		@FindAll({
			@FindBy(xpath = "//button[contains(text(),'X')]")
		})
		 WebElement popup;
	
		@FindAll({
			@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/span[1]"),
			@FindBy(xpath = "//a[contains(text(),'লেখক')]")
		})
	    WebElement lakhok;

		@FindAll({
			@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/nav[1]/ul[1]/li[2]/a[1]")
		})
	    WebElement nextPage;
		
		@FindAll({
			@FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"),
			@FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"),
		})
	    WebElement generalBooks;
		
		@FindAll({
			@FindBy(xpath = "//a[contains(text(),'হালাল মার্কেটিং')]")
		})
	    WebElement viewAnyBookDetails;
		
		@FindAll({
			@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]")
		})
	    WebElement order;

		@FindAll({
			@FindBy(xpath = "//span[contains(text(),'অর্ডার সম্পন্ন করুন')]")
		})
	    WebElement orderShoponnoKorun;
		
		
		
		public void closePopUp() throws IOException {
			test.info("Click on X");
			timeOut(3000);
			try {
				if (popup.isDisplayed()) {
					popup.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>popup closed.</b></p>");
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>popup location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "popup");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "popup.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(popup.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(3000);
		}

		
		public void clickOnlakhok() throws IOException {
			test.info("Click on lakhok");
			try {
				if (lakhok.isDisplayed()) {
					lakhok.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>lakhok Clicked.</b></p>");
					
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "lakhok");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "lakhok.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(2000);
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>lakhok location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "lakhok");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "lakhok.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(lakhok.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(2000);
		}
		
		public void selectNextPage() throws IOException {
			test.info("select next page");
			try {
				if (nextPage.isDisplayed()) {
					nextPage.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>next page selected.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectNextPage");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectNextPage.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(2000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>next page not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectNextPage");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectNextPage.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(nextPage.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(2000);
		}
		
		
		public void selectGeneralBooks() throws IOException {
			test.info("select general books");
			try {
				if (generalBooks.isDisplayed()) {
					generalBooks.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>generalBooks selected.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectGeneralBooks");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectGeneralBooks.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(1000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>general books location not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectGeneralBooks");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectGeneralBooks.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(generalBooks.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(2000);
		}
		
		public void viewAnyBookDetails() throws IOException {
			test.info("view Any Book Details");
			try {
				if (viewAnyBookDetails.isDisplayed()) {
					viewAnyBookDetails.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>Book Details viewed.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "viewAnyBookDetails");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "viewAnyBookDetails.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(1000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>viewAnyBookDetails location not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "viewAnyBookDetails");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "viewAnyBookDetails.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(viewAnyBookDetails.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(2000);
		}
		
		public void clickOnOrder() throws IOException {
			test.info("click Order Button");
			try {
				if (order.isDisplayed()) {
					order.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>order button clicked.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "order");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "order.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(1000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>order location not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "order");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "order.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(order.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(3000);
		}
		
		public void clickOnorderShoponnoKorun() throws IOException {
			test.info("click order Shoponno Korun");
			try {
				if (orderShoponnoKorun.isDisplayed()) {
					orderShoponnoKorun.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>order Shoponno Korun button clicked.</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderShoponnoKorun");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderShoponnoKorun.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					timeOut(1000);
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>orderShoponnoKorun location not avilable.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderShoponnoKorun");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderShoponnoKorun.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(orderShoponnoKorun.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			timeOut(3000);
		}
		
		
}
		