package org.title21.POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.title21.utility.BaseClass;
import org.title21.validation.entities.ErrorMessages;

import com.relevantcodes.extentreports.LogStatus;

public class LogoutPage_POM
{
	public WebDriver driver;
	public WebElement element;

	@FindBy (css=".dropdown-toggle.t21-nav-bar-dropdown")
	WebElement administratordropdown;
	
	@FindBy (xpath=".//*[@id='Logout']/a")
	WebElement logoutlink;
	
	@FindBy (xpath=".//*[@id='Logout']/a")
	WebElement logoutbutton;
	
	@FindBy (css=".modal-body")
	WebElement modalDialogText;

	public LogoutPage_POM(WebDriver driver) {	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//By administratordropdown=By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
// By logoutlink=By.xpath(".//*[@id='Logout']/a");
 //By logoutbutton=By.xpath("//a[contains(@href,'Logout')]");
// By modalDialogText=By.cssSelector(".modal-body");

	 public WebElement getAdmindropdown()
	 {
		return administratordropdown;
	 }
	 
	 public WebElement getlogoutLink()
	 {
		return logoutlink;
	 }
	 
	 public WebElement getLogoutButton() 
	 {
		  return logoutbutton;
	 }
	 
	 public WebElement getLogoutConfirmationMessage() 
	 {
		  return modalDialogText;
	 }
   
	 public boolean verifyMessageonModalDialog(WebDriver driver){
	 
		 String confirmationText=getLogoutConfirmationMessage().getText();
		 if (confirmationText.contains(ErrorMessages.messageonLogoutAlert)){
			 return true;
		 }else{
			 return false;
		 }
	  
	 }
	 
	 public void logoutFunction(){
		 
		getAdmindropdown().click();		
		getlogoutLink().click();	
		 
	 }
 
}
