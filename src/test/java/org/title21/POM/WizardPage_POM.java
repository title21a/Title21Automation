package org.title21.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WizardPage_POM {
	WebElement element;
	By administratordropdown = By.cssSelector(".dropdown-toggle.t21-nav-bar-dropdown");
	By settinglink = By.xpath(".//*[@id='Settings']/a");
	By wizardcheckbox = By.xpath(".//*[@id='OpenWizardOnStartUp']");
	By modeltext = By.cssSelector(".modal-title");
	By trainingtextonmodel = By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3[1]");
	By starttrainingnowbutton = By.cssSelector(".t21-btn-primary.btn-lg.btn.t21-top-split");
	By approveltextmodel = By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3[2]");
	By approvalbutton = By.cssSelector(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/a[2]");
	By reviewingtextmodel = By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3[3]");
	By reviewingbutton = By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/a[3]");

	public WebElement verifWizard(WebDriver driver, String vrifytrxt) {
		List<WebElement> list = driver
				.findElements(By.xpath(".//*[@id='t21-workarea']/div/div/div[2]/div/div/div[2]/div/h3"));
		int size = list.size();
		element = driver.findElement(modeltext);
		String text = element.getText();
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
			driver.findElement(administratordropdown).click();
		}

		return element;
	}

}
