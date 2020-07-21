package com.ys.h2hdrx.adminmodule;

import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AdminLocators;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Supervisior {

	private WebDriver driver;
	AdminLocators obj;

	@Test(priority = 1)
	public void f() {
		obj = PageFactory.initElements(driver, AdminLocators.class);
		obj.registerdoctor_tab.click();
	}

	@BeforeTest
	public void beforeTest() {
	/*	driver = Driver.browser("admin");	
		AdminUserLogin au = new AdminUserLogin();
		au.AdminUserLogin();*/
	}

	@AfterTest
	public void afterTest() {
		
	}

}
