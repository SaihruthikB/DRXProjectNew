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
	 if(obj.Register_lastname_val().contains("Last Name is required.")){
		 //Thread.sleep(2000);
		 obj.patientsearch_lastname_txt.sendKeys("324@#@");
	 }
 if(obj.Register_firstname_val().contains("First Name is required.")){
		 obj.patientsearch_firstname_txt.sendKeys("fs#$34");
		 obj.Patienregistartion_middle_txt.sendKeys("tyy56");
	 }
 if(obj.Register_city_val().contains("City is required.")){
	 obj.city.sendKeys("df@#");
 }
 if(obj.Register_zip_val().contains("Zip is required.")){
	 obj.zip.sendKeys("5e#$");
 }
 if(obj.Register_dateofbirth_val().contains("Date of Birth is required.")){
	 obj.patientsearch_dob_txt.sendKeys("344fr&8");
	 
 }
 if(obj.Register_gender_val().contains("Gender is required.")){
	 Select gender = new Select(obj.Patienregistartion_gender_txt);
	 gender.selectByIndex(1);
 }
 if(obj. Register_addrees_val().contains("Address is required.")){
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
	  
 if(obj.Patienregistartion_lastname_val_Charecters().contains("Last Name should be alphabetic characters.")){
	 obj.patientsearch_lastname_txt.clear();
	 obj.patientsearch_lastname_txt.sendKeys("sridhar");
 }
if(obj.Patienregistartion_FirstName_val_Charecters().contains("First Name is Required.")){
	obj.patientsearch_firstname_txt.clear();
	obj.patientsearch_firstname_txt.sendKeys("maddi");
	
 }
if(obj.Register_gender_val().contains("Middle Name should be alphabetic characters.")){
	 obj.Patienregistartion_middle_txt.clear();
	 obj.Patienregistartion_middle_txt.sendKeys("m");
 }
if(obj.Patienregistartion_City_val_Charecters().contains("City Required.")){
	 obj.city.clear();
	obj.city.sendKeys("city");
}
if(obj.Patienregistartion_Zip_val_Charecters().contains("Zip Code Required.")){
	obj.zip.clear();
	obj.zip.sendKeys("34545");
}
if(obj.Patienregistartion_DOB_val_Charecters().contains("Invalid Date Of Birth.")){
	obj.patientsearch_dob_txt.clear();
	obj.patientsearch_dob_txt.sendKeys("02/02/1900");
 
}
if(obj.Patienregistartion_TelePhoneW_val_Charecters().contains("Invalid Telephone No.(Home).")){
	 obj.telhome.clear();
	obj.telhome.sendKeys("445");
	obj.telhome1.clear();
	 obj.telhome1.sendKeys("567");
	 obj.telhome2.clear();
	 obj.telhome2.sendKeys("5687");
}
if(obj.Patienregistartion_AddressNo_val_Charecters().contains("invalid message address")){
	obj.addressone.clear();
	obj.addressone.sendKeys("jubehilss add");
	if(obj.Patienregistartion_TelephoneWN_val_Charecters().contains("Invalid Telephone No.(Work).")){
		obj.telwork.clear();	
 obj.telwork.sendKeys("565");
 obj.telwork1.clear();
 obj.telwork1.sendKeys("456");
 obj.telwork2.clear();
 obj.telwork2.sendKeys("5687");
 
}  
	//if(obj.Patient_Gender().contains("Gender is Required.")){
		WebElement web2=obj.Patient_gender;
		Select s1 = new Select(web2);
		s1.selectByIndex(1);
	//}
	obj.register_registerbut.click();
	obj.save_lnkText.click();
	//System.out.println(obj.Register_lastname_val());
	if(obj.Patient_SaveMess_Val().equals("Select the patient Information before clicking SAVE.")){
		obj.patient_registration_checkbox.click();
		obj.save_lnkText.click();
		obj.patient_registration_gotorxpad.click();
		
	}
}  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*driver=Driver.browser("web");
      UserLogin us = new UserLogin();
	  us.driver = driver;
      //us.doctorLogin("midrhpn001", "password");
      us.doctorLogin("MIDANAR001", "Pass@123");
      PatientSearch ps = new PatientSearch();
      ps.driver=driver;
      ps.patientSearch();*/
  }

  @AfterTest
  public void afterTest() {
  }

}
