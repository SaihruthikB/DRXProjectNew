package com.ys.h2hdrx.webmodule;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;


public class CaptureScreenshot extends Driver{
	WriteExcel we = new WriteExcel();
	public static void Capture(String name, String foldername) {

		try {
			String screenshotname = null;
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			DateFormat dateFormate1 = new SimpleDateFormat("MM.dd.yyyy hh.mm.ss");
			Date date = new Date();
			String date1 = dateFormate1.format(date);
			screenshotname = name + " " + date1;
			String[]  status=WriteExcel.getStatus();
			for(int i=0;i<status.length;i++)
			{
			FileUtils.copyFile(source, new File("./Screenshots/"+foldername+"/"+status[i]+"edCases/"+ screenshotname + ".jpeg"));
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
