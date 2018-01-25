package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.title21.utility.BaseClass;

public class DashBord_POM

{
	BaseClass b=new BaseClass();
	protected WebDriver driver;
	protected WebElement element;
	By dashbord = By.cssSelector("#Dashboard>a>span");
	By headerstyle = By.cssSelector(".t21-grid-header-style");

	public WebElement dashBordText(WebDriver driver) 
	{ 			
		element = driver.findElement(dashbord);		
		return element;		
	}

	
	public WebElement headerStyle(WebDriver driver) 
	{
		element = driver.findElement(headerstyle);
		return element;
	}
	
	/*
	 * 
	 * This method verify text on dashboard - (Dashboard). 
	 * @param WebDriver obj
	 */
	
	public boolean verifyDashboardPrescence(WebDriver driver){
		
		String dashboredtext = dashBordText(driver).getText();
		System.out.println(dashboredtext);
		
		if(dashboredtext.equals("Dashboard"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	/*
	 * 
	 * 
	 */
	
	public boolean verifyHeaderStyle(WebDriver driver){
		
		String headstyletext = headerStyle(driver).getText();
		System.out.println(headstyletext);
		if(headstyletext.equals("Administrator's Dashboard"))
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
}
