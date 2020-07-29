package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class MedicationHistory  {
	int i;
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
	@Test(priority=13)
	public void drugcheckbox() throws Exception {
		/* UserLogin us = new UserLogin();
	      // System.out.println("getDriver"+Driver.getDriver());
	      us.driver = driver;
	      us.doctorLogin("FLNTRSL001", "password");
	      PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		 obj.patientsearch_tab.click();
		 PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();
		obj.medicationHistory_tab.click();
		WebElement WebElement = obj.medicationhistory_table;
		List<WebElement> list1 = WebElement.findElements(By.tagName("tr"));

		System.out.println(list1.size());
		for (int i = 1; i <= list1.size(); i++) {
			//obj.medication_druglist(i);
			System.out.println(obj.medication_druglists(i));
			if (obj.medication_druglists(i).contains("Lipitor 80 MG Oral Tablet")) {
				obj.medication_checkboxes(i).click();
				

				break;
			} else if (obj.medication_druglists(i).contains("Lipitor 80 MG Oral Tablet  *")) {
				obj.medication_checkboxes(i).click();
				//obj.confirm_but.click();

				break;
			}
		}
	}

	@Test(priority=14)
	public void Confirmprescription() {
		obj.confirm_but.click();		
		obj.sendtophar_txt.click();
		obj.send_close.click();
		
	}

	@Test(priority=15)
	public void Updatedrug() throws Exception {
		drugcheckbox();
		obj.updateDrug_btn.click();
		new Select(obj.delivery_option).selectByIndex(1);
		obj.updatedrug_comment_txt.sendKeys("Change the directions of a drug");
		obj.reset_LinkText.click();
		new Select(obj.delivery_option).selectByIndex(1);
		new Select(obj.dose_option).selectByIndex(2);
		new Select(obj.units_option).selectByIndex(2);
		new Select(obj.freq_option).selectByIndex(2);
		obj.time_but.click();
		obj.time_list.isSelected();
		obj.done_time_rxpad_btn.click();
		obj.useFreetext_btn.click();
		/*obj.upddatedrug_modifiedsig_txt.clear();
  		obj.upddatedrug_modifiedsig_txt.sendKeys("take one tablet");*/
		obj.updatedrug_comment_txt.sendKeys("Change the directions of a drug");
		obj.update_LinkText.click();
		
		//System.out.println(obj.update_sucess());
		
		//if (obj.update_sigvali().equalsIgnoreCase("SIG Information is already exist.")) {
		try{
		if (obj.useridVal().equalsIgnoreCase("SIG Information is already exist.")) {	
		new Select(obj.delivery_option).selectByIndex(2);
			new Select(obj.dose_option).selectByIndex(3);
			new Select(obj.units_option).selectByIndex(3);
			new Select(obj.freq_option).selectByIndex(1);
			obj.time_but.click();
			obj.time_list.isSelected();
			obj.done_time_rxpad_btn.click();
			obj.useFreetext_btn.click();
			/*obj.upddatedrug_modifiedsig_txt.clear();
	  		obj.upddatedrug_modifiedsig_txt.sendKeys("take one tablet");*/
			obj.updatedrug_comment_txt.sendKeys("Change the directions of a drug");
			obj.update_LinkText.click();
		} 
		else{
			tryFailScreenshot("TS");
		}}catch(NoSuchElementException ne){
		if(obj.update_sucess().equals("Drug has been modified successfully")){
			obj.back_LinkText.click();
			WebElement WebElement = obj.medicationhistory_table;
			List<WebElement> list1 = WebElement.findElements(By.tagName("tr"));

			System.out.println(list1.size());
			for (int i = 1; i <= list1.size(); i++) {
				//obj.medication_druglist(i);
				System.out.println(obj.medication_druglists(i));
			
			  if (obj.medication_druglists(i).equalsIgnoreCase("Lipitor 80 MG Oral Tablet  *")) {
				
				obj.Details_lnk.click();
				break;
			}
		
				/*if(obj.update_new_sig().equals("Sig: Take 1/2 teaspoon(s) as needed")){
					System.out.println("pass");
				tryPassScreenshot("ts");
				obj.send_close.click();
				}
			*/
		}
	
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
	      PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
	  }

	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }
	 }

