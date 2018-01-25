package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdministrationPage_POM
{
public WebDriver driver;
public WebElement element;
 By administratordropdown=By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
 By administrationlink=By.xpath("//a[contains(@href, 'Administration')]");
 By administrationtext=By.cssSelector(".t21-grid-header-style");
 
 public WebElement administratorDropDown(WebDriver driver)
 {
	 element=driver.findElement(administratordropdown);
	 return element;
 }
 public WebElement administrationLink(WebDriver driver)
 {
	 element=driver.findElement(administrationlink);
	 return element;
 }
 public WebElement administrationText(WebDriver driver)
 {
	 element=driver.findElement(administrationtext); 
	 return element;
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
