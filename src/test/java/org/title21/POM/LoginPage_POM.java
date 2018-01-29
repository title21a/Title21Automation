package org.title21.POM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.title21.utility.BaseClass;
import org.title21.validation.entities.ErrorMessages;

public class LoginPage_POM extends BaseClass
{
	public BaseClass baseClassObj=new BaseClass();
	public WebDriver driver;
	public WebElement element;
		
	By username=By.cssSelector(".form-control#UserId");
	By password=By.cssSelector(".form-control#Password");
	By loginButton=By.cssSelector(".btn.t21-btn-primary");
	By passwordErrorMessage=By.xpath(".//*[@id='login_panel']/form/div[3]/span");	
	By useridValidationMessage=By.cssSelector(".text-danger#UserId-error");
	By passwordValidationMessage=By.cssSelector(".text-danger#Password-error");
	
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
	public WebElement passworderrorMessageArea(WebDriver driver){
		
		element = driver.findElement(passwordErrorMessage);
		
		return element;
	}
	public WebElement userIDValidationMessage(WebDriver driver){
		
		element = driver.findElement(useridValidationMessage);
		
		return element;
	}
	
	public WebElement passwordValidationMessage(WebDriver driver){
		
		element = driver.findElement(passwordValidationMessage);
		
		return element;
	}
	
	public boolean verifyPasswordValidationMessage(WebDriver driver){
		
		element=passwordValidationMessage(driver);
		String errorMessage = element.getText();		
		if(errorMessage.contains(ErrorMessages.messagewithoutPassword))
		{
			baseClassObj.captureScreenShot(driver,"messagewithoutPassword");
			return true;
		}
		else
		{			
			return false;
		}
		
	}
	
	public boolean verifyUserIDValidationMessage(WebDriver driver){
		
		element=userIDValidationMessage(driver);
		String errorMessage = element.getText();		
		if(errorMessage.contains(ErrorMessages.messagewithoutUsername))
		{
			baseClassObj.captureScreenShot(driver,"messagewithoutUsername");
			return true;
		}
		else
		{	
			return false;
		}		
		
	}
	
	public boolean verifyPasswordErrorMessage(WebDriver driver)
	{
		//element = driver.findElement(passwordErrorMessage);
		element=passworderrorMessageArea(driver);
		String errorMessage = element.getText();		
		if(errorMessage.contains(ErrorMessages.passworderrormessages))
		{
			baseClassObj.captureScreenShot(driver,"passwordFieldErrorMessage");
			return true;
		}
		else
		{			
			return false;
		}
				
	}

	

}
