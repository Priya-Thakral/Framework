    package com.w2a.pages;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.baseclass.Page;

	public class DashboardPage extends Page {
		
		
		
		

		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-sidebar/div/ul/li[4]/img[1]")
		private WebElement InspectionIcon;
		
		@FindBy(xpath = "//span[contains(text(),'New Inspection')]")
		private WebElement NewInspection;
		
		
		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-new-inspection/div/div[2]/div[1]/div/div[2]/input")
		private WebElement AddName;
		
		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-new-inspection/div/div[2]/div[2]/div/div[2]/select")
		private WebElement DropDown;
		
		
		//@FindBy(xpath = "//option[contains(text(),'HO Data')]")
		//private WebElement SelectValue;
		
		@FindBy(xpath ="/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-new-inspection/div/div[2]/div[3]/div/div[2]/select")
		private WebElement Questionnaire;
		
		
		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-new-inspection/div/div[2]/div[4]/div/div[2]/select ")
		private WebElement FilterData;

		@FindBy(xpath = "//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[4]/div[1]/div[3]/input[1] ")
		private WebElement Days;
		
	
	    @FindBy(xpath = "//input[@id='1']")
		private WebElement Prior;

	 
	    @FindBy(xpath = "//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
		private WebElement Calender;
	    
	    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]")
	    private WebElement StartDate;
	    
		
	    @FindBy(className="mat-icon-button mat-button-base")
		//@FindBy(xpath = "//body/app-root[1]/app-master-dashboard[1]/app-master-user-dashboard[1]/app-new-inspection[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
		private WebElement EndDateCalender;

		
		@FindBy(xpath = "//div[contains(text(),'17')]")
		private WebElement SelectEndDate;
	    
	    
	   

		
	    @FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-new-inspection/div/div[2]/div[7]/div/div[2]/input")
		private WebElement LifeSpan;

		@FindBy(xpath = "//*[@id=\"No\"]")
		private WebElement Reminder;
		
		

		

		// Getters
		
	
		public WebElement getNewInspection() {
			return NewInspection;
		}

		public WebElement getAddName() {
			return AddName;
		}


		
		public WebElement getDropDown() {
			return  DropDown;
		}
		
		/*public WebElement getSelectValue() {
			return  SelectValue;
		}*/

		
		public WebElement getQuestionnaire() {
			return  Questionnaire;
		}
		
		public WebElement getFilterData() {
			return FilterData;
		}

		public WebElement getDays() {
			return Days;
		}

		public WebElement getPrior() {
			return Prior;
		}
		
		
	public WebElement getCalender() {
			return Calender;
		}
		
		public WebElement getStartDate() {
			return StartDate;
		}

		public WebElement getEndDateCalender() {
			return EndDateCalender;
		}
		
		public WebElement getSelectEndDate() {
			return SelectEndDate;
		}
		
		
		public WebElement getLifeSpan() {
			return LifeSpan;
		}

		public WebElement getReminder() {
			return Reminder;
		}

	

		public String captureScreenshot(WebDriver driver) {
			// TODO Auto-generated method stub
			return null;
		}

		public WebElement getInspectionIcon() {
			// TODO Auto-generated method stub
			return InspectionIcon;
		}

		public WebElement EndDateCalender() {
			// TODO Auto-generated method stub
			return null;
		}

		


	}



