package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DefaultPhysician {
	Webmoduleobjects obj;

	WebDriver driver;

  @Test(priority=20)
  public void DefaultPhysician_save() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.deafaultphysician_tab.click();
      Select list = new Select(obj.deafaultphysician_list);
      list.selectByIndex(5);
      obj.save_lnkText.click();
     // System.out.println(obj.defaultphysician_sucess);
      obj.mh_back_btn.click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver=Driver.browser("web");
      UserLogin us = new UserLogin();
	  us.driver = driver;
      us.doctorLogin("midrhpn001", "Pass@123");
      System.out.println("default physician");
      PatientSearch ps = new PatientSearch();
      ps.driver=driver;
      ps.patientSearch();*/
  }

  @AfterTest
  public void afterTest() {
  }

}
