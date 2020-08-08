package com.ys.h2hdrx.webmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToMedication  {
	Webmoduleobjects obj;

	public WebDriver driver;
	@Test(enabled = false)
	protected void tryPassScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data/Result TestCase1.xlsx", "Pass");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}

	@Test(enabled = false)
	protected void tryFailScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data/Result TestCase1.xlsx", "Fail");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}
	 @Test(priority=18)
	  public void Addtomedicationhistory() throws Exception {
	
		/* UserLogin us = new UserLogin();
			// System.out.println("getDriver"+Driver.getDriver());
			us.driver = driver;
			us.doctorLogin("CADARAH001", "password");
			 PatientSearch ps = new PatientSearch();
		      ps.driver = driver;
		      ps.patientSearch();*/
		 obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.RxPad_tab.click();
		  Rxpad rx = new Rxpad();
	      rx.driver=driver;
		  rx.Confirmprescription();
			obj.confirmscreen_prescriptionselect_name_txt.click();
			 obj.add2medicationHistory_btn.click();
			 obj.altclose_lnk.click();
			 obj.medicationHistory_tab.click();
		 if(obj.Firstdrug_txt().equalsIgnoreCase("Lipitor")&&(obj.MedicationHistoryStatus_txt().equalsIgnoreCase("A*S"))){
			 tryPassScreenshot("Addtomedicationhistory in medication sowing as A*S");
				System.out.println("sucess");
		 }
		 else{
			 
		 }
	  }
	 @BeforeTest
	 public void beforeTest() throws Exception {
		 driver = Driver.browser("web");
			UserLogin us = new UserLogin();
			// System.out.println("getDriver"+Driver.getDriver());
			us.driver = driver;
			
			us.doctorLogin("MIDANAR001", "Pass@123");
			 //System.out.println("add to medication");
			 PatientSearch ps = new PatientSearch();
		      ps.driver = driver;
		      ps.patientSearch();
		      /*Rxpad rxp = new Rxpad();
		      rxp.driver=driver;
				 rxp.Confirmprescription();*/
	  }

	  @AfterTest
	  public void afterTest() {
		  //driver.quit();
	  }

	}  

