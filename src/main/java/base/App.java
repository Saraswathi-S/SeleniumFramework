package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
	
	
	
    public static void main( String[] args ) throws InterruptedException
    {
        login();
        
    }
    public static void login() throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver", "C://Users//Saraswathi//Desktop//TestLeaf [Selenium Library]//Softwares//drivers//chromedriver//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.xpath("//*[@value='Login']")).click();
        
        //clicking on the crmsfa link
        driver.findElement(By.xpath("//*[@class='crmsfa']/a/img")).click();
        Thread.sleep(1000);
        
        //clicking on create lead tab
        driver.findElement(By.linkText("Leads")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.linkText("Find Leads")).click();
        Thread.sleep(1000);
        
        //enter first name in search lead
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("test");
        driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        Thread.sleep(1000);
        
        System.out.println("Window title" +driver.getTitle());
        driver.findElement(By.linkText("Edit")).click();
        String existingCompanyName=driver.findElement(By.id("updateLeadForm_companyName")).getText();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("updated");
        
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        String updatedCompanyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
        
        if(!(existingCompanyName.contains(updatedCompanyName))){
        	System.out.println("Title modified");
        }
        }
        
        
        
        //enter lead details
      /*  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saraswathi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("siva");
        Select sourceSelobj = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
        sourceSelobj.selectByVisibleText("Conference");
        Select marketCompaignSelobj = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
        marketCompaignSelobj.selectByVisibleText("Automobile");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8489159780");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@testleaf.com");
        driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
        Thread.sleep(1000);
        String leadid=driver.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println("Lead id" +leadid);*/ 
        
    //}
}
