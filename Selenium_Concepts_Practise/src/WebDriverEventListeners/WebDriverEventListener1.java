package WebDriverEventListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebDriverEventListener1 extends AbstractWebDriverEventListener {
	
	@Override
	public void beforeNavigateTo(String url,WebDriver driver){
		System.out.println("Before navigatin :"+url);
		
		
	}
	
	@Override
	public void afterNavigateTo(String url,WebDriver driver){
		System.out.println("After navigation :"+url);
	}
	
	@Override
	public void beforeNavigateForward(WebDriver driver){
		System.out.println("navigating to next page");
	}
	
	@Override
	public void afterNavigateForward(WebDriver driver){
		System.out.println("Navigated to next page");
	}
	
	@Override
	public void beforeNavigateBack(WebDriver driver){
		System.out.println("Navigating previous page");
	}
	@Override
	public void afterNavigateBack(WebDriver driver){
		System.out.println("Navigated to previous  page");
	}
	@Override
	public void beforeNavigateRefresh(WebDriver driver){
		System.out.println("before refresh");
		
	}
	
	@Override
	public void afterNavigateRefresh(WebDriver driver){
		System.out.println("after reresh of page");
	}
	
	@Override
	public void beforeClickOn(WebElement element,WebDriver driver){
		System.out.println("Before click on :"+element.toString());
	}
	
	@Override
	public void afterClickOn(WebElement element,WebDriver driver){
		System.out.println("After click on :"+element.toString());
	}
	
	@Override
	public void beforeChangeValueOf(WebElement element,WebDriver driver){
		System.out.println("value of element is  :"+element.toString() +" before change made");
		
	}
	
	@Override
	public void afterChangeValueOf(WebElement element,WebDriver driver){
		System.out.println("value of element of :"+element.toString()+ "after change made");
	}
	
	@Override
	public void beforeFindBy(By by,WebElement element,WebDriver driver){
		System.out.println("Element :"+by.toString());
	}
	
	@Override
	public void afterFindBy(By by,WebElement element,WebDriver driver){
		System.out.println("Element found by :"+by.toString());
	}
	@Override
	public void onException(Throwable error,WebDriver driver){
		System.out.println("Exception :"+error);
		
	}
	
	@Override
	public void beforeScript(String arg0,WebDriver driver){
		
	}
	
	@Override
	public void afterScript(String argo,WebDriver driver){
		
	}

}
