package com.w2a.baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.w2a.utility.BrowserFactory;
import com.w2a.utility.ConfigReader;
import com.w2a.utility.Helper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.reportUtility.HighLevelReport;

public class Page extends HighLevelReport {

	public static WebDriver driver;

	public BrowserFactory bf;
	public ConfigReader config;

	// public static ExtentReports reports;
	// public static ExtentTest extentTest;

	// public static ExtentReports extent;
	// public static ExtentHtmlReporter htmlReporter;
	// public static ExtentTest test;

	public Helper hp;

	public void generateHTMLreport() {

		generateReport();
	}

	@BeforeSuite

	public void startBrowser() {

		generateHTMLreport();
	}

	@BeforeMethod
	public void getBrowser() throws Exception {
		bf = new BrowserFactory();
		config = new ConfigReader();

		hp = new Helper();
		// reports = new
		// ExtentReports(System.getProperty("user.dir")+"/reports/Report_at_"
		// +hp.getTimeFormat() +".html");

		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
	}

	@AfterSuite
	public void closeBrowser() {
		generateReport();
	}

	@AfterMethod
	public void Teardown() {

		// reports.flush();
		// bf.quitBrowser(driver);

		driver.quit();
	}

}
