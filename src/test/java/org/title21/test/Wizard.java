package org.title21.test;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.title21.POM.LoginPage_POM;
import org.title21.POM.LogoutPage_POM;
import org.title21.POM.WizardPage_POM;
import org.title21.utility.BaseClass;

import com.relevantcodes.extentreports.LogStatus;
// not to execute now.
/*
public class Wizard extends BaseClass
{
	public LoginPage_POM login = new LoginPage_POM();
	public LogoutPage_POM logout = new LogoutPage_POM();
	public WizardPage_POM wizard=new WizardPage_POM();
	@BeforeClass
	public void openURL() {		
		browser("Chrome", "https://quantumdev.title21.com");
		implicitwait(driver);		
	}

	@Test(testName = "logout_admin", groups = "Logout", priority = 0)
	public void Login() throws Exception {
		
		test = extent.startTest("Wizard");
		test.log(LogStatus.PASS, "Opened URL");
		login.login_username(driver).sendKeys("admin");
		test.log(LogStatus.PASS, "Username Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Login button after entering Username");
		login.login_password(driver).sendKeys("administrator");
		test.log(LogStatus.PASS, "Pass Entered");
		login.login_BTN(driver).click();		
		//Thread.sleep(3000);
		wizard.verifWizard(driver, "You have 2 approvals awaiting your action.");
		
	}
}
*/
