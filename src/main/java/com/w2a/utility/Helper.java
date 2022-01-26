package  com.w2a.utility;



	import java.io.File;
	import java.io.IOException;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;
	import java.util.NoSuchElementException;
	import java.util.logging.FileHandler;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.w2a.baseclass.Page;


	public class Helper extends Page{

	
		private boolean flag;
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		
	//Helper Method to enter data into a field	
	public void enterbox(WebElement textBox, String textToBeEntered) {
		textBox.sendKeys(textToBeEntered);
	}

	public void enterbox(String data)
	{
		
	}

	//Helper Method to Click on the element 
	public void clickOnElement(WebElement Clicked)
	{
		Clicked.click();

	}
	
	public void ClickRadioButton(WebElement element)
	{
	
	try {
		
        element.click();
        
		boolean flag=element.isSelected();
		System.out.println(flag);
		
		if(flag) {
			test.log(Status.PASS,"successfully clicked on MaleRadioButton");
		}
			
			
		else {
			test.log(Status.FAIL,"Not able to click on MaleRadioButton");
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	
		
	//Helper Method to isSelected is used to tick the checkbox
	public void checkCheckBox(WebElement element)
	{
	
	try {
		
        element.click();
        
		boolean flag=element.isSelected();
		System.out.println(flag);
		
		if(flag) {
			test.log(Status.PASS,"successfully validated selected Checkbox");
		}
			
			
		else {
			test.log(Status.FAIL,"Not able to select checkbox");
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	
	
	//Helper Method to isSelected is used to untick the checkbox
		public void uncheckCheckBox(WebElement element)
		{
		
		try {
			
	        element.click();
	        
			boolean flag=element.isSelected();
			System.out.println(flag);
			
			//if not flag then it will untick the checkbox
			if(!flag) {
				test.log(Status.PASS,"Checkbox deselected");
			}
				
				
			else {
				test.log(Status.FAIL,"Checkbox Selected");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
		
		//Helper Method to isDisplayed is used to tick the checkbox
				public void checkElementIsDisplayed(WebElement element)
				{
				
				try {
					
			        element.click();
			        	
					boolean flag=element.isDisplayed();
					System.out.println(flag);
					
					if(flag) {
						test.log(Status.PASS,"SuccessMessage is displayed ");
					}
						
						
					else {
						test.log(Status.PASS,"Not able");
					}
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}}
			
				
		

	//Helper Method for making the webdriver wait for a element.
		public void WaitForElement(WebElement element, String Path)
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);

			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path)));
		}
		
		//Explicit Wait
		public void clickElement(WebElement element, String data)
		{
			WebDriverWait wait = new WebDriverWait(driver, 300);
			wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		
	//Helper Method to return content of any element 
	public String getText(WebElement element)
	{

		return element.getText();

	}

	//Helper Method to handle the click using Actions class
		public void HandleClickAction(WebElement element) {

			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
		}
		
		//Helper Method to Handle Dropdowns
			public void HandleDropdownVisibleText(WebElement Element, String visibleText) {

				Select sel = new Select(Element);
				sel.selectByVisibleText(visibleText);

			}
		
			
			//Helper Method to handle dropdown using the index of the element 
			public void HandleDropdownByIndex(WebElement Element, int index) {

				Select sel = new Select(Element);
				sel.selectByIndex(index);

			}
			
			//Helper Method to get content of element containing any error message 
			public String getErrorMsg(WebElement ErrorDiv) {
				return ErrorDiv.getText();
			}
			
			
			//Helper Method to check the presence of element
			public boolean isElementPresent(String Path) {
				flag = false;
				System.out.println("inside is Elemnt present");
				List<WebElement> element = driver.findElements(By.xpath(Path));
				System.out.println("inside is Elemnt present  2");
				if(element.size()!=0) {
					flag = true;
					System.out.println("Elements are there");
				}else
				{
					System.out.println("Elements are not there");				
					flag=false;
				}
				
				return flag;
			}
			
			
			//Helper Method to clear a text field first and then write something
			public void ClearAndWrite(WebElement Element, String text) {
				try {
				if(Element.isDisplayed()) {
					Element.clear();
					Element.sendKeys(text);
				}
				else
				{
					System.out.println("Element is not there");
				}
			 }catch (NoSuchElementException e) {
				 
				System.out.println("Element could not be found try again.");
			}
			}
			
			
			//Helper Method to verify a text against the expected text 
			public boolean verifyText(WebElement element, String ExpectedText) {
				flag=false;
				
				if(element.getText().equalsIgnoreCase(ExpectedText))
					flag=true;
				
				
				return flag;
				
			}
			
			
			//Helper Method to handle keyboard actions 
			public void HandleKeyBoardEvent(WebElement element, String text) {
				
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().sendKeys(element, text).build().perform();
			}
			
			
			//Helper Method to scrolling down a page by 250px. 
			public void javaScriptScroll1(WebElement Element) {
				try{ 
					System.out.println("Scrolling the web");
				javascript.executeScript("window.scrollBy(0,250)");
				}
				catch(Exception ex) {
					
				}
			}
			
			//Helper Method to scrolling up a page by 250px
			public void javaScriptScrollUp(WebElement Element) {
				try{ 
					System.out.println("Scrolling the web");
				javascript.executeScript("window.scrollBy(0,-250)");
				}
				catch(Exception ex) {
					
				}
			}
			
			//Helper Method to capture a screenshot. 
			
			public String captureScreenshot(WebDriver driver) throws IOException {
				
				String Path = "";
				
				DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
				
				Date date = new Date();
				
				Path = System.getProperty("user.dir") + "/Screenshots/" + dateformat.format(date)+".png";
				
				File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				// try{
				FileUtils.copyFile(scr, new File(Path));
				// System.out.println("Screenshot taken");
				// }
				 // catch (Exception e) {
			    // System.out.println("Exception while taking screenshot"+e.getMessage());
			   // }
				return Path;
			}
			
			
			
		//Helper Method To get current time in readable format.
			public String getTimeFormat() {

				DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
				
				Date date = new Date();
				
				return dateformat.format(date);
			

			}}
			
		//Loader Method
		/*	public void waitForLoadingIconToDisappear() throws InterruptedException {
				
				int count=0;
				while(loadingIcon.size()!=0 && count<10) {
					Thread.sleep(1000);
					count++;
				}
			}
	}
*/
		




	
