package com.w2a.testcases;

    import com.w2a.BuisnessLogic.LoginBLCarousel;
	import com.w2a.baseclass.Page;
	import com.w2a.utility.ConfigReader;
import com.w2a.utility.Constants;
import com.w2a.utility.DataReader;
import com.w2a.utility.ExcelDataProvider;



import java.util.Hashtable;
import java.util.List;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

	public class LoginTest extends Page {

		// private static WebDriver WebDriver = null;

		ConfigReader cr;
		LoginBLCarousel lbl;
		ExcelDataProvider edw;

		 //@Test(priority=1,dataProviderClass=ExcelDataProvider.class,dataProvider="testcase1")
		
		
		 @Test(priority=1)
		 //public void SimpleLogin(List<String> list) throws Exception {
		 public void SimpleLogin() throws Exception {
			
			//extentTest = reports.startTest("Login Test");
			
			Hashtable<String, List<String>> data=DataReader.getMultipleRowFromXls("TestData.xlsx","user");
	
			cr = new ConfigReader();
			lbl = new LoginBLCarousel();
			edw = new ExcelDataProvider();

			
			String res = lbl.Login(data.get("Username").get(Constants.firstrow),data.get("Password").get(Constants.firstrow));

			System.out.println(res);
			if (cr.getLoginText().equalsIgnoreCase(res)) {

				System.out.println("Test Case Passed Successfully Logged in");
				//extentTest.log(LogStatus.PASS, "User logged In successfully");
			}

			Thread.sleep(2000);

			Boolean flag = lbl.logout();

			if (flag) {
				System.out.println("Logged Out Successfully");
				//extentTest.log(LogStatus.INFO, "User Logged Out Now");
			} else {
				System.out.println("Couldnt logged out");
				//extentTest.log(LogStatus.INFO, "Could not logged out");
			}
		}

		//@Test(priority=2,dataProviderClass=ExcelDataProvider.class,dataProvider="testcase2")
		 
		@Test(priority=2)
		public void LoginWithWrongCred() throws Exception {
		Hashtable<String, List<String>> data=DataReader.getMultipleRowFromXls("TestData.xlsx","user");
			

			cr = new ConfigReader();

			lbl = new LoginBLCarousel();

			//extentTest = reports.startTest("Test for login with wrong credentials.");
			Thread.sleep(3000);
			String res = lbl.LoginWithWrongCred(data.get("Username").get(Constants.secondrow),data.get("Password").get(Constants.secondrow));

			if (cr.getLoginError().equalsIgnoreCase(res)) {
				System.out.println("Test Case Pass for wrong Cred.");
				//extentTest.log(LogStatus.PASS, "Test Case Pass for wrong Cred.");
			}

		}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// HomePage home=new HomePage();
	// LoginPage lp=home.goToLogin();
	// DashboardC dh=lp.doLogin("priya.thakral@rsk-bsl.com","1234567");


	