package com.ys.h2hdrx.lowprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.adminmodule.AdminUserLogin;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.MedicationHistory;
import com.ys.h2hdrx.webmodule.PatientSearch;
import com.ys.h2hdrx.webmodule.UserLogin;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

public class LowMedicationHistory {
	Webmoduleobjects obj;
	WebDriver driver;
  @Test(priority=1,enabled=false)
  public void disable_sentopharmacy() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	 /* obj.medicationHistory_tab.click();
	  String status = driver.findElement(By.xpath("//*[@id='tooltipTD']")).getText();
	  System.out.println(status);
	  String physician = driver.findElement(By.xpath("//*[@id='scrollableTBodyFull']/table/tbody/tr[1]/td[8]")).getText();
	  System.out.println(physician);
 if(status.equalsIgnoreCase("A * S")&&physician.equalsIgnoreCase("ADAMS  GREEN")){*/
		 
		     MedicationHistory ms  = new MedicationHistory();
		     ms.driver = driver;
		     ms.drugcheckbox();
		     obj.confirmPrescription_LinkText.click();
		   //  driver.findElement(By.xpath("//*[@id="formPatientProfileTabs"]/table/tbody/tr[2]/td/div/div[1]/b/span[1]"))
		  //  System.out.println(obj.useridVal());
  }   @Test(priority=2,enabled=false)
		     public void selectdefault() throws Exception {
	  try{
	 
		      if(obj.useridVal().equals("Default Physican is disable, Please select another physican as default Physican.")){
		    	  DefaultPhysicain df = new DefaultPhysicain();
		    	  df.driver = driver;
		    	  df.Rxpad_DefaultPhysicain();
		    	String str = driver.findElement(By.xpath("//*[@id='dataLinks']/a")).getText();
		    	System.out.println(str);
		      }
	  }catch(NoSuchElementException ne){
		  DefaultPhysiciancheck dp = new  DefaultPhysiciancheck();
    	  dp.driver = driver;
    	  dp.Enabled_DefaultPhysician();
    	  driver.quit();
		  
		  
	  }
		      }
	  
  
  @Test(priority=3)
  public void Enabled_physiacn() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  driver = Driver.browser("admin");
	   AdminUserLogin al = new AdminUserLogin();
		al.driver = driver;
		al.AdminUserLogin();
	    	  Adminedit1 ae = new Adminedit1();
	    		// System.out.println("getDriver"+Driver.getDriver());
	    		ae.driver = driver;
	    		ae.checkboxenable();
	    		ae.Admin_searchdoctor();
	    		driver.quit();
	    		driver = Driver.browser("web");
	    		   UserLogin us = new UserLogin();
	    			// System.out.println("getDriver"+Driver.getDriver());
	    			us.driver = driver;
	    			us.doctorLogin("CSISH001", "Pass@123");
	    			 PatientSearch ps = new PatientSearch();
	    		      ps.driver = driver;
	    		      ps.patientSearch();
	    		      LowMedicationHistory ds  = new LowMedicationHistory();
	    			     ds.driver = driver;
	    			     ds.disable_sentopharmacy();
	    			   
	    	  try{
	    			 
			      if(obj.useridVal().equals("Default Physican is disable, Please select another physican as default Physican.")){
			    	  System.out.println("Default Physican is disable, Please select another physican as default Physican is displayed");
			      }
	    	  }catch(NoSuchElementException ne1){
	    		  driver.findElement(By.tagName("Body")).sendKeys(Keys.CONTROL + "t");
	    		  Adminedit1 ae1 = new Adminedit1();
	    	  
		    		// System.out.println("getDriver"+Driver.getDriver());
		    		ae1.driver = driver;
		    		ae1.checkboxenable();
		    		ae1.Admin_searchdoctor();
	    		driver.quit();
	    		  driver = Driver.browser("web");
	    		   UserLogin us1 = new UserLogin();
	    			// System.out.println("getDriver"+Driver.getDriver());
	    			us1.driver = driver;
	    			us1.doctorLogin("CSISH001", "Pass@123");
	    			 PatientSearch ps1 = new PatientSearch();
	    		      ps1.driver = driver;
	    		      ps1.patientSearch();
	    	  DefaultPhysiciancheck dp1 = new  DefaultPhysiciancheck();
	    	  dp1.driver = driver;
	    	  dp1.Enabled_DefaultPhysician();
	    		
	    	  	    
	    	    /*	String str = driver.findElement(By.xpath("//*[@id='dataLinks']/a")).getText();
	    	    	System.out.println(str); */
	    	  }
	    	  }    
 
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = Driver.browser("admin");
	  AdminUserLogin al = new AdminUserLogin();
		al.driver = driver;
		al.AdminUserLogin();
		 AdminEdit ae = new AdminEdit();
			// System.out.println("getDriver"+Driver.getDriver());
			ae.driver = driver;
			ae.Admin_disable();
			ae.Admin_searchdoctor();
	   driver.quit();
	   driver = Driver.browser("web");
	   UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("CSISH001", "Pass@123");
		 PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();
  }

  @AfterTest
  public void afterTest() {
  }

}
