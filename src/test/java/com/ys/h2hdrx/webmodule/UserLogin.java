package com.ys.h2hdrx.webmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.ys.h2hdrx.adminmodule.AdminLogin;

public class UserLogin {
	// public static WebDriver driver;
	Webmoduleobjects obj;
	public WebDriver driver;

	// static WebDriver driver;
	@Test(priority=1)
	@DataProvider(name = "physicianlogin")
	public Object[][] loginUser() throws Exception {
		//MyScreenRecorder.startRecording("UserLogin");
		InputStream file = new InputStream("Input Test Data/LoginUsers.xlsx");
		// file.getCellData(0, cellnum)
		int rowcount = file.rowCount(2);
		Object[][] data = new Object[rowcount - 1][2];
		for (int i = 1; i <rowcount; i++) {
			data[i - 1][0] = file.getCellData(6, i, 0);
			data[i - 1][1] = file.getCellData(6, i, 1);
			System.out.println(data[i - 1][0]);
			System.out.println(data[i - 1][1]);
		}
		return data;
	}
	

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

	@Test(priority=2,dataProvider = "physicianlogin")
	public void doctorLogin(String username, String password) throws Exception {
		
		System.out.println(username);
		System.out.println(password);
		obj = PageFactory.initElements(driver, Webmoduleobjects.class);
		//remove comments after user is disable
		//if(username.equals("CADW OR001")){
		obj.password_txt.sendKeys(password);
		obj.userlogin_btn.click();
		Thread.sleep(4000);
		if (obj.useridVal().contains("User Id is required.")) {
			tryPassScreenshot("WM_L_04");
		} else {
			tryFailScreenshot("WM_L_04");
		}
		obj.password_txt.clear();
		obj.userid_txt.sendKeys(username);
		obj.userlogin_btn.click();
		if (obj.useridVal().contains("Password is required")) {
			tryPassScreenshot("WM_L_05");
		} else {
			tryFailScreenshot("WM_L_05");
		}
		obj.userid_txt.clear();
		obj.password_txt.clear();
		obj.userlogin_btn.click();
		System.out.println(obj.useridVal());
		if ((obj.useridVal().contains("User Id is required")) && (obj.pswdVal().contains("Password is required"))) {
			tryPassScreenshot("WM_L_06");
		} else {
			tryFailScreenshot("WM_L_06");
		}
		obj.userid_txt.sendKeys("jhguy");
		obj.password_txt.sendKeys("nbjhg");
		obj.userlogin_btn.click();
		if (obj.useridVal().contains("Login is invalid")) {
			tryPassScreenshot("WM_L_07");
		} else {
			tryFailScreenshot("WM_L_07");
		}
		obj.userid_txt.clear();
		obj.password_txt.clear();
		obj.userid_txt.sendKeys(username);
		obj.password_txt.sendKeys("nbjhg");
		obj.userlogin_btn.click();
		if (obj.useridVal().contains("Login is invalid")) {
			tryPassScreenshot("WM_L_08");
		} else {
			tryFailScreenshot("WM_L_08");
		}
		obj.userid_txt.clear();
		obj.password_txt.clear();
		obj.userid_txt.sendKeys("sdsfs");
		obj.password_txt.sendKeys(password);
		obj.userlogin_btn.click();
		if (obj.useridVal().contains("Login is invalid")) {
			tryPassScreenshot("WM_L_09");
		} else {
			tryFailScreenshot("WM_L_09");
		}
		obj.resetlogin_btn.click();
		String user = obj.userid_txt.getText();
		String pass = obj.password_txt.getText();
		if ((user.equalsIgnoreCase("")) && (pass.equalsIgnoreCase(""))) {
			tryPassScreenshot("WM_L_10");
		} else {
			tryFailScreenshot("WM_L_10");
		}
		obj.userid_txt.sendKeys(username);
		obj.password_txt.sendKeys(password);
		obj.userlogin_btn.click();
		
		Thread.sleep(2000);
		System.out.println("page title is: " + obj.pageTitle_txt());
		if (obj.pageTitle_txt().contains("Digital Rx | EUA")) {
			tryPassScreenshot("WM_L_12");
			if (obj.agree_btn.isEnabled()) {
				tryFailScreenshot("WM_L_14");
			} else {
				tryPassScreenshot("WM_L_14");
			}
			obj.agree_cbox.click();
			obj.agree_btn.click();
			if (obj.pageTitle_txt().contains("Digital Rx | Rx Pad")) {
				System.out.println("User login sucess after agreement page");
				tryPassScreenshot("WM_L_15");
			} else {
				System.out.println("User login failed after agreement page");
				tryFailScreenshot("WM_L_15");
			}
		} else if (obj.pageTitle_txt().contains("Digital Rx | Login")) {
			if (obj.pswdchange_txt().contains("Password has expired. Please change the password:")) {
				//tryPassScreenshot("WM_L_18");
				obj.pswdchange_popup_submit_btn.click();
				if ((obj.pswdchange_popup_oldpswrd_valtxt().contains("Old Password is required."))
						&& (obj.pswdchange_popup_newpswrd_valtxt().contains("New Password is required."))
						&& (obj.pswdchange_popup_cnfrmpswrd_valtxt().contains("Confirm New Password is required."))) {
					//tryPassScreenshot("WM_L_19");
				} else {
					//tryFailScreenshot("WM_L_19");
				}
				String newpassword = password + "new";
				obj.pswdchange_popup_oldpswrd_txt.sendKeys(password);
				obj.pswdchange_popup_newpswrd_txt.sendKeys(newpassword);
				obj.pswdchange_popup_submit_btn.click();
				if (obj.pswdchange_popup_valtxt().contains("Confirm New Password is required")) {
					//tryPassScreenshot("WM_L_24");
				} else {
					//tryFailScreenshot("WM_L_24");
				}
				obj.pswdchange_popup_newpswrd_txt.sendKeys(newpassword);
				obj.pswdchange_popup_confirmnewpswrd_txt.sendKeys("gfytgyj");
				obj.pswdchange_popup_submit_btn.click();
				if (obj.pswdchange_popup_valtxt().contains("New Password and Confirm Password should be same")) {
					//tryPassScreenshot("WM_L_25");
				} else {
					//tryFailScreenshot("WM_L_25");
				}
				obj.pswdchange_popup_cancel_btn.click();
				//tryPassScreenshot("WM_L_36");
				obj.password_txt.sendKeys(password);
				obj.userlogin_btn.click();
				String oldpass = obj.pswdchange_popup_oldpswrd_txt.getText();
				String newpass = obj.pswdchange_popup_newpswrd_txt.getText();
				String cnfmpass = obj.pswdchange_popup_confirmnewpswrd_txt.getText();
				obj.resetlogin_btn.click();
				if ((oldpass.equalsIgnoreCase("")) && (newpass.equalsIgnoreCase(""))
						&& (cnfmpass.equalsIgnoreCase(""))) {
					//tryPassScreenshot("WM_L_26");
				} else {
					//tryFailScreenshot("WM_L_26");
				}
				obj.pswdchange_popup_oldpswrd_txt.sendKeys(password);
				obj.pswdchange_popup_reset_btn.click();
				obj.pswdchange_popup_oldpswrd_txt.sendKeys(password);
				obj.pswdchange_popup_newpswrd_txt.sendKeys(newpassword);
				obj.pswdchange_popup_confirmnewpswrd_txt.sendKeys(newpassword);
				obj.pswdchange_popup_submit_btn.click();
				System.out.println("Password changed to user: " + username);
				//tryPassScreenshot("WM_L_23");
				
				 /** obj.userid_txt.sendKeys(username);
				 * obj.resetlogin_btn.click();
				 * obj.userid_txt.sendKeys(username);
				 * obj.password_txt.sendKeys(password);
				 * obj.userlogin_btn.click();*/
				 
				if (obj.pageTitle_txt().contains("Digital Rx | Rx Pad")) {
					//tryPassScreenshot("WM_L_11");
					obj.myprofile_lnk.click();
					try {
						obj.myprofile_ChangePassword.click();
						System.out.println("change password exist");
						obj.myprofile_ChangePassword_oldpass.sendKeys(newpassword);
						obj.reset_LinkText.click();
						obj.myprofile_ChangePassword_oldpass.sendKeys(newpassword);
						obj.myprofile_ChangePassword_newpass.sendKeys(password);
						obj.myprofile_ChangePassword_confirmpass.sendKeys(password);
						obj.update_LinkText.click();
						System.out.println("changed the password in my profile to: " + password);
					} catch (Exception e) {
						System.out.println("changepassword is not there");
						
						/* * AdminLogin admin = new AdminLogin();
						 * admin.beforeTest(); admin.loginAdmin();
						 * admin.editUser(username);
						 * admin.changePassword(password);*/
						 
					}

				} else {
					System.out.println("User login failed after change password");
					//tryFailScreenshot("WM_L_11");
				}
			} else {
				System.out.println("login failed");
			}
		} else {
			System.out.println("User login sucess normally");
			//tryPassScreenshot("WM_L_11");
		}

		try {
			WebdriverWait.implicitwait(3);
			obj.prescriber_details_link.click();
			tryPassScreenshot("WM_L_38");
			try {
				obj.close_lnk.click();
				tryPassScreenshot("WM_L_39");
			} catch (Exception e) {
				tryFailScreenshot("WM_L_39");
			}
		} catch (Exception e) {
			tryFailScreenshot("WM_L_38");
		}
		try {
			obj.onbehalf_link.click();
			tryPassScreenshot("WM_L_40");
			Thread.sleep(3000);
			obj.onbehalf_close_xpath.click();
			tryPassScreenshot("WM_L_41");
		} catch (Exception e) {
			tryFailScreenshot("WM_L_40");
		}
		//driver.findElement(By.linkText("Logoff")).click();
	//MyScreenRecorder.stopRecording();
	}
	//}
	public WebDriver driver() {
		return driver;
	}

	@BeforeTest
	public void beforetest() {
		driver = Driver.browser("web");
		/*
		 * Driver ds=new Driver(); ds.browser("web");
		 */
	}
	@AfterTest
	public void afterTest() {
		//driver.quit();
	}
}