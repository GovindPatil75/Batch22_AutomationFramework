package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentreportGenrator {

	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String ReportPath=System.getProperty("user.dir")+"\\TestReport\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 22 Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Batch22_AutomationFramework");
		extent.setSystemInfo("Module name", "ABC");
		extent.setSystemInfo("Automation Tool", "Selenium WebDriver");
		extent.setSystemInfo("O.S.", "Window 10");
		extent.setSystemInfo("Browser Name", "Chrome");
		return extent;
		
	}
}
