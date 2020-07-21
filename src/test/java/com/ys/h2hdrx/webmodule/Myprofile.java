package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Myprofile  {
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
  @Test(priority=6)
  public void Myprofile_clinicinformation() throws Exception {
	  obj= PageFactory.initElements(driver, Webmoduleobjects.class);

	  try {
	  obj.myprofile_lnk.click();
      
		//tryPassScreenshot("WM_CI_01");
	} catch (Exception e) {
		//tryFailScreenshot("WM_CI_01");
	}
		obj.updateclinic_btn.click();
		// if(obj.clinic_val().equals("Please select a Clinic.")){
	       if(obj.useridVal().contains("Please select a Clinic.")){
	    	  // System.out.println(obj.clinic_val());
		       obj.remove_btn.click();

	    	   //tryPassScreenshot("WM_CI_02");
	       }
	    	   else{
	    	   //tryFailScreenshot("WM_CI_02");
	       }
	       //trunk
	      // if(obj.clinic_val().equals("Please select a Clinic.")){
		       if(obj.useridVal().contains("Please select a Clinic.")){
  
	    	   //System.out.println(obj.useridVal());
	      
	    	   //tryPassScreenshot("WM_CI_19");
	       
      
      WebElement list = obj.clinic_webtable;
      List<WebElement> cliniclist = list.findElements(By.tagName("tr"));
      System.out.println(cliniclist.size());
      for(int i =1;i<cliniclist.size();i++){
    	 
    	 obj.clinic_infor(i);
		 System.out.println( obj.clinic_infor(i));
		 obj.clinic_truestatus(i);
    	 System.out.println(obj.clinic_truestatus(i));
    	 
    	  if( obj.clinic_infor(i).trim().contains("nyeo clinic    3354 G. Shea evlen    Wilson  MI  65789")&& obj.clinic_truestatus(i).trim().contains("true")){
    		  obj.clinic_checkboxes(i).click();
    		  obj.updateclinic_btn.click();
    		  //tryPassScreenshot("WM_CI_03");
    	  }
    	  else{
       	   //tryFailScreenshot("WM_CI_03");
          }
    	  if( obj.clinic_infor(i).trim().contains("  nyeo clinic    3354 G. Shea evlen    Wilson  MI  65789")&& obj.clinic_truestatus(i).trim().contains("true")){
    		  obj.clinic_checkboxes(i).click();
    		  obj.remove_btn.click();
    		 // tryPassScreenshot("WM_CI_09");
    	  }
    	  else{
       	   //tryFailScreenshot("WM_CI_09");
          }
    		    if( obj.clinic_infor(i).trim().contains("highland clinic2    123 bigthon    michigon  CA  45678")&& obj.clinic_truestatus(i).trim().contains("false")){
    		 obj.clinic_checkboxes(i).click();
   		     obj.updateclinic_btn.click();
   		 // tryPassScreenshot("WM_CI_04");
   		 obj.address.clear();
   		     obj.address.sendKeys("234 @@");
   		  
   		  obj.city.clear();
   		     obj.city.sendKeys("6567 @");
   		  
   		     obj.update.click();
   		  System.out.println("updated");   
   		     
   		    /* System.out.println(obj.adrees_validation());
   		     System.out.println(obj.city_validation());
   		    
   		    */ 
   		  System.out.println(obj.useridVal());
		     System.out.println(obj.useridVal());
   		     //if(obj.adrees_validation().equals("Invalid Address.")){
		     if(obj.useridVal().contains("invalid message address")){
   		    	tryPassScreenshot("WM_CI_07");
   		    	obj.address.clear();
   		     obj.address.sendKeys("234 abc");
   		   //	tryPassScreenshot("WM_CI_08");
   		     }
   		  else{
          	  // tryFailScreenshot("WM_CI_07");
          	 //tryFailScreenshot("WM_CI_08");
             }
   	        // if(obj.city_validation().equals("City should be alphabetic characters.")){
		     if(obj.useridVal().contains("Invalid City Name.")){
		     //tryPassScreenshot("WM_CI_07");
   	        	 obj.city.clear();
   	   		     obj.city.sendKeys("michigon mic");
   	   	   	//tryPassScreenshot("WM_CI_08");
   	   		     Select state = new Select(obj.state_txt);
   	   		     state.selectByIndex(8);
   	   		 obj.update.click();
   	   //	tryPassScreenshot("WM_CI_08");
   	         }
   	      else{
         	  // tryFailScreenshot("WM_CI_07");
         	 //tryFailScreenshot("WM_CI_08");
            }
   	   
       	 
         	 
   			 if( obj.clinic_infor(i).trim().contains("highland clinic2    234 abc    michigon mic  CA  45678")&& obj.clinic_truestatus(i).trim().contains("false")) {
   		
   			
   				 obj.clinic_checkboxes(i).click();
      		     obj.updateclinic_btn.click();
      		     obj.reset_LinkText.click();
      		   //tryPassScreenshot("WM_CI_05");
      		     obj.back_LinkText.click();
      		  // tryPassScreenshot("WM_CI_06");
   	         }
   			 else{
            	   //tryFailScreenshot("WM_CI_05");
            	// tryFailScreenshot("WM_CI_06");
               }
   			 if( obj.clinic_infor(i).trim().contains("highland clinic2    234 abc    michigon mic  CA  45678")&& obj.clinic_truestatus(i).trim().contains("false")) {
   		   		System.out.println("removed");
   	   			
   				 obj.clinic_checkboxes(i).click();
      		     obj.remove_btn.click();
      		    
      		  // tryPassScreenshot("WM_CI_20");
      		   
   	         }
   			 else{
            	   //tryFailScreenshot("WM_CI_20");
            	
               }
   	      break; 
    	  }
    	  
      
    		    }
		       }

	    	   else{
	    	   //tryFailScreenshot("WM_CI_19");
	       }
 	    			 
 			 
 		 
 		
 		
 	 
    		  }
    
  @Test(priority=5)
  public void addclinic() throws Exception {
	  obj= PageFactory.initElements(driver, Webmoduleobjects.class);

	  obj.myprofile_lnk.click();
	  try{
  obj.addclinic_btn.click();
  //tryPassScreenshot("WM_CI_10");
	  }catch (Exception e){
		  //tryFailScreenshot("WM_CI_10");
	  }
  //tryPassScreenshot("WM_CI_10");
  obj.reset_LinkText.click();
  obj.add_btn.click();
  /*System.out.println(obj.emptypractice_validation());
  System.out.println(obj.emptyaddress_validation());
  System.out.println(obj.emptycity_validation());
  System.out.println(obj.emptystate_validation());
  System.out.println(obj.emptytelpone_validation());
  System.out.println(obj.emptyfax_validation());
  System.out.println(obj.emptyzip_validation());*/
 // if(obj.emptypractice_validation().equals("Practice Name is required.")){
  if(obj.useridVal().equals("Practice Name is required.")){
	  //tryPassScreenshot("WM_CI_11");
  }
  
 // if(obj.emptyaddress_validation().equals("Address is required.")){
  if(obj.useridVal().equals("Address is required.")){
	 // tryPassScreenshot("WM_CI_11");
  }
 
  //if(obj.emptycity_validation().equals("City is required.")){
  if(obj.useridVal().equals("City is required.")){
	//  tryPassScreenshot("WM_CI_11");
  }
 
 // if(obj.emptystate_validation().equals("State is required.")){
  if(obj.useridVal().equals("State is required.")){
	 // tryPassScreenshot("WM_CI_11");
  }
  
 // if(obj.emptytelpone_validation().equals("Telephone No is required.")){
  if(obj.useridVal().equals("Telephone No is required.")){
	 // tryPassScreenshot("WM_CI_11");
  }
  
 // if(obj.emptyfax_validation().equals("Fax No is required.")){
  if(obj.useridVal().equals("Fax No is required.")){
	 // tryPassScreenshot("WM_CI_11");
  }
 
  //if(obj.emptyzip_validation().equals("Zip is required.")){
  if(obj.useridVal().equals("Zip is required.")){
	  //tryPassScreenshot("WM_CI_11");
  }
  else{
	  //tryFailScreenshot("WM_CI_11");
  }
  obj.practicename.sendKeys("highland clinic2");
     obj.address.sendKeys("234 @@");
  //System.out.println(obj.addcity_validation());
     obj.city.sendKeys("6567 @");
     Select state = new Select(obj.state_txt);
		     state.selectByIndex(8);
		     obj.zip.sendKeys("457*e");
		     obj.telphone.sendKeys("345");
		     obj.telphone1.sendKeys("df#");
		     obj.telphone2.sendKeys("456y");
		     obj.faxNo.sendKeys("456");
		     obj.faxNo1.sendKeys("65$");
		     obj.faxNo2.sendKeys("7ty%");
		     obj.add_btn.click();
		    /* System.out.println(obj.addaddrees_validation());
		     System.out.println(obj.addcity_validation());
		     System.out.println(obj.addzip_validation());
		     System.out.println(obj.addtelpone_validation());
		     System.out.println(obj.addfax_validation());*/
		     System.out.println(obj.useridVal());
		    
		    // if(obj.addaddrees_validation().equals("Invalid Address.")){
		     if(obj.useridVal().contains("invalid message address")){
		   	  tryPassScreenshot("WM_CI_13");
		   	  obj.address.clear();
		   	  obj.address.sendKeys("123 bigthon");
		     }
		    
		     //if(obj.addcity_validation().equals("City should be alphabetic characters.")){
		     if(obj.useridVal().contains("Invalid City Name.")){
		     tryPassScreenshot("WM_CI_13");
		   	obj.city.clear();
		   	obj.city.sendKeys("michigon");
		     }
		     //if(obj.addzip_validation().equals("Please enter Zip in one of the following patterns: xxxxx or xxxxx-xxxx.")){
		     if(obj.useridVal().contains("Please enter Zip in one of the following patterns: xxxxx or xxxxx-xxxx.")){
		     tryPassScreenshot("WM_CI_13");
			   	 obj.zip.clear();
			   	 obj.zip.sendKeys("45678");
			     }
		    // if(obj.addtelpone_validation().equals("Invalid Telephone number.")){
		     if(obj.useridVal().contains("Invalid Telephone number.")){
		   	  tryPassScreenshot("WM_CI_13");
		   	obj.telphone.clear();
		   	obj.telphone.sendKeys("678");
		   	obj.telphone1.clear();
		     obj.telphone1.sendKeys("567");
		     obj.telphone2.clear();
		     obj.telphone2.sendKeys("4567");
		     }
		     
		     //if(obj.addfax_validation().equals("Invalid Fax No.")){
		     if(obj.useridVal().contains("Invalid Fax No.")){
		   	  tryPassScreenshot("WM_CI_13");
			obj.faxNo.clear();
		   	obj.faxNo.sendKeys("456");
		   	obj.faxNo1.clear();
		     obj.faxNo1.sendKeys("657");
		     obj.faxNo2.clear();
		     obj.faxNo2.sendKeys("6789");
		     }
 else{
	  tryFailScreenshot("WM_CI_13");   	 
		     }
		     try{
		     obj.add_btn.click();
		     tryPassScreenshot("WM_CI_12");
		     } catch(Exception e){
		    	 tryFailScreenshot("WM_CI_12");   	 
		     }
		     
  }
  
  
 
 
 
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
	   UserLogin us = new UserLogin();
	  us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
	*/	 
  }

  @AfterTest
  public void afterTest() {
  }

}
