package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Scheduledrug  {
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
	
	@Test (priority=4)
	  public void Confirmprescription() throws Exception {
	 obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	//tryFailScreenshot("WM_RX_03");
	 obj.drug_txt.sendKeys("xanax");
	 Thread.sleep(3000);
	 obj.drugsearch_txt.click();
	 
	 /*obj.drug_txt.clear();
	  * Thread.sleep(3000);
	 obj.back_LinkText.click();
	 obj.drug_txt.sendKeys("xanax");
	 WebElement druglist=obj.drug_table;
	 Select options = new Select(druglist);
	 List<WebElement> drugoptions= options.getOptions();
	 System.out.println(drugoptions.size());
	 for(int i = 0;i<=drugoptions.size();i++){
	 obj.Druglist(i);
	 System.out.println(obj.Druglist(i));
	 if(obj.Druglist(i).equalsIgnoreCase("xanax"));
	 Actions a = new Actions(driver);
	 a.doubleClick(obj.Druglists(i)).build().perform();
	 }
	*/
	 WebElement WebElement = obj.druglist_table;
	List<WebElement> list1 = WebElement.findElements(By.tagName("tr"));

	System.out.println(list1.size());
	for (int i = 1; i <= list1.size(); i++) {
	obj.Drugs_list(i);
	System.out.println(obj.Drugs_list(i));
	if (obj.Drugs_list(i).equalsIgnoreCase("Xanax 2 MG Oral Tablet")) {
	/*obj.drugsearch_detailslink.click();
	obj.close_lnk.click();
	tryPassScreenshot("WM_RX_27");*/
	obj.Drugs_lists(i).click();
	// tryPassScreenshot("WM_RX_21");
	break;

	}
	else{
	// tryFailScreenshot("WM_RX_21");
	//tryFailScreenshot("WM_RX_27");
	}
	}
	 
	  }
	 
	  @Test(priority=5)
	 
	  public void idme() throws InterruptedException{
	 obj.quantity_txt.sendKeys("2");
	      obj.refill_txt.sendKeys("2");
	                  obj.confirm_but.click();
	                  obj.sendtophar_txt.click();
	                  obj.schedule_ok.click();
	                  Thread.sleep(3000);
	          //obj.schedule_ok.click();
	                  obj.idme_email.sendKeys("nagamani.maram@ritwik.com");
	        obj.idme_password.sendKeys("Pass@123");
	        obj.schedule_siginbutton.click();
	        Thread.sleep(2000);
	        obj.idme_continue.click();
	        Thread.sleep(2000);
	        obj.idme_startnow.click();
	        obj.idme_dob.sendKeys("02021989");
	        obj.idme_social.sendKeys("111111111");
	        Thread.sleep(3000);
	        JavascriptExecutor js =  (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)","");
	        Thread.sleep(3000);

	        obj.idme_personLcontinue.click();
	        Thread.sleep(3000);
	        JavascriptExecutor js1 =  (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(3000);
	        obj.idme_homecontinue.click();
	                obj.idme_smartphone.click();
	                Thread.sleep(3000);
	        JavascriptExecutor js2 =  (JavascriptExecutor) driver;
	        js2.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(3000);
	                obj.idme_phonecontinue.click();
	                Thread.sleep(3000);
	        JavascriptExecutor js3 =  (JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(3000);
	               
	                obj.idme_checkbox.click();
	                Thread.sleep(3000);
	        JavascriptExecutor js4 =  (JavascriptExecutor) driver;
	        js4.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(3000);
	                obj.idme_confirmcontinue.click();
	                Thread.sleep(4000);
	                obj.idme_rockfinanicialcropcheckbox.click();
	                Thread.sleep(3000);
	        JavascriptExecutor js5 =  (JavascriptExecutor) driver;
	        js5.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(4000);
	                obj.idme_2009cropcheckbox.click();
	                Thread.sleep(4000);
	        JavascriptExecutor js6 =  (JavascriptExecutor) driver;
	        js6.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(4000);
	                obj.idme_sundersmanufacuringcheckbox.click();
	                Thread.sleep(3000);
	        JavascriptExecutor js7 =  (JavascriptExecutor) driver;
	        js7.executeScript("window.scrollBy(0,500)","");
	                Thread.sleep(3000);
	                obj.idme_identifycontinue.click();
	               obj.idme_verifylink.click();
	               
	               ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	               driver.switchTo().window(tabs2.get(1));
	               driver.close();
	               driver.switchTo().window(tabs2.get(0));
	  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	 /* driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
		PatientSearch ps = new PatientSearch();
	      ps.driver = driver;
	      ps.patientSearch();*/
  }

  @AfterTest
  public void afterTest() {
  }

}
