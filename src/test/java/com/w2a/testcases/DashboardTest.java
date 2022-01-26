package com.w2a.testcases;

import java.util.Hashtable;
import java.util.List;

import org.testng.annotations.Test;
import com.w2a.BuisnessLogic.DashboardBL;
import com.w2a.BuisnessLogic.LoginBLCarousel;
import com.w2a.baseclass.Page;
import com.w2a.utility.Constants;
import com.w2a.utility.DataReader;
import com.w2a.utility.ExcelDataProvider;

import com.w2a.utility.Constants;
import com.w2a.utility.ExcelReader;



//import utilities.DataProviders;

import com.relevantcodes.extentreports.LogStatus;

public class DashboardTest extends Page {

	static DashboardBL sbl;
	static LoginBLCarousel lbl = new LoginBLCarousel();

	
	@Test(priority = 1)
	public static void  Navigate() throws Exception  {

		Hashtable<String, List<String>> data=DataReader.getMultipleRowFromXls("TestData.xlsx","user");


		//extentTest = reports.startTest("Navigate to Dashboard Page");
	    sbl = new DashboardBL();
		sbl.GotoInspectionPage();

	}
	
	

	@Test(priority = 2)
	
	public void FillShipmentInfo() throws Exception {
		
	
		//extentTest.log(LogStatus.INFO, "Filling the Inspection information");
		
		Hashtable<String, List<String>> data=DataReader.getMultipleRowFromXls("TestData.xlsx","user");
		
		sbl.FillInspectionForm();
				
	}

}
