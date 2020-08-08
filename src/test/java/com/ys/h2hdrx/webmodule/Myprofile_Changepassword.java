package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Myprofile_Changepassword {
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
	@Test(priority=8)
	  
	  
	  public void ChangePassword() throws Exception {
		 obj= PageFactory.initElements(driver, Webmoduleobjects.class);
		// try {
			 obj.myprofile_lnk.click();
	     obj.myprofile_ChangePassword.click();
	     //WM_PCP_01
	     obj.update.click();
	     obj.reset_LinkText.click();
	     /*tryPassScreenshot("WM_PCP_10");
		 }catch(Exception e){
			 tryFailScreenshot("WM_PCP_10");
		 }*/
		// try {
	     obj.myprofile_oldpswrd_txt.sendKeys("pass");
	     obj.myprofile_newpswrd_txt.sendKeys("pass");
	     obj.myprofile_confirmpswrd_txt.sendKeys("pass");
	     obj.reset_LinkText.click();
//	     tryPassScreenshot("WM_PCP_10");
		/* }catch(Exception e){
			 tryFailScreenshot("WM_PCP_10");
		 }*/
	     obj.update.click();
	   /* System.out.println(obj.emptypractice_validation());
	     System.out.println(obj.emptyaddress_validation());
	     System.out.println(obj.emptycity_validation());*/
	    // if(obj.emptypractice_validation().equals("Old Password is required.")){
	     if(obj.useridVal().contains("Old Password is required.")){
	   	 // tryPassScreenshot("WM_PCP_03");
	   	obj.myprofile_oldpswrd_txt.clear();
	   	obj.myprofile_oldpswrd_txt.sendKeys("pass");
	     
	     
	    // if(obj.emptyaddress_validation().equals("New Password is required.")){
	   	if(obj.useridVal().contains("New Password is required.")){
	   	//tryPassScreenshot("WM_PCP_03");
	   	obj.myprofile_newpswrd_txt.clear();
	   	obj.myprofile_newpswrd_txt.sendKeys("pass@123");
	     
	 
	    // if(obj.emptycity_validation().equals("Confirm Password is required.")){
	    	  if(obj.useridVal().contains("Confirm Password is required.")){
	   	 // tryPassScreenshot("WM_PCP_03");
	   	 obj.myprofile_confirmpswrd_txt.clear();
	   	 obj.myprofile_confirmpswrd_txt.sendKeys("pass@123");
	   	
	   	
	     }}
	   
	   	  
	     }
	     else{
	    	 tryFailScreenshot("WM_PCP_03");
	     }
	     obj.update.click();
	    // System.out.println(obj.myprofileoldpsw_validation());
	   // if(obj.myprofileoldpsw_validation().equals("Invalid Old Password.")){
	     if(obj.useridVal().contains("Invalid Old Password.")){
	    	//tryPassScreenshot("WM_PCP_08");
	     	obj.myprofile_oldpswrd_txt.clear();
	       	obj.myprofile_oldpswrd_txt.sendKeys("Pass@123");
	    	obj.myprofile_newpswrd_txt.clear();
	       	obj.myprofile_newpswrd_txt.sendKeys("Pass@123");
	        obj.myprofile_confirmpswrd_txt.clear();
	      	 obj.myprofile_confirmpswrd_txt.sendKeys("pass@3");
	      	  obj.update.click();
	      	
	      	
	    }
	    else{
	   	// tryFailScreenshot("WM_PCP_08");
	    }
	   // System.out.println(obj.myprofileoldpsw_validation());
	   // if(obj.myprofileoldpsw_validation().equals("New Password and Confirm Password should be same.")){
	     if(obj.useridVal().contains("New Password and Confirm Password should be same.")){
	   // tryPassScreenshot("WM_PCP_09");
	    obj.myprofile_oldpswrd_txt.clear();
		   	obj.myprofile_oldpswrd_txt.sendKeys("Pass@123");
		  obj.myprofile_newpswrd_txt.clear();
		 obj.myprofile_confirmpswrd_txt.clear();
		  	  obj.update.click();
	 }
	    else{
	   	 //tryFailScreenshot("WM_PCP_09");
	    }
	    //System.out.println(obj.emptypractice_validation());
		    // System.out.println(obj.emptyaddress_validation());
	   // if(obj.emptypractice_validation().equals("New Password is required.")){
	     if(obj.useridVal().contains("New Password is required.")){
	    	  //tryPassScreenshot("WM_PCP_10");
	    	//if(obj.emptyaddress_validation().equals("Confirm Password is required.")){
	    		if(obj.useridVal().contains("Confirm Password is required.")){
	    		 // tryPassScreenshot("WM_PCP_10");
	    		obj.myprofile_oldpswrd_txt.clear();
	    	   	obj.myprofile_oldpswrd_txt.sendKeys("Pass@123");
	    		obj.myprofile_newpswrd_txt.clear();
	    	   	obj.myprofile_newpswrd_txt.sendKeys("pas");
	    	    obj.myprofile_confirmpswrd_txt.clear();
	    	  	 obj.myprofile_confirmpswrd_txt.sendKeys("pas");
	    	  	  obj.update.click();
	    	}
	    }
	    else{
	   	 //tryFailScreenshot("WM_PCP_10");
	    }
	  	 //System.out.println(obj.myprofileoldpsw_validation());
	  	// if(obj.myprofileoldpsw_validation().equals("New Password should be at least 8 in length, must contain at least one capital letter,small letter,one numeric value and a special character.")){
	     if(obj.useridVal().contains("New Password should be at least 8 in length, must contain at least one capital letter,small letter,one numeric value and a special character.")){
	     //tryPassScreenshot("WM_PCP_05");
	  		obj.myprofile_oldpswrd_txt.clear();
	       	obj.myprofile_oldpswrd_txt.sendKeys("Pass@123");
	    	obj.myprofile_newpswrd_txt.clear();
	       	obj.myprofile_newpswrd_txt.sendKeys("Pass@123");
	        obj.myprofile_confirmpswrd_txt.clear();
	      	 obj.myprofile_confirmpswrd_txt.sendKeys("Pass@123");
	      	  obj.update.click();
	  	  	
	  	 }
	  	else{
	   	// tryFailScreenshot("WM_PCP_05");
	    }
	  	//System.out.println(obj.myprofileoldpsw_validation());
	  	// if(obj.myprofileoldpsw_validation().equals("New Password should be different than Old Password.")){
	     if(obj.useridVal().contains("New Password should be different than Old Password.")){
	   		//tryPassScreenshot("WM_PCP_06");
	  	 }
	  	else{
	   	 //tryFailScreenshot("WM_PCP_06");
	    }
	   		obj.myprofile_oldpswrd_txt.clear();
	       	obj.myprofile_oldpswrd_txt.sendKeys("Pass@123");
	    	obj.myprofile_newpswrd_txt.clear();
	       	obj.myprofile_newpswrd_txt.sendKeys("Rass@123");
	        obj.myprofile_confirmpswrd_txt.clear();
	      	 obj.myprofile_confirmpswrd_txt.sendKeys("Rass@123");
	      	  obj.update.click();
	      	//System.out.println(obj.myprofile_sucess_message());  
	  
	      	 if(obj.myprofile_sucess_message().equals("Password updated.")){
	      		//tryPassScreenshot("WM_PCP_07");
	      	 }
	      	
	      	 else{
	      		obj.myprofile_oldpswrd_txt.sendKeys("Pass@234");
	        	obj.myprofile_newpswrd_txt.clear();
	           	obj.myprofile_newpswrd_txt.sendKeys("Pass@123");
	            obj.myprofile_confirmpswrd_txt.clear();
	          	 obj.myprofile_confirmpswrd_txt.sendKeys("Pass@123");
	          	//tryPassScreenshot("WM_PCP_07");
	          	 obj.update.click();
	      	 }
	      	if(obj.myprofile_sucess_message().equals("Password updated.")){
	      		//tryPassScreenshot("WM_PCP_07");
	      	 }
	  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");*/
  }

  @AfterTest
  public void afterTest() {
  }

}
