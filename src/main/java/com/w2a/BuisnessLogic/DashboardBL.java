package com.w2a.BuisnessLogic;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.w2a.baseclass.Page;
import com.w2a.utility.Constants;
import com.w2a.utility.DataReader;
import com.w2a.utility.ExcelDataProvider;
import com.w2a.utility.Helper;
import com.relevantcodes.extentreports.LogStatus;

import com.w2a.pages.DashboardPage;
import com.w2a.pages.LoginPage;

public class DashboardBL extends Page {

	Helper hp = new Helper();

	ExcelDataProvider excelLib = new ExcelDataProvider();

	DashboardPage hr = PageFactory.initElements(driver, DashboardPage.class);

	LoginBLCarousel lbl = new LoginBLCarousel();

	public void GotoInspectionPage() throws Exception {

		Hashtable<String, List<String>> data = DataReader.getMultipleRowFromXls("TestData.xlsx", "user");

		// lbl.Login("john.doe@aiinspection.com", "password");

		String res = lbl.Login(data.get("Username").get(Constants.thirdrow),data.get("Password").get(Constants.thirdrow));

		System.out.println("Logged In Successfully");
		// extentTest.log(LogStatus.INFO, "Logged In Successfully");

		Thread.sleep(4000);
		// Follow Sequencing otherwise it will give you an error

	}

	public void FillInspectionForm() throws Exception {
		

		hp.clickOnElement(hr.getInspectionIcon());

		hp.clickOnElement(hr.getInspectionIcon());

		System.out.println("Fill Form");

		hp.clickOnElement(hr.getNewInspection());
		hp.enterbox(hr.getAddName(), "ABC123");
		
		
		hp.clickOnElement(hr.getDropDown());
		hp.HandleDropdownVisibleText(hr.getDropDown(), "GL Contractors API");

		hp.clickOnElement(hr.getQuestionnaire());
		hp.HandleDropdownVisibleText(hr.getQuestionnaire(), "GL Contractor");

		hp.clickOnElement(hr.getFilterData());
		hp.HandleDropdownVisibleText(hr.getFilterData(), "Date Bound");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		hp.enterbox(hr.getDays(), "10");
		System.out.println("Testing 1 ");

		hp.clickOnElement(hr.getPrior());

		hp.WaitForElement(hr.getCalender(),
				"//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1] ");
		System.out.println("Testin Priya 2 ");

		if (hp.isElementPresent(
				"//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")) {
			System.out.println("Navigated to next field ");
			// extentTest.log(LogStatus.PASS, "Navigated Successfully to next field");
		} else {
			System.out.println("Could not navigated to next field");
		}
		// Start Date Code
		hp.clickOnElement(hr.getCalender());
		hp.HandleClickAction(hr.getStartDate());

		Thread.sleep(2000);

		// Wait for element Code

		hp.WaitForElement(hr.getEndDateCalender(),
				"//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1] ");
		System.out.println("Testin Priya 2 ");

		if (hp.isElementPresent(
				"//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")) {
			System.out.println("Navigated to End Date field ");
			// extentTest.log(LogStatus.PASS, "Navigated Successfully to next field");
		} else {
			System.out.println("Could not navigated to End Date field");
		}

		// EndDate Code
		hp.clickOnElement(hr.EndDateCalender());
		hp.HandleClickAction(hr.getSelectEndDate());

		// hp.enterbox(hr.getSelectEndDate(),"9/17/2021");

		hp.enterbox(hr.getLifeSpan(), "10");
		Thread.sleep(3000);
		hp.clickOnElement(hr.getReminder());


	}

	

}
