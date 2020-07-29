package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Myprofile_Setdruginteraction {
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
	@Test(priority=9)
	 
	 
	 public void SetDrugInteraction() throws Exception  {
		  obj = PageFactory.initElements(driver, Webmoduleobjects.class); 
	 obj.myprofile_lnk.click();
	 try{
	 obj.setdruginteraction_lnk.click();
	 tryPassScreenshot("WM_SDIL_01");
	 }catch (Exception e){
		 tryFailScreenshot("WM_SDIL_01");
	 }
	 try{
	 obj.setdrug_allergies.click();
	 tryPassScreenshot("WM_SDIL_02");
	 }catch (Exception e){
		 tryFailScreenshot("WM_SDIL_02");
	 }
	 
	 //obj.save_lnkText.click();
	 //System.out.println(obj.setdrugsucess_msg());
	 try{
	 obj.setdrug_druginteraction.click();
	 tryPassScreenshot("WM_SDIL_03");
	 }catch (Exception e){
		 tryFailScreenshot("WM_SDIL_03");
	 }

	 Select setallergies=new Select(obj.setdrug_allergies);
	 setallergies.selectByIndex(1);
	Select setdrug=new Select(obj.setdrug_druginteraction);
	setdrug.selectByIndex(3);
	obj.save_lnkText.click();
	if(obj.setdrugsucess_msg().equals("No Changes done to update.")){
		 Select setallergies1=new Select(obj.setdrug_allergies);
		 setallergies1.selectByIndex(0);
		Select setdrug1=new Select(obj.setdrug_druginteraction);
		setdrug1.selectByIndex(2);
		obj.save_lnkText.click();
	}
		tryPassScreenshot("WM_SDIL_05");
		if(obj.setdrugsucess_msg().equals("Drug Interaction Levels updated successfully.")){
			System.out.println("enter");
			obj.save_lnkText.click();
			System.out.println("enter");
			if(obj.setdrugsucess_msg().equals("No Changes done to update.")){
				tryPassScreenshot("WM_SDIL_06");
				obj.reset_LinkText.click();
				tryPassScreenshot("WM_SDIL_07");
			}
			else{
				tryFailScreenshot("WM_SDIL_05");
				tryFailScreenshot("WM_SDIL_06");
				tryFailScreenshot("WM_SDIL_07");
			
			}
		}
	}
  @BeforeTest
  public void beforeTest() throws Exception {
	  /*driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");*/
  }

  @AfterTest
  public void afterTest() {
  }

}
