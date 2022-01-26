package com.w2a.utility;



	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class ConfigReader {
		
		//Class properties-This class in inbuild in java library itself
		Properties pro;
		
		public ConfigReader() throws Exception {
			
			//Press Alt+Enter to see the path of this file 
			String filepath = System.getProperty("user.dir")+"/Config/config.properties";
			File file = new File(filepath);
			
			//FileInputStream class-Add argument to watch FileInputstream(File)
			
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			//Call method pro.load from properties  and it will accept your fis
			pro.load(fis);		
		}

	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getStagingURL()
	{
		return pro.getProperty("URL");
	}
	public String getLoginText() {
		return pro.getProperty("loginText");
	}

	public String getLoginError() {
		return pro.getProperty("ErrorMessageCredentials");
	}


	}





