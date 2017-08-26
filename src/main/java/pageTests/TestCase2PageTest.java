package pageTests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.AnnotationClass;
import dataProvider.ExcelDataProvider;
import pageFactory.LoginPage;

public class TestCase2PageTest extends AnnotationClass{
	@BeforeClass
	public void setValues(){
		dataSheetName="TC002";
	}
	
	
	/*@DataProvider(name="editLeadInput")
	public  Object[][] editLeadInputs() throws InvalidFormatException{
		//return new Object[][] {{"DemoSalesManager","crmsfa","test","update","test"}	};
		
			return ExcelDataProvider.excelInputs("TC002");
		
			// TODO Auto-generated catch block
		
		
	}*/
	
	
	
	
	@Test(dataProvider="fetchdata")
	public void editLead(String username,String password,String companyName, String updatedCompanyName, String companyNameToverify) throws InterruptedException{
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginbtn()
		.clickCRMSFALink()
		.clickLeadsTab()
		.findLeadsTabLeft()
		.enterLeadNamettxt(companyName)
		.clickOnFindLeadsbtn()
		.selectFirstRecord()
		.editbtn()
		.clearCompanyName(updatedCompanyName)
		.clickUpdatebtn()
		.verifyUpdatedCompanyName(companyNameToverify);
		
	}

}
