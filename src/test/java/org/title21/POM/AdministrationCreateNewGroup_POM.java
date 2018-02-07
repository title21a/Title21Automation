package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.title21.utility.BaseClass;
import org.title21.validation.entities.ErrorMessages;

public class AdministrationCreateNewGroup_POM
{
public WebDriver driver;
public WebElement element;
BaseClass baseClassObj = new BaseClass();


public AdministrationCreateNewGroup_POM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[contains(@href,'GetGroupList')]")
WebElement groupslink;

@FindBy(xpath="//a[contains(@href,'AddUserGroup')]")
WebElement addnewlink;

@FindBy(xpath="//*[text()='Add Group']")
WebElement addgroupheaderlable;

@FindBy(xpath="//select[@class='form-control']")
WebElement grouplocationdropdownclick;

@FindBy(xpath="//select[@class='form-control valid']/option")
WebElement grouplocationdropdownvalue;

@FindBy(css="#Group_Groups")
WebElement addgrouptextbox;

@FindBy(css=".btn.t21-btn-primary.t21-ajax-submit-button")
WebElement addgroupaddbutton;

@FindBy(css=".btn.t21-btn-default.pull-left")
WebElement addgroupcancelbutton;

@FindBy(css=".form-control.t21-placeholder")
WebElement groupfilterresult;

@FindBy(xpath="//button[@type='submit'][@tabindex='1']")
WebElement groupfilterresutgobutton;

@FindBy(xpath="//*[text()='No group found']")
WebElement nogroupfoundresulttext;

@FindBy(xpath="//tbody[@class='t21-js-clickable-rows']/tr/td[1]")
WebElement listOfGroups;

@FindBy(xpath="//button[text()='Close']")
WebElement alertCloseButton;

@FindBy(xpath="//h4[text()='Message']")
WebElement alertMsgPopUp;

@FindBy(css="#Group_Groups-error")
WebElement alreadyGroupCreatedErrorMsg;

 
 public WebElement groupsTab()
 {
	 //element=driver.findElement(groupslink);
	 return groupslink;
 }
 public WebElement groupAddNewLink()
 {
	 //element=driver.findElement(addnewlink);
	 return addnewlink;
 }
 public WebElement addGroupHeaderlable()
 {
	 //element=driver.findElement(addgroupheaderlable); 
	 return addgroupheaderlable;
 }
 
 public WebElement groupLocationDropDownClick()
 {
	// element=driver.findElement(grouplocationdropdownclick); 
	 return grouplocationdropdownclick;
 }
 
 public WebElement groupLocationDropDownValue()
 {
	 //element=driver.findElement(grouplocationdropdownvalue); 
	 return grouplocationdropdownvalue;
 }
 
 public WebElement addGroupTextBox()
 {
	 //element=driver.findElement(addgrouptextbox); 
	 return addgrouptextbox;
 }
 
 public WebElement addGroupAddButton()
 {
	 //element=driver.findElement(addgroupaddbutton); 
	 return addgroupaddbutton;
 }
 
 public WebElement addGroupCancelButton()
 {
	 //element=driver.findElement(addgroupcancelbutton); 
	 return addgroupcancelbutton;
 }
 
 public WebElement groupFilterResult()
 {
	 //element=driver.findElement(groupfilterresult); 
	 return groupfilterresult;
 }
 
 public WebElement groupFilterResutGoButton()
 {
	 //element=driver.findElement(groupfilterresutgobutton); 
	 return groupfilterresutgobutton;
 }
 
 public WebElement noGroupFoundResultText(){
	 //element=driver.findElement(nogroupfoundresulttext);
	 return nogroupfoundresulttext;
 }
 
 public WebElement listOfGroups(){
	 //element=driver.findElement(listOfGroups);
	 return listOfGroups;
 }
 
 public WebElement alertCloseButton() {
	 
	 return alertCloseButton;
 }
 
 public WebElement alertMsgPopUp() {
	 
	 return alertMsgPopUp;
 }
 
 public WebElement alreadyGroupCreatedErrorMsg() {
	 
	 return alreadyGroupCreatedErrorMsg;
 }
 
 /*
	 * 
	 * This method verify text on Administration 
	 * @param WebDriver obj
	 */
	
	public boolean verifyAddGroupPopUp(WebDriver driver){
		
		String AddGroupPopUpHeaderText = addGroupHeaderlable().getText();
		
		if(AddGroupPopUpHeaderText.equalsIgnoreCase("Add Group"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean verifyNoGroupFoundText(WebDriver driver){
		
		String NoGroupFoundResultText = noGroupFoundResultText().getText();
		
		if(NoGroupFoundResultText.equalsIgnoreCase("No group found"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public boolean verifyAlerPopUp(WebDriver driver){
		
		String alertHeaderText = alertMsgPopUp().getText();
		
		if(alertHeaderText.equalsIgnoreCase("Message"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean verifyalreadyGroupCreatedErrorMsg(WebDriver driver){
		
		baseClassObj.waitForPageToLoad(driver, 10);
		String errorMessage = alreadyGroupCreatedErrorMsg().getText();		
		if(errorMessage.contains(ErrorMessages.groupnamealreadyexist))
		{
			return true;
		}
		else
		{	
			return false;
		}		
		
	}
	
	public boolean verifyalreadyGroupCreatedErrorMsg1(WebDriver driver){
		
		try {
			
			driver.findElement(By.cssSelector("#Group_Groups-error")); 
			
		}catch(NoSuchElementException e) {
			
			
			
		}
		
		
		baseClassObj.waitForPageToLoad(driver, 10);
		String errorMessage = alreadyGroupCreatedErrorMsg().getText();		
		if(errorMessage.contains(ErrorMessages.groupnamealreadyexist))
		{
			return true;
		}
		else
		{	
			return false;
		}		
		
	}
	
	
	
	
	public void switchToModalDialog(WebDriver driver){
		 
		 driver.switchTo().alert();
	 }
	
	public void acceptToAddGroup(WebDriver driver){
		 
		 driver.switchTo().alert().accept();
	 }
	
	public void cancelToAddGroup(WebDriver driver){
		 
		 driver.switchTo().alert().dismiss();
	 }
	
}
