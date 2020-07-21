package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Practicefavoritedrug extends UserLogin {
  @Test(priority=11)
  public void Confirmprescription() throws Exception {
	  obj= PageFactory.initElements(driver, Webmoduleobjects.class);
	  Myprofile_favouritedrug mfd=new Myprofile_favouritedrug();
			  mfd.practicefavoritedrug();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
