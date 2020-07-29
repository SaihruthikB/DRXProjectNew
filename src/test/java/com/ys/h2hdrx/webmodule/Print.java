package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Print   {
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
	  @Test(priority=17)
	  public void Printbutton() throws Exception {
		 /* UserLogin us = new UserLogin();
			// System.out.println("getDriver"+Driver.getDriver());
			us.driver = driver;
			us.doctorLogin("CADARAH001", "password");
			 PatientSearch ps = new PatientSearch();
		      ps.driver = driver;
		      ps.patientSearch();*/
		  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		  obj.RxPad_tab.click();
		  obj.reset_LinkText.click();
		  Rxpad rx = new Rxpad();
	      rx.driver=driver;
		  rx.Confirmprescription();
		 obj.Print_lnkTxt.click();
		 System.out.println(obj.print_pouptxt());
		 if (obj.print_pouptxt()
					.contains("Drugs to be printed :")) {
				//tryPassScreenshot("SendToPharmacy");
				obj.send_close.click();
				obj.back_LinkText.click();
		 
				obj.medicationHistory_tab.click();
				System.out.println(obj.Firstdrug_txt());
				if ((obj.Firstdrug_txt().contains("Lipitor 80 MG Oral Tablet")) && (obj.MedicationHistoryStatus_txt().contains("P*S"))) {
					//tryPassScreenshot("SendToPharmacy in medication sowing as E*S");
				System.out.println("Wp_p_01");
				} else {
					/*WriteExcel.writepassfail("SendToPharmacy drug not stored in medication history",
							"Output Data/SanitytestResult.xls", "Fail");
					CaptureScreenshot.Capture("SendToPharmacy drug not stored in medication history", "sanityTesting");*/
				}
		 }
	  }
	  @BeforeTest
	  public void beforeTest() throws Exception {
		/*driver = Driver.browser("web");
			UserLogin us = new UserLogin();
			// System.out.println("getDriver"+Driver.getDriver());
			us.driver = driver;
			us.doctorLogin("MIDANAR001", "Pass@123");
			 System.out.println("print");
			 PatientSearch ps = new PatientSearch();
		      ps.driver = driver;
		      ps.patientSearch();*/
		     /* Rxpad rxp = new Rxpad();
		      rxp.driver=driver;
				 rxp.Confirmprescription();*/
	  }

	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }

	}
