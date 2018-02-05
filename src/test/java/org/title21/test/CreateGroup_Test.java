package org.title21.test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.title21.POM.AdministrationCreateNewGroup_POM;
import org.title21.POM.LoginPage_POM;
import org.title21.POM.LogoutPage_POM;
import org.title21.utility.BaseClass;

import com.relevantcodes.extentreports.LogStatus;
public class CreateGroup_Test extends BaseClass {

<<<<<<< HEAD
	LoginPage_POM login; 
	LogoutPage_POM logout;
=======
	LoginPage_POM login = new LoginPage_POM(driver);
	public LogoutPage_POM logout = new LogoutPage_POM(driver);
	boolean group=false;
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
	String className="";
<<<<<<< HEAD
	AdministrationCreateNewGroup_POM adminCreateGroup;
=======
	AdministrationCreateNewGroup_POM adminCreateGroup = new AdministrationCreateNewGroup_POM(driver);
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
	
	
	@BeforeClass
	public void openURL() 
	{
		getBrowser();
		className = this.getClass().getName();
		createDirectory(className);
<<<<<<< HEAD
		login=new LoginPage_POM(driver);
		login.loginFunction();
=======
		//Call Login keyword
		test = extent.startTest("LoginFunction");
		/*login.login_username(driver).sendKeys(data[0][0]);
		test.log(LogStatus.PASS, "Username Entered");
		login.login_BTN(driver).click();
		test.log(LogStatus.PASS, "Clicked on Login button after entering Username.");
		
		login.login_password(driver).sendKeys(data[1][1]);
		test.log(LogStatus.PASS, "Correct password Entered.");
		login.login_BTN(driver).click();*/
		login.loginFunction();
		test.log(LogStatus.PASS, "Clicked on Login button."+
		test.addScreenCapture(captureScreenShot(driver, "View after Loggedin.")));	
		extent.endTest(test);
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
	}
	
