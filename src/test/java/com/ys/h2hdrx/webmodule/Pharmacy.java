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

public class Pharmacy {
	Webmoduleobjects obj;

	WebDriver driver;

  @Test
  public void Searchpharmacy() {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  obj.searchPharmacy_btn.click();
	  obj.searchphar_detailedhelp.click();
	  obj.close_lnk.click();
	  obj.searchphar_quickreference.click();
	  obj.close_lnk.click();
/*WebElement pharmacylist =obj.search_statetable;
List<WebElement> list=pharmacylist.findElements(By.tagName("tr"));*/
	  Select pharmacy = new Select(obj.search_statetable);
	  pharmacy.selectByVisibleText("Texas");
	  obj.searchPharmacy_btn.click();
	  WebElement pharmacylist =obj.pharmacy_table;
	  List<WebElement> list=pharmacylist.findElements(By.tagName("td"));
	  System.out.println(list.size());
	  for(int i =1;i<list.size();i++){
		  System.out.println(obj.pharmacy(i));
		
	  }
	  obj.next_link.click();  
  }
  @BeforeTest
  public void beforeTest() throws Exception  {
	  driver = Driver.browser("web");
      UserLogin us = new UserLogin();
      // System.out.println("getDriver"+Driver.getDriver());
      us.driver = driver;
      us.doctorLogin("MIDANAR001", "Pass@123");
      //MIDANAR001
      PatientSearch ps = new PatientSearch();
      ps.driver=driver;
      ps.patientSearch();
      
}

  @AfterTest
  public void afterTest() {
  }

}
