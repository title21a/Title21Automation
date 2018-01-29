package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdministrationCreateNewGroup_POM
{
public WebDriver driver;
public WebElement element;
 By groupslink=By.xpath("//a[contains(@href,'GetGroupList')]");
 By addnewlink=By.xpath("//a[contains(@href,'AddUserGroup')]");
 By addgroupheaderlable=By.xpath("//*[text()='Add Group']");
 By grouplocationdropdownclick=By.xpath("//select[@class='form-control']");
 By grouplocationdropdownvalue=By.xpath("//select[@class='form-control valid']/option");
 By addgrouptextbox=By.cssSelector("#Group_Groups");
 By addgroupaddbutton=By.cssSelector(".btn.t21-btn-primary.t21-ajax-submit-button");
 By addgroupcancelbutton=By.cssSelector(".btn.t21-btn-default.pull-left");
 By groupfilterresult=By.cssSelector(".form-control.t21-placeholder");
 By groupfilterresutgobutton=By.xpath("//button[@type='submit'][@tabindex='1']");
 		
 
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
	
}
