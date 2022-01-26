package com.w2a.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.baseclass.Page;
import com.w2a.utility.Helper;

public class CheckboxPage extends Page {
	
	
	@FindBy(id = "isAgeSelected")
	private WebElement ageCheckBox;
	
	@FindBy(xpath = "//div[contains(text(),'Success-Check Box is Checked')]")
	private WebElement successmessagetext;
	

	public CheckboxPage() {
		PageFactory.initElements(driver,this);
	}
	


    public WebElement getageCheckBox() {
		return  ageCheckBox;
	}

	
    public WebElement getsuccessmessagetext() {
		return  successmessagetext;
	}
	
	
	
	Helper function=new Helper();
	
	//Method1
	public void selectCheckBox()
	{
		function.checkCheckBox( ageCheckBox);
	}
	
	//Method2
	public void uncheckCheckBox()
	{
		function.checkElementIsDisplayed(successmessagetext);
	}
	
	//Method3
	public void selectedcheckboxMessage()
	{
		function.checkElementIsDisplayed(successmessagetext);
	}
	
	//Method4
	public void selectAllCheckbox()
	{
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
		}
	}



	



	

}
