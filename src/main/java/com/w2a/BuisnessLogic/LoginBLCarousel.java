package com.w2a.BuisnessLogic;

    import org.openqa.selenium.support.PageFactory;

    import com.w2a.baseclass.Page;
    import com.w2a.pages.LoginPage;
    import com.w2a.utility.Helper;
	import com.relevantcodes.extentreports.LogStatus;

    public class LoginBLCarousel extends Page {
			

            Helper hp = new Helper();

			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			
			
			public String Login(String Email, String Password) throws Exception {
			
			 // hp.clickOnElement(lp.getLoginTrigger());
				
				hp.enterbox(lp.getEmailField(), Email);
				
				hp.enterbox(lp.getPasswordField(), Password);
				
				hp.clickOnElement(lp.getSubmitButton());
				
			
				//extentTest.log(LogStatus.INFO, "Login Button Clicked after entering email and password");
				//String res = hp.getText(lp.getNameHolder());
				//return res;
				return Email;
				
			
				
			}
				
				
			public String LoginWithWrongCred(String Email, String Pass) {
				
				
				//hp.clickOnElement(lp.getLoginTrigger());
				hp.enterbox(lp.getEmailField(), Email);
				hp.enterbox(lp.getPasswordField(), Pass);
				hp.clickOnElement(lp.getSubmitButton());
				//extentTest.log(LogStatus.INFO, "Login Button Clicked after entering invaild email and password");
				String res = hp.getErrorMsg(lp.getErrorHolder());
				return res;
			
				
			}


			public Boolean logout() {
				
				hp.clickOnElement(lp.getMenuDropDown());
				hp.HandleClickAction(lp.getlogoutTrigger());
				return true;
			}

	}






