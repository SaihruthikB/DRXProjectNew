package com.ys.h2hdrx.lowprofile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.adminmodule.AdminUserLogin;
import com.ys.h2hdrx.webmodule.AdminLocators;
import com.ys.h2hdrx.webmodule.Driver;

public class AdminEdit {
	public WebDriver driver;
	AdminLocators obj;
	int i;
	private boolean flag;

	@Test(priority=1)
	public void Admin_disable() {
		obj = PageFactory.initElements(driver, AdminLocators.class);
		Select vendor = new Select(obj.registerdoctor_vendor);
		vendor.selectByIndex(14);
		Select practice = new Select(obj.registerdoctor_practice);
		practice.selectByIndex(1);

		/*Select profile = new Select(obj.profile);
		//Select profile = new Select(obj.trunk_profile);
		profile.selectByIndex(5);*/
		obj.edit_search.click();
		
	}
	@Test(priority=2)
	public void Admin_searchdoctor() {
		WebElement userinfo = obj.searchuserinfo;
		List<WebElement> userlist = userinfo.findElements(By.tagName("tr"));
		System.out.println(userlist.size());
		WebElement next = obj.adminedit_next;
		while (next != null) {
			
			for (int i = 1; i < userlist.size(); i++) {
				System.out.println(obj.userslist(i));
				if (obj.userslist(i).trim().equalsIgnoreCase("Alexa kelly")) {
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
		
		if(obj.disable_checkbox.isSelected()){
			obj.disable_checkbox.click();
		    obj.edit_save.click();
		}
		
		else{
			obj.disable_checkbox.click();
		    obj.edit_save.click();
		}
		
	}

	@BeforeTest
	public void beforetest() {
		/*driver = Driver.browser("admin");
		AdminUserLogin al = new AdminUserLogin();
		al.driver = driver;
		al.AdminUserLogin();*/
		/*
		 * Driver ds=new Driver(); ds.browser("web");
		 */
	}

}
