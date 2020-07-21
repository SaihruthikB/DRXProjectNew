package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class PrescriberHistory {
	Webmoduleobjects obj;

	WebDriver driver;
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
  @Test(priority=7)
  public void Report_PrescriberHistory() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
      obj.reports_tab.click();
      obj.reports_prescriptionhistorytab.click();
	  obj.generatereport_but.click();
	  if ((obj.useridVal().contains("From Date is required."))&& (obj.useridVal().contains("To Date is required."))) {
  		
  		obj.reset_LinkText.click();
  		obj.report_fromdate.click();
  		obj.fromdate_month.click();
  		WebElement list = obj.fromdate_tablemonth;
		List<WebElement> patientlsit = list.findElements(By.tagName("div"));
		//System.out.println(patientlsit.size());
		
		for(int i=1;i<=patientlsit.size();i++){
		//System.out.println(obj.calmonth(i));
		if(obj.calmonth(i).equalsIgnoreCase("January")){
			obj.calmonths(i).click();
			break;
		}
			/*Select month = new Select(obj.calmonths(i));
			month.selectByIndex(1);
		}*/
		}
		for(int j=1;j<=patientlsit.size();j++){
		obj.fromdate_year.click();
		System.out.println(obj.calyear(j));
		if(obj.calyear(j).equalsIgnoreCase("2015")){
		obj.calyears(j).click();
		break;
		}
	  }
		WebElement daylist = obj.fromdate_tableday;
		List<WebElement> dayslist = daylist.findElements(By.tagName("tr"));
		/*String xpath3="html/body/div/div[5]/table/tbody/tr[";
		 String xpath4="]/td[";*/
		System.out.println(dayslist.size());
		for(int k=1;k<=dayslist.size();k++)	{
			boolean flag = false;
			List<WebElement> col1=dayslist.get(k-1).findElements(By.tagName("td"));
			 for(int l=1;l<=col1.size();l++)
			 {
			//System.out.println(obj.date(k));
				// String cal = driver.findElement(By.xpath(obj.date1+k+obj.date2+"]")).getText();
			String date2=driver.findElement(By.xpath(obj.date1+k+obj.date2+l+"]")).getText();
			// System.out.println(date2);
			if(date2.equalsIgnoreCase("8")){
				driver.findElement(By.xpath(obj.date1+k+obj.date2+l+"]")).click();
				obj.generatereport_but.click();
				flag=true;
				break;
				
			}

		}
			 if(flag==true)
			 {
				 break;
			 }
			 
		}
	  }
	  if (obj.useridVal().contains("To Date is required.")) {
	  obj.report_todate.click();
	  obj.fromdate_month.click();
		WebElement list = obj.fromdate_tablemonth;
		List<WebElement> patientlsit = list.findElements(By.tagName("div"));
		System.out.println(patientlsit.size());
		
		for(int i=1;i<=patientlsit.size();i++){
		System.out.println(obj.calmonth(i));
		if(obj.calmonth(i).equalsIgnoreCase("February")){
			obj.calmonths(i).click();
			break;
		}}
		for(int j=1;j<=patientlsit.size();j++){
			obj.fromdate_year.click();
			System.out.println(obj.calyear(j));
			if(obj.calyear(j).equalsIgnoreCase("2019")){
			obj.calyears(j).click();
			break;
			}
		  }
			WebElement daylist = obj.fromdate_tableday;
			List<WebElement> dayslist = daylist.findElements(By.tagName("tr"));
			/*String xpath3="html/body/div/div[5]/table/tbody/tr[";
			 String xpath4="]/td[";*/
			System.out.println(dayslist.size());
			for(int k=1;k<=dayslist.size();k++)	{
				boolean flag = false;
				List<WebElement> col1=dayslist.get(k-1).findElements(By.tagName("td"));
				 for(int l=1;l<=col1.size();l++)
				 {
				//System.out.println(obj.date(k));
					// String cal = driver.findElement(By.xpath(obj.date1+k+obj.date2+"]")).getText();
				String date2=driver.findElement(By.xpath(obj.date1+k+obj.date2+l+"]")).getText();
				// System.out.println(date2);
				if(date2.equalsIgnoreCase("4")){
					driver.findElement(By.xpath(obj.date1+k+obj.date2+l+"]")).click();
					obj.generatereport_but.click();
					flag=true;
					System.out.println("Prescriber history report generated");
					WebdriverWait.implicitwait(20000);
					obj.reports_back.click();
					break;
					
				}

			}
				 if(flag==true)
				 {
					 break;
				 }

			}

		
	  }
	  }
  
 
		
		 
  
  @BeforeTest
  public void beforeTest() throws Exception {
	 driver = Driver.browser("web");
		UserLogin us = new UserLogin();
		// System.out.println("getDriver"+Driver.getDriver());
		us.driver = driver;
		us.doctorLogin("MIDANAR001", "Pass@123");
  }

  @AfterTest
  public void afterTest() {
  }

}
