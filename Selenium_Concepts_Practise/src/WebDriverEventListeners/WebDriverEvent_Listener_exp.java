package WebDriverEventListeners;

import mx4j.tools.config.DefaultConfigurationBuilder.Register;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverEvent_Listener_exp {

   WebDriver driver;
   WebDriverEventListener1 evlstnr;
   EventFiringWebDriver e_fire;
   WebDriverWait wait;
   public int waittime=10;
   String appurl="https://www.google.com";
   String pagetext="One account. All of Google.";
   String errormsg="The email and password you entered don't match.";
   
   
   @BeforeClass
   public void setup(){
	   driver= new FirefoxDriver();
	   wait = new WebDriverWait(driver, waittime);
	   
	   //now creating object to the WebDriver evenet listner class
	   evlstnr= new WebDriverEventListener1();
	   
	   //now creating EventFiring Object
	    e_fire= new EventFiringWebDriver(driver);
	    
	    //now rigister with eventfire 
	    
	    e_fire.register(evlstnr);
	    e_fire.manage().window().maximize();
	    e_fire.get(appurl);
	   
   }

   @Test
   
   public void test1(){
	   System.out.println("***********test1***************");
	   e_fire.findElement(By.linkText("Gmail")).click();
	   String textofpage=e_fire.findElement(By.tagName("h1")).getText();
	   Assert.assertTrue(textofpage.equalsIgnoreCase(pagetext));
   }
   
   @Test
   public void test2(){
	   System.out.println("*******************test2****************");
	   e_fire.findElement(By.id("Email")).sendKeys("idboapp@gmail.com");
	   e_fire.findElement(By.id("next")).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
	   e_fire.findElement(By.id("Passwd")).sendKeys("1234");
	   e_fire.findElement(By.id("signIn")).click();
	   String msg=e_fire.findElement(By.id("errormsg_0_Passwd")).getText();
	   Assert.assertTrue(msg.equalsIgnoreCase(errormsg));
   }
   @AfterClass
   public void teardown(){
	   e_fire.close();
   }

}
