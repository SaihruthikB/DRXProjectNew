package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Scheduledrug  {
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
  @Test (priority=4)
  public void Confirmprescription() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		tryFailScreenshot("WM_RX_03");
		obj.drugsearch_txt.click();
		System.out.println(obj.drugsearch_vali());
		if (obj.drugsearch_vali().contains("First three letters of Drug name are required.")) {
			tryPassScreenshot("WM_RX_11");

		} else {
			tryFailScreenshot("WM_RX_11");
		}
		obj.drug_txt.clear();
		obj.drug_txt.sendKeys("l$");
		obj.drugsearch_txt.click();
		System.out.println(obj.drugsearch_vali());
		if (obj.drugsearch_vali().contains("First three letters of Drug name are required.")) {
			tryPassScreenshot("WM_RX_15");

		} else {
			tryFailScreenshot("WM_RX_15");
		}
		
		
		try{
			obj.drug_txt.clear();
			obj.drug_txt.sendKeys("l$tr45");
			obj.drugsearch_txt.click();
			obj.back_LinkText.click();
			tryPassScreenshot("WM_RX_16");
			
			
		}catch (Exception e) {
			 tryFailScreenshot("WM_RX_16");
			}
		try{
			obj.drug_txt.clear();
		obj.drug_txt.sendKeys("xana");
		obj.drugsearch_txt.click();
		obj.back_LinkText.click();
		tryPassScreenshot("WM_RX_18");
		}catch (Exception e) {
			 tryFailScreenshot("WM_RX_18");
			}
		try{
			obj.drug_txt.clear();
		obj.drug_txt.sendKeys("xana");
		obj.drugsearch_txt.click();
		obj.drugsearch_detailslink.click();
		tryPassScreenshot("WM_RX_19");
		//obj.back_LinkText.click(); /// need to be removed
		tryPassScreenshot("WM_RX_20");
		}catch (Exception e) {
			 tryFailScreenshot("WM_RX_19");
			 tryFailScreenshot("WM_RX_20");
			}
		/////////  need to be added removed lines here
				System.out.println(obj.alternativepopup());
		  if(obj.alternativepopup().contains("Alternatives:")){
		  
		  obj.altclose_lnk.click();
	  	}
	  	else if(obj.alternativepopup().contains("Alternatives:")){
	  		obj.next_link.click();
			  obj.altclose_lnk.click();
		  
	  	}
		try{
		obj.quantity_txt.clear();
		obj.quantity_txt.sendKeys("5");
		tryPassScreenshot("WM_RX_47");
		}catch(Exception e){
			tryFailScreenshot("WM_RX_47");
		}
		try{
		obj.refill_txt.clear();
		obj.refill_txt.sendKeys("5");
		tryPassScreenshot("WM_RX_49");
		}catch(Exception e){
		tryFailScreenshot("WM_RX_49");
		}
	 //delivery or sig dropdown information 
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
	try{
		obj.time_but.click();
		tryPassScreenshot("WM_RX_41");
	}catch(Exception e){
			tryFailScreenshot("WM_RX_41");
		}
		try{
	
		obj.time_list.click();
		obj.time_done.click();
		tryPassScreenshot("WM_RX_42");
	}catch(Exception e){
		tryFailScreenshot("WM_RX_42");
	}
		
		obj.usefreetext_but.click();
		try{
		obj.sig_txt.clear();
		obj.sig_txt.sendKeys("take two tablets");
		tryPassScreenshot("WM_RX_40");
		}catch(Exception e){
			tryFailScreenshot("WM_RX_40");
		}
		obj.payerpbm_but.click();
		obj.therapetical_but.click();
		try{
		obj.nextprescription_but.click();
		tryPassScreenshot("WM_RX_55");
		}catch(Exception e){
			tryFailScreenshot("WM_RX_55");
		}
		
	 /* Rxpad rx = new Rxpad();
	  rx.Drugsearch();
	  rx.Drugselection();*/
		obj.previousprescription_but.click();
		obj.confirm_but.click();
   obj.edit_but.click();
    obj.confirm_but.click();
	  obj.adverseEffects_but.click();
	  Thread.sleep(3000);
	  obj.Patientedc_but.click();
	  Thread.sleep(3000);
	  obj.drugtofood_but.click();
	  Thread.sleep(3000);
	  obj.pharmacy_lnk.click();
	  Thread.sleep(3000);
	  obj.close_lnk.click();
	  Thread.sleep(3000);
	}

	@Test(priority=5)
	public void sendtopharmacy() throws Exception {
		obj.sendtophar_txt.click();
		//String str=driver.findElement(By.xpath("/html/body/div[3]/div[3]")).getText();
		//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span")).click();
		obj.schedule_ok.click();
		obj.schedule_email.sendKeys("madhulika@h2hsolutions.com");
		obj.schedule_password.sendKeys("RITWIKwelcome@12345");
		obj.schedule_siginbutton.click();
		Thread.sleep(7000);
	/*	Alert alert=driver.switchTo().alert();
		alert.accept();*/
		System.out.println(obj.trxn_sucess_msg());
		if (obj.trxn_sucess_msg().contains("(TRANSACTION SUCCESSFUL ; ACCEPTED AND VERIFIED BY ULTIMATE RECEIVER)")) {
			tryPassScreenshot("SendToPharmacy");
			obj.close_lnk.click();
			obj.medicationHistory_tab.click();

			if ((obj.Firstdrug_txt().contains("Lipitor")) && (obj.MedicationHistoryStatus_txt().equals("E*S"))) {
				tryPassScreenshot("SendToPharmacy in medication sowing as E*S");
			} else {
				WriteExcel.writepassfail("SendToPharmacy drug not stored in medication history",
						"Output Data/SanitytestResult.xls", "Fail");
				CaptureScreenshot.Capture("SendToPharmacy drug not stored in medication history", "sanityTesting");
			}
			obj.RxPad_tab.click();
		} else {
			WriteExcel.writepassfail("SendToPharmacy", "Output Data/SanitytestResult.xls", "Fail");
			CaptureScreenshot.Capture("SendToPharmacy", "sanityTesting");
			obj.back_LinkText.click();
		}
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
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
