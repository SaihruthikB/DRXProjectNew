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

public class Myprofile_favouritedrug {
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
	int i;
  @Test(priority=1)
  public void favouritedrug() throws Exception {
	 obj= PageFactory.initElements(driver, Webmoduleobjects.class);
	  try{
	  obj.myprofile_lnk.click();
	 obj.favourite_lnk.click();
	 tryPassScreenshot("WM_FDD_01");
	 obj.add_btn.click();
	 tryPassScreenshot("WM_FDD_04");
	  }catch(Exception e){
		  tryFailScreenshot("WM_FDD_01");
		  tryFailScreenshot("WM_FDD_04");
	  }
	 obj.drugsearch_txt.click();
	 System.out.println(obj.useridVal());
	if(obj.useridVal().equals("First three letters of Drug name are required.")){
		 tryPassScreenshot("WM_FDD_05");
		 obj.drugName_txt.sendKeys("lipi");
		 obj.drugsearch_txt.click();
		 tryPassScreenshot("WM_FDD_06");
		obj.practicelist_but.click();
		System.out.println(obj.useridVal());
		
	}
	else{
		  tryFailScreenshot("WM_FDD_05");
		  tryFailScreenshot("WM_FDD_06");
	}
	if(obj.useridVal().equals("Please select drugs.")){
		// drug list
		 tryPassScreenshot("WM_FDD_11");
			WebElement WebElement = obj.favouritedrug_table;
			List<WebElement> list1 = WebElement.findElements(By.tagName("tr"));

			System.out.println(list1.size());
			for (int i = 1; i <= list1.size(); i++) {
				obj.favoDrugs_list(i);
				System.out.println(obj.favoDrugs_list(i));
				if (obj.favoDrugs_list(i).trim().equalsIgnoreCase("LipidShield Plus Oral Tablet")) {
					
					obj.favoDrugs_checkboxes(i).click();
					obj.practicelist_but.click();
					//System.out.println(obj.patientValidation());
					System.out.println(obj.useridVal());
					//if(obj.patientValidation().equals("Please choose a quantity qualifier for the drug selected.")){
					if(obj.useridVal().equals("Please choose a quantity qualifier for the drug selected.")){
						 tryPassScreenshot("WM_FDD_12");				
			   Select qualifier = new Select(obj.favoDrugs_qualifier(i));
			   qualifier.selectByIndex(5);
			   obj.favoDrugs_quantity(i).clear();
			   obj.favoDrugs_quantity(i).sendKeys("5");
			   obj.favoDrugs_quantity(i).clear();
			   obj.favoDrugs_quantity(i).sendKeys("6");
			   obj.practicelist_but.click();
			  // System.out.println(obj.patientValidation());
			   System.out.println(obj.useridVal());
			  // if(obj.patientValidation().equals("Drugs With No SIG can not be added in Favorite Drugs List at this time. Please use Rx-Pad page to add it.")){
			   if(obj.useridVal().equals("Drugs With No SIG can not be added in Favorite Drugs List at this time. Please use Rx-Pad page to add it.")){
				   tryPassScreenshot("WM_FDD_15");
				  
				   obj.back_LinkText.click();
				   break;
				  
			   }
					}
				}	}
				}
	else{
		tryFailScreenshot("WM_FDD_11");
		tryFailScreenshot("WM_FDD_12");
		tryFailScreenshot("WM_FDD_15");
		}
	}
  @Test(priority=2)
  public void addpracticelist() throws Exception {
	  obj.myprofile_lnk.click();
	  obj.favourite_lnk.click();
	  obj.add_btn.click();
	  obj.drugName_txt.sendKeys("lipi");
		 obj.drugsearch_txt.click();
	  WebElement WebElement = obj.favouritedrug_table;
		List<WebElement> list1 = WebElement.findElements(By.tagName("tr"));

		System.out.println(list1.size());
		for (int i = 1; i <= list1.size(); i++) {
			obj.favoDrugs_list(i);
			System.out.println(obj.favoDrugs_list(i));
			if (obj.favoDrugs_list(i).trim().equalsIgnoreCase("Lipitor 20 MG Oral Tablet")) {
				
				obj.favoDrugs_checkboxes(i).click();
		   Select qualifier = new Select(obj.favoDrugs_qualifier(i));
		   qualifier.selectByIndex(5);
		   obj.favoDrugs_quantity(i).clear();
		   obj.favoDrugs_quantity(i).sendKeys("5");
		   obj.favoDrugs_refill(i).clear();
		   obj.favoDrugs_refill(i).sendKeys("6");
		   obj.practicelist_but.click(); 
		   
		   tryPassScreenshot("WM_FDD_14");
		   break;
			}
		}			
		//System.out.println(obj.addpractice_sucess(i));	
		if(obj.addpractice_sucess(i).trim().equals("Added selected drugs to favorite list by practice.")){
			
			System.out.println("Passed the test");
			// This should finish the test below lines are not required.
			/*obj.patientsearch_link.click();
		PatientSearch ps = new PatientSearch();
		ps.patientSearch();*/ 
			
			///need to discuss with nagamani for this 
		}
		
	
  }
  @Test(priority=3)
  public void practicefavoritedrug() throws Exception {
	  //obj= PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.patientsearch_tab.click();
  PatientSearch ps = new PatientSearch();
  ps.driver=driver;
	ps.patientSearch();
	 obj.practicefavorite_lnk.click();
	 obj.practicesearch_txt.sendKeys("lipi");
	 obj.search_btn.click();
	 WebElement WebElement = obj.practicefavdrug_table;
		List<WebElement> list1 = WebElement.findElements(By.tagName("tr"));

		System.out.println(list1.size());
		for (int i = 1; i <= list1.size(); i++) {
			//obj.medication_druglist(i);
	System.out.println(obj.medication_druglist(i));
			System.out.println(obj.favorite_qualifier(i));
			if(obj.medication_druglist(i).trim().equals("Lipitor 20 MG Oral Tablet") && (obj.favorite_qualifier(i).trim().equalsIgnoreCase("5.0"))){
				obj.favorite_druglink(i).click();
				break;
			}
		}
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	 driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
  }

  @AfterTest
  public void afterTest() {
  }

}
