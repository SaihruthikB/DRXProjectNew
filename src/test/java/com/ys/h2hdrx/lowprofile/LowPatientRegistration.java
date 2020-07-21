package com.ys.h2hdrx.lowprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AddToMedication;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.PatientRegistration;
import com.ys.h2hdrx.webmodule.Rxpad;
import com.ys.h2hdrx.webmodule.UserLogin;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

public class LowPatientRegistration {
	Webmoduleobjects obj;
	WebDriver driver;
  @Test
  public void LowPatientRegistration() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.patientsearch_lastname_txt.sendKeys("sridhar");
	  obj.search_btn.click();
	  String patientname =obj.search_patientlink.getText();
	 // System.out.println(patientname);
	  if(patientname.equalsIgnoreCase("maddi sridhar")){
		  obj.search_patientlink.click();
	  
	  obj.deafaultphysician_tab.click();
	  String str = driver.findElement(By.xpath("//*[@id='formPatientProfileTabs']/table/tbody/tr[5]/td[2]/select/option[1]")).getText();
      System.out.println(str);
      if(str.equalsIgnoreCase("Select One")){
    	  obj.mh_back_btn.click();
    	  Rxpad rx = new Rxpad();
    	  rx.driver = driver;
    	  rx.Confirmprescription();
    	  AddToMedication ad = new AddToMedication();
    	  ad.driver = driver;
    	  ad.Addtomedicationhistory();
    	
    	  String supervisior = driver.findElement(By.xpath("//*[@id='blueLinks']/select/option[1]")).getText();
    	  System.out.println(supervisior);
    	  obj.medicationHistory_tab.click();
    	  String status = driver.findElement(By.xpath("//*[@id='tooltipTD']")).getText();
    	  System.out.println(status);
    	  String physician = driver.findElement(By.xpath("//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[8]")).getText();
    	  System.out.println(physician);
     if(status.equalsIgnoreCase("A * S")&&physician.equalsIgnoreCase(physician)){
    	  
      }}}
	  else{
		  PatientRegistration pr = new PatientRegistration();
	      pr.driver=driver;
	      pr.PatientRegistration();
	  }
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = Driver.browser("web");
	   UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("CSISH001", "Pass@123");
		
	     /* PatientRegistration pr = new PatientRegistration();
	      pr.driver=driver;
	      pr.PatientRegistration();*/
  }
  

  @AfterTest
  public void afterTest() {
  }

}
