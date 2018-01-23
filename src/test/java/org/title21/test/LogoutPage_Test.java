package org.title21.test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.title21.POM.LoginPage_POM;
import org.title21.POM.LogoutPage_POM;
import org.title21.utility.BaseClass;

import com.relevantcodes.extentreports.LogStatus;

public class LogoutPage_Test extends BaseClass {
	
	public LoginPage_POM login = new LoginPage_POM();
	public LogoutPage_POM logout = new LogoutPage_POM();

	@BeforeClass
	public void openURL() {
		
		browser("Chrome", "https://quantumdev.title21.com");				
	}

	@Test(testName = "logout_admin", groups = "Logout", priority = 0)
	public void Logout() throws Exception {
		
		test = extent.startTest("logoutFunction");
		test.log(LogStatus.PASS, "Opened URL");
		login.login_username(driver).sendKeys("admin");
		test.log(LogStatus.PASS, "Username Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Login button after entering Username");
		login.login_password(driver).sendKeys("administrator");
		test.log(LogStatus.PASS, "Pass Entered");
		login.login_BTN(driver).click();
		logout.administratorDropDown(driver).click();
		test.log(LogStatus.PASS, "Clicked on Administrator dropdown after sucefully login");
		logout.logoutLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on logout link"+
		test.addScreenCapture(captureScreenShot(driver, "clickonLogoutlink")));	
		
		Thread.sleep(3000);
		logout.logoutButton(driver).click();
		test.log(LogStatus.PASS, "Clicked on logout button"+
		test.addScreenCapture(captureScreenShot(driver, "ClickOnLogoutButton")));
		extent.endTest(test);
	}
}
