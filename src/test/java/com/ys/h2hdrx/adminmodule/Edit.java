package com.ys.h2hdrx.adminmodule;

import org.testng.annotations.Test;

import com.ys.h2hdrx.lowprofile.AdminEdit;
import com.ys.h2hdrx.webmodule.AdminLocators;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Edit {
	WebDriver driver;
	AdminLocators obj;
  @Test
  public void edit_allbuttons () {
	  AdminEdit ae = new AdminEdit();
	  ae.driver =driver;
	  ae.Admin_disable();
	  ae.Admin_searchdoctor();
	  obj.edit_save.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
