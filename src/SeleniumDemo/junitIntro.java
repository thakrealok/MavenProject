package SeleniumDemo;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class junitIntro {
	private WebDriver driver;
	private String baseUrl;
	WebDriverWait wait;
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		baseUrl= "https://www.amazon.com";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	@Test
	public void test1() throws InterruptedException {
		System.out.println("User is on homepage");
		String hpDrpDown="//div[@class='nav-search-scope nav-sprite']";
		
		WebElement hpDrpDn=driver.findElement(By.xpath(hpDrpDown));
		hpDrpDn.click();
		//Thread.sleep(20);
		String selection="//select[@id='searchDropdownBox']/option";
		List<WebElement> element=driver.findElements(By.xpath(selection));
		  if(element.size()!= 0) {
			  System.out.println(element.size() + "  this is actual size of dropdown list");
		for(WebElement inputElement : element) 
		{
			System.out.println(inputElement.getText());
			
			System.out.println(inputElement.isDisplayed());
			
			System.out.println(inputElement.isSelected());
			
			System.out.println(inputElement.isEnabled());
			inputElement.click();
			hpDrpDn.click();
			/*String elementToClick="Baby";
			String expected=inputElement.getText();
		if(expected.equals(elementToClick)) {
	      System.out.println(expected);
	      inputElement.click();
	      System.out.println("element is clicked");
	      Thread.sleep(10);
	      break;
			
		}else {
			System.out.println(inputElement.getText());
		}
		*/	
		}}else 
		{
			System.out.println("no data present in dropdown");
		}
	
		
}
	@After
	public void tearDown() throws Exception {
	//driver.close();
	}
}
	//@BeforeClass
	//public static void setUpBeforeClass() throws Exception {
	//	System.out.println("Before test class");
	//}

	//@AfterClass
	//public static void tearDownAfterClass() throws Exception {
	//	System.out.println("After test class");
	//}



	//@Test
	//public void test2() {
		//System.out.println("My test run2");
	//}

//}
