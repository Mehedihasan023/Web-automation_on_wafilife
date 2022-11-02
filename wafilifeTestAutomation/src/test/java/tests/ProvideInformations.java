package tests;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CheckoutPage;
import pages.HomePage;
//import pages.HomePage;
import utilities.ExtentFactory;

public class ProvideInformations extends BaseDriver {

	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Provide All informations</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		//PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	
	@Test(priority = 0)
	public void clickOnCheckbox() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>checkbox clicked.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.clickOnCheckbox();
	}
	
	@Test(priority = 1)
	public void fillPassword() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>password provided.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.fillPassword();
	}
	
	@Test(priority = 2)
	public void fillName() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>name provided.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.fillName();
	}
	
	@Test(priority = 3)
	public void fillPhoneNumber() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Phone Number  provided.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.fillPhoneNumber();
	}
	
	@Test(priority = 4)
	public void fillEmail() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>email  provided.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.fillEmail();
	}
	
	@Test(priority = 5)
	public void clickOnStateContainer() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>state container clicked.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.clickOnStateContainer();
	}
	
	@Test(priority = 6)
	public void selectState() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>state selected.</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.selectState();
	}
	
	@Test(priority = 7)
	public void clickOnArea() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>billing_area clicked</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.clickOnArea();
	}
	
	@Test(priority = 8)
	public void selectArea() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>select mohammadpur</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.selectArea();
	}
	
	@Test(priority = 9)
	public void fillBillingAddrees() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>billing address provided</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.fillBillingAddrees();
	}
	
	@Test(priority = 10)
	public void fillOrderComments() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>order comments provided</b></p>");
		CheckoutPage checkoutPage = new CheckoutPage(childTest);
		checkoutPage.fillOrderComments();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}	
	
}



