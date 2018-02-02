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

	AdministrationPage_POM administrationPage; 
	LoginPage_POM login; 
	LogoutPage_POM logout;

	
	@BeforeClass
	public void openURL() 
	{
		getBrowser();
		className = this.getClass().getName();
		createDirectory(className);
		login=new LoginPage_POM(driver);
		login.loginFunction();
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
			test.addScreenCapture(captureScreenShot(driver, "administrationPage"));
		}else{
			
			test.log(LogStatus.FAIL, "Unable to find 'Groups' tab");
			
		}
		extent.endTest(test);
	}
	
	@Test(testName = "logout_admin", groups = "Logout", priority = 1)
	public void LoginWithInvalidCredentials() throws Exception 
	{		
		logout=new LogoutPage_POM(driver);
		logout.logoutFunction();		
	}
	
	
	@AfterClass
	public void closeBrowserInstance() 
	{
		driver.close();
	}

	
	
}
