package com.ys.h2hdrx.lowprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.PatientSearch;
import com.ys.h2hdrx.webmodule.Rxpad;
import com.ys.h2hdrx.webmodule.UserLogin;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

public class Supervisior_sendtopharmacy {
	Webmoduleobjects obj;
	public WebDriver driver;
  @Test(priority=1)
  public void sendtopharmacy() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  Rxpad rx = new Rxpad();
	  rx.driver = driver;
	  rx.Confirmprescription();
	  obj.sendtophar_txt.click();
	 /* else{
			obj.disable_checkbox.click();
		    obj.edit_save.click();
		    obj.changepsw_back.click();
		    obj.edit_reset.click();
		    Supervisior_edit se = new Supervisior_edit();
		    se.driver=driver;
		    se.Supervisiordropdown();
		    if(obj.supdisable_firstone.equals("Select One")){
		    	System.out.println("supervisior is not disabled");
		    }
		    else{
		    	System.out.println("supervisior is disabled");
		    }
		}*/
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver.quit();
	  driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("TXNAWTR001", "Pass@123");
		 PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();
  }

  @AfterTest
  public void afterTest() {
  }

}
