package com.ys.h2hdrx.Implementation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ys.h2hdrx.webmodule.CaptureScreenshot;
import com.ys.h2hdrx.webmodule.Driver;
import com.ys.h2hdrx.webmodule.InputStream;
import com.ys.h2hdrx.webmodule.SendEmail;
import com.ys.h2hdrx.webmodule.WriteExcel;

public class ProdUrls extends Driver {
	int i;
	int rowcount;
	String message = "Production URL is down for: ";
	String url;
	InputStream file;
	
	@Test()
	public void prodCheck() throws Exception {
		try {
			file = new InputStream("Input Test Data/ProdURL.xlsx");
			rowcount = file.rowCount(0);
			for (i = 0; i < rowcount-1; i++) {
				url = file.getCellData(0, i, 0);
				driver.get(url);
				if (url.contains("?wsdl")) {
					String sourcecode = driver.getPageSource();
					if (sourcecode.contains("definitions xmlns:wsu=")) {
						WriteExcel.writepassfail("TC" + i, "Output Data//ProdURLStatusPassFail.xlsx", "Pass");
						CaptureScreenshot.Capture("TC" + i, "ProdURL");
					} else {
						WriteExcel.writepassfail("TC" + i, "Output Data//ProdURLStatusPassFail.xlsx", "Fail");
						CaptureScreenshot.Capture("TC" + i, "ProdURL");
						message = message + url + ", ";

					}
				} else if (url.contains("ssconnector/ssAdminTrans")) {
					String sourcecode = driver.getPageSource();
					if (sourcecode.contains("Whitelabel Error Page")) {
						WriteExcel.writepassfail("TC" + i, "Output Data//ProdURLStatusPassFail.xlsx", "Pass");
						CaptureScreenshot.Capture("TC" + i, "ProdURL");
					} else {
						WriteExcel.writepassfail("TC" + i, "Output Data//ProdURLStatusPassFail.xlsx", "Fail");
						CaptureScreenshot.Capture("TC" + i, "ProdURL");
						message = message + url + ", ";
					}
				} else {
					String title = driver.getTitle();
					if (title.equals("Digital Rx | Login")) {
						WriteExcel.writepassfail("TC" + i, "Output Data//ProdURLStatusPassFail.xlsx", "Pass");
						CaptureScreenshot.Capture("TC" + i, "ProdURL");
					} else {
						WriteExcel.writepassfail("TC" + i, "Output Data//ProdURLStatusPassFail.xlsx", "Fail");
						CaptureScreenshot.Capture("TC" + i, "ProdURL");
						message = message + url + ", ";
					}
				}
			}
			if (message.equalsIgnoreCase("Production URL is down for: ")) {
				return;
			} else {
				SendEmail.mail(message);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			message = "Production URL testscript is failure because of bellow exception:" + "  " + e.getMessage();
			SendEmail.mail(message);
		}

	}

	@BeforeTest
	public void browser() {
		 Driver.browser("web");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}