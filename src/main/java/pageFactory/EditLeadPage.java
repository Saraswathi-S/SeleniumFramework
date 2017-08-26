package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditLeadPage extends AbstractPage{
	public  EditLeadPage() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using= "Edit")
	WebElement editbtn;
	public EditLeadPage editbtn(){
		clickElement(editbtn);
		return this;
	} 
	
		
	
	@FindBy(how=How.ID, using= "updateLeadForm_companyName")
	WebElement updateCompanyName;
	public EditLeadPage clearCompanyName(String companyNameNew){
		clear(updateCompanyName);
		type(updateCompanyName, companyNameNew);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using= "//input[@value='Update']")
	WebElement updatebtn;
	public EditLeadPage clickUpdatebtn(){
		clickElement(updatebtn);
		return this;
	}
	
	@FindBy(how=How.ID, using= "viewLead_companyName_sp")
	WebElement updatedCompanyName;
	public EditLeadPage verifyUpdatedCompanyName(String companyNameToverify){
		verifyText(updatedCompanyName, companyNameToverify);
		return this;
	}

}
