package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Insurance {
	WebDriver driver;
	Webmoduleobjects obj;
  @Test
  public void InsuranceInfo() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.patientprofiletab.click();
	  obj.patientprofile_insurancetab.click();
	 /* obj.insurance_viewdetails.click();
	  System.out.println(obj.useridVal());*/
	  System.out.println(obj.insurance_noresultmsg());
	  if(obj.insurance_noresultmsg().equalsIgnoreCase("No results to display")){
		  obj.patientsearch_tab.click();
		  obj.patient_id.sendKeys("1");
		  obj.search_btn.click();
		  obj.patientsearch_patient.click();
		  obj.patientprofiletab.click();
		  obj.patientprofile_insurancetab.click();
		  obj.insurance_viewdetails.click();
		 // System.out.println(obj.useridVal());
	  }
		  if(obj.useridVal().equalsIgnoreCase("Please select an Insurance.")){
			  obj.insurance_radio.click();
			  obj.insurance_viewdetails.click();
			// System.out.println(obj.insurance_details());
		  }
			 if(obj.insurance_details().equalsIgnoreCase("Insurance Details")){
				 
				
				
		  }
			 obj.insurance_back.click(); 
		 
		 	//System.out.println(obj.insurance_results());
		  if(obj.insurance_results().equals("Results (page 1 of 1)")){
			  obj.insurance_back.click();
		  }
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*driver=Driver.browser("web");
      UserLogin us = new UserLogin();
	  us.driver = driver;
      //us.doctorLogin("midrhpn001", "password");
      us.doctorLogin("MIDANAR001", "Pass@123");
      PatientSearch ps = new PatientSearch();
      ps.driver=driver;
      ps.patientSearch();*/
  }

  @AfterTest
  public void afterTest() {
  }

}
