package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Multipledrugs extends PatientSearch{
	int i;
	String str;
  @Test(priority=12)
  public void Schedule() throws Exception {
	  obj = PageFactory.initElements(driver, Webmoduleobjects.class);
	  InputStream file = new InputStream("Input Test Data\\Druglist.xlsx");
	  int rowcount = file.rowCount(0);
		Object[][] data = new Object[rowcount-1][2];
		for (int i = 0; i < rowcount; i++) {
			String str  = file.getCellData(0, i, 0);
			String str1 = file.getCellData(0, i, 0);
			System.out.println(str);
			//System.out.println(str1);
			
		}
		obj.drug_txt.sendKeys(str);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
