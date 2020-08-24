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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Reports {
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

  @Test(priority=1)
  public void PrescriptionReport() {
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
        obj.reports_tab.click();
        obj.reports_prescription.click();
        obj.search_btn.click();
        if (obj.useridVal().contains("Last Name is required.")) {
        	obj.report_lastname_txt.sendKeys("3$#e"); 
        	obj.report_first_txt.sendKeys("o*65");
        	  obj.search_btn.click();
        //System.out.println(obj.useridVal());
        	if ((obj.useridVal().contains("Last Name is invalid."))&& (obj.useridVal().contains("Invalid First Name."))) {
        		
        		obj.reset_LinkText.click();
    			obj.report_lastname_txt.sendKeys("sch");	
    			obj.search_btn.click();
        			WebElement list = obj.reports_search;
        			List<WebElement> patientlsit = list.findElements(By.tagName("tr"));
        			//System.out.println(patientlsit.size());
        			
        			for(int i=1;i<=patientlsit.size();i++){
        				System.out.println(obj.patientlist(i));
        				System.out.println(obj.patientaddresslist(i));
        				if(obj.patientlist(i).trim().equals("Bert Schnur")){
        					obj.reports_add.click();
        					
        				}
        				if(obj.patientlist(i).trim().equals("df sch")){
        					obj.patientaddlist(i).click();
        				}
        						if(obj.patientlist(i).trim().equals("DOROTHY SCHNUR")){
  
        					obj.patientaddlist(i).click();
        					//obj.reports_add.click();
        					obj.generatereport_but.click();
        					//System.out.println(obj.generatereport_error(i));
        					WebdriverWait.pageLoadWait(20000);
        					//obj.reports_back.click();	
        					obj.reports_back.click();	
        				break;
        				
        			}
        						 
        					
        			
        	
        
        
        	}}
      
			
		}
  }
  @Test(priority=7)
  public void PrescriptionReport_remove() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.reports_tab.click();
		obj.report_lastname_txt.sendKeys("sch");	
		obj.search_btn.click();
	  WebElement list = obj.reports_search;
		List<WebElement> patientlsit = list.findElements(By.tagName("tr"));
		//System.out.println(patientlsit.size());
		
		for(int i=1;i<=patientlsit.size();i++){
			System.out.println(obj.patientlist(i));
			System.out.println(obj.patientaddresslist(i));
			if(obj.patientlist(i).trim().equals("Bert Schnur")){
				obj.reports_add.click();
				obj.reports_options.click();
			
		/*Select option = new Select(obj.reports_options);
		option.selectByIndex(1);*/
		obj.reports_remove.click();
		obj.reset_LinkText.click();
		obj.generatereport_but.click();
		//System.out.println(obj.reports_breifcase());
		if(obj.reports_breifcase().equals("Report will be generated and can be accessed through the briefcase")){
			break;
		}
		/*Alert a = driver.switchTo().alert();
		a.accept();
		obj.reports_remove.click();*/
			}}
}	
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");*/
  }

  @AfterTest
  public void afterTest() {
  }

}
