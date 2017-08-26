package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{
	
	public  HomePage(){
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//*[@class='crmsfa']/a/img")
	WebElement crmsfaLink;
	public LeadsPage clickCRMSFALink(){
		clickElement(crmsfaLink);
		return new LeadsPage();
	}
	
}
