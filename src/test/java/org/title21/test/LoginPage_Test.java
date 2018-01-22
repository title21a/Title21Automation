package org.title21.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.title21.POM.DashBord;
import org.title21.POM.LoginPage_POM;
import org.title21.utility.BaseClass;

import com.relevantcodes.extentreports.LogStatus;

public class LoginPage_Test extends BaseClass {
	LoginPage_POM login = new LoginPage_POM();
	DashBord dashboardObj = new DashBord();

	@BeforeClass
	public void openURL() 
	{
		browser("Chrome", "https://quantumdev.title21.com");
	}
	@Test(testName = "login_admin", groups = "Logins", priority = 0)
	public void LoginWithInvalidPassword() 
	{
		test = extent.startTest(data[0][2]);
		test.log(LogStatus.PASS, "Opened URL");
		login.login_username(driver).sendKeys(data[0][0]);
		test.log(LogStatus.PASS, "Username Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Login button after entering Username");

		// login.login_BTN(driver).click();

		login.login_password(driver).sendKeys(data[0][1]);
		test.log(LogStatus.PASS, "Pass Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked Buttons");
		login.passwordErrorMessage(driver);
		test.log(LogStatus.PASS, "Verify error message without entering password.");
		extent.endTest(test);
	}	
	
	@Test(testName = "login_admin", groups = "Logins", priority = 1)
	public void LoginValidPassword() 
	{
		test = extent.startTest(data[1][2]);
		login.login_password(driver).sendKeys(data[1][1]);
		test.log(LogStatus.PASS, "Correct password Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Button");
		extent.endTest(test);

	}
	@Test(testName = "login_admin", groups = "Logins", priority = 2)
	public void sucefullyLogin() 
	{
		test = extent.startTest(data[1][2]);
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Verifing DashBord");
		dashboardObj.verifyDashboardPrescence(driver);
		test.log(LogStatus.PASS, "DashBord is displayed After Login.");
		test.log(LogStatus.PASS,"verifying Administrator's Dashboard header text");
		dashboardObj.verifyHeaderStyle(driver);
		test.log(LogStatus.PASS,"Sucefully displayed Administrator's Dashboard header text");
		extent.endTest(test);
	}
	@AfterClass
	public void closeBrowserInstance() 
	{

		driver.close();
	}

	
	
}
