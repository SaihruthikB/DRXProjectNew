package com.ys.h2hdrx.webmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PatientSearch {
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

	@Test(priority=3)
	public void patientSearch() throws Exception {
		
		//MyScreenRecorder.startRecording("PatientSearch");
		
		// obj.patientSearch_LinkText.click();
		// PassandFailtestcases.tryPassScreenshot("WM_PS_01");
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		// remove comments  after disable user 
		obj.search_btn.click();
		// System.out.println("obj.patientValidation()");
		if (obj.useridVal().contains("Patient ID or Last Name is required.")) {
			tryPassScreenshot("WM_PS_03");
		} else {
			tryFailScreenshot("WM_PS_03");
		}
		//obj.patientsearch_lastname_txt.sendKeys("98*/+");
		// remove comments  after disable user 
		obj.Search_LinkText.click();
		 if (obj.useridVal().contains("Last Name is invalid.")) {
			tryPassScreenshot("WM_PS_04");
		} else {
			tryFailScreenshot("WM_PS_04");
		}
		obj.patientsearch_lastname_txt.clear();
		obj.patientsearch_firstname_txt.sendKeys("98/*-+");
		obj.Search_LinkText.click();
		System.out.println(obj.useridVal());
		if (obj.useridVal().contains("Patient ID or Last Name is required.")) {
			tryPassScreenshot("WM_PS_05");
		} else {
			tryFailScreenshot("WM_PS_05");
		}
		obj.patientsearch_firstname_txt.clear();
		obj.patientsearch_lastname_txt.sendKeys("steve");
		obj.patientsearch_dob_txt.sendKeys("15/09/1998");
		obj.Search_LinkText.click();
		if (obj.useridVal().contains("Invalid Date Of Birth.")) {
			tryPassScreenshot("WM_PS_06");
		} else {
			tryFailScreenshot("WM_PS_06");
		}
		obj.patientsearch_lastname_txt.clear();
		obj.patientsearch_dob_txt.clear();
		obj.patientsearch_lastname_txt.sendKeys("steve");
		obj.patientsearch_dob_txt.sendKeys("1998/05/19");
		obj.Search_LinkText.click();
		if (obj.useridVal().contains("Invalid Date Of Birth.")) {
			tryPassScreenshot("WM_PS_07");
		} else {
			PassandFailtestcases.tryFailScreenshot("WM_PS_07");
		}
		obj.patientsearch_firstname_txt.clear();
		obj.patientsearch_dob_txt.clear();
		obj.patientsearch_lastname_txt.sendKeys("steve");
		obj.patientsearch_dob_txt.sendKeys("05/19/2025");
		obj.Search_LinkText.click();
		if (obj.useridVal().contains("Date Of Birth should not be a future date")) {
			tryPassScreenshot("WM_PS_08");
		} else {
			tryFailScreenshot("WM_PS_08");
		}
		try {
			obj.reset_LinkText.click();
			tryPassScreenshot("WM_PS_23");
		} catch (Exception e) {
			tryFailScreenshot("WM_PS_23");
		}
		obj.patientsearch_lastname_txt.sendKeys("a"); //schnur
		obj.patientsearch_dob_txt.sendKeys("08/25/2009"); //08/13/1956
		obj.Search_LinkText.click();
		tryPassScreenshot("WM_PS_09");
		WebdriverWait.implicitwait(10);
		try {
			if (obj.patientDOBinTable().contains("08/26/2009")) { //08/13/1956
				tryPassScreenshot("WM_PS_15");
			} else {
				tryFailScreenshot("WM_PS_15");
			}
		} catch (Exception e) {
			tryFailScreenshot("WM_PS_15");
		}
		try {
			obj.more_linktext.click();
			tryPassScreenshot("WM_PS_18");
			tryPassScreenshot("WM_PS_20");
		} catch (Exception e) {
			tryFailScreenshot("WM_PS_18");
		}
		try {
			obj.close_lnk.click();
			tryPassScreenshot("WM_PS_19");
		} catch (Exception e) {
			tryFailScreenshot("WM_PS_19");
		}
		try {
			obj.patient_select_link.click();
			WebdriverWait.implicitwait(10);
			tryPassScreenshot("WM_PS_21");
		} catch (Exception e) {
			tryFailScreenshot("WM_PS_21");
		}
		//MyScreenRecorder.stopRecording();
	}

	/*
	 * public WebDriver driver() { return driver; }
	 */

	@BeforeTest
	public void beforeTest() throws Exception {
//		driver = Driver.browser("web");
//		UserLogin us = new UserLogin();
//		 //System.out.println("getDriver"+Driver.getDriver());
//		us.driver = driver;
//		us.doctorLogin("MIDANAR001", "Pass@123");
	}

	@AfterTest
	public void afterTest() {
//driver.quit();
	}
}
