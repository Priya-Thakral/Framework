package com.w2a.utility;


	

	import java.util.concurrent.TimeUnit;



	import org.openqa.selenium.Capabilities;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;

    import io.github.bonigarcia.wdm.WebDriverManager;

	//import io.github.bonigarcia.wdm.WebDriverManager;

	public class BrowserFactory {
		

		public static WebDriver startApplication(WebDriver driver,String BrowserName, String BaseURL) {
			
			System.out.println("BrowserName-->"+BrowserName);
			if(BrowserName.equalsIgnoreCase("Chrome")) {

				WebDriverManager.chromedriver().setup();
				
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
		
				driver = new ChromeDriver(dc);
				System.out.println("driver-->"+driver);
				
			}
			
			else if(BrowserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		
			else 
				System.out.println("Browser Not supported");
			   
			driver.manage().window().maximize();
			System.out.println("Just before Browser");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(BaseURL);
			
			return driver;
			
			
		}
		
	}





