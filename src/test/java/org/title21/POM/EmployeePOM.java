package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePOM {

	public WebDriver driver;
	public WebElement element;
		
	By administrator=By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
	By administration=By.xpath("//*[@id='Administration']/a");
	By employees=By.cssSelector(".selected.t21-padding-5.set-item");
	By addNew=By.cssSelector(".fa.fa-plus-circle.t21-padding-right-5");
	By locationTab=By.cssSelector(".form-control#GridLocation");
	By searchBox=By.cssSelector(".form-control.t21-placeholder");
	By goButton=By.xpath("//button[contains(@type,'submit') and contains(@tabindex,'1')]");
	By crossButton=By.xpath("//button[contains(@name,'clear')]");
    By generalTab=By.xpath("//a[contains(@href,'#tab1')]");
    By locationEmployee=By.xpath("//select[contains(@name,'Employee.Location')]");
    By employeeFullName=By.cssSelector(".form-control#Employee_FullName");
    By employeeID=By.cssSelector(".form-control#Employee_EmployeeID");
    By supervisorDropdown=By.xpath("//select[contains(@name,'Employee.SupervisorID')]");
    By businessUnit=By.xpath("//select[contains(@name,'Employee.DefaultFirm')]");
    By department=By.xpath("//select[contains(@name,'Employee.Department')]");
    By address=By.cssSelector(".form-control#Employee_Address");
    By city=By.cssSelector(".form-control#Employee_City");
    By state=By.cssSelector(".form-control#Employee_State");
    By postal_Code=By.cssSelector(".form-control#Employee_Postal_Code");
    By country=By.cssSelector(".form-control#Employee_Country");
    By phone=By.cssSelector(".form-control#Employee_Phone");
    By email=By.cssSelector(".form-control#Employee_Email");
    By cancelButton=By.xpath("//button[contains(@class,'btn t21-btn-default pull-left')]");
    By addButton=By.xpath("//button[contains(@class,'btn t21-btn-primary t21-ajax-submit-button')]");
    By jobCodesTab=By.xpath("//a[contains(@href,'#tab2')]");
    By jobCodesDropdown=By.xpath("//a[contains(text(),'Human Resources Clerk')]");
    By otherTab=By.xpath("//a[contains(@href,'#tab3')]");
    By trainingLink=By.xpath("//*[@class='collapsible-icon t21-padding-right-5']");
    By uponSaveCheckbox=By.xpath("//*[@id='IsTraining']");
    
    By employeeSupervisorradioBtn=By.xpath("//*[@id='collapse-1']/div/div[2]/div/label");
    By otherSpecificSupervisorradioBtn=By.xpath("//*[@id='collapse-1']/div/div[3]/div[1]/label");
    
    By supervisorOtherTab=By.xpath("//*[@name='Supervisor']");
    By sendEmailNotification=By.xpath("//*[@id='IsEmailNotificationTobeSend']");
    By hireDate=By.xpath("//*[@id='Employee_HireDate']");
    By employeeType=By.xpath("//*[@name='Employee.EmploymentType']");
    By employeeForwardItemsTo=By.xpath("//*[@name='Employee.ForwardItemsTo']");
    By employeeStatus=By.xpath("//*[@name='Employee.Status']");
    By altEmployeeID=By.xpath("//*[@name='Employee.AltEmployeeID']");
    By createUserID=By.xpath("//*[@id='CreateUserId']");  
    
	By editButton = By.xpath("//a[contains(@href,'/Update?EmployeeID=akarshb')]");
    
    
   	public WebElement administrator_dropdown(WebDriver driver)
   	{
   		WebElement element=driver.findElement(administrator);
   		return element;
   	}
   	public WebElement administration_menue(WebDriver driver)
   	{
   		WebElement element=driver.findElement(administration);
   		return element;
   	}
   	public WebElement employees_menue(WebDriver driver)
   	{
   		WebElement element=driver.findElement(employees);
   		return element;
   	}
   	public WebElement addNew_Employee(WebDriver driver)
   	{
   		WebElement element=driver.findElement(addNew);
   		return element;
   	}
   	public WebElement general_Tab(WebDriver driver)
   	{
   		WebElement element=driver.findElement(generalTab);
   		return element;
   	}
   	public WebElement location_Field(WebDriver driver)
   	{
   		WebElement element=driver.findElement(locationTab);
   		return element;
   	}
   	public WebElement searchText_Box(WebDriver driver)
   	{
   		WebElement element=driver.findElement(searchBox);
   		return element;
   	}
   	public WebElement go_Button(WebDriver driver)
   	{
   		WebElement element=driver.findElement(goButton);
   		return element;
   	}
   	public WebElement cross_Button(WebDriver driver)
   	{
   		WebElement element=driver.findElement(crossButton);
   		return element;
   	}
   	public WebElement employee_Dropdown_LocTab(WebDriver driver)
   	{
   		WebElement element=driver.findElement(locationEmployee);
   		return element;
   	}
   	public WebElement employee_FullName(WebDriver driver)
   	{
   		WebElement element=driver.findElement(locationEmployee);
   		return element;
   	}
   	public WebElement supervisorDropdown_Field(WebDriver driver)
   	{
   		WebElement element=driver.findElement(supervisorDropdown);
   		return element;
   	}
   	public WebElement businessUnit_Dropdown(WebDriver driver)
   	{
   		WebElement element=driver.findElement(businessUnit);
   		return element;
   	}
   	public WebElement department_Dropdown(WebDriver driver)
   	{
   		WebElement element=driver.findElement(department);
   		return element;
   	}
   	public WebElement address_textbox(WebDriver driver)
   	{
   		WebElement element=driver.findElement(address);
   		return element;
   	}
   	public WebElement employee_City(WebDriver driver)
   	{
   		WebElement element=driver.findElement(city);
   		return element;
   	}
   	public WebElement employee_State(WebDriver driver)
   	{
   		WebElement element=driver.findElement(state);
   		return element;
   	}
   	public WebElement employee_PostalCode(WebDriver driver)
   	{
   		WebElement element=driver.findElement(postal_Code);
   		return element;
   	}
   	public WebElement employee_Country(WebDriver driver)
   	{
   		WebElement element=driver.findElement(country);
   		return element;
   	}
   	public WebElement employee_Phone(WebDriver driver)
   	{
   		WebElement element=driver.findElement(phone);
   		return element;
   	}
   	public WebElement employee_email(WebDriver driver)
   	{
   		WebElement element=driver.findElement(email);
   		return element;
   	}
   	public WebElement cancel_Btn(WebDriver driver)
   	{
   		WebElement element=driver.findElement(cancelButton);
   		return element;
   	}
   	public WebElement add_Btn(WebDriver driver)
   	{
   		WebElement element=driver.findElement(addButton);
   		return element;
   	}
   	public WebElement job_Codes(WebDriver driver)
   	{
   		WebElement element=driver.findElement(jobCodesTab);
   		return element;
   	}
   	public WebElement jobCode_Dropdown1(WebDriver driver)
   	{
   		WebElement element=driver.findElement(jobCodesDropdown);
   		return element;
   	}
   	public WebElement other_Tab(WebDriver driver)
   	{
   		WebElement element=driver.findElement(otherTab);
   		return element;
   	}
   	public WebElement trainingLink_Tab(WebDriver driver)
   	{
   		WebElement element=driver.findElement(trainingLink);
   		return element;
   	}
   	public WebElement uponSave_Checkbox(WebDriver driver)
   	{
   		WebElement element=driver.findElement(uponSaveCheckbox);
   		return element;
   	}
   	public WebElement employeeSupervisor_RadioBtn(WebDriver driver)
   	{
   		WebElement element=driver.findElement(employeeSupervisorradioBtn);
   		return element;
   	}
   	public WebElement otherSpecificSupervisor_RadioBtn(WebDriver driver)
   	{
   		WebElement element=driver.findElement(otherSpecificSupervisorradioBtn);
   		return element;
   	}
   	public WebElement sendEmail_Notification(WebDriver driver)
   	{
   		WebElement element=driver.findElement(createUserID);
   		return element;
   	}
   	
   	public WebElement hire_Date(WebDriver driver)
   	{
   		WebElement element=driver.findElement(hireDate);
   		return element;
   	}
   	public WebElement employee_type(WebDriver driver)
   	{
   		WebElement element=driver.findElement(employeeType);
   		return element;
   	}
   	public WebElement employee_ForwardItemsTo(WebDriver driver)
   	{
   		WebElement element=driver.findElement(employeeForwardItemsTo);
   		return element;
   	}
   	public WebElement employee_Status(WebDriver driver)
   	{
   		WebElement element=driver.findElement(employeeStatus);
   		return element;
   	}
   	public WebElement alt_Employee(WebDriver driver)
   	{
   		WebElement element=driver.findElement(altEmployeeID);
   		return element;
   	}
   	public WebElement create_UserID(WebDriver driver)
   	{
   		WebElement element=driver.findElement(createUserID);
   		return element;
   	}
   	public WebElement edit_BTN(WebDriver driver)
	{
		WebElement element=driver.findElement(editButton);
		return element;
	}
   	
   }
