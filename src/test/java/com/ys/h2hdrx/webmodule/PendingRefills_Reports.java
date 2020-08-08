package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class PendingRefills_Reports {
	Webmoduleobjects obj;
	WebDriver driver;
  @Test
  public void PendingRefills_Reports() {
	  
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.reports_tab.click();
      obj.reports_pendingrefilltab.click();
      //System.out.println(obj.report_savedocotor());
	  obj.search_btn.click();
	 
	  if (obj.useridVal().contains("Last Name is required.")) {
  		
  		obj.reset_LinkText.click();
  		try{
  		if(obj.report_savedocotor().equals("arban  amer.")){
  			System.out.println("doctor name is  there");
  			obj.generatereport_but.click();
  			WebdriverWait.implicitwait(2000);
  			obj.reports_back.click();
  		}
  		}catch(NoSuchElementException ne){
  			System.out.println("doctor name is not there");
  			obj.generatereport_but.click();
  			WebdriverWait.implicitwait(2000);
  			obj.reports_back.click();
  		}
  }
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");*/
  }

  @AfterTest
  public void afterTest() {
  }

}
