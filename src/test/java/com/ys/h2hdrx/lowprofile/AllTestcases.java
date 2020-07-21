package com.ys.h2hdrx.lowprofile;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.UserLogin;

public class AllTestcases {
	WebDriver driver;
	 /*@Test(priority=2)
	  public void defaultphysician() throws Exception {
		  DefaultPhysicain df = new DefaultPhysicain();
		  df.driver=driver;
		  df.Rxpad_DefaultPhysicain();
	  }*/
  @Test(priority=1)
  public void userlogin() throws Exception {
	  UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("CSISH001", "Pass@123");
  }
 /* @Test(priority=3)
  public void AdminEdit() throws Exception {
	  AdminEdit ae = new AdminEdit();
		// System.out.println("getDriver"+Driver.getDriver());
		ae.driver = driver;
		ae.Admin_disable();
		ae.Admin_searchdoctor();
  }*/
  @Test(priority=4)
  public void LowMedicationHistory() throws Exception {
	  LowMedicationHistory lm = new LowMedicationHistory();
		// System.out.println("getDriver"+Driver.getDriver());
		lm.driver = driver;
		lm.disable_sentopharmacy();
		
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
