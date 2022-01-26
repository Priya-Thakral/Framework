package com.w2a.pages;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.w2a.baseclass.Page;

	public class ListofInsuredPage extends Page {

		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-user-dashboard/div/div[2]/div/div[1]/div")
		private WebElement InitiatedIcon;
		
		@FindBy(xpath = "//*[@id=\"inspectionDataId\"]/pagination-template/ul/li[4]/a/span[2]")
		//@FindBy(xpath = "//span[contains(text(),'2')]")
		private WebElement PageTwo;
		
		
		@FindBy(xpath ="//*[@id=\"inspectionDataId\"]/pagination-template/ul/li[5]/a/span[2]")
		private WebElement PageThree;
		
		
		@FindBy(xpath = "//tbody/tr[9]/td[9]/span[1]")
		private WebElement ViewButtonPageThree;
		
		@FindBy(xpath = "//body/app-root[1]/app-loader[1]/div[1]/img[1]")
		private WebElement Loader;
		
		
		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-submission-details/html/div/div/button[2]")
		private WebElement SendTo;
		
		
		@FindBy(xpath = "//button[contains(text(),'Back')]")
		private WebElement BackButton;

		
		
		

		

		// Getters
		
	
		public WebElement getInitiatedIcon() {
			return InitiatedIcon;
		}

		public WebElement getPageTwo() {
			return PageTwo;
		}

		public WebElement getPageThree() {
			return PageThree;
		}

		
		public WebElement getViewButtonPageThree() {
			return ViewButtonPageThree;
		}
		
		public WebElement getLoader() {
			return  Loader;
		}

		public WebElement getSendTo() {
			return  SendTo;
		}
		
		
		public WebElement getBackButton() {
			return  BackButton;
		}
		
		
		
		
	

		/*public String captureScreenshot(WebDriver driver) {
			// TODO Auto-generated method stub
			return null;
		}*/

		

	}





