package org.title21.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.title21.POM.AdministrationCreateNewGroup_POM;
import org.title21.POM.LoginPage_POM;
import org.title21.POM.LogoutPage_POM;
import org.title21.POM.Table;
import org.title21.utility.BaseClass;

import com.relevantcodes.extentreports.LogStatus;
public class CreateGroup_Test extends BaseClass {

	LoginPage_POM login; 
	LogoutPage_POM logout;
	String className="";
	AdministrationCreateNewGroup_POM adminCreateGroup;
	Table tableObj = new Table(driver);
	boolean GroupPresence = false;
	boolean GroupPresenceAfterSearch = false;
	
	@BeforeClass
	public void openURL() 
	{
		getBrowser();
		className = this.getClass().getName();
		createDirectory(className);
		login=new LoginPage_POM(driver);
		login.loginFunction();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test(testName = "CreateGroup_admin", groups = "CreateGroup", priority = 0)
	public void CreateGroupInAdmin() 
	{
		adminCreateGroup = new AdministrationCreateNewGroup_POM(driver);
		BaseClass.getAdministrationPage();
		
		test = extent.startTest("CreateGroup_admin");
		test.log(LogStatus.PASS, "successfully navigated to Administration Page"+
				test.addScreenCapture(captureScreenShot(driver, "getAdministrationPage")));
		
		String GroupsTab = adminCreateGroup.groupsTab().getText();
		
		if(GroupsTab.contains("Groups"))
		{
			adminCreateGroup.groupsTab().click();
			test.log(LogStatus.PASS, "Successfully click on 'Groups tab");
			adminCreateGroup.groupAddNewLink().click();
			test.log(LogStatus.PASS, "Successfully click on 'Add New' link.");
			adminCreateGroup.verifyAddGroupPopUp(driver);
			test.log(LogStatus.PASS, "Verify 'Add Group' pop-up.");
			test.log(LogStatus.PASS, "Successfully verified Add Group Pop-Up"+
					test.addScreenCapture(captureScreenShot(driver, "Add Group")));
			sleep(2);
			
			adminCreateGroup.addGroupCancelButton().click();
			test.log(LogStatus.PASS, "Successfully clicked on 'Cancel' button\""+
					test.addScreenCapture(captureScreenShot(driver, "'Cancel' button")));

			
			sleep(2);
			
			String AddNewTest = adminCreateGroup.groupAddNewLink().getText();
			
			if(AddNewTest.contains("Add New")) {
				
				test.log(LogStatus.PASS, "Successfully navigated on 'Administration' page"+
						test.addScreenCapture(captureScreenShot(driver, "Administration' page")));
				
			}else {
				
				test.log(LogStatus.FAIL, "Unable to navigate on 'Administration' page after cancel pop-up."+
						test.addScreenCapture(captureScreenShot(driver, "Administration' page")));
			}
			
			adminCreateGroup.groupAddNewLink().click();
			test.log(LogStatus.PASS, "Successfully click on 'Add New' link."+
					test.addScreenCapture(captureScreenShot(driver, "'Add New' link.")));
			sleep(2);
			adminCreateGroup.verifyAddGroupPopUp(driver);
			test.log(LogStatus.PASS, "Verify 'Add Group' pop-up."+
					test.addScreenCapture(captureScreenShot(driver, "'Add Group' pop-up")));
			
			adminCreateGroup.groupLocationDropDownClick().click();
			sleep(2);
			Select SelectObj = new Select(adminCreateGroup.groupLocationDropDownClick());
			SelectObj.selectByVisibleText(""+groupData[1][0]+"");
			
			adminCreateGroup.addGroupTextBox().sendKeys(groupData[1][1]);
			
			test.log(LogStatus.PASS, "Selected Location:"+groupData[1][0]+" and Group: "+groupData[1][1]+"."+
					test.addScreenCapture(captureScreenShot(driver, "'Location & Group")));
			
			adminCreateGroup.addGroupTextBox().click();
			
			try{
				driver.findElement(By.cssSelector("#Group_Groups-error")); 
				GroupPresence = true;
				
			}catch(NoSuchElementException e) {
				
				GroupPresence = false;
			}
			
			if(GroupPresence) {
				
				adminCreateGroup.addGroupCancelButton().click();
				test.log(LogStatus.PASS, "'"+groupData[1][1]+"' Group is already created."+
						test.addScreenCapture(captureScreenShot(driver, "Group is already created.")));
			}
			else 
			{
				adminCreateGroup.addGroupAddButton().click();
				test.log(LogStatus.PASS, "Successfully click on Add button."+
						test.addScreenCapture(captureScreenShot(driver, "Add button")));
				sleep(2);
				if(adminCreateGroup.verifyAlerPopUp(driver)) 
				{
					adminCreateGroup.alertCloseButton().click();
					test.log(LogStatus.PASS, "Successfully close alert PopUp."+
							test.addScreenCapture(captureScreenShot(driver, "Successfully close alert PopUp.")));
				}else {
					test.log(LogStatus.FAIL, "Unable to close alert PopUp."+
							test.addScreenCapture(captureScreenShot(driver, "Unable to close alert PopUp.")));
				}
				sleep(2);
				if(adminCreateGroup.groupFilterResult() != null)
				{
					adminCreateGroup.groupFilterResult().click();
					adminCreateGroup.groupFilterResult().sendKeys(data[1][1]);
					adminCreateGroup.groupFilterResutGoButton().click();
					
					sleep(2);
					
					for(int i=1; i<=10; i++ ) {
						
						System.out.println(i);
						String groups = driver.findElement(By.xpath("//tbody[@class='t21-js-clickable-rows']/tr["+i+"]/td[1]")).getText();
						
						if(groups.equalsIgnoreCase(groupData[1][1])) {
							GroupPresenceAfterSearch = true;
							break;
						}
					}
					
					if(GroupPresenceAfterSearch) {
						test.log(LogStatus.PASS, "Successfully group is created and verified."+
								test.addScreenCapture(captureScreenShot(driver, "group is created and verified")));
					}else {
						test.log(LogStatus.FAIL, "Unable to verify created group."+
								test.addScreenCapture(captureScreenShot(driver, "Unable to verify created group.")));
					}
				}
				else
				{
					test.log(LogStatus.PASS, "Unable to find 'Filter Result' text field."+
							test.addScreenCapture(captureScreenShot(driver, "Unable to find 'Filter Result' text field.")));
				}
			}
			
		}else{
			test.log(LogStatus.FAIL, "Unable to find 'Groups' tab"+
					test.addScreenCapture(captureScreenShot(driver, "Unable to find 'Groups' tab")));
		}
		extent.endTest(test);
	}
	
	@Test(testName = "logout_admin", groups = "Logout", priority = 1)
	public void LogoutFromAdmin() throws Exception 
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
