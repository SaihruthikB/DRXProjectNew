
package com.ys.h2hdrx.webmodule;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
				//
				fi = new FileInputStream("Input Test Data/Url_Browser1.xlsx");
				wb = new XSSFWorkbook(fi);
				s = wb.getSheetAt(0);
				//url = s.getRow(3).getCell(0).getStringCellValue();
				url = s.getRow(12).getCell(0).getStringCellValue();

				// driver.findElement(By.xpath("//*[@id='rightCommercialOne']/map/area")).click();

			} catch (Exception e) {
				e.printStackTrace();
			}
			// return driver;
		} else if (module.equalsIgnoreCase("admin")) {
			try {
				fi = new FileInputStream("Input Test Data/Url_Browser1.xlsx");
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
		
	if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver 2");
			driver = new ChromeDriver(); 
			
			
		} 
		driver.get(url);
		// driver.manage().window().maximize();
		return driver;
	}
	
	
	
	/*public static WebDriver getDriver(){
		
	}*/
}
