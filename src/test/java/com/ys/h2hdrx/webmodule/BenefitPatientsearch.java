package com.ys.h2hdrx.webmodule;
//package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class BenefitPatientsearch {
	
	Webmoduleobjects obj;

	  public WebDriver driver;

	  @Test
	   public void Benefitpatient() throws InterruptedException {
	 
	  //MyScreenRecorder.startRecording("PatientSearch");
	 
	  // obj.patientSearch_LinkText.click();
	  // PassandFailtestcases.tryPassScreenshot("WM_PS_01");
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.patientsearch_lastname_txt.sendKeys("ac");
	  obj.search_btn.click();
	  WebElement patientinfo = obj.patientinfo_table;
	  List<WebElement> patient = patientinfo.findElements(By.xpath("tr"));
	  System.out.println(patient.size());
	  for(int i=1;i<=patient.size();i++){
	  System.out.println(obj.patientid(i));
	  System.out.println(obj.patietname(i));
	  if(obj.patientid(i).trim().equalsIgnoreCase("PatientT..")&&(obj.patietname(i)).trim().equalsIgnoreCase("Rowena Acacianna")){
	  obj.patientnames(i).click();
	Thread.sleep(2000);
	 
	  }
	 
	  }
	 
	    }

	  /*
	  * public WebDriver driver() { return driver; }
	  */

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
	 //driver.quit();
	  }
	 

	  }
