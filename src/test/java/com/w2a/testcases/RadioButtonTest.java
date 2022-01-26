package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.baseclass.Page;
import com.w2a.pages.CheckboxPage;

public class RadioButtonTest extends Page{
	
	
	@Test
	public void testcase1() 
	{
		test=extent.createTest("testcase1");
		
		CheckboxPage page=new CheckboxPage();
		
		page.selectRadioButton();
		
		
	}


	}
	


