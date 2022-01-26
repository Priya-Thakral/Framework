package com.w2a.pages;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.w2a.baseclass.Page;

	public class UserScreenPage extends Page {
		
		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-admin-master/app-user-list/div/div[1]/div[2]/span ")
		private WebElement AddNewUser;
		
		@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-admin-master/app-user-management-details/div/form/div[2]/div[1]/div/div[2]/input ")
        private WebElement Username;
		
		
		@FindBy(xpath ="/html/body/app-root/app-master-dashboard/app-admin-master/app-user-management-details/div/form/div[2]/div[2]/div/div[2]/input ")
		private WebElement FirstName;
		
		
		@FindBy(xpath ="/html/body/app-root/app-master-dashboard/app-admin-master/app-user-management-details/div/form/div[2]/div[3]/div/div[2]/input ")
		private WebElement LastName;
		
		@FindBy(xpath ="//*[@id=\"admin\"] ")
		private WebElement UserType;


		@FindBy(xpath ="/html/body/app-root/app-master-dashboard/app-admin-master/app-user-management-details/div/form/div[2]/div[4]/div/div[2]/div[3]/label/span ")
		private WebElement Active;
		
		
		@FindBy(xpath ="/html/body/app-root/app-master-dashboard/app-admin-master/app-user-management-details/div/form/div[3]/div/button[1]")
		private WebElement Save;
		
	

	
	// Getters
	
	
			public WebElement getAddNewUser() {
				return AddNewUser;
			}

			public WebElement getUsername() {
				return Username;
			}

			public WebElement getFirstName() {
				return FirstName;
			}

			
			public WebElement getLastName() {
				return LastName;
			}
			
			public WebElement getUserType() {
				return  UserType;
			}
			
			public WebElement getActive() {
				return  Active;
			}
			
			public WebElement getSave() {
				return  Save;
			}
	}