package com.ys.h2hdrx.webmodule;

import org.testng.annotations.Test;

public class PassandFailtestcases {
	@Test(enabled = false)
	public static void tryPassScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data/Result TestCase.xlsx", "Pass");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}

	@Test(enabled = false)
	public static void tryFailScreenshot(String TestCaseId) throws Exception {
		WriteExcel.writepassfail(TestCaseId, "Output Data/Result TestCase.xlsx", "Fail");
		CaptureScreenshot.Capture(TestCaseId, "WebModule");
	}
}
