package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SSMedicationhistory  {
	WebDriver driver;
	Webmoduleobjects obj;
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
	  public void pbm() throws Exception {
	// MyScreenRecorder.startRecording("SSMedicationHistory");
	obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	 //System.out.println(obj.patient_benefit());
	  try{
	 obj.ssmedicationhistory_tab.click();
	 
	 //tryPassScreenshot("WM_SSPBM_01");
	 obj.ssmedicationhistory_help.click();
	// tryPassScreenshot("WM_SSPBM_02");
	 //Thread.sleep(2000);
	 obj.close_lnk.click();
	 // tryFailScreenshot("WM_SSPBM_03");
	 }catch (Exception e){
	 //tryFailScreenshot("WM_SSPBM_01");
	 // tryFailScreenshot("WM_SSPBM_02");
	 // tryFailScreenshot("WM_SSPBM_03");
	 }}
	  @Test(priority=7)
	 public void ssmedicationhistoryinfo() throws Exception {
	 obj.ssmedicationhistory_gethistory.click();
	 Thread.sleep(20000);
	System.out.println(obj.useridVal());

	 if(obj.useridVal().equals("Medication History cannot be displayed without patient's consent.")){
	 

	 Select pbm = new Select(obj.ssmedicationhistory_content);

	pbm.selectByIndex(1);

	 //tryPassScreenshot("WM_SSPBM_04");
	 obj.ssmedicationhistory_gethistory.click();
	// tryPassScreenshot("WM_SSPBM_04");
	 WebElement web=obj.ssmedicationhistory_pbmwebtable;
	 List<WebElement> list=web.findElements(By.tagName("tr"));
	 System.out.println(list.size());

	 for(int i =1;i<=list.size();i++){
	/*System.out.println(obj.ssm_druglist(i));
	System.out.println(obj.ssm_date(i));*/
	if(obj.ssm_druglist(i).trim().equals("Prednisone 5 mg tablet")){
	obj.ssm_druglists(i).click();
	obj.confirm_but.click();
	break;
	}


	else if(obj.useridVal().equals("SIG Information is required.")){


	try{
	Select dose= new Select(obj.dose_option);
	dose.selectByIndex(5);
	tryPassScreenshot("WM_RX_37");
	}catch(Exception e){
	tryFailScreenshot("WM_RX_37");
	}
	try{
	Select delivery= new Select(obj.delivery_option);
	delivery.selectByIndex(5);
	tryPassScreenshot("WM_RX_36");
	}catch(Exception e){
	tryFailScreenshot("WM_RX_36");
	}
	try{
	Select units= new Select(obj.units_option);
	units.selectByIndex(5);
	tryPassScreenshot("WM_RX_38");
	}catch(Exception e){
	tryFailScreenshot("WM_RX_38");
	}
	try{
	Select freq= new Select(obj.freq_option);
	freq.selectByIndex(5);
	tryPassScreenshot("WM_RX_39");
	}catch(Exception e){
	tryFailScreenshot("WM_RX_39");
	}
	obj.confirm_but.click();
	obj.sendtophar_txt.click();
	obj.altclose_lnk.click();
	}
	//System.out.println(obj.drugsearch_vali());

	obj.sendToPharmacy_lnkTxt.click();
	}


	 obj.sendToPharmacy_lnkTxt.click();


	 
	 }
	 //System.out.println(obj.ssmed_records());
	 
	  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
       driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
	    us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
		 System.out.println("ss medication");
//		 PatientSearch ps = new PatientSearch();
//	      ps.driver = driver;
//	      ps.patientSearch();
		 BenefitPatientsearch bp = new BenefitPatientsearch();
		 bp.driver= driver;
		 bp.Benefitpatient();
  }

  @AfterTest
  public void afterTest() {
	 //driver.quit();
  }

}
