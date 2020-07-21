package com.ys.h2hdrx.lowprofile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.adminmodule.AdminUserLogin;
import com.ys.h2hdrx.webmodule.AdminLocators;
import com.ys.h2hdrx.webmodule.Driver;

public class Supervisior_edit {
	AdminLocators obj;
	WebDriver driver;
	private boolean flag;
  @Test(priority=6)
  public void Supervisiordropdown() throws Exception {
	  obj = PageFactory.initElements(driver, AdminLocators.class);
	 
	  Select vendor = new Select(obj.registerdoctor_vendor);
		vendor.selectByIndex(14);
		Select practice = new Select(obj.registerdoctor_practice);
		practice.selectByIndex(1);

		Select profile = new Select(obj.profile);
		//Select profile = new Select(obj.trunk_profile);
		profile.selectByIndex(6);
		obj.edit_search.click();
		WebElement userinfo = obj.searchuserinfo;
		List<WebElement> userlist = userinfo.findElements(By.tagName("tr"));
		System.out.println(userlist.size());
		WebElement next = obj.adminedit_next;
		while (next != null) {
			
			for (int i = 1; i < userlist.size(); i++) {
				System.out.println(obj.userslist(i));
				if (obj.userslist(i).trim().equalsIgnoreCase("Andrew Taylor")) {
					obj.radiobuttons(i).click();
					obj.edit_button.click();
					flag = true;
					break;
				}

			}

			if (flag == true) {
				break;
			}
			obj.adminedit_next.click();
		}
  }
		 @Test(priority=7)
		  public void disable_Supervisiordropdown() throws Exception{
		String state = obj.sup_state.getText();
		System.out.println(state);
		
		if(state.equals("Florida")){
			obj.edit_back.click();
			//obj.edit_reset.click();
			//Select profile1 = new Select(obj.trunk_profile);
			Select profile1 = new Select(obj.profile);
			profile1.selectByIndex(0);
			obj.edit_lastname.sendKeys("aaram");
			obj.edit_firstname.sendKeys("len");
			obj.edit_search.click();
			obj.search_firstcheckbox.click();
			obj.edit_button.click();
			if(obj.disable_checkbox.isSelected()){
				obj.disable_checkbox.click();
			    obj.edit_save.click();
			    obj.changepsw_back.click();
			    obj.edit_reset.click();
			    Supervisior_edit se = new Supervisior_edit();
			    se.driver=driver;
			    se.Supervisiordropdown();
			}
			else{
				obj.disable_checkbox.click();
			    obj.edit_save.click();
			    obj.changepsw_back.click();
			    obj.edit_reset.click();
			    Supervisior_edit se = new Supervisior_edit();
			    se.driver=driver;
			    se.Supervisiordropdown();
			    
				}
			}
			   
			    if(obj.sup_enabletone.equals("LEN  AARAM")){
			    	System.out.println("supervisior is not enabled");
			    	Supervisior_sendtopharmacy ss = new Supervisior_sendtopharmacy();
			    	ss.driver=driver;
			    	ss.sendtopharmacy();
			    }
			    else{
			    	/*obj.disable_checkbox.click();
				    obj.edit_save.click();
				    obj.changepsw_back.click();
				    obj.edit_reset.click();
				    Supervisior_edit se1 = new Supervisior_edit();
				    se1.driver=driver;
				    se1.Supervisiordropdown();
				    if(obj.supdisable_firstone.equals("Select One")){
				    	System.out.println("supervisior is  disabled");*/
				    	
				    	Supervisior_sendtopharmacy ss = new Supervisior_sendtopharmacy();
				    	ss.driver=driver;
				    	ss.sendtopharmacy();
			    }
			
			
			
			/*else{
				obj.disable_checkbox.click();
			    obj.edit_save.click();
			    obj.changepsw_back.click();
			    obj.edit_reset.click();
			    Supervisior_edit se = new Supervisior_edit();
			    se.driver=driver;
			    se.Supervisiordropdown();
			    if(obj.supdisable_firstone.equals("Select One")){
			    	System.out.println("supervisior is  disabled");
			    	
			    	Supervisior_sendtopharmacy ss = new Supervisior_sendtopharmacy();
			    	ss.driver=driver;
			    	ss.sendtopharmacy();
			    	
			    }
			    else{
			    	System.out.println("supervisior is disabled");
			    }
			}*/
			
		
		/*else{
			Select state1 = new Select(obj.edit_state);
			state1.selectByIndex(13);
			obj.edit_save.click();
		}*/
		
  }
  @BeforeTest
  public void beforeTest() {
	  driver = Driver.browser("admin");
		AdminUserLogin al = new AdminUserLogin();
		al.driver = driver;
		al.AdminUserLogin();
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
