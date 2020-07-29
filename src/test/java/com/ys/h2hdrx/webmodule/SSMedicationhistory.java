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
	  if(obj.patient_benefit().trim().equals("RXHUBPBM-PLANABX")){
		 
	  }
	  try{
	  obj.ssmedicationhistory_tab.click();
	  tryPassScreenshot("WM_SSPBM_01");
	  }catch (Exception e){
		  tryFailScreenshot("WM_SSPBM_01");
	  }
	  try{
	  obj.ssmedicationhistory_help.click();
	  tryPassScreenshot("WM_SSPBM_02");
	  obj.close_lnk.click();
	  }catch (Exception e){
		  tryFailScreenshot("WM_SSPBM_02");
	  }
	  tryPassScreenshot("WM_SSPBM_03");
	  Select ssm=new Select(obj.ssmedicationhistory_content);
	  ssm.selectByIndex(1);
	  tryPassScreenshot("WM_SSPBM_04");
	  obj.ssmedicationhistory_gethistory.click();
	 tryPassScreenshot("WM_SSPBM_04");
	/* if(obj.user_val.equals("Patient not eligible for SS medication history request.")){
		 obj.ssmed_fillradiobutton.click();
		  Select ssm1=new Select(obj.ssmedicationhistory_content);
		  ssm1.selectByIndex(1);
		  obj.ssmedicationhistory_gethistory.click();
		  obj.SSMH_BacktoMH.click();
		  tryPassScreenshot("WM_SSFILL_05");
		  obj.ssmed_fillradiobutton.click();
		  Select ssm2=new Select(obj.ssmedicationhistory_content);
		  ssm.selectByIndex(0);
		  obj.ssmedicationhistory_gethistory.click();
		 // System.out.println(obj.ssmedicationhistory_val());
		 // obj.confirm_but.click();
		  if(obj.useridVal().trim().equals("Medication History cannot be displayed without patient's consent.")){
			 tryPassScreenshot("WM_SSPBM_06");
			   
		  } 
	 }
	 else{*/

		 obj.ssmed_pbmbackbutton.click();
	 
	 tryPassScreenshot("WM_SSPBM_05");
	  obj.ssmedicationhistory_gethistory.click();

	  WebElement web=obj.ssmedicationhistory_pbmwebtable;
	  List<WebElement> list=web.findElements(By.tagName("tr"));
	  System.out.println(list.size());

	  for(int i =1;i<=list.size();i++){
		 /*System.out.println(obj.ssm_druglist(i));
		 System.out.println(obj.ssm_date(i));*/
		 if(obj.ssm_druglist(i).trim().equals("NOVOLOG FLEXPEN SYRINGE")){
			 obj.ssm_druglists(i).click();
			 obj.confirm_but.click();
			 //System.out.println(obj.drugsearch_vali());
			if(obj.useridVal().equals("SIG Information is required.")){
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
			 break;

		 }
	  }
	  
  
	  obj.ssmedicationhistory_tab.click();
	  obj.ssmedicationhistory_gethistory.click();
	 // System.out.println(obj.ssmedicationhistory_val());
	 // obj.confirm_but.click();
	  if(obj.useridVal().trim().equals("Medication History cannot be displayed without patient's consent.")){
		 tryPassScreenshot("WM_SSPBM_06");
		   
	  }
	  
  }
  @Test(priority=7)
  public void fills() throws Exception {
	  
	  //obj.ssmedicationhistory_tab.click();
	// tryPassScreenshot("WM_SSFILL_01");
	  obj.ssmed_fillradiobutton.click();
	  Select ssm=new Select(obj.ssmedicationhistory_content);
	  ssm.selectByIndex(1);
	  obj.ssmedicationhistory_gethistory.click();
	  obj.SSMH_BacktoMH.click();
	  tryPassScreenshot("WM_SSFILL_05");
	  obj.ssmed_fillradiobutton.click();
	  Select ssm1=new Select(obj.ssmedicationhistory_content);
	  ssm.selectByIndex(0);
	  obj.ssmedicationhistory_gethistory.click();
	 // System.out.println(obj.ssmedicationhistory_val());
	 // obj.confirm_but.click();
	  if(obj.useridVal().trim().equals("Medication History cannot be displayed without patient's consent.")){
		 tryPassScreenshot("WM_SSPBM_06");
		   
	  }
	  //MyScreenRecorder.stopRecording();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
//	driver = Driver.browser("web");
//		UserLogin us = new UserLogin();
//		// System.out.println("getDriver"+Driver.getDriver());
//		us.driver = driver;
//		us.doctorLogin("MIDANAR001", "Pass@123");
//		 System.out.println("ss medication");
//		 PatientSearch ps = new PatientSearch();
//	      ps.driver = driver;
//	      ps.patientSearch();
  }

  @AfterTest
  public void afterTest() {
	 //driver.quit();
  }

}
