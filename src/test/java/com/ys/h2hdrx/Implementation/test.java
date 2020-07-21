package com.ys.h2hdrx.Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ys.h2hdrx.webmodule.Driver;

public class test extends Driver{
		  @Test()
		  public void prodCheck() throws Exception
		  {
			  driver.get("https://www.amazon.in/");
			  WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div[1]/a/span"));
			  JavascriptExecutor je =((JavascriptExecutor) driver);
					  je.executeScript("arguments[0].scrollIntoView();", element);
		  }
		
		@BeforeTest
	public void browser()
	{
		Driver.browser("web");
	}
	@AfterTest
	public void afterTest()
	{
		//driver.close();
	}
	}

