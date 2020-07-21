package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Rxpad_Prescription {
	Webmoduleobjects obj;
	WebDriver driver;
  @Test
  public void Rxpad_Prescriptionreport() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.rxpad_prescriptionreport.click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
	  UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
		 PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();
*/  }

  @AfterTest
  public void afterTest() {
  }

}
