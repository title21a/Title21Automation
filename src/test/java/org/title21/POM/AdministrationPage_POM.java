package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
import org.title21.utility.BaseClass;
=======
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git

public class AdministrationPage_POM
{
	
<<<<<<< HEAD
	public BaseClass baseClassObj=new BaseClass();
	public WebDriver driver;
	public WebElement element;
	
 By administratordropdown=By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
 By administrationlink=By.xpath("//a[contains(@href, 'Administration')]");
 By administrationtext=By.cssSelector(".t21-grid-header-style");
=======
	
public WebDriver driver;
public WebElement element;

@FindBy(css=".dropdown-toggle.t21-nav-bar-dropdown")
 WebElement administratordropdown;

@FindBy(xpath="//a[contains(@href, 'Administration')]")
 WebElement administrationlink;

@FindBy(css=".t21-grid-header-style")
WebElement administrationtext;
>>>>>>> branch 'master' of https://github.com/Title21user1/Title21Automation.git
 
public AdministrationPage_POM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

 public WebElement administratorDropDown()
 {
	 return administratordropdown;
	// return element;
 }
 public WebElement administrationLink()
 {
	 return administrationlink;
	 //return element;
 }
 public WebElement administrationText()
 {
	 return administrationtext; 
	 //return element;
 }
 
 /*
	 * 
	 * This method verify text on Administration 
	 * @param WebDriver obj
	 */
	
	public boolean verifyAdministrationPagePrescence(){
		
		String administrationText = administrationText().getText();
		
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
