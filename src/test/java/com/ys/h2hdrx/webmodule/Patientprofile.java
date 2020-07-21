package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Patientprofile {
	Webmoduleobjects obj;

	WebDriver driver;

  @Test
  public void Patientprofile_patientinforamtion() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.patientprofiletab.click();
	  obj.zip.clear();
		obj.zip.sendKeys("34545");
	  obj.update.click();
//System.out.println(obj.personalsucess());
	  if(obj.personalsucess().equalsIgnoreCase("Your profile has been modified.")){
		  obj.savedback_but.click();
		  
	  }

  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*driver=Driver.browser("web");
      UserLogin us = new UserLogin();
	  us.driver = driver;
      us.doctorLogin("MIDANAR001", "password");
      PatientSearch ps = new PatientSearch();
      ps.driver=driver;
      ps.patientSearch();*/
     
  }

  @AfterTest
  public void afterTest() {
  }

}
