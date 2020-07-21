package com.ys.h2hdrx.lowprofile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AdminLocators;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.UserLogin;
import com.ys.h2hdrx.webmodule.Webmoduleobjects;

public class Sendtopharmacy {
	Webmoduleobjects obj;
	WebDriver driver;
	AdminLocators obj1;
	private boolean flag;
  @Test (priority=4)
  public void onbehalflink() throws InterruptedException {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj1 = PageFactory.initElements(driver, AdminLocators.class);
	  obj.onbehalf_link.click();
	  Thread.sleep(3000);
	  WebElement list = obj.onbehalftable;
	  List<WebElement> onbehallist = list.findElements(By.xpath("div"));
	  System.out.println(onbehallist);
	  for(int i =1;i< onbehallist.size();i++){
		String str = obj.onbehalflist.getText();
	  System.out.println(str);  
	  }
	
  }
	 /* driver.quit();
	  driver = Driver.browser("admin");
		AdminUserLogin al = new AdminUserLogin();
		al.driver = driver;
		al.AdminUserLogin();
	  AdminEdit ae = new AdminEdit();
	  ae.driver=driver;
	  ae.Admin_disable();
	  WebElement userinfo = obj1.searchuserinfo;
		List<WebElement> userlist = userinfo.findElements(By.tagName("tr"));
		System.out.println(userlist.size());
		WebElement next = obj1.adminedit_next;
		while (next != null) {
			
			for (int i = 1; i < userlist.size(); i++) {
				System.out.println(obj1.userslist(i));
				if (obj1.userslist(i).trim().equalsIgnoreCase("ADAMS GREEN")) {
					obj1.radiobuttons(i).click();
					obj1.edit_button.click();
					flag = true;
					break;
				}

			}

			if (flag == true) {
				break;
			}
			obj1.adminedit_next.click();
		}
		
		obj1.disable_checkbox.click();
		obj1.edit_save.click();
  }*/
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = Driver.browser("web");
	   UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("VANAMZA001", "Pass@123");
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
