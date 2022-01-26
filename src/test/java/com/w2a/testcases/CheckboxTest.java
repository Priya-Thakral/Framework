package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.baseclass.Page;
import com.w2a.pages.CheckboxPage;

//public static void main(String args[])


public class CheckboxTest extends Page {
	
	
	@Test
	public void testcase() 
	{
		test=extent.createTest("testcase");
		
		CheckboxPage page=new CheckboxPage();
		
		page.selectCheckBox();
		//page.selectedcheckboxMessage();
		
		//page.selectAllCheckbox();
		
	}


	}
	

