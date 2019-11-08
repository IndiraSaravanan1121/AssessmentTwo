package com.tutorialsninja.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tutorialsninja.utils.TestBase;

public class Helper extends TestBase {
	
	WebElement webElement;
	
	public WebElement findLocator(WebDriver driver,String LocatorType) {
		String[] Locator=LocatorType.split(":");
		
		try {
			switch (Locator[0]) {
			case "class":
				element=driver.findElement(By.className(Locator[1]));
				break;
			case "css":
				element=driver.findElement(By.cssSelector(Locator[1]));
				break;
			case "id":
				element=driver.findElement(By.id(Locator[1]));
				break;
			case "linktext":
				element=driver.findElement(By.linkText(Locator[1]));
				break;
			case "name":
				element=driver.findElement(By.name(Locator[1]));
				break;
			case "partiallinktext":
				element=driver.findElement(By.partialLinkText(Locator[1]));
				break;
			case "tagname":
				element=driver.findElement(By.tagName(Locator[1]));
				break;
			case "xpath":
				element=driver.findElement(By.xpath(Locator[1]));
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}return element;
	}
	
	public void clickElement(WebDriver driver,String element) {
		webElement = findLocator(driver, element);
		webElement.click();
	}
}

