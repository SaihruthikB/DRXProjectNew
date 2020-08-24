package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class SendandPrint {
	Webmoduleobjects obj;

	WebDriver driver;
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
	@Test(priority=15)
	 public void Sendandprintbutton() throws Exception  {
		  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.RxPad_tab.click();  /// These two lines to be used when we run it for regression.
		 obj.reset_LinkText.click(); /// These two lines to be used when we run it for regression.
		  Rxpad rx = new Rxpad();
	      rx.driver=driver;
		  rx.Confirmprescription();

			 obj.sendAndPrint_lnkTxt.click();
			// System.out.println(obj.trxn_sucess_msg());
			 if (obj.trxn_sucess_msg()
						.contains("(TRANSACTION SUCCESSFUL ; ACCEPTED AND VERIFIED BY ULTIMATE RECEIVER)")) {
			
			 		//tryPassScreenshot("SendToPharmacy");
				 obj.send_close.click();
				 obj.back_LinkText.click();
					obj.medicationHistory_tab.click();
			 }		
			 else{
			 }
					if ((obj.Firstdrug_txt().contains("Lipitor")) && (obj.MedicationHistoryStatus_txt().equals("E*S"))) {
						tryPassScreenshot("SendToPharmacy in medication sowing as E*S");
					System.out.println("sucess");
					} else {
						/*WriteExcel.writepassfail("SendToPharmacy drug not stored in medication history",
								"Output Data/SanitytestResult.xls", "Fail");*/
						CaptureScreenshot.Capture("SendToPharmacy drug not stored in medication history", "sanityTesting");
					}
			 
			 
	  }
	  @BeforeTest
	  public void beforeTest() throws Exception {
		 /*driver = Driver.browser("web");
			UserLogin us = new UserLogin();
			// System.out.println("getDriver"+Driver.getDriver());
			us.driver = driver;
			us.doctorLogin("MIDANAR001", "Pass@123");
			 System.out.println("send and print");
			 PatientSearch ps = new PatientSearch();
		      ps.driver = driver;
		      ps.patientSearch();*/
		    /*  Rxpad rxp = new Rxpad();
		      rxp.driver=driver;
				 rxp.Confirmprescription();*/
	  }

	  @AfterTest
	  public void afterTest() {
	  
	  }
}
