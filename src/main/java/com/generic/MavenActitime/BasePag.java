package com.generic.MavenActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePag {

	public void selectByVisibleText(WebElement element, String text) {

		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void click(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.click(element).perform();
	}

}
