
package com.ys.h2hdrx.webmodule;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public class Driver {
	public static WebDriver driver;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet s;
	static String url;

	@Parameters("browser")
	public static WebDriver browser(String module) {
		// module = "web";
		if (module.equalsIgnoreCase("web")) {
			try {
				//Input Test Data/Url&Browser1.xlsx
				fi = new FileInputStream("Users/admin/Documents/workspace/H2HDrxProductionNew/Input Test Data/Url_Browser1.xlsx");
				wb = new XSSFWorkbook(fi);
				s = wb.getSheetAt(0);
				url = s.getRow(4).getCell(0).getStringCellValue();

				// driver.findElement(By.xpath("//*[@id='rightCommercialOne']/map/area")).click();

			} catch (Exception e) {
				e.printStackTrace();
			}
			// return driver;
		} else if (module.equalsIgnoreCase("admin")) {
			try {
				fi = new FileInputStream("Users/admin/Documents/workspace/H2HDrxProductionNew/Input Test Data/Url_Browser1.xlsx");
				wb = new XSSFWorkbook(fi);
				s = wb.getSheetAt(0);
				url = s.getRow(2).getCell(0).getStringCellValue();
				//syso
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			driver.get(module);
		}
		String browser = s.getRow(0).getCell(1).getStringCellValue();
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Library//geckodriver.exe");
			/*
			 * FirefoxProfile firefoxProfile = new FirefoxProfile();
			 * firefoxProfile.setPreference(
			 * "browser.startup.homepage_override.mstone", "ignore");
			 * firefoxProfile.setPreference(
			 * "startup.homepage_welcome_url.additional", "about:blank");
			 * firefoxProfile.setPreference("acceptInsecureCerts", "True");
			 */ driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Library//chromedriver3.exe");
			driver = new ChromeDriver(); 
			
			
		} else {
			System.setProperty("webdriver.ie.driver", "Library//IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		}
		driver.get(url);
		// driver.manage().window().maximize();
		return driver;
	}
	
	
	
	/*public static WebDriver getDriver(){
		
	}*/
}
