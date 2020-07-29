package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Allergies  {
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
  @Test(priority=7)
  public void allergies_add() throws Exception {
	
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		
	obj.Allergies_tab.click();
		//System.out.println(obj.allergiesheader());
		
	 obj.addAllergy_btn.click();
	  //System.out.println(obj.noallergies());
	  if(obj.noallergies().equals("No Known Allergy")){
		  try{
		  //tryPassScreenshot("WM_A_09");
		  obj.add_btn.click();
		  //obj.addAllergy_btn.click();
		  obj.drug_txt.sendKeys("lipi");
		 WebElement web = obj.drugdropdown;
		 List<WebElement> dropdownlist = web.findElements(By.tagName("tr"));
		  System.out.println(dropdownlist.size());
		  for(int i =1;i< dropdownlist.size();i++){
			  //{
		  obj.drug_txt.sendKeys("lipi");
		 WebElement web1 = obj.drugdropdown;
		  Select options = new Select(web1);
		options.selectByIndex(1);
		 Actions a = new Actions(driver);
		 a.doubleClick(web1).build().perform();
		  }
		  }catch(Exception e){
			 // tryFailScreenshot("WM_A_09");
		  }
		    
	  }
	 
	  else{
		//obj.Allergies_tab.click();
		  //obj.addAllergy_btn.click();
		  obj.drug_txt.sendKeys("lipi");
		  Thread.sleep(3000);
			 WebElement web = obj.drugdropdown;
			 List<WebElement> druglist = new Select(web).getOptions();
			  System.out.println(druglist.size());
			  for(int i =1;i<=druglist.size();i++){
				System.out.println(obj.Druglist(i)); 
				
				if(obj.Druglist(i).equalsIgnoreCase("LipiChol 540")){
					try{
				Actions action = new Actions(driver);
				action.doubleClick(obj.Druglists(i)).build().perform();
				//tryPassScreenshot("WM_A_10");
				break;
				
				
				}catch(Exception e){
					//tryFailScreenshot("WM_A_10");
				}
                  
                  
			  }
			    }
	  }
  }
			  @Test(priority=8)
			  public void allergies_addreaction() throws Exception {
			  //System.out.println(obj.useridVal());
			  if(obj.useridVal().equalsIgnoreCase("Please select or enter a reaction.")){
				  //tryPassScreenshot("WM_A_11");
				  WebElement allergies =obj.allergies_tab;
			    	List<WebElement> list = allergies.findElements(By.tagName("td"));
			    	 System.out.println(list.size());
					  for(int j =1;j<=list.size();j++){
						 System.out.println(obj.allergyreactions(j));
						  if(obj.allergyreactions(j).trim().equalsIgnoreCase("' Anemia")){
							 obj.allergyreactioncheckbox(j).click();
							obj.otherallergies_txt.sendKeys("other");
							break;
						  }
					  }
				            obj.allergies_calender.click();
				            obj.allergies_calendertomarow.click();
				           /* obj.add_btn.click();
				            if(obj.useridVal().equalsIgnoreCase("Onset Date should not be a future date.")){
				            	 obj.allergies_calender.click();
				            	obj.allergies_todaydate.click();*/
						          obj.allergies_note.sendKeys("Getting vomiting imediate after swallowing tablet");
						          obj.add_btn.click();
						         // tryPassScreenshot("WM_A_12");
						          
					        	  
				            }
				               
								
			  
			  if(obj.allergiesheader().trim().equalsIgnoreCase("Reaction(s)")){
	        	  
			  		
		         
			  
			  }
			  else{
				  //tryFailScreenshot("WM_A_11");
				  //tryFailScreenshot("WM_A_12");
			  }
            
			  obj.allergies_sort.click();
			  obj.add_btn.click();  //// need to be removed
        	  System.out.println("reasons is seleted");
			  }
			 
			  //}
	 
			  @Test(priority=9)
			  public void allergies_edit() throws Exception {
				
						//System.out.println(obj.allergiesheader());
						
					
				  WebElement list = obj.satff_webtable;
				  List<WebElement> allergieslist=list.findElements(By.tagName("tr"));
				  System.out.println(allergieslist.size());
				  for(int i =1;i<allergieslist.size();i++){
					 System.out.println(obj.Staff_names(i));
					 System.out.println(obj.allergiesstatus(i));
					 if ((obj.Staff_names(i).trim().contains("xya")) ) {
					
						  obj.edit(i).click();
						  obj.otherallergies_txt.clear();
						  obj.otherallergies_txt.sendKeys("jaram");
						  obj.add_btn.click();
						  break;
					  }
				  }	  
				  }
				 

					  @Test(priority=10)
					  public void allergies_inactive() throws Exception {
						 
								//System.out.println(obj.allergiesheader());
								
							
						  WebElement list = obj.satff_webtable;
						  List<WebElement> allergieslist=list.findElements(By.tagName("tr"));
						  System.out.println(allergieslist.size());
						  for(int i =1;i<=allergieslist.size();i++){
							 System.out.println(obj.Staff_names(i));
							 System.out.println(obj.allergiesstatus(i));
							 if ((obj.Staff_names(i).trim().equalsIgnoreCase("xya")) ) {
							//System.out.println(obj.inactive(i));
								 
								 obj.inactive(i).click();
								 break;	 
									  
						  }
							
						  }
						  
					  }
					  @Test(enabled=false)
					  public void allergies_delete() throws Exception {
						
								//System.out.println(obj.allergiesheader());
								
							
						  WebElement list = obj.satff_webtable;
						  List<WebElement> allergieslist=list.findElements(By.tagName("tr"));
						  System.out.println(allergieslist.size());
						  for(int i =1;i<=allergieslist.size();i++){
							 System.out.println(obj.Staff_names(i));
							 System.out.println(obj.allergiesstatus(i));
							 if ((obj.Staff_names(i).trim().contains("xya")) ) {
							
								 obj.delete(i).click();
								  
								  break;
							  }
								  
						  }
					  }
	  
				  
  
  @BeforeTest
  public void beforeTest() throws Exception {
//	 driver = Driver.browser("web");
//	  UserLogin us = new UserLogin();
//		// System.out.println("getDriver"+Driver.getDriver());
//		us.driver = driver;
//		us.doctorLogin("MIDANAR001", "Pass@123");
//		 PatientSearch ps = new PatientSearch();
//	      ps.driver = driver;
//	      ps.patientSearch();
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
