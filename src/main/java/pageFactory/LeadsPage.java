package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends AbstractPage{
	public  LeadsPage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using= "Leads")
	WebElement leadsTab;
	public LeadsPage clickLeadsTab(){
		clickElement(leadsTab);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT, using= "Create Lead")
	WebElement createLeadele;
	public LeadsPage createLead(){
		clickElement(createLeadele);
		return this;
	}
	
	
	
	@FindBy(how=How.LINK_TEXT, using= "Find Leads")
	WebElement findLeadsLeftTab;
	public LeadsPage findLeadsTabLeft(){
		clickElement(findLeadsLeftTab);
		return this;
	}
	
	@FindBy(how=How.XPATH, using= "(//input[@name='firstName'])[3]")
	WebElement enterLeadNametxtbox;
	public LeadsPage enterLeadNamettxt(String companyName){
		type(enterLeadNametxtbox, companyName);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using= "//button[contains(text(),'Find Leads')]")
	WebElement findLeadsbtn;
	public LeadsPage clickOnFindLeadsbtn(){
		clickElement(findLeadsbtn);
		return this;
	}
	
	@FindBy(how=How.XPATH, using= "(//a[@class='linktext'])[4]")
	WebElement selectFirstRecord;	
	public EditLeadPage selectFirstRecord() throws InterruptedException{
		Thread.sleep(2000);
		clickElement(selectFirstRecord);
		return new EditLeadPage();
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_companyName")
	WebElement companyNameele;
	public LeadsPage enterCompanyName(){
		type(companyNameele,"test");
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_firstName")
	WebElement firstNameele;
	public LeadsPage enterFirstName(String enterFirstName){
		type(firstNameele,enterFirstName);
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_lastName")
	WebElement lastNameele;
	public LeadsPage enterLastName(String enterLastName){
		type(lastNameele,enterLastName);
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_dataSourceId")
	WebElement enterSourceele;
	public LeadsPage selectSource(String selectSource){
		selectByVisibleText(enterSourceele,selectSource);
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_marketingCampaignId")
	WebElement marketingCompaignele;
	public LeadsPage selectMarketingCompaign(String selectCompaign){
		selectByVisibleText(marketingCompaignele,selectCompaign);
		return this;
	}
	
	
	@FindBy(how=How.ID, using= "createLeadForm_primaryPhoneNumber")
	WebElement phoneNumberele;
	public LeadsPage enterPhoneNumber(String phoneNumber){
		type(phoneNumberele,phoneNumber);
		return this;
	}
	
	@FindBy(how=How.ID, using= "createLeadForm_primaryEmail")
	WebElement primaryEmailele;
	public LeadsPage enterPrimaryEmail(String email){
		type(primaryEmailele,email);
		return this;
	}
	
	@FindBy(how=How.NAME, using= "submitButton")
	WebElement submitele;
	public LeadsPage clickSubmit(){
		clickElement(submitele);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using= "//*[@id='viewLead_companyName_sp']")
	WebElement viewCompanyNameele;
	public LeadsPage viewCreatedCompanyName(){
		getText(viewCompanyNameele);
		return this;
	}
	
	
	
	
	
	

}
