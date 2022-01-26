package com.w2a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.baseclass.Page;
import com.w2a.utility.Helper;

public class RadioButtonPage extends Page{

	@FindBy(xpath = "//input[@value='Male']")
	private WebElement SelectMaleRadioButton;
	
	

	public RadioButtonPage() {
		PageFactory.initElements(driver,this);
	}
	
	


    public WebElement getSelectMaleRadioButton() {
		return  SelectMaleRadioButton;
	}

	
    Helper function=new Helper();
	
    //Method1
	public void selectRadioButton()
	{
		function.ClickRadioButton(SelectMaleRadioButton);
	}
}