	@Test(testName = "CreateGroup_admin", groups = "CreateGroup", priority = 0)
	public void CreateGroupInAdmin() 
	{
		BaseClass.getAdministrationPage();
		
		test = extent.startTest("CreateGroup_admin");
		test.addScreenCapture(captureScreenShot(driver, "getAdministrationPage"));
		
		String GroupsTab = adminCreateGroup.groupsTab().getText();
		
		if(GroupsTab.contains("Groups"))
		{
			adminCreateGroup.groupsTab().click();
			test.log(LogStatus.PASS, "Successfully click on 'Groups tab");
			adminCreateGroup.groupAddNewLink().click();
			test.log(LogStatus.PASS, "Successfully click on 'Add New' link.");
			adminCreateGroup.verifyAddGroupPopUp(driver);
			test.log(LogStatus.PASS, "Verify 'Add Group' pop-up.");
			test.addScreenCapture(captureScreenShot(driver, "Add Group"));
			
			sleep(2);
			
			adminCreateGroup.addGroupCancelButton().click();
			test.log(LogStatus.PASS, "Successfully click on 'Cancel' button");
			
			sleep(2);
			
			String AddNewTest = adminCreateGroup.groupAddNewLink().getText();
			
			if(AddNewTest.contains("Add New")) {
				
				test.log(LogStatus.PASS, "Successfully navigate on 'Administration' page");
				
			}else {
				
				test.log(LogStatus.FAIL, "Unable to navigate on 'Administration' page after cancel pop-up.");
			}
			test.addScreenCapture(captureScreenShot(driver, "AdministrationPage"));
			
			adminCreateGroup.groupAddNewLink().click();
			test.log(LogStatus.PASS, "Successfully click on 'Add New' link.");
			sleep(2);
			adminCreateGroup.verifyAddGroupPopUp(driver);
			test.log(LogStatus.PASS, "Verify 'Add Group' pop-up.");
			test.addScreenCapture(captureScreenShot(driver, "AddGroup"));
			
<<<<<<< HEAD
			adminCreateGroup.groupLocationDropDownClick(driver).click();
			sleep(2);
			Select SelectObj = new Select(adminCreateGroup.groupLocationDropDownClick(driver));
=======
			adminCreateGroup.groupLocationDropDownClick().click();
			
			//Select location
			Select SelectObj = new Select(adminCreateGroup.groupLocationDropDownClick());
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
			SelectObj.selectByVisibleText("Dallas");
			
			String location = adminCreateGroup.groupLocationDropDownClick().getText();
			
			if(location.contains("Dallas"))
			{
				test.log(LogStatus.PASS, "Successfully set 'Dallas' Location.");
			}else{
				test.log(LogStatus.FAIL, "Unable to set 'Dallas' Location.");
			}
			
<<<<<<< HEAD
			adminCreateGroup.addGroupTextBox(driver).sendKeys("Test123");
			adminCreateGroup.addGroupTextBox(driver).click();
=======
			//provide group name 
			adminCreateGroup.addGroupTextBox().sendKeys("Test1234");
			
			String GroupName = adminCreateGroup.addGroupTextBox().getText();
		//	test.addScreenCapture(captureScreenShot(driver, "AfterEnteringProperUsername"));
			if(GroupName.contains("Test1234"))
			{
				test.log(LogStatus.PASS, "Successfully set 'Test1234' group.");
			}else{
				test.log(LogStatus.FAIL, "Unable to set 'Test1234' group.");
			}
			
			//adminCreateGroup.acceptToAddGroup(driver);
			
			adminCreateGroup.addGroupAddButton().click();
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
			
			
<<<<<<< HEAD
			if(adminCreateGroup.verifyalreadyGroupCreatedErrorMsg(driver)) {
=======
			if(adminCreateGroup.verifyAlertPopUp()) 
			{
				adminCreateGroup.alerCloseButton().click();
				test.log(LogStatus.PASS, "Successfully close alert PopUp.");
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
				
				adminCreateGroup.addGroupCancelButton(driver).click();
				
			}
<<<<<<< HEAD
			else 
=======
			
			Alert alert= driver.switchTo().alert();
			String alertMessg=driver.switchTo().alert().getText();
			System.out.println(alertMessg);
			sleep(2);
			alert.accept();
			
			
			if(adminCreateGroup.groupFilterResult() != null)
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
			{
<<<<<<< HEAD
				adminCreateGroup.addGroupAddButton(driver).click();
=======
				adminCreateGroup.groupFilterResult().click();
				adminCreateGroup.groupFilterResult().sendKeys("Test");
				adminCreateGroup.groupFilterResutGoButton().click();
			//	adminCreateGroup.groupFilterResutGoButton(driver).click();
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
				
<<<<<<< HEAD
				if(adminCreateGroup.verifyAlerPopUp(driver)) 
				{
					adminCreateGroup.alerCloseButton(driver).click();
					test.log(LogStatus.PASS, "Successfully close alert PopUp.");
					test.addScreenCapture(captureScreenShot(driver, "AftercloseAlert"));
=======
				List<WebElement> allGroups = (List<WebElement>) adminCreateGroup.listOfGroups();

				//String allGroupList = adminCreateGroup.listOfGroups(driver).getTagName();
				String allGroupList = adminCreateGroup.listOfGroups().getText();
				
				List<WebElement> allGrouplist2 = driver.findElements(By.xpath("//tbody[@class='t21-js-clickable-rows']/tr/td"));
				System.out.println(allGrouplist2);
				
				if(allGroupList.contains("Test1234")) {
					
					test.log(LogStatus.PASS, "Successfully group is created.");
					
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
				}else {
					test.log(LogStatus.FAIL, "Unable to close alert PopUp.");
				}
				
<<<<<<< HEAD
				if(adminCreateGroup.groupFilterResult(driver) != null)
=======
				
				
				for ( WebElement Group: allGroups) 
				{ 
			        if ( Group.getText().contains("Text1234") ) {
			        	group= true;
			        }
			    }
				
				if(group==true)
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
				{
<<<<<<< HEAD
					adminCreateGroup.groupFilterResult(driver).click();
					adminCreateGroup.groupFilterResult(driver).sendKeys("Test123");
					adminCreateGroup.groupFilterResutGoButton(driver).click();
					String allGroupList = adminCreateGroup.listOfGroups(driver).getText();
					test.addScreenCapture(captureScreenShot(driver, "listOfGroups"));
					
					if(allGroupList.contains("Test123")) {
						
						test.log(LogStatus.PASS, "Successfully group is created.");
						test.addScreenCapture(captureScreenShot(driver, "groupCreated"));
					}else {
						test.log(LogStatus.FAIL, "Successfully group is created.");
					}
				}
				else
				{
					test.log(LogStatus.PASS, "Unable to find 'Filter Result' text field.");
				}
				
			
				
=======
					test.log(LogStatus.PASS, "Successfully group is created.");
		        }else{
		        	test.log(LogStatus.FAIL, "Successfully group is created.");
		        }
			}
			else
			{
				test.log(LogStatus.PASS, "Unable to find 'Filter Result' text field.");
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
			}
			
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
<<<<<<< HEAD
=======
		//call Logout keyword
		test = extent.startTest("logoutFunction");
		/*logout.administratorDropDown(driver).click();
		test.log(LogStatus.PASS, "Clicked on Administrator dropdown after sucessfully login.");
		logout.logoutLink(driver).click();
		test.log(LogStatus.PASS, "Clicked on logout link"+
		test.addScreenCapture(captureScreenShot(driver, "clickonLogoutlink")));	
		
		sleep(2);
		
		if (logout.verifyMessageonModalDialog(driver)){
			test.log(LogStatus.PASS, "Message on Logout alert verified."+
			test.addScreenCapture(captureScreenShot(driver, "Logout Alert")));
		};
		*/
		logout.logoutFunction();
		test.log(LogStatus.PASS, "Clicked on logout button"+
		test.addScreenCapture(captureScreenShot(driver, "ClickOnLogoutButton")));
		extent.endTest(test);
		
		
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
		driver.close();
	}

}
