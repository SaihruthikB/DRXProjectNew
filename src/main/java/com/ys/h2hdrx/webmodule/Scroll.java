package com.ys.h2hdrx.webmodule;

 
import org.openqa.selenium.JavascriptExecutor;
 

public class Scroll extends Driver {
	public static int scrollDown(int coordinate)
	{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,"+coordinate+")", "");
		return coordinate;
	}
}
