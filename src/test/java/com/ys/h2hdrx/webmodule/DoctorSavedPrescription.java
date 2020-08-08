package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class DoctorSavedPrescription  {
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
	int i;
	@Test(priority=21)
	  public void savedprescription() throws Exception {
		
		  obj=PageFactory.initElements(driver, Webmoduleobjects.class);
		 obj.RxPad_tab.click(); //need to remove for since execution
		 Rxpad rx = new Rxpad(); //need to remove
	   rx.driver=driver; //need to remove
		rx.Confirmprescription(); //need to remove
		 // tryPassScreenshot("WM_SPSP_01");
		  obj.save_lnkText.click(); //need to remove
		  obj.doctorsavedprescription_tab.click();
		  /*PatientSavedPrescription ps= new PatientSavedPrescription();
		  ps.savedprescription();*/
		  obj.confirm_but.click();
		  //trunk val
			//System.out.println(obj.docconfirm_savevali());
			 System.out.println(obj.useridVal());
			 //trunk val
			// if (obj.docconfirm_savevali().trim().equals("Please select Prescription to confirm")) {
			// if (obj.useridVal().trim().equals("Please select Prescription to confirm")) {
			 if (obj.useridVal().equals("Please select Prescription to confirm")) {
			 tryPassScreenshot(" WM_SPSP_07");
					
					WebElement WebElement = obj.docsaved_table;
					  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
					  
					  System.out.println(list1.size());
					  for(int i =1;i<=list1.size();i++){
					
					  System.out.println( obj.save_druglist(i));
					if(obj.save_druglist(i).trim().equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
						//obj.Detailslink.click();
						//obj.send_close.click();
						//obj.savepharmacy_link.click();
						obj.medication_checkboxes(i).click();
						obj.confirm_but.click();
						tryPassScreenshot(" WM_SPSP_08");
						obj.sendtophar_txt.click();
						obj.send_close.click();
					}
					 break;
						}
						
					 obj.doctorsavedprescription_tab.click();
						 
						 obj.selectall_checkbox.click();
						 obj.savedreset_btn.click();
						 tryPassScreenshot(" WM_SPSP_09");
						 obj.savedremove_but.click();
						 //trunk val
					//System.out.println(obj.docconfirm_savevali());
						 System.out.println(obj.useridVal());
						 //trunk val
						//if(obj.docconfirm_savevali().trim().equals("Please select a Prescription.")) {
						
						  for(int i =1;i<=list1.size();i++){
						
						  System.out.println( obj.save_druglist(i));
						 if(obj.useridVal().equals("Please select a Prescription.")) {
							 tryPassScreenshot(" WM_SPSP_10");
							if(obj.save_druglist(i).trim().equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
								obj.medication_checkboxes(i).click();
								obj.savedremove_but.click();
								 tryPassScreenshot(" WM_SPSP_11");
								
								
								 break;
							}
						
						 }
						 
							}
						
			 obj.savedback_but.click();
				tryPassScreenshot("WM_SPSP_05");
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
