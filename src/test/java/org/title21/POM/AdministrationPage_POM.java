package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationPage_POM
{
	
	
public WebDriver driver;
public WebElement element;

@FindBy(css=".dropdown-toggle.t21-nav-bar-dropdown")
 WebElement administratordropdown;

@FindBy(xpath="//a[contains(@href, 'Administration')]")
 WebElement administrationlink;

@FindBy(css=".t21-grid-header-style")
WebElement administrationtext;
 
public AdministrationPage_POM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

 public WebElement administratorDropDown()
 {
	 return administratordropdown;
	// return element;
 }
 public WebElement administrationLink(WebDriver driver)
 {
	 return administrationlink;
	 //return element;
 }
 public WebElement administrationText(WebDriver driver)
 {
	 return administrationtext; 
	 //return element;
 }
 
 /*
	 * 
	 * This method verify text on Administration 
	 * @param WebDriver obj
	 */
	
	public boolean verifyAdministrationPagePrescence(WebDriver driver){
		
		String administrationText = administrationText(driver).getText();
		
		if(administrationText.equalsIgnoreCase("Administration"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
 
}
