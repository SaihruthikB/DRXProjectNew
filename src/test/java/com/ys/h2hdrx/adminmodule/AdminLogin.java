package com.ys.h2hdrx.adminmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.Scroll;
import com.ys.h2hdrx.webmodule.WebLocators;

public class AdminLogin {
	public WebDriver driver;
	WebLocators obj;
	
@Test(priority=1)
public void loginAdmin()
{
	 obj = PageFactory.initElements(driver, WebLocators.class);
	 obj.userid_txt.sendKeys("admin");
	  obj.password_txt.sendKeys("password");
	  obj.adminlogin_btn.click();
}
@Test(enabled=false)
public void editUser(String username) throws Exception
{
	obj.userid_txt.sendKeys(username);
	obj.Search_LinkText.click();
	obj.admin_selectUser_rbtn.click();
	Scroll.scrollDown(250);
	obj.admin_EditUser.click();
	Thread.sleep(2000);
	Scroll.scrollDown(250);
}
@Test(enabled=false)
public void changePassword(String oldpassword) throws Exception
{
	//already changed the new password after 5 days expiry so again changing the password to old one
	obj.admin_changepswd.click();
	obj.admin_changepassword_newpassword.sendKeys(oldpassword);
	obj.admin_changepassword_confirmpassword.sendKeys(oldpassword);
	obj.save_lnkText.click();
}
@BeforeTest
public void beforeTest()
{
	driver = Driver.browser("admin");
}}

