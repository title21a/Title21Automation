package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrationCreateNewGroup_POM
{
public WebDriver driver;
public WebElement element;

@FindBy(xpath="//a[contains(@href,'GetGroupList')]")
WebElement groupslink=By.xpath("//a[contains(@href,'GetGroupList')]");
WebElement addnewlink=By.xpath("//a[contains(@href,'AddUserGroup')]");
WebElement addgroupheaderlable=By.xpath("//*[text()='Add Group']");
WebElement grouplocationdropdownclick=By.xpath("//select[@class='form-control']");
WebElement grouplocationdropdownvalue=By.xpath("//select[@class='form-control valid']/option");
WebElement addgrouptextbox=By.cssSelector("#Group_Groups");
WebElement addgroupaddbutton=By.cssSelector(".btn.t21-btn-primary.t21-ajax-submit-button");
WebElement addgroupcancelbutton=By.cssSelector(".btn.t21-btn-default.pull-left");
WebElement groupfilterresult=By.cssSelector(".form-control.t21-placeholder");
WebElement groupfilterresutgobutton=By.xpath("//button[@type='submit'][@tabindex='1']");
WebElement nogroupfoundresulttext=By.xpath("//*[text()='No group found']");
WebElement listOfGroups=By.xpath("//tbody[@class='t21-js-clickable-rows']/tr/td[1]");
 
 public WebElement groupsTab(WebDriver driver)
 {
	 element=driver.findElement(groupslink);
	 return element;
 }
 public WebElement groupAddNewLink(WebDriver driver)
 {
	 element=driver.findElement(addnewlink);
	 return element;
 }
 public WebElement addGroupHeaderlable(WebDriver driver)
 {
	 element=driver.findElement(addgroupheaderlable); 
	 return element;
 }
 
 public WebElement groupLocationDropDownClick(WebDriver driver)
 {
	 element=driver.findElement(grouplocationdropdownclick); 
	 return element;
 }
 
 public WebElement groupLocationDropDownValue(WebDriver driver)
 {
	 element=driver.findElement(grouplocationdropdownvalue); 
	 return element;
 }
 
 public WebElement addGroupTextBox(WebDriver driver)
 {
	 element=driver.findElement(addgrouptextbox); 
	 return element;
 }
 
 public WebElement addGroupAddButton(WebDriver driver)
 {
	 element=driver.findElement(addgroupaddbutton); 
	 return element;
 }
 
 public WebElement addGroupCancelButton(WebDriver driver)
 {
	 element=driver.findElement(addgroupcancelbutton); 
	 return element;
 }
 
 public WebElement groupFilterResult(WebDriver driver)
 {
	 element=driver.findElement(groupfilterresult); 
	 return element;
 }
 
 public WebElement groupFilterResutGoButton(WebDriver driver)
 {
	 element=driver.findElement(groupfilterresutgobutton); 
	 return element;
 }
 
 public WebElement noGroupFoundResultText(WebDriver driver){
	 element=driver.findElement(nogroupfoundresulttext);
	 return element;
 }
 
 public WebElement listOfGroups(WebDriver driver){
	 element=driver.findElement(listOfGroups);
	 return element;
 }
 
 /*
	 * 
	 * This method verify text on Administration 
	 * @param WebDriver obj
	 */
	
	public boolean verifyAddGroupPopUp(WebDriver driver){
		
		String AddGroupPopUpHeaderText = addGroupHeaderlable(driver).getText();
		
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
		
		String NoGroupFoundResultText = noGroupFoundResultText(driver).getText();
		
		if(NoGroupFoundResultText.equalsIgnoreCase("No group found"))
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
