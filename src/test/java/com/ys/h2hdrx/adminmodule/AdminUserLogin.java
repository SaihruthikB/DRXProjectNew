package com.ys.h2hdrx.adminmodule;

import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AdminLocators;
import com.ys.h2hdrx.webmodule.Driver;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class AdminUserLogin  {
	AdminLocators obj;
public WebDriver driver;
	// WebDriver driver;
	@Test
	public void AdminUserLogin() {
		obj = PageFactory.initElements(driver, AdminLocators.class);
		obj.userid_txt.sendKeys("admin");
		obj.password_txt.sendKeys("password");
		obj.adminlogin_btn.click();
	}

	public WebDriver driver() {
		return driver;
	}

	@BeforeTest
	public void beforeTest() {
		driver = Driver.browser("admin");

	}

	@AfterTest
	public void afterTest() {
	}

}
