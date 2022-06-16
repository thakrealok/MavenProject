package MainTest;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AmazonPage;
import Pages.GooglePage;

public class TestClass {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		baseUrl = "https://google.com";
		//baseUrl2 = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	
	/*
	 * @Test public void test() { driver.get(baseUrl);
	 * GooglePage.Search_box(driver).sendKeys("https://www.amazon.com");
	 * GooglePage.Search_button(driver).click();
	 * GooglePage.actual_result(driver).click();
	 * 
	 * }
	 */
	 
	@Test
	public void test2() {
		
		  driver.get("https://www.amazon.in/");
		  AmazonPage.today_deals(driver).click(); 
		  AmazonPage.customer_service(driver);
		  AmazonPage.registry(driver).click();
		  AmazonPage.gift_cards(driver);
		  AmazonPage.sell(driver).click();
		  AmazonPage.search(driver).sendKeys("hp laptop 10 generation");
		  AmazonPage.click(driver).click();		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		//driver.close();
	}
}
