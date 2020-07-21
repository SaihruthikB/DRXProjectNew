package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class PatientFavouriteDrug {
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

	@Test(priority=12)
	  public void FavouriteDrug() throws Exception {
		
		  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		obj.RxPad_tab.click();
		  obj.reset_LinkText.click();
		  Rxpad rx = new Rxpad();
	      rx.driver=driver;
		  rx.Confirmprescription();
		 obj.savedback_but.click();
		  obj.favourite_checkbox.click();
		  obj.confirm_but.click();
		  try{
		  obj.favDrugPatient_tab.click();
		tryPassScreenshot("WM_FDP_01");
		  }catch(Exception e){
			  tryFailScreenshot("WM_FDP_01");
		  }
		 // obj.favourite_search.sendKeys("Lipitor 80 MG Oral Tablet");
		  obj.favourite_search.sendKeys("Lipitor");
		  obj.search_btn.click();
		  WebElement WebElement = obj.Saved_table;
		  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
		  
		  System.out.println(list1.size());
		  for(int i =1;i<=list1.size();i++){
		  //obj.medication_druglist(i);
		  System.out.println( obj.medication_druglist(i));
		if(obj.medication_druglist(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
			//obj.Detailslink.click();
			//obj.send_close.click();
			obj.medication_druglink(i).click();
			obj.confirm_but.click();
			tryPassScreenshot("WM_SPSP_08");
			obj.sendtophar_txt.click();
			obj.send_close.click();
			break;
		}
		  }
		  }
		  @Test(priority=13)
		  public void Favourite_confirmprescription() throws Exception {
			
		obj.favDrugPatient_tab.click();
		obj.favourite_search.sendKeys("Lipitor");
		  obj.search_btn.click();
		  WebElement WebElement = obj.Saved_table;
		  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
		  
		  System.out.println(list1.size());
		  for(int i =1;i<=list1.size();i++){
		 if(obj.medication_druglist(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
				obj.medication_checkboxes(i).click();  
				obj.confirm_but.click();
				tryPassScreenshot(" WM_SPSP_08");
				obj.sendtophar_txt.click();
				obj.send_close.click();
				break;
		 }
		  }
				 Rxpad rx1 = new Rxpad();
			      rx1.driver=driver;
				  rx1.Confirmprescription();
				  obj.savedback_but.click();
				  obj.favourite_checkbox.click();
				  obj.confirm_but.click();
				 obj.favDrugPatient_tab.click();
			
				 tryPassScreenshot(" WM_SPSP_09");
				 
		  
		  }
		  @Test(priority=14)
		  public void FavouriteDrug_delete() throws Exception {
		obj.delete_lnktxt.click();
			System.out.println(obj.confirm_savevali());
				if(obj.useridVal().trim().equals("Please select the prescriptions to delete.")) {
					 tryPassScreenshot(" WM_SPSP_10");
					obj.favDrugPatient_tab.click();
					obj.favourite_search.sendKeys("Lipitor");
					  obj.search_btn.click();
					  WebElement WebElement = obj.Saved_table;
					  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
					  
					  System.out.println(list1.size());
					  for(int i =1;i<=list1.size();i++){
					if(obj.medication_druglist(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet")){
						obj.medication_checkboxes(i).click();
						obj.delete_lnktxt.click();
						 tryPassScreenshot(" WM_SPSP_11");
						 obj.savedback_but.click();
						 tryPassScreenshot("WM_SPSP_06");
						 obj.favDrugPatient_tab.click();
						 
						
				}
				
				 
				 
			  }
			 
				//break;	 	
			
	
		  
		  }

	}
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
		 System.out.println("patient saved prescription");
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
