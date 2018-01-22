package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.title21.utility.BaseClass;
import org.title21.validation.entities.ErrorMessages;
public class LoginPage_POM 
{
	public BaseClass b1=new BaseClass();
	public WebDriver driver;
	public WebElement element;
		
	By username=By.cssSelector(".form-control#UserId");
	By password=By.cssSelector(".form-control#Password");
	By loginButton=By.cssSelector(".btn.t21-btn-primary");
	By passerrormessage=By.xpath(".//*[@id='login_panel']/form/div[3]/span");
	
	
	public WebElement login_username(WebDriver driver)
	{
		element=driver.findElement(username);
		return element;
	}
	public WebElement login_password(WebDriver driver)
	{
		element= driver.findElement(password);

		return element;
	}
	public WebElement login_BTN(WebDriver driver)
	{

		element = driver.findElement(loginButton);

		return element;
	}
	public WebElement passwordErrorMessage(WebDriver driver)
	{
		element = driver.findElement(passerrormessage);
		String error = element.getText();
		System.out.println(error);
		if(error.contains(ErrorMessages.passworderrormessages))
		{
			System.out.println("True");
			b1.captureScreenShot(driver,"passResult");
		}
		else
		{
			System.out.println("False");
		}
		return element;
		
	}

	

}
