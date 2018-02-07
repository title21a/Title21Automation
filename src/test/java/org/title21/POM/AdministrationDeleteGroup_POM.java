package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationDeleteGroup_POM
{
public WebDriver driver;
public WebElement element;

public AdministrationDeleteGroup_POM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[contains(@href,'GetGroupList')]")
WebElement groupslink;

@FindBy(css=".form-control.t21-placeholder")
WebElement groupfilterresult;

@FindBy(xpath="//button[@type='submit'][@tabindex='1']")
WebElement groupfilterresutgobutton;

@FindBy(xpath="//*[text()='No group found']")
WebElement nogroupfoundresulttext;

@FindBy(css=".modal-title>span")
WebElement deleteGroupPopUpHeaderText;

@FindBy(xpath="//*[text()='Message']")
WebElement deleteGroupConfirmPopUpHeaderText;
 
 public WebElement groupsTab()
 {
	 //element=driver.findElement(groupslink);
	 return groupslink;
 }
 public WebElement groupFilterResult()
 {
	// element=driver.findElement(groupfilterresult); 
	 return groupfilterresult;
 }
 
 public WebElement groupFilterResutGoButton()
 {
	// element=driver.findElement(groupfilterresutgobutton); 
	 return groupfilterresutgobutton;
 }
 
 public WebElement noGroupFoundResultText()
 {
	 //element=driver.findElement(nogroupfoundresulttext);
	 return nogroupfoundresulttext;
 }
 
 public WebElement deleteGroupPopUpHeaderText()
 {
	// element=driver.findElement(deleteGroupPopUpHeaderText);
	 return deleteGroupPopUpHeaderText;
 }
 
 public WebElement deleteGroupConfirmPopUpHeaderText()
 {
	// element=driver.findElement(deleteGroupConfirmPopUpHeaderText);
	 return deleteGroupConfirmPopUpHeaderText;
 }
 
 /*
	 * 
	 * This method verify text on Administration 
	 * @param WebDriver obj
	 */
	
	public boolean verifyNoGroupFoundText(){
		
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
	
	public boolean verifyDeleteGroupPopUp(){
		
		String DeleteGroupHeaderText = deleteGroupPopUpHeaderText().getText();
		
		if(DeleteGroupHeaderText.equalsIgnoreCase("Delete Group"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public void switchToModalDialog(){
		 
		 driver.switchTo().alert();
	 }
	
	public boolean verifyDeleteGroupPopUpTextMsg(){
		
		driver.switchTo().alert();
		String DeleteGroupTextMsg= driver.switchTo().alert().getText();
		
		if(DeleteGroupTextMsg.contains("Are you sure you want to delete"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean verifyDeleteGroupcConfirmPopUpText(){
		
		String DeleteGroupHeaderText = deleteGroupConfirmPopUpHeaderText.getText();
		
		if(DeleteGroupHeaderText.equalsIgnoreCase("Message"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean verifyDeleteGroupConfirmPopUpTextMsg(WebDriver driver){
		
		driver.switchTo().alert();
		String DeleteGroupTextMsg= driver.switchTo().alert().getText();
		
		if(DeleteGroupTextMsg.contains("deleted successfully."))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
