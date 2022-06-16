package MainTest;

import static org.junit.Assert.*;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	private WebDriver driver;
	private String Url;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    Url="http://www.ebay.in";
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(Url);
		WebElement element1=driver.findElement(By.linkText("Getting Started"));
		WebElement element2=driver.findElement(By.linkText("Seller Updates"));
		WebElement element3=driver.findElement(By.linkText("About Us"));
		WebElement element4=driver.findElement(By.linkText("Shipping & Payments"));
		Actions action=new Actions(driver);
		
		action.moveToElement(element1).perform();
		
		action.moveToElement(element2).perform();
		
		action.moveToElement(element3).perform();
	
		action.moveToElement(element4).perform();
		
	}
    
	@After
	public void tearDown() throws Exception {
	}
}
