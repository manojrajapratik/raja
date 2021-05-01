package com.generic.MavenActitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTests implements AutoConst {

	public WebDriver driver;

	@BeforeMethod
	public void loginMethod() {

		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

}
