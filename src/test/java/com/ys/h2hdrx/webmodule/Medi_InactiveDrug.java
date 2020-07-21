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

public class Medi_InactiveDrug {
	Webmoduleobjects obj;

	public WebDriver driver;
  @Test
  public void Medi_inactivedrug_twocheckbox() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.medicationHistory_tab.click();
	  obj.mh_inactivatedrug.click();
	  if(obj.useridVal().equalsIgnoreCase("Pleease select any precription to Inactivate.")){
		  WebElement WebElement = obj.medicationhistory_table;
		  List<WebElement> list1= WebElement.findElements(By.tagName("tr"));
		  
		  System.out.println(list1.size());
		  for(int i =1;i<=list1.size();i++){
		  //obj.medication_druglist(i);
		  System.out.println( obj.medication_druglists(i));
		// System.out.println(obj.medicationHistoryStatus);
		  if ((obj.medication_druglists(i).trim().equals("Actimmune 2000000 UNIT/0.5ML Subcutaneous Solution"))){
			  obj.medication_checkboxes(i).click();
		  }
				  if((obj.medication_druglists(i).trim().equals("Gastrocrom 100 MG/5ML Oral Concentrate"))) {
					  obj.medication_checkboxes(i).click();
					  obj.mh_inactivatedrug.click();
					  
					 // System.out.println(obj.confirmcancellation_num());
					  break;
					 
					 }
					
					
					  
		  }
	  }
	  obj.submit_lnktxt.click();
	  Alert a = driver.switchTo().alert();
	  a.accept();
	 Select options = new Select(obj.inactive_inactivereasonoption);
	 options.selectByIndex(2);
	String str = driver.findElement(By.xpath("//*[@id='drugInactivationPage']/table/tbody/tr[5]/td[1]")).getText();
	System.out.println(str);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = Driver.browser("web");
      UserLogin us = new UserLogin();
      // System.out.println("getDriver"+Driver.getDriver());
      us.driver = driver;
      us.doctorLogin("MIDANAR001", "Pass@123");
      PatientSearch ps = new PatientSearch();
      ps.driver = driver;
      ps.patientSearch();
  }

  @AfterTest
  public void afterTest() {
  }

}
