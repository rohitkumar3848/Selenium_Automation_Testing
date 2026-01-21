package org.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extentReports;
    public static ExtentReports getExtentReports(){
        if(extentReports==null){
            ExtentSparkReporter spark=new ExtentSparkReporter("target/ExtentReport.html");
            spark.config().setDocumentTitle("Automation Execution Report");
            spark.config().setReportName("Smart Bazar BBD Report");

            extentReports=new ExtentReports();
            extentReports.attachReporter(spark);
        }
        return extentReports;
    }
}
