package org.title21.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.title21.utility.BaseClass;

public class WizardPage_POM extends BaseClass{
	public BaseClass baseClassObj=new BaseClass();
	public WebDriver driver;
	WebElement element;
	
	public WizardPage_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".dropdown-toggle.t21-nav-bar-dropdown")
	WebElement administratordropdown;
	
	@FindBy(xpath =".//*[@id='Settings']/a")
	WebElement settinglink;
	
	@FindBy(xpath =".//*[@id='OpenWizardOnStartUp']")
	WebElement wizardcheckbox;
	
	@FindBy(css =".modal-title")
	WebElement modeltext;
	
	@FindBy(xpath =".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3[1]")
	WebElement trainingtextonmodel;
	
	@FindBy(css =".t21-btn-primary.btn-lg.btn.t21-top-split")
	WebElement starttrainingnowbutton;
	
	@FindBy(xpath =".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3[2]")
	WebElement approveltextmodel;
	
	@FindBy(xpath =".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/a[2]")
	WebElement approvalbutton;
	
	@FindBy(xpath =".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3[3]")
	WebElement reviewingtextmodel;
	
	@FindBy(xpath =".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/a[3]")
	WebElement reviewingbutton;

	public WebElement verifWizard(WebDriver driver, String vrifytrxt) {
		List<WebElement> list = driver
				.findElements(By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3"));
		int size = list.size();
		//element = driver.findElement(modeltext);
		String text = modeltext.getText();
		System.out.println(text);
		if (text.equals("Title21 Wizard")) {
			

			List<WebElement> button = driver
					.findElements(By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/a"));
			int bsize = button.size();
			for (int i = 0; i < size; i++) {
				String veifytext = list.get(i).getText();
				System.out.println(veifytext);

				if (veifytext.equals(vrifytrxt)) {

					for (int j = i; j < bsize; j++) {

						button.get(j).click();
						System.out.println(j);

						break;
					}
				}

			}

		} else {
			administratordropdown.click();
		}

		return element;
	}

}
