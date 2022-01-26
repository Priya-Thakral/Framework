
package com.w2a.utility;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	
   @DataProvider(name="testcase1")
	public Object[][] testcase1()
	{

	Object[][] result;

	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelData\\TestData.xlsx";
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,0,"testcase1","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}
	
	
	
	
	@DataProvider(name="testcase2")
	public Object[][] testcase2()
	{

	Object[][] result;

	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelData\\TestData.xlsx";
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,0,"testcase2","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}
	
	

}




//Second Method 

/*package com.w2a.utility;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	//Use Excel Reader Class
	
	@DataProvider(name="flipBoard")
	public static Object[][] getDataSuite1(Method m) {

		System.out.println(m.getName());
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		String testcase = m.getName();
		return DataUtil.getData(testcase, excel);
	
	}
	
	
	
	@DataProvider(name="Navigate")
	public Object[][] Navigate()
	{

	Object[][] result;

	//String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\FlipBoardSuite.xlsx";
	String path=System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\AI-Inspection\\ExcelData\\TestData.xlsx");
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,0,"Navigate","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}
	
	
	
	
	@DataProvider(name="FillShipmentInfo")
	public Object[][] FillShipmentInfo()
	{

	Object[][] result;

	String path=System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\AI-Inspection\\ExcelData\\TestData.xlsx");
	List<List<Object>> fullxlsData=DataReader.readXlsFile(path,0,"FillShipmentInfo","Y");
	        result=new Object[fullxlsData.size()][];
	       
	        for(int i=0;i<result.length;i++)
	        {
	       
	        result[i]=new Object[] {fullxlsData.get(i)};
	        }

	return result;

	}}*/

	





