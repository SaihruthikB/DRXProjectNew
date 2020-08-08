package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Medicationhistory_confirmcancellation {
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
	@Test(priority=16) 
  	public void Confirmcanellation() throws Exception {
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		//obj.medicationHistory_tab.click();
		obj.medicationHistory_tab.click();
	  WebElement WebElement = obj.medicationhistory_table;
	  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
	  
	  System.out.println(list1.size());
	  for(int i =1;i<=list1.size();i++){
	  //obj.medication_druglist(i);
	  System.out.println( obj.medication_druglists(i));
	 //System.out.println(obj.medicationHistoryStatus);
	  if (obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet")) {
			obj.medication_checkboxes(i).click();
		  try{
		  obj.mh_confirmcancellation.click();
		  tryPassScreenshot("WB_MCC_001");
		  }catch(Exception e){
			  tryFailScreenshot("WB_MCC_001");
		  }
		  try{
		  obj.mh_cc_sendcancelrx.click();
		  tryPassScreenshot("WB_MCC_002");
		  }catch(Exception e){
			  tryFailScreenshot("WB_MCC_002");
		  }
		  try{
			  System.out.println(obj.confirmcancellation_sucess()); 
			  if(obj.confirmcancellation_sucess().equalsIgnoreCase("Drugs sent for cancel electronically :")){
					 obj.cancellation_close.click();
				
		  tryPassScreenshot("WB_MCC_003");
			  }
		  }catch(Exception e){
			  tryFailScreenshot("WB_MCC_003");
		  }
	  
			
	  
			  /*if((obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet  *"))&&(obj.medication_druglist(i).equalsIgnoreCase("NovoLOG FlexPen 100 UNIT/ML Subcutaneous Solution Pen-injector"))){
				  obj.medication_checkboxes(i).click();
			  }*/
			
			 
		 // break;
		  } //else if condition
	  if(obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet *")) {
		  obj.medication_checkboxes(i).click();
		  try{
		  obj.mh_confirmcancellation.click();
		  tryPassScreenshot("WB_MCC_001");
		  }catch(Exception e){
			  tryFailScreenshot("WB_MCC_001");
		  }
		  try{
		  obj.mh_cc_sendcancelrx.click();
		  tryPassScreenshot("WB_MCC_002");
		  }catch(Exception e){
			  tryFailScreenshot("WB_MCC_002");
		  }
		  try{
		  obj.send_close.click();
		  tryPassScreenshot("WB_MCC_003");
		  }catch(Exception e){
			  tryFailScreenshot("WB_MCC_003");
		  }
		  
			
	  
			  if((obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet"))&&(obj.medication_druglist(i).equalsIgnoreCase("NovoLOG FlexPen 100 UNIT/ML Subcutaneous Solution Pen-injector"))){
				  obj.medication_checkboxes(i).click();
			  }
		  System.out.println(obj.confirmcancellation_sucess()); 
			
			 if(obj.confirmcancellation_sucess().equalsIgnoreCase("Drugs sent for cancel electronically :")){
				 obj.cancellation_close.click();
			 }
		  break;
		  }}
	  }
	 @Test(priority=17) 
	  	public void Confirmcanellation_back() throws Exception {
		 
	 WebElement WebElement = obj.medicationhistory_table;
	  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
	  
	  System.out.println(list1.size());
	  for(int i =1;i<=list1.size();i++){
	  //obj.medication_druglist(i);
	  System.out.println( obj.medication_druglists(i));
	// System.out.println(obj.medicationHistoryStatus);
	  if (obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet")) {
			obj.medication_checkboxes(i).click();
			obj.mh_confirmcancellation.click();
		  obj.savedback_but.click();
		 // break;
	  }
	  else if (obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet")) {
				obj.medication_checkboxes(i).click();
				obj.mh_confirmcancellation.click();
			  obj.savedback_but.click();
			  break; 
	  }
	 }
	 }
	 
	 @Test(priority=18) 
	  	public void Confirmcanellation_remove() throws Exception {
			
	 WebElement WebElement = obj.medicationhistory_table;
	 List<WebElement> list1= WebElement.findElements(By.xpath("//div[@id='scrollableTBodyFull']/table/tbody/tr"));
	 // List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
	  
	  System.out.println(list1.size());
	  for(int i =1 ;i<=list1.size();i++){
	  //obj.medication_druglist(i);
	  System.out.println( obj.medication_druglists(i));
	  
	  
	// System.out.println(obj.medicationHistoryStatus);
	  if ((obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet"))){
		  obj.medication_checkboxes(i).click();
		  obj.mh_confirmcancellation.click();
		  
		 obj.savedremove_but.click();/// added for script stability  
		 
		 break;
	  }
	  else if((obj.medication_druglists(i).trim().equals("Lipitor 80 MG Oral Tablet *"))){
		  obj.medication_checkboxes(i).click();
		  obj.mh_confirmcancellation.click();
		  obj.savedremove_but.click(); /// added for script stability
		  
		  break;
	  }
		  /*if((obj.medication_druglists(i).trim().equals("Zestril 10 MG Oral Tablet"))) {
			  obj.medication_checkboxes(i).click();
			  obj.mh_confirmcancellation.click();
			  
			  
			 // System.out.println(obj.confirmcancellation_num());
			  break;
			  
			 
	  }
			*/  //need to check with nagamani
			  
					
				
				  
	  }
	 //obj.cancel_checkbox.click(); (nned to check with nagamani)
	 // obj.savedremove_but.click(); (neeed to check with nagamani)
	  
	  
	 /* System.out.println(obj.cancelscreen());
	if(obj.cancelscreen().equalsIgnoreCase("Cancel Prescriptions :")){
	obj.savedback_but.click(); 
	
	
	}*/ //need to check with nagamani ---- Dono why this code is 
	  
	  WebElement WebElement1 = obj.cancel_table;
	 
	 // List<WebElement> cancellist1= WebElement.findElements(By.tagName("td"));
	  List<WebElement> cancellist1= WebElement1.findElements(By.xpath("//*[@id=\"scrollableTBodyFull\"]/div/div"));
	  
	  
	  System.out.println(cancellist1.size());
	  for(int i =1;i<=cancellist1.size();i++){
	  System.out.println(obj.confirmcancellation_num());
	  if(obj.confirmcancellation_num().equalsIgnoreCase("Rx No. :")){  
			 obj.cancelcheck1s(i).click();	  
			obj.savedremove_but.click();
		 
		  
	  }}
	  
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
