package com.ys.h2hdrx.SanityTestCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ys.h2hdrx.webmodule.CaptureScreenshot;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.Scroll;
import com.ys.h2hdrx.webmodule.WebLocators;
import com.ys.h2hdrx.webmodule.WebdriverWait;
import com.ys.h2hdrx.webmodule.WriteExcel;

public class WebLowProfiles{
	WebDriver driver;
	WebLocators obj;
	String user;
	String pass;
	public static FileInputStream fi;
	 static XSSFWorkbook wb;
	 static XSSFSheet s;
	@Test(priority = 1)
	  public void weblogin() throws Exception{
		obj = PageFactory.initElements(driver, WebLocators.class);
		fi = new FileInputStream("Input Test Data/LoginUsers.xlsx");
		wb = new XSSFWorkbook(fi);
		s = wb.getSheetAt(2);
		int rowsize = s.getLastRowNum();
		for (int i =1; i <=rowsize ; i++) {
			 Row row = s.getRow(i);
			 /*int cellsize = row.getLastCellNum();
			for (int j = 0; j < cellsize-1; j++) {*/
				user = row.getCell(0).getStringCellValue();
				pass = row.getCell(1).getStringCellValue();
				System.out.println("user name is: "+user);
				System.out.println("Password name is: "+pass);
				//String doc_name = row.getCell(j+2).getStringCellValue();
				obj.userid_txt.sendKeys(user);
			obj.password_txt.sendKeys(pass);
			obj.userlogin_btn.click();
			WebdriverWait.explicitwait(obj.web_logoff);
			System.out.println("login success for user: " + user + " :for the loop count of: "+i);
			
			/*savedPrescriptions();
			patientRegistration();*/
			patientSearch();
			/*rxPad();
			freeTextPad();
			ssMedicationHistory();
			allegies();
			savedPrescriptionsPatient();
			favDrugPatient();*/
			medicationHistory();
			/*practiceFavDrugs();
			defaultPhysician();
			prescriptionReport();
			personalInformation();
			allergyInformation();
			insuranceInformation();
			pharmacyInformation();
			patientBand();
			changePassword();
			staffAuthorization();
			clinicInformation();
			personalProfile();
			favDrugsDoctor();
			setDrugInteractions();*/
			
			obj.web_logoff.click();
	  }}
  @Test(enabled=false)
  public void patientRegistration() throws Exception {
	  //Patient Registration
		try
		{
			obj.patientReg_link.click();
	  WebdriverWait.explicitwait(obj.register_LinkText);
	  obj.register_LinkText.click();
	  obj.reset_LinkText.click();
	  }catch(Exception e)
		{
		  if (e.getMessage().contains("no such element: Unable to locate element:")) {
			return;
		}else{
		  e.printStackTrace();
			catchMethod("PatientRegistration");
		}}
  }
  @Test(enabled=false)
  public void savedPrescriptions() throws Exception {
	  // Saved Prescriptions left navigation link
	  try{
	  obj.savedPrescriptions_LinkText.click();
	  obj.confirmPrescription_LinkText.click();
	  obj.reset_LinkText.click();
	  obj.Remove_LinkText.click();
	  obj.back_LinkText.click();
	   }
	  catch (Exception e) {
		  e.printStackTrace();
		  catchMethod("savedPrescriptionsLeftNavigation");
	}
  }
  
  @Test(enabled=false)
  public void patientSearch() throws Exception {
	  obj.patientsearch_lastname_txt.sendKeys("a");
	  obj.reset_LinkText.click();
	  obj.patientsearch_lastname_txt.sendKeys("a");
	  obj.Search_LinkText.click();
	  Thread.sleep(3000);
	  obj.patient_select_link.click();
  }
  
  @Test(enabled=false)
  public void ssMedicationHistory() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void allegies() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void savedPrescriptionsPatient() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void favDrugPatient() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void medicationHistory() throws Exception {
	  WebdriverWait.explicitwait(obj.medicationHistory_tab);
	  obj.medicationHistory_tab.click();
	  Scroll.scrollDown(200);
	  String attribute = obj.updateDrug_btn.getAttribute("title");
	  obj.medicationHistory_selectRecord_rbtn.click();
	  obj.updateDrug_btn.click();
	  if (attribute.equalsIgnoreCase("Access Denied ")) {
		try {
			obj.update_LinkText.click();
			System.out.println("Fail");
			WriteExcel.writepassfail("UpdateDrugLock", "Output Data/SanitytestResult.xlsx", "Fail");
			CaptureScreenshot.Capture("UpdateDrugLock", "sanityTesting");
		} catch (Exception e) {
			System.out.println("Pass");
			WriteExcel.writepassfail("UpdateDrugLock", "Output Data/SanitytestResult.xlsx", "Pass");
			CaptureScreenshot.Capture("UpdateDrugLock", "sanityTesting");
		}
	}
  }
  
  @Test(enabled=false)
  public void practiceFavDrugs() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void defaultPhysician() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void prescriptionReport() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void personalInformation() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void allergyInformation() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void insuranceInformation() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void pharmacyInformation() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void patientBand() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void doctorBand() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void changePassword() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void staffAuthorization() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void clinicInformation() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void personalProfile() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void favDrugsDoctor() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void setDrugInteractions() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void rxPad() throws Exception {
	  
  }
  
  @Test(enabled=false)
  public void freeTextPad() throws Exception {
	  
  }
  
  @Test(enabled=false)
  private void catchMethod(String modulename) throws Exception {
		WriteExcel.writepassfail(modulename, "Output Data/SanitytestResult.xlsx", "Fail");
		CaptureScreenshot.Capture(modulename, "sanityTesting");
		driver.close();
		driver = Driver.browser("web");
		obj.userid_txt.sendKeys(user);
		obj.password_txt.sendKeys(pass);
		obj.userlogin_btn.click();
  }
  
  @BeforeTest
	public void browser() {
		driver = Driver.browser("web");
	}

	@AfterTest
	public void afterTest() {
		
	}

}
