package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class PatientRegistration extends UserLogin {
	//Webmoduleobjects obj;
	
  @Test(priority=2)
  public void PatientRegistration() throws Exception {
	  obj= PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.Patienregistartion_tab.click();
	tryPassScreenshot("WM_PR_01");
	  obj.register_registerbut.click();
	 tryPassScreenshot("WM_PR_02");
	  /*System.out.println(obj.Register_lastname_val());
	  System.out.println(obj.Register_firstname_val());
	  System.out.println(obj.Register_city_val());
	  System.out.println(obj.Register_zip_val());
	  System.out.println(obj.Register_dateofbirth_val());
	  System.out.println(obj.Register_gender_val());
	  System.out.println(obj. Register_addrees_val());*/
	 if(obj.Register_lastname_val().equals("Last Name is required.")){
		 obj.patientsearch_lastname_txt.sendKeys("324@#@");
	 }
 if(obj.Register_firstname_val().equals("First Name is required.")){
		 obj.patientsearch_firstname_txt.sendKeys("fs#$34");
		 obj.Patienregistartion_middle_txt.sendKeys("tyy56");
	 }
 if(obj.Register_city_val().equals("City is required.")){
	 obj.city.sendKeys("df@#");
 }
 if(obj.Register_zip_val().equals("Zip is required.")){
	 obj.zip.sendKeys("5e#$");
 }
 if(obj.Register_dateofbirth_val().equals("Date of Birth is required.")){
	 obj.patientsearch_dob_txt.sendKeys("344fr&8");
	 
 }
 if(obj.Register_gender_val().equals("Gender is required.")){
	 Select gender = new Select(obj.Patienregistartion_gender_txt);
	 gender.selectByIndex(1);
 }
 if(obj. Register_addrees_val().equals("Address is required.")){
	 obj.addressone.sendKeys("fd34%");
	 obj.telhome.sendKeys("568");
	 obj.telhome1.sendKeys("568@");
	 obj.telhome2.sendKeys("5687");
	 obj.telwork.sendKeys("568");
	 obj.telwork1.sendKeys("568@");
	 obj.telwork2.sendKeys("5687");
	 
 }
 obj.register_registerbut.click();
 /*System.out.println(obj.Register_lastname_val());
 System.out.println(obj.Register_firstname_val());
 System.out.println(obj.Register_city_val());
 System.out.println(obj.Register_zip_val());
 System.out.println(obj.Register_dateofbirth_val());
 System.out.println(obj.Register_gender_val());
 System.out.println(obj. Register_addrees_val());
 System.out.println(obj.Register_teleponehome_val());
 System.out.println(obj.Register_teleponework_val());*/
/*if(obj.Register_gender_val().equals("Gender is required.")){
	 
 }*/
	 // System.out.println(obj.Register_middlename_val());
	  
 if(obj.Register_lastname_val().equals("Last Name should be alphabetic characters.")){
	 obj.patientsearch_lastname_txt.clear();
	 obj.patientsearch_lastname_txt.sendKeys("sridhar");
 }
if(obj.Register_firstname_val().equals("First Name should be alphabetic characters.")){
	obj.patientsearch_firstname_txt.clear();
	obj.patientsearch_firstname_txt.sendKeys("maddi");
	
 }
if(obj.Register_gender_val().equals("Middle Name should be alphabetic characters.")){
	 obj.Patienregistartion_middle_txt.clear();
	 obj.Patienregistartion_middle_txt.sendKeys("m");
 }
if(obj.Register_city_val().equals("City should be alphabetic characters.")){
	 obj.city.clear();
	obj.city.sendKeys("city");
}
if(obj.Register_zip_val().equals("Please enter Zip in one of the following patterns: xxxxx or xxxxx-xxxx.")){
	obj.zip.clear();
	obj.zip.sendKeys("34545");
}
if(obj.Register_dateofbirth_val().equals("Invalid Date Of Birth.")){
	obj.patientsearch_dob_txt.clear();
	obj.patientsearch_dob_txt.sendKeys("02/02/1900");
 
}
if(obj.Register_teleponehome_val().equals("Invalid Telephone No.(Home).")){
	 obj.telhome.clear();
	obj.telhome.sendKeys("445");
	obj.telhome1.clear();
	 obj.telhome1.sendKeys("567");
	 obj.telhome2.clear();
	 obj.telhome2.sendKeys("5687");
}
if(obj. Register_addrees_val().equals("Invalid Address.")){
	obj.addressone.clear();
	obj.addressone.sendKeys("jubehilss add");
	if(obj.Register_teleponework_val().equals("Invalid Telephone No.(Work).")){
		obj.telwork.clear();	
 obj.telwork.sendKeys("565");
 obj.telwork1.clear();
 obj.telwork1.sendKeys("456");
 obj.telwork2.clear();
 obj.telwork2.sendKeys("5687");
 
}  
	obj.register_registerbut.click();
	obj.save_lnkText.click();
	//System.out.println(obj.Register_lastname_val());
	if(obj.Register_lastname_val().equals("Select the patient Information before clicking SAVE.")){
		obj.patient_registration_checkbox.click();
		obj.save_lnkText.click();
		obj.patient_registration_gotorxpad.click();
		
	}
}  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
