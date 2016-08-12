package WebDriverEventListeners;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverEventListner implements WebDriverEventListener {
	
	
	@Override
	public void beforeNavigateTo(String url,WebDriver driver){
		System.out.println("before Navigate to :"+url);
		
	}
	
	@Override
	public void afterNavigateTo(String url,WebDriver driver){
		System.out.println("After navigation url :"+url);
	}
	
	@Override
	public void beforeNavigateForward(WebDriver driver){
		System.out.println("navigating to next page");
	}
	
	@Override
	public void afterNavigateForward(WebDriver driver){
		System.out.println("navigated to net page");
	}
	
	@Override
	public void beforeNavigateBack(WebDriver driver){
		System.out.println("Navigating previous page");
	}
	
	@Override
	
	public void afterNavigateBack(WebDriver driver){
		System.out.println("Navigated to previous page");
	}
    
	@Override
	public void beforeNavigateRefresh(WebDriver driver){
		System.out.println("before page refresh");
	}
	
	@Override
	public void afterNavigateRefresh(WebDriver driver){
		System.out.println("After refresh page");
	}
	
	@Override
	public void beforeClickOn(WebElement element,WebDriver driver){
		System.out.println("trying oy click :"+element.toString());
	}
	
	@Override
	
	public void afterClickOn(WebElement element,WebDriver driver){
		System.out.println("Element clicked  :"+element.toString());
	}
	@Override
	public void beforeFindBy(By by,WebElement element,WebDriver driver){
		System.out.println("trying find element :"+element.toString());
	}
	
	@Override
	public void afterFindBy(By by,WebElement element,WebDriver driver){
		System.out.println("Element found :"+element.toString());
	}
	@Override
	public void beforeChangeValueOf(WebElement element,WebDriver driver){
		System.out.println("value of Element :"+element.toString()+"before any changes made");
	}
	
	@Override
	public void afterChangeValueOf(WebElement element,WebDriver driver){
		System.out.println("value of element ;"+element.toString()+ " after change made");
	}
	
	@Override
    public void onException(Throwable error,WebDriver driver){
		System.out.println("Error "+error);
		
	}
	
	@Override
	public void beforeScript(String arg0,WebDriver driver){
		
		
	}
	
	@Override
	public void afterScript(String argo,WebDriver driver){
		
	}
	
	
}
