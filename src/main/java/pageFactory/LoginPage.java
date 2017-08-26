package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
	public LoginPage(){
		PageFactory.initElements(eventDriver, this);	
	}
	
	@FindBy(how=How.ID, using="username")
	WebElement uName;
	public LoginPage enterUserName(String username){
		type(uName, username);
		return this;
	}
	
	@FindBy(how=How.ID, using="password")
	WebElement passwordele;
	public LoginPage enterPassword(String password){
		type(passwordele, password);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//*[@value='Login']")
	WebElement loginbtn;
	public HomePage clickLoginbtn(){
		clickElement(loginbtn);
		return new HomePage();
	}
	

}
