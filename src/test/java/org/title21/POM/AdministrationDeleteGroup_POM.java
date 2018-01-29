package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdministrationDeleteGroup_POM
{
public WebDriver driver;
public WebElement element;
 By groupslink=By.xpath("//a[contains(@href,'GetGroupList')]");
 By groupfilterresult=By.cssSelector(".form-control.t21-placeholder");
 By groupfilterresutgobutton=By.xpath("//button[@type='submit'][@tabindex='1']");
 By nogroupfoundresulttext=By.xpath("//*[text()='No group found']");
 By deleteGroupPopUpHeaderText=By.cssSelector(".modal-title>span");
 By deleteGroupConfirmPopUpHeaderText=By.xpath("//*[text()='Message']");
 
 public WebElement groupsTab(WebDriver driver)
 {
	 element=driver.findElement(groupslink);
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
 
 public WebElement noGroupFoundResultText(WebDriver driver)
 {
	 element=driver.findElement(nogroupfoundresulttext);
	 return element;
 }
 
 public WebElement deleteGroupPopUpHeaderText(WebDriver driver)
 {
	 element=driver.findElement(deleteGroupPopUpHeaderText);
	 return element;
 }
 
 public WebElement deleteGroupConfirmPopUpHeaderText(WebDriver driver)
 {
	 element=driver.findElement(deleteGroupConfirmPopUpHeaderText);
	 return element;
 }
 
 /*
	 * 
	 * This method verify text on Administration 
	 * @param WebDriver obj
	 */
	
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
	
	public boolean verifyDeleteGroupPopUp(WebDriver driver){
		
		String DeleteGroupHeaderText = deleteGroupPopUpHeaderText(driver).getText();
		
		if(DeleteGroupHeaderText.equalsIgnoreCase("Delete Group"))
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
	
	public boolean verifyDeleteGroupPopUpTextMsg(WebDriver driver){
		
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
	
	public boolean verifyDeleteGroupcConfirmPopUpText(WebDriver driver){
		
		String DeleteGroupHeaderText = deleteGroupConfirmPopUpHeaderText(driver).getText();
		
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
