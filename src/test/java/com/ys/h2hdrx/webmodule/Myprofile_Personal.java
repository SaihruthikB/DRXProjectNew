package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Myprofile_Personal { 
	Webmoduleobjects obj;
	WebDriver driver;
	@Test(enabled = false)
	protected void tryPassScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data/Result TestCase1.xlsx", "Pass");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}
	@Test(enabled = false)
	protected void tryFailScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data/Result TestCase1.xlsx", "Fail");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}
	@Test(priority=7)
	  
	  
	  public void PersonalProfile() throws Exception {
		  obj= PageFactory.initElements(driver, Webmoduleobjects.class);

	      try {
	    	 obj.myprofile_lnk.click();
	    	  obj.myprofile_personalprofiel.click();
			tryPassScreenshot("WM_PP_01");
		} catch (Exception e) {
			 tryFailScreenshot("WM_PP_01");  
		}
	  }  @BeforeTest
  public void beforeTest() throws Exception {
		 /* driver = Driver.browser("web");
		   UserLogin us = new UserLogin();
		  us.driver = driver;
			us.doctorLogin("MIDANAR001", "Pass@123");*/
		
  }

  @AfterTest
  public void afterTest() {
  }

}
