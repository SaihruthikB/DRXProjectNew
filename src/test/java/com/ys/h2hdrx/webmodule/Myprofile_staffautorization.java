package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Myprofile_staffautorization extends UserLogin {
  @Test(priority=5)
  public void staffupadte() throws Exception {
	  obj= PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.myprofile_lnk.click();
	  try{
	  obj.staffauthrozation_lnk.click();
	tryPassScreenshot("WM_SA_01");
	tryPassScreenshot("WM_SA_02");
	  obj.satff_search.sendKeys("sri");
	  obj.search_btn.click();
	 tryPassScreenshot("WM_SA_03");
	  }catch(Exception e){
		tryFailScreenshot("WM_SA_01");
		  tryFailScreenshot("WM_SA_02");
		  tryFailScreenshot("WM_SA_03");
	  }
	  WebElement web=obj.satff_webtable;
	  
	List<WebElement> list= web.findElements(By.tagName("tr"));
	System.out.println(list.size());
	for(int i =1;i<=list.size();i++){
		System.out.println(obj.Staff_names(i));
	System.out.println(obj.Staff_profilenames(i));
		if(obj.Staff_names(i).trim().equals("sri srinith") && (obj.Staff_profilenames(i).trim().equals("Clinical Staff Nurse"))){
	   
		//obj.Staff_obn_checkboxes(i).isSelected();
		if(obj.Staff_obn_checkboxes(i).isEnabled()){
			obj.Staff_obn_checkboxes(i).click();
		    //obj.staff_spcheckbox().click();
		   // obj.staff_prcheckbox().click();
		   // obj.staff_epacheckbox().click();
		   // obj.staff_epmcheckbox().click();
		    obj.update_LinkText.click();
		    break;
		}
		else{
			obj.Staff_obn_checkboxes(i).click();
		    //obj.staff_spcheckbox().click();
		   // obj.staff_prcheckbox().click();
		   // obj.staff_epacheckbox().click();
		   // obj.staff_epmcheckbox().click();
		    obj.update_LinkText.click();
		    break;
		}
		}
	
	

	else {
		
		if(obj.Staff_names(i).trim().equals("cairns chris") && (obj.Staff_profilenames(i).trim().equals("Clinical Staff Medical Assistant"))){
				if(obj.Staff_obn_checkboxes(i).isSelected()){
					obj.Staff_obn_checkboxes(i).click();
				    //obj.staff_spcheckbox().click();
				   // obj.staff_prcheckbox().click();
				   // obj.staff_epacheckbox().click();
				   // obj.staff_epmcheckbox().click();
				    obj.update_LinkText.click();
				    break;
				}
				else{
					obj.Staff_obn_checkboxes(i).click();
				    //obj.staff_spcheckbox().click();
				   // obj.staff_prcheckbox().click();
				   // obj.staff_epacheckbox().click();
				   // obj.staff_epmcheckbox().click();
				    obj.update_LinkText.click();
				    break;
				
				
		}}}}
	System.out.println(obj.staff_sucessmsg());
	if(obj.staff_sucessmsg().equals("Staff Authorization has been updated.")){
	tryPassScreenshot("WM_SA_04");
	//obj.satff_search.sendKeys("chris");
	obj.savedreset_btn.click();
	tryPassScreenshot("WM_SA_06");
	}
	else{
	tryFailScreenshot("WM_SA_04");
	tryFailScreenshot("WM_SA_06");
	}
	
  }
  @Test(priority=6,enabled=false)
  public void staffnext() throws Exception {
	  obj.myprofile_lnk.click();
	  
	  obj.staffauthrozation_lnk.click();
	  for(int i=1;i<=149;i++){
	  obj.next_link.click();
	if(obj.Staff_names(i).trim().equals("yten mar")&&(obj.Staff_profilenames(i).trim().equals("Non-Clinical Staff Front Desk Staff"))){
		  
		obj.previous_link.click();
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
