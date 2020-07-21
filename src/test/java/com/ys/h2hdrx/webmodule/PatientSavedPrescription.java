package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class PatientSavedPrescription {
	Webmoduleobjects obj;

	WebDriver driver;
	@Test(enabled = false)
	protected void tryPassScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data\\Result TestCase.xlsx", "Pass");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}

	@Test(enabled = false)
	protected void tryFailScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data\\Result TestCase.xlsx", "Fail");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}
	 @Test(priority=8)
	  public void save() throws Exception  {
		
	      
		 
		 obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		  obj.RxPad_tab.click();
		  Rxpad rx = new Rxpad();
	      rx.driver=driver;
		  rx.Confirmprescription();
		 // tryPassScreenshot("WM_SPSP_01");
		  obj.save_lnkText.click();
		 // tryPassScreenshot("WM_SPSP_02");
		  System.out.println(obj.trxn_sucess_msg());
		  if (obj.trxn_sucess_msg().equalsIgnoreCase("Lipitor 80 MG Oral Tablet")) {
				
			  obj.send_close.click();
			//	tryPassScreenshot("WM_SPSP_03");
				obj.savedPrescriptionsPatient_tab.click();
				
			//	tryPassScreenshot("WM_SPSP_04");
				 
				  
				  }
	  }
		 @Test(priority=9)
		  public void savedprescription() throws Exception  {
			
			  obj.confirm_but.click();
				//System.out.println(obj.confirm_savevali());
				 
				 if (obj.useridVal().equals("Please select Prescription to confirm")) {
					//tryPassScreenshot(" WM_SPSP_07");
						
						WebElement WebElement = obj.Saved_table;
						  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
						  
						  System.out.println(list1.size());
						  for(int i =1;i<=list1.size();i++){
						 // obj.medication_druglist(i);
						  System.out.println( obj.Savedprescriptiondrug(i));
						if(obj.Savedprescriptiondrug(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
							/*obj.Detailslink.click();
							obj.close_lnk.click();*/
							obj.savepharmacy_link.click();
							obj.confirm_but.click();
							//tryPassScreenshot(" WM_SPSP_08");
							obj.sendtophar_txt.click();
							obj.send_close.click();
						}
						/* Rxpad rx = new Rxpad();
					      rx.driver=driver;
						  rx.Confirmprescription(); 
						  obj.save_lnkText.click();
						  System.out.println(obj.trxn_sucess_msg());
						  if (obj.trxn_sucess_msg().equalsIgnoreCase("Lipitor 80 MG Oral Tablet")) {
								
							  obj.send_close.click();
								//tryPassScreenshot("WM_SPSP_03");
								obj.savedPrescriptionsPatient_tab.click();
							obj.savedPrescriptionsPatient_tab.click();
						  }
							if(obj.Savedprescriptiondrug(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
							obj.medication_checkboxes(i).click();  
							obj.confirm_but.click();
							//tryPassScreenshot(" WM_SPSP_08");
							obj.sendtophar_txt.click();
							obj.send_close.click();*/
							 Rxpad rx1 = new Rxpad();
							rx1.driver=driver;
							  rx1.Confirmprescription(); 
							  obj.save_lnkText.click();
							  System.out.println(obj.trxn_sucess_msg());
							  if (obj.trxn_sucess_msg().equalsIgnoreCase("Lipitor 80 MG Oral Tablet")) {
									
									obj.send_close.click();
									//tryPassScreenshot("WM_SPSP_03");
									obj.savedPrescriptionsPatient_tab.click();
							
							  }
							
							 
							 obj.selectall_checkbox.click();
							 obj.savedreset_btn.click();
							// tryPassScreenshot(" WM_SPSP_09");
							 obj.savedremove_but.click();
					
						System.out.println(obj.useridVal());
							if(obj.useridVal().equals("Please select a Prescription.")) {
								
							      
								 tryPassScreenshot(" WM_SPSP_10");
								if(obj.Savedprescriptiondrug(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
									obj.medication_checkboxes(i).click();
									obj.savedremove_but.click();
									 //tryPassScreenshot(" WM_SPSP_11");
									 obj.add_btn.click();
									// tryPassScreenshot("WM_SPSP_06");
									 obj.savedPrescriptionsPatient_tab.click();
									 obj.savedback_but.click();
									// tryPassScreenshot("WM_SPSP_05");
							}
							
								
							 
						  }
						 
							break;
							
				}
				
						
				
				 }
				 
				 }
				 
	  
		  
	  @BeforeTest
	  public void beforeTest() throws Exception   {
		/*driver = Driver.browser("web");
	      UserLogin us = new UserLogin();
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("MIDANAR001", "Pass@123");
	      PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
	   /*Rxpad rx = new Rxpad();
	      rx.driver=driver;
		  rx.Confirmprescription();*/ 
 }

	  @AfterTest
	  public void afterTest() {
	  }

}
