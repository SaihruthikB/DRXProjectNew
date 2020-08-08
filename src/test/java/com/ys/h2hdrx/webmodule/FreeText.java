package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FreeText {
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
  @Test(priority=6)
  public void FreeText_Addtomedication() throws Exception {
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.freetext_tab.click();
	  obj.drugName_txt.sendKeys("happyd");
		obj.rxpad_quantity_txt.sendKeys("2");
		obj.useFreetext_btn.click();
		obj.sig_txt.sendKeys("take 1 tablet daily");
		new Select(obj.freeoct).selectByIndex(1);
		new Select(obj.qualifier_option).selectByIndex(2);
		obj.searchPharmacy_btn.click();
		Thread.sleep(2000);
		new Select(obj.drugSearch_state_txt).selectByVisibleText("California");
		obj.pharmacy_name_txt.sendKeys("ca");
		//Scroll.scrollDown(250);
		obj.searchPharmacy_btn.click();
		obj.capharmacy_lnk.click();
		obj.confirmPrescription_LinkText.click();
		WebdriverWait.implicitwait(10);
		driver.switchTo().alert().accept();
		obj.back_LinkText.click();
		obj.confirmPrescription_LinkText.click();
		WebdriverWait.implicitwait(10);
		driver.switchTo().alert().accept();
		obj.edit_btn.click();
		obj.confirmPrescription_LinkText.click();
		WebdriverWait.implicitwait(10);
		driver.switchTo().alert().accept();
		obj.viewRx_lnk.click();
		obj.close_lnk.click();
		obj.confirmscreen_prescriptionselect_name_txt.click();
		obj.add2medicationHistory_btn.click();
		Thread.sleep(2000);
		System.out.println(obj.print_pouptxt());
		if (obj.print_pouptxt().equalsIgnoreCase("Drugs added to medication history :")) {
			tryPassScreenshot("AddToMedicationHistory");
			obj.close_lnk.click();
			obj.medicationHistory_tab.click();
			if ((obj.Firstdrug_txt().contains("happyd")) && (obj.MedicationHistoryStatus_txt().contains("A * S"))) {
				tryPassScreenshot("Print in medicationhistory sowing as A*S");
			} else {
				WriteExcel.writepassfail("Printed drug is not showing in Medication History",
						"Output Data/SanitytestResult.xlsx", "Fail");
				CaptureScreenshot.Capture("Printed drug is not showing in Medication History", "sanityTesting");
			}
			obj.RxPad_tab.click();
		} else {
			WriteExcel.writepassfail("AddToMedicationHistory", "Output Data/SanitytestResult.xlsx", "Fail");
			CaptureScreenshot.Capture("AddToMedicationHistory", "sanityTesting");
			obj.RxPad_tab.click();
		}

	}
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
		PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
  }

  @AfterTest
  public void afterTest() {
  }

}
