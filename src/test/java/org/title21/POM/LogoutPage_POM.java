package org.title21.POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.title21.utility.BaseClass;
import org.title21.validation.entities.ErrorMessages;

public class LogoutPage_POM
{
public WebDriver driver;
public WebElement element;
 By administratordropdown=By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
 By logoutlink=By.xpath(".//*[@id='Logout']/a");
 By logoutbutton=By.xpath("//a[contains(@href,'Logout')]");
 By modalDialogText=By.cssSelector(".modal-body");

 public WebElement administratorDropDown(WebDriver driver)
 {
	 element=driver.findElement(administratordropdown);
	 return element;
 }
 public WebElement logoutLink(WebDriver driver)
 {
	 element=driver.findElement(logoutlink);
	 return element;
 }
 public WebElement logoutButton(WebDriver driver)
 
 {
	 element=driver.findElement(logoutbutton); 
	 return element;
 }
 
 public WebElement textOnAlert(WebDriver driver){
	 element=driver.findElement(modalDialogText); 
	 return element;	 
 }
  
 public boolean verifyMessageonModalDialog(WebDriver driver){
	 
	String confirmationText=textOnAlert(driver).getText();
	 if (confirmationText.contains(ErrorMessages.messageonLogoutAlert)){
		 return true;
	 }else{
		 return false;
	 }
	 
	 
 }
 
}
