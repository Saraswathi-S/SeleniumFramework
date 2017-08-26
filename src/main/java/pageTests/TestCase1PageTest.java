package pageTests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.AnnotationClass;
import dataProvider.ExcelDataProvider;
import pageFactory.LoginPage;

public class TestCase1PageTest extends AnnotationClass{
	
	@BeforeClass
	public void setValues(){
		dataSheetName="TC001";
	}
	
	/*@DataProvider(name="createLead")
	public  Object[][] createLeadInputs() throws InvalidFormatException{
		//return new Object[][] {{"DemoSalesManager","crmsfa","test","update","test"}	};
		
			return ExcelDataProvider.excelInputs("TC001");
		
			// TODO Auto-generated catch block
		
		
	}*/
	
	@Test(dataProvider="fetchdata")
	public void createLeadTC1(String username,String password,String firstName, String lastName, String source, String compaign, String phoneNumber, String email) throws InterruptedException{
			new LoginPage()
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginbtn()
			.clickCRMSFALink()
			.createLead()
			.enterCompanyName()
			.enterFirstName(firstName)
			.enterLastName(lastName)
			.selectSource(source)
			.selectMarketingCompaign(compaign)
			.enterPhoneNumber(phoneNumber)
			.enterPrimaryEmail(email)
			.clickSubmit()
			.viewCreatedCompanyName();
			

	} 

}
