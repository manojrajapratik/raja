package com.pom.MavenActitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.MavenActitime.AutoConst;
import com.generic.MavenActitime.BasePag;
import com.generic.MavenActitime.ExcelLib;

public class ActiTimepom extends ExcelLib implements AutoConst{
	
	BasePag basePag=new BasePag();

	WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='remember']")
	private WebElement checkbox;

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement login;

	public ActiTimepom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void loginMethod() throws IOException {
		username.sendKeys(ExcelLib.readSheet(sheet_name, 1,0));
		password.sendKeys(ExcelLib.readSheet(sheet_name, 1,1));
		basePag.click(driver, checkbox);
		basePag.click(driver, login);
	}

}
