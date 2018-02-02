package org.title21.test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.title21.POM.AdministrationCreateNewGroup_POM;
import org.title21.POM.AdministrationPage_POM;
import org.title21.POM.LoginPage_POM;
import org.title21.POM.LogoutPage_POM;
import org.title21.utility.BaseClass;

import com.relevantcodes.extentreports.LogStatus;

public class AdministratonPage_Test extends BaseClass {

	boolean group=false;
	String className="";

	AdministrationPage_POM administrationPage = new AdministrationPage_POM();
	LoginPage_POM login = new LoginPage_POM();
	public LogoutPage_POM logout = new LogoutPage_POM();

	
	@BeforeClass
	public void openURL() 
	{
		//browser("Chrome", "https://quantumdev.title21.com");
		
		getBrowser();
		className = this.getClass().getName();
		createDirectory(className);
		//Call Login keyword
		test = extent.startTest("LoginIntoAdministration");
		login.login_username(driver).sendKeys(data[0][0]);
		test.log(LogStatus.PASS, "Username Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Login button after entering Username.");
		
		login.login_password(driver).sendKeys(data[1][1]);
		test.log(LogStatus.PASS, "Correct password Entered.");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Login button."+
		test.addScreenCapture(captureScreenShot(driver, "View after Loggedin.")));	
		
		extent.endTest(test);
	}
	
	@Test(testName = "Administration_Page", groups = "AdministrationPage", priority = 0)
	public void CreateGroupInAdmin() 
	{
		test = extent.startTest("CreateGroup_admin");
		
		String administratorTab = administrationPage.administratorDropDown(driver).getText();
		
		if(administratorTab.contains("Administrator"))
		{
			administrationPage.administratorDropDown(driver).click();
			test.log(LogStatus.PASS, "Successfully click on 'administrator");
			
			administrationPage.administrationLink(driver).click();
			test.log(LogStatus.PASS, "Successfully click on 'administration' link.");
			
			if(administrationPage.verifyAdministrationPagePrescence(driver)) {
				test.log(LogStatus.PASS, "Successfully verify 'administration Page' Prescence.");
			}else {
				test.log(LogStatus.FAIL, "Unable to verify 'administration Page' Prescence.");
			}
			test.addScreenCapture(captureScreenShot(driver, "AfterEnteringProperUsername"));
		}else{
			
			test.log(LogStatus.FAIL, "Unable to find 'Groups' tab");
			
		}
		extent.endTest(test);
	}
	
	@AfterClass
	public void closeBrowserInstance() 
	{
		//call Logout keyword
		test = extent.startTest("logoutFunction");
		logout.administratorDropDown(driver).click();
		test.log(LogStatus.PASS, "Clicked on Administrator dropdown after sucessfully login.");
		logout.logoutLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on logout link"+
		test.addScreenCapture(captureScreenShot(driver, "clickonLogoutlink")));	
		
		sleep(2);
		
		if (logout.verifyMessageonModalDialog(driver)){
			test.log(LogStatus.PASS, "Message on Logout alert verified."+
			test.addScreenCapture(captureScreenShot(driver, "Logout Alert")));
		};
		
		logout.logoutButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on logout button"+
		test.addScreenCapture(captureScreenShot(driver, "ClickOnLogoutButton")));
		extent.endTest(test);
		
		
		driver.close();
	}

	
	
}
