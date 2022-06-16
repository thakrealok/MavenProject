package SeleniumDemo;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WindowHandle {
	private WebDriver driver;
	private String baseUrl;
	WebDriverWait wait;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		baseUrl = "https://www.irctctourism.com/";
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		 js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void test() throws InterruptedException {
		js.executeScript("window.location = 'https://www.irctc.co.in'");
		Thread.sleep(3000);
		
		//size of window
		
		long height=(long) js.executeScript("return window.innerHeight;");
	    long width=(long) js.executeScript("return window.innerWidth;");
	    System.out.println("height=" + height);
	    System.out.println("width=" + width);
	
	   //Secoll the page and click ok button
	    String okbtn="//button[@type=\"submit\" and @class=\"btn btn-primary\"]";
	    WebElement element=driver.findElement(By.xpath(okbtn));
	    js.executeScript("arguments[0].scrollIntoView(true);",element);
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].click();",element);
	    
	    System.out.println("click the ok button");
	    
	    //Code for clicking the menu button
	    String menu="//div[@class='h_menu_drop_button hidden-xs']";
	    WebElement option=driver.findElement(By.xpath(menu));
	    option.click();
	    Thread.sleep(1000);
	    
	    //code for clicking bus option
	    String parentHandle = driver.getWindowHandle();
	    String bus="//a/label[text()='BUSES']";
	    WebElement buses=new WebDriverWait(driver, Duration.ofSeconds(50))
	    		.until((ExpectedConditions.elementToBeClickable(By.xpath(bus))));
	        buses.click();
	        
	        //code for handling the windows
	        Set<String> handles= driver.getWindowHandles();
	   for(String handle:handles) {
	        	System.out.println(handle);
	      if(!handle.equals(parentHandle)) {
	        		driver.switchTo().window(handle);
	        		 Thread.sleep(1000);
	        		 String book="//h3[text()='Book Bus Ticket']";
	        		 WebElement bookText=driver.findElement(By.xpath(book));
	        		 System.out.println("This is bus window");
	        		 System.out.println(bookText.getText());
	        		 Thread.sleep(100);
	        		 //driver.close();
	        		// break;
	        		}
	        	 }
	        //how to switch 
	   driver.switchTo().window(parentHandle);
	    String enterFrom="//*[@id=\"origin\"]/span/input";
	    WebElement from=driver.findElement(By.xpath(enterFrom));
	        from.sendKeys("Mumbai");
	        System.out.println("This is main window");
	        
	       //code for flight
	 String flight="//a[@class='a']/label[text()='FLIGHTS']";
	 
     WebElement flights=new WebDriverWait(driver, Duration.ofSeconds(100))
		    		.until((ExpectedConditions.elementToBeClickable(By.xpath(flight))));
               
		        flights.click();
		        Thread.sleep(8000);
		    System.out.println("This is flight window");
		  
		    
		   
		 // hotels
		    driver.switchTo().window(parentHandle);
	    String hotels="//a[@class='a']/label[text()='HOTELS']";
	    WebElement hotelClick=new WebDriverWait(driver, Duration.ofSeconds(50))
	    		.until((ExpectedConditions.elementToBeClickable(By.xpath(hotels))));
 
	        hotelClick.click();
			
			/*
			 * js. executeScript("window.location = 'https://www.hotel.irctctourism.com/hotel'");
			 *  Thread.sleep(3000);
			 * 
			 * //size of window
			 * 
			 * long height1=(long) js.executeScript("return window.innerHeight;"); long
			 * width1=(long) js.executeScript("return window.innerWidth;");
			 * System.out.println("height=" + height1); System.out.println("width=" +
			 * width1);
			 * 
			 * //Secoll the page and click ok button String String
			 * text="//a[text()='Terms & Conditions']"; WebElement
			 * elements=driver.findElement(By.xpath(text));
			 * js.executeScript("arguments[0].scrollIntoView(true);",elements);
			 * Thread.sleep(2000); js.executeScript("arguments[0].click();",elements);
			 */
	}
	@After
	public void tearDown() throws Exception {
		//driver.quit();

	
	}

}
