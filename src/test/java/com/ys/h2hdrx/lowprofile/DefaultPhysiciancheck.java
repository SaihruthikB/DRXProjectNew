package com.ys.h2hdrx.lowprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AddToMedication;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

public class DefaultPhysiciancheck {
	Webmoduleobjects obj;
	WebDriver driver;
  @Test(priority=2)
  public void Enabled_DefaultPhysician() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.deafaultphysician_tab.click();
	  String str = driver.findElement(By.xpath("//*[@id='formPatientProfileTabs']/table/tbody/tr[5]/td[2]/select/option[7]")).getText();
      System.out.println(str);
	  if(str.equalsIgnoreCase("Alex  Steinbock")){
    	  obj.mh_back_btn.click();
    	
    	  AddToMedication ad = new AddToMedication();
    	  ad.driver = driver;
    	  ad.Addtomedicationhistory();
      }
	  else{
    	  obj.mh_back_btn.click();
    	  System.out.println(obj.lowprofile_supervisior());
    	  if(obj.lowprofile_supervisior().equals("ammer anith")){
    		  System.out.println("default physician name is correct in supervisior");
    	  AddToMedication ad = new AddToMedication();
    	  ad.driver = driver;
    	  ad.Addtomedicationhistory(); 
    	  }
    	  else{
    		  System.out.println("default physician name is not correct in supervisior");
    	  }
      }
  }
}
