package com.w2a.testcases;

import java.util.List;

import org.testng.annotations.Test;
import com.w2a.BuisnessLogic.DashboardBL;
import com.w2a.BuisnessLogic.ListofInsuredBL;
import com.w2a.BuisnessLogic.LoginBLCarousel;
import com.w2a.baseclass.Page;
import com.w2a.utility.ExcelDataProvider;

import com.w2a.utility.ExcelReader;

//import utilities.DataProviders;

import com.relevantcodes.extentreports.LogStatus;

public class ListofInsuredTest extends Page {

	static DashboardBL sbl;

	static ListofInsuredBL ibl = new ListofInsuredBL();
	ExcelDataProvider excelLib = new ExcelDataProvider();
	static LoginBLCarousel lbl = new LoginBLCarousel();

	@Test(priority = 1)
	public static void NavigatetoInsuredPage() throws Exception {

		
		
		ibl = new ListofInsuredBL();
		ibl.ClickOnInitiated();
		//extentTest.log(LogStatus.INFO, "Navigate to Page2");

	}

	@Test(priority = 2)

	public void NavigateToPage2() throws Exception {

		ibl.Pagination();
	}

	@Test(priority = 3)

	public void NavigateViewPage() throws Exception {

		// extentTest.log(LogStatus.INFO, "View Page will be displayed");

		ibl.ClickView();

	}

}
