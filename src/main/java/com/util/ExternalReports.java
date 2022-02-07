package com.util;

import com.relevantcodes.extentreports.ExtentReports;

public class ExternalReports {
	 static ExtentReports extent;
	public static ExtentReports createReport() {
	
		extent = new ExtentReports("/home/neelushettygmai/eclipse-workspace/First-training/src/com/training/simplilearn-maven/Report/MyFirstReport.html");
		return extent;
		}
	}


