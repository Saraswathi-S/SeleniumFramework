package base;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.SessionNotFoundException;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class EventListenerTest implements WebDriverEventListener{

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Change value of");
		System.out.println("Before changeing the" +driver+ "element" +element );
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After Click on");
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("After Find By");
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Back");
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Forward");
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate To");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After script");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeChangeValueOf");
		System.out.println("Before changeing the" +driver+ "element" +element );
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("beforeClickOn");
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("beforeFindBy");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateBack");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateForward");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateTo");
		System.out.println("The browser"+driver+ "launched with url" +url );
		
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("beforeScript");
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("onException");
		String throwableStr=throwable.toString();
		switch (throwableStr) {
		case "InvalidElementStateException":
		break;
		case "NoSuchElementException":
			break;
		case "NotFoundException":
			break;
		case "StaleElementReferenceException":
			break;
		case "TimeoutException":
			break;
		case "UnexpectedTagNameException":
			break;
		case "UnhandledAlertException":
			break;
		case "UnreachableBrowserException":
			break;
		case "SessionNotCreatedException":
			break;
		case "SessionNotFoundException":
			break;
		case "ScreenshotException":
			break;
    	default:
		break;
		}
		//System.out.println("The Element could not be found"+throwable.getMessage());
		String msgSplit=throwable.getMessage();
		System.out.println("Message to be modified:" +msgSplit);
		System.out.println(msgSplit.split("[(]", 0)); 
		
		/*if(throwable instanceof org.openqa.selenium.NoSuchElementException)
		{
			//System.out.println("The Element could not be found"+throwable.getMessage());
			String str = throwable.getMessage();
			String modifiedmsg[];
			//System.out.println("Modified text" +str.split("{"));
		}
		else if(throwable instanceof InvalidElementStateException ){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof NotFoundException ){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof StaleElementReferenceException)
		{
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof TimeoutException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof UnexpectedTagNameException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof UnhandledAlertException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof UnreachableBrowserException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof SessionNotCreatedException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof SessionNotFoundException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof ScreenshotException){
			System.out.println("The Element could not be found"+throwable.getMessage());
		}*/
		
		
	}

}
