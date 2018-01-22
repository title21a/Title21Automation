
package org.title21.POM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports 
{	protected WebDriver driver;
	protected WebElement element;
	By reportslink=By.cssSelector("#NavReports>a>span");
	By reporttitle=By.cssSelector(".t21-js-tutorial-info");
	By reportlinks=By.xpath(".//*[@id='t21-workarea']/div/div/div/div[2]/div[3]/table/tbody/tr/td/a");
	public WebElement reportsLink(WebDriver driver)
	{
		element=driver.findElement(reportslink);
		return element;
	}
	public WebElement reportTitle(WebDriver driver)
	{
		element=driver.findElement(reporttitle);
		String title = element.getText();
		if(title.equals("Reports "))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		return element;
	}
	public WebElement reportLinks(WebDriver driver)
	{
		List<WebElement> links = driver.findElements(reportlinks);
		int linksize = links.size();
		for(int i=0;i<linksize;i++)
		{
			String linkslist = links.get(i).getText();
			System.out.println(linkslist);
			
		}
		return element;
		
	}
}
