package com.ys.h2hdrx.lowprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AddToMedication;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.PatientSearch;
import com.ys.h2hdrx.webmodule.UserLogin;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

public class DefaultPhysicain {
	Webmoduleobjects obj;
	WebDriver driver;
  @Test(priority=1)
  public void Rxpad_DefaultPhysicain() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.patientsearch_tab.click();
	  PatientSearch ps = new PatientSearch();
      ps.driver = driver;
      ps.patientSearch();
	  obj.deafaultphysician_tab.click();
      Select list = new Select(obj.deafaultphysician_list);
      list.selectByIndex(6);
      obj.save_lnkText.click();
     // System.out.println(obj.defaultphysician_sucess);
     // obj.mh_back_btn.click();
      //*[@id='defaultPhysicianId']/option[7]
      String str = driver.findElement(By.xpath("//*[@id='formPatientProfileTabs']/table/tbody/tr[5]/td[2]/select/option[7]")).getText();
      System.out.println(str);
      if(str.equalsIgnoreCase("Alabama Physician")){
    	  obj.mh_back_btn.click();
    	
    	
    	  AddToMedication ad = new AddToMedication();
    	  ad.driver = driver;
    	  ad.Addtomedicationhistory();
      }
    	 
      else{
    	  obj.mh_back_btn.click();
    	  System.out.println(obj.lowprofile_supervisior());
    	  if(obj.lowprofile_supervisior().equals("Alex Hales")){
    		  System.out.println("default physician name is same as supervisior drop dwon");
    	  AddToMedication ad = new AddToMedication();
    	  ad.driver = driver;
    	  ad.Addtomedicationhistory(); 
    	  }
    	  else{
    		  System.out.println("default physician name is not same as supervisior drop dwon");
    	  }
      }

      
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("CSISH001", "Pass@123");
		 PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();
	    
  }

  @AfterTest
  public void afterTest() {
  }

}
