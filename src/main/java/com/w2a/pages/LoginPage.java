package com.w2a.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.w2a.baseclass.Page;

import java.util.List;
public class LoginPage extends Page {
	// WebDriver driver;

	// String triggerPath = "//*[@id=loginLink]";

	// WebElement Initialization.
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/form/div[1]/input")
	private WebElement EmailField;

	@FindBy(xpath = " /html/body/app-root/app-login/div/div/form/div[2]/input")
	private WebElement PasswordField;

	@FindBy(xpath = "/html/body/app-root/app-login/div/div/form/div[3]/input")
	private WebElement SubmitButton;

	@FindBy(xpath = "//*[@id=\"settinIcon\"]")
	private WebElement MenuDropDown;

	@FindBy(xpath = "/html/body/app-root/app-master-dashboard/app-master-user-dashboard/app-header/header/div[3]/span[1]")
	private WebElement logoutButton;

	@FindBy(xpath = "//div[contains(text(),'The email address or password you entered was not ')]")
	private WebElement ErrorHolder;

	// @FindBy(xpath="//li[contains(text(),'The user name or password is
	// incorrect.')]")
	// private WebElement ErrorHolder;

	// @FindBy(xpath="//body/span[1]/div[2]/div[3]/div[1]/form[1]/div[1]/ul[1]/li[1]")
	// private WebElement NameHolder;

	// @FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[2]/div[2]/strong[1]/a[1]")
	// private WebElement Relogin;

	

	// Getters for accessing the above webElements starts.

	// public WebElement getNameHolder() {
	// return NameHolder;
	// }

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getMenuDropDown() {
		return MenuDropDown;
	}

	public WebElement getlogoutTrigger() {
		return logoutButton;
	}

	public WebElement getErrorHolder() {
		return ErrorHolder;
	}

	public void Login(String Email, String Password) {
		// TODO Auto-generated method stub
		
		EmailField.sendKeys(Email);
		PasswordField.sendKeys(Password);
		SubmitButton.click();
		
		/*EmailField.sendKeys(list.get(2));
		PasswordField.sendKeys(list.get(2));
		SubmitButton.click();*/
		
	}

}
