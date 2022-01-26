package com.w2a.BuisnessLogic;


	import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

   
    import com.w2a.baseclass.Page;

	import com.w2a.utility.ExcelDataProvider;
	import com.w2a.utility.Helper;
	import com.relevantcodes.extentreports.LogStatus;

	import com.w2a.pages.DashboardPage;
    import com.w2a.pages.ListofInsuredPage;

	public class  UserScreenBL extends Page {
		
		Helper hp = new Helper();

		ExcelDataProvider excellib = new ExcelDataProvider();

		ListofInsuredPage ip = PageFactory.initElements(driver, ListofInsuredPage.class);

		LoginBLCarousel lbl = new LoginBLCarousel();
		DashboardBL sbl = new DashboardBL();

		public void ClickOnInitiated() throws Exception {
			
			
	
			sbl.GotoInspectionPage();
			Thread.sleep(4000);
			
		}

		
		
		public void Pagination() throws Exception{
			
		hp.clickOnElement(ip.getInitiatedIcon());
		Thread.sleep(3000);
		System.out.println("Navigate to List of Insured Screen ");
			
	    hp.javaScriptScroll1(ip.getPageTwo());
	    //hp.clickOnElement(ip.getPageTwo());
		hp.clickOnElement(ip.getPageThree());
		
		
		}
		
		
		
		public void ClickView() throws Exception{
			//lbl.Login(excelLib.getData("user", 0, 0), excelLib.getData("user", 0, 1));
			Thread.sleep(3000);
			
		    hp.clickOnElement(ip.getViewButtonPageThree());
	
		    
		 //   hp.waitForLoadingIconToDisappear();
		    hp.WaitForElement(ip.getSendTo(), "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-submission-details/html/div/div/button[2] ");
		    hp.javaScriptScroll1(ip.getSendTo());
			hp.clickOnElement(ip.getBackButton());
			
			

	
		

	}



		
}

		
		
		
		


