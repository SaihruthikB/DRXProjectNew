package com.ys.h2hdrx.adminmodule;

import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.AdminLocators;
import com.ys.h2hdrx.webmodule.CaptureScreenshot;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.WriteExcel;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Registration {
	private WebDriver driver;
	AdminLocators obj;
	@Test(enabled = false)
	protected void tryPassScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data\\Result TestCase.xlsx", "Pass");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}

	@Test(enabled = false)
	protected void tryFailScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data\\Result TestCase.xlsx", "Fail");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}
  @Test(priority=2)
  public void Registration_register() throws IOException {
	  obj = PageFactory.initElements(driver, AdminLocators.class);
	  obj.registerdoctor_tab.click();
	  Select vendor = new Select(obj.registerdoctor_vendor);
	  vendor.selectByIndex(14);
	  Select practice = new Select(obj.registerdoctor_practice);
	  practice.selectByIndex(1);
	  FileInputStream fi = new FileInputStream("/Users/admin/Documents/workspace/H2HDrxProductionNew/Input Test Data/Register.xlsx");
	  XSSFWorkbook w = new XSSFWorkbook(fi);
	  XSSFSheet s = w.getSheetAt(0);
	  int row = s.getLastRowNum();
	  //for(int i =1;i<=2;i++){
	 // System.out.println(row);
	  String lastname = s.getRow(10).getCell(0).getStringCellValue();
	  System.out.println(lastname);
	  obj.registerdoctor_lastname.sendKeys(lastname);
	  String firstname = s.getRow(10).getCell(1).getStringCellValue();
	 obj.registerdoctor_firstname.sendKeys(firstname);
	  System.out.println(firstname);
	  String clinic = s.getRow(10).getCell(2).getStringCellValue();
	  System.out.println(clinic);
	  obj.registerdoctor_clinicname.sendKeys(clinic);
	String addrees = s.getRow(10).getCell(3).getStringCellValue();
	  System.out.println(addrees);
	  obj.registerdoctor_addressline1.sendKeys(addrees);
	  String city = s.getRow(10).getCell(4).getStringCellValue();
	  System.out.println(city);
	  obj.registerdoctor_city.sendKeys(city);
	  double zip = s.getRow(10).getCell(5).getNumericCellValue();
	  String Zip1=Double.toString(zip);
	 obj.registerdoctor_zip.sendKeys(Zip1);
	  System.out.println((int)zip);
	  String tel = s.getRow(10).getCell(6).getRawValue();
	  //String tel1=Double.toString(tel);
	  System.out.println(tel);
	  obj.registerdoctor_telcliniccode.sendKeys(tel);
	  String tel1 = s.getRow(10).getCell(7).getRawValue();
	 // String tel2=Double.toString(tel3);
	  System.out.println(tel1);
	  obj.registerdoctor_telcliniccode1.sendKeys(tel1);
	  String tel3 = s.getRow(10).getCell(8).getRawValue();
	 // String tel5=Double.toString(tel4);
	  System.out.println(tel3);
	  obj.registerdoctor_telcliniccode2.sendKeys(tel3);
	  String fax = s.getRow(10).getCell(9).getRawValue();
	  //String fax1=Double.toString(fax);
	  System.out.println(fax);
	  obj.registerdoctor_faxAreaCode.sendKeys(fax);
	  String fax2 = s.getRow(10).getCell(10).getRawValue();
	  //String fax3=Double.toString(fax2);
	  System.out.println(fax2);
	  obj.registerdoctor_faxAreaCode1.sendKeys(fax2);
	  String fax3 = s.getRow(10).getCell(11).getRawValue();
	  //String fax4=Double.toString(fax5);
	  System.out.println(fax3);
	  obj.registerdoctor_faxAreaCode2.sendKeys(fax3);
	  String npi = s.getRow(10).getCell(12).getRawValue();
	  System.out.println(npi);
	  obj.registerdoctor_npi.sendKeys(npi);
	  String deano = s.getRow(10).getCell(13).getStringCellValue();
	  System.out.println(deano);
	  obj.registerdoctor_deano.sendKeys(deano);
	 Select state =  new Select(obj.registerdoctor_state);
	  state.selectByIndex(30);
	  
	 obj.registerwithsurescript_checkbox.click();
	 obj.register_refillcheckbox.click();
	 obj.register_cancelcheckbox.click();
	 obj.register_controlcheckbox.click();
	  obj.registration_register.click();
	  obj.register_changepassword.click();
	  obj.changepsw_newpsw.sendKeys("password");
	  obj.changepsw_confirmpsw.sendKeys("password");
	  obj.changepsw_save.click();
	  obj.changepsw_back.click();
	  String str = driver.findElement(By.name("userId")).getText();
      System.out.println(str);
      //obj.registerdoctor_tab.click();
	  /*Select vendor1 = new Select(obj.registerdoctor_vendor);
	  vendor1.selectByIndex(9);
	  Select practice1 = new Select(obj.registerdoctor_practice);
	  practice1.selectByIndex(1);
	  }*/
  
  }
  @Test(enabled=false)
  public void Registration_edit() throws IOException {
	  obj = PageFactory.initElements(driver, AdminLocators.class);
	  obj.edit_userid.sendKeys("CADARSA001");
	  obj.edit_search.click();
	  obj.edit_radio.click();
	  obj.edit_button.click();
	 // obj.edit_changeuserid.click();
	  System.out.println(obj.register_userid());
  }
	  /*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	  driver.get("htt	p://jsfiddle.net/alexdresko/cLNB6/");
	  driver.switchTo().frame(0);
	  obj.npi_generator.click();*/
  
  @BeforeTest
  public void beforeTest() throws Exception {
	 
	  driver = Driver.browser("admin");	
	AdminUserLogin au = new AdminUserLogin();
	
	au.AdminUserLogin();
  }

  @AfterTest
  public void afterTest() {
  }

}
