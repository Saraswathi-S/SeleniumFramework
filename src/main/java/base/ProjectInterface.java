package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is an project interface
 * @author Saraswathi
 *
 */
public interface ProjectInterface {
	
	
	/**
	 * This method is used to launch the browser
	 * @param url-provide application url
	 * @param browser-provide browser type(example:chrome/ie)
	 */
	public void invokeApp(String url, String browser);
	
	
	/**
	 * This method is used to find the elements in the application
	 * @param elementType-provide the element type(example:id,name etc.,
	 * @param value-provide the value of the element
	 * @return
	 */
	public WebElement locateElement(String elementType, String value);
	
	
	/**
	 * This method is used to enter the value in the input fields
	 * @param element-->provide the element to which the input to be provided
	 * @param value-->provide the value
	 */
	public void type(WebElement element,String value);
	
	
	/**
	 * This method is used to click the element
	 * @param element-element to which the click action to be performed
	 */
	public void clickElement(WebElement element);
	
	/**
	 * This method is used to select the dropdown by using index
	 * @param element-->provide the dropdown element path
	 * @param index-->provide the index value
	 */
	public void selectByIndex(WebElement element, int index);
	
	/**
	 * This method is used to select the dropdown by using value
	 * @param element-->provide the dropdown element path
	 * @param value-->provide the value of the dropdown
	 */
	public void selectByValue(WebElement element, String value);
	
	/**
	 * This method is used to select the dropdown by using visibleText
	 * @param element-->provide the dropdown element path
	 * @param text-->provide the visibletext of the dropdown
	 */
	public void selectByVisibleText(WebElement element, String text);
	
	/**
	 * This method is used to switch between the window
	 * @param windowindex-->provide the window index
	 */
	public void switchToWindow(int windowindex);
	
	/**
	 * This method is used to switch to alert
	 */
	public void switchToalert();
	
	/**
	 * This method is used to accept the alert
	 */
	public void alertAccept();
	
	/**
	 * This mehtod is used to dismiss the alert
	 */
	public void alertDismiss();
	
	/**
	 * This method is used to retrieve the text from the alert
	 * @return
	 */
	public String alertgetText();
	
	/**
	 * This method is used to switch to the frame by the webelement
	 * @param element-->provide the webelement to switch between the frame
	 */
	public void switchToframe(WebElement element);
	
	/**
	 * This method is used to verify the window title
	 * @param title-->provide the title to which it is verified
	 * @return
	 */
	public boolean verifyTitle(String title);
	
	/**
	 * This method is used to retrieve the attribute of the webelement
	 * @param element-->provide th element to which attribute value to be fetched
	 * @param attribute-->provide the attribute
	 * @return
	 */
	public String getAttributes(WebElement element,String attribute);
	
	/**
	 * This method is used to retriev the text from the element
	 * @param element-->provide the element to which the attribute value to be retrieved
	 * @return
	 */
	public String getText(WebElement element);
	
	/**
	 * This method is used to verify the text 
	 * @param element-->provide the element to which the text to be verified
	 * @param text-->text as reference value 
	 * @return
	 */
	public boolean verifyText(WebElement element, String text);
	
	/**
	 * This method is used to take the screenshot
	 * @param srcPath-->path to which the screenshot to be captured
	 * @param destPath-->path to which the screenshot to be saved
	 * @return
	 */
	public boolean takeSnapshot(String srcPath, String destPath);
	
	/**
	 * This method is used to clear the value from the element
	 * @param element-->provide the element to which the text to be cleared
	 */
	
	public void clear(WebElement element);
	
	/**
	 * This method is used to close the browser
	 */
	public void quitapp();
}
