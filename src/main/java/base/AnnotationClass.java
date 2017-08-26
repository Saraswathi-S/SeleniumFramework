package base;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import dataProvider.ExcelDataProvider;

public class AnnotationClass extends WrapperClass1{
	
	public String dataSheetName;
	
	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("Before Test");
	}
	@BeforeGroups
	public void beforeGroupsMethod(){
		System.out.println("Before Groups");
	}
	@BeforeClass
	public void beforeClassMethod(){
		System.out.println("Before Class");
	}
	@DataProvider
	public void dataProviderInputMethod(){
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforeMethodsMethod(){
		System.out.println("Before Method");
		invokeApp("http://leaftaps.com/opentaps/control/main","chrome");
	}
	@AfterMethod
	public void afterMethodsMethod(){
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClassMethod(){
		System.out.println("After Class");
	}
	@AfterGroups
	public void afterGroupsMethod(){
		System.out.println("After Groups");
	}
	@AfterTest
	public void afterTestsMethod(){
		System.out.println("After Method");
	}
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println("After Suite");
	}
	
	@DataProvider(name="fetchdata")
	public  Object[][] editLeadInputs() throws InvalidFormatException{
		//return new Object[][] {{"DemoSalesManager","crmsfa","test","update","test"}	};
		
			return ExcelDataProvider.excelInputs(dataSheetName);
		
			// TODO Auto-generated catch block
		
		
	}
	
	
	

}
