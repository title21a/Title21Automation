package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.title21.utility.BaseClass;

public class LogoutPage_POM
{
public WebDriver driver;
public WebElement element;
 By administratordropdown=By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
 By logoutlink=By.xpath(".//*[@id='Logout']/a");
 By logoutbutton=By.xpath(".//*[@id='logout-modal']/div/div/div[3]/a");
 By modaldialog=By.cssSelector(".modal-dialog");
 
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
 
 public WebElement alert(WebDriver driver){
	 element=driver.findElement(modaldialog);
	 return element;
 }
 
 public void switchToModalDialog(WebDriver driver){
	 
	 driver.switchTo().alert();
 }
 
}
