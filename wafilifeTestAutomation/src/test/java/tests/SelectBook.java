
package tests;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utilities.ExtentFactory;


public class SelectBook extends BaseDriver {

	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Select Book</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void closePopUp() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>popup closed.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.closePopUp();
	}
	
	
	@Test(priority = 1)
	public void clickOnlakhok() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click On lakhok.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnlakhok();
	}
	
	@Test(priority = 2)
	public void selectNextPage() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>next page selected.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.selectNextPage();
	}
	
	@Test(priority = 3)
	public void selectGeneralBooks() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>general books selected.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.selectGeneralBooks();
	}

	@Test(priority = 4)
	public void viewAnyBookDetails() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Any Book Details viewed.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.viewAnyBookDetails();
	}
	
	
	@Test(priority = 5)
	public void clickOnOrder() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on order button.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnOrder();
	}
	
	@Test(priority = 6)
	public void clickOnorderShoponnoKorun() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on orderShoponnoKorun button.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnorderShoponnoKorun();
	}
	
	
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}	
	
	
}