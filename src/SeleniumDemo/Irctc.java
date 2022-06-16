package SeleniumDemo;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;



import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {
	private WebDriver driver;
	private String baseUrl;
	WebDriverWait wait;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		baseUrl = "https://www.irctctourism.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	@Test

	public void test3() throws InterruptedException {

	String searchBut = "//button[text()=\"Search \"]";
	WebElement searchButton =driver.findElement(By.xpath(searchBut));
	searchButton.click(); 
	String bookNow ="//div[@class='top-sortby']/following-sibling::div[1]/div/div[3]/div/a[2]";

	WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(50))
			.until((ExpectedConditions.elementToBeClickable(By.xpath(bookNow))));
			wait.click(); 

	

	//WebElement bookNowButn = driver.findElement(By.xpath(bookNow));
	//bookNowButn.click(); 
	System.out.println("Element clicked");

	
	System.out.println("Search clicked clicked");

	//Thread.sleep(50); 
	System.out.println("Book Now Button is Clicked");

	}

	/*
	 * @Test
	 * 
	 * public void test2() throws InterruptedException {
	 * 
	 * String searchBut = "//button[text()='Search ']"; WebElement searchButton =
	 * driver.findElement(By.xpath(searchBut)); searchButton.click(); // First step
	 * 
	 * String bookNow =
	 * "//div[@class='top-sortby']/following-sibling::div[1]/div/div[3]/div/a[2]";
	 * String expected ="TOOo";
	 * 
	 * //WebElement bookNowButn = driver.findElement(By.xpath(bookNow));
	 * //bookNowButn.click(); 
	 * System.out.println("Element clicked");
	 * 
	 * WebElement bookNowVisibility = new WebDriverWait(driver,
	 * Duration.ofSeconds(50)).until((ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath( bookNow))));
	 * 
	 * String expectedText=bookNowVisibility.getText();
	 * System.out.println(bookNowVisibility.getText());
	 * 
	 * WebElement bookNowButn = driver.findElement(By.xpath(bookNow));
	 * 
	 * 
	 * boolean foo2= new
	 * WebDriverWait(driver,Duration.ofSeconds(5)).until((ExpectedConditions.
	 * textToBePresentInElement(bookNowButn, "took")));
	 * 
	 * //500 milisecond
	 * 
	 * if(foo2 = new WebDriverWait(driver, Duration.ofSeconds(5))
	 * .until((ExpectedConditions.textToBePresentInElement(bookNowButn, expected))))
	 * { System.out.println("Text is present"); }else{
	 * 
	 * System.out.println("Text is present"); }
	 * 
	 * }
	 * 
	 * 
	 * @Test
	 * 
	 * public void test1() throws InterruptedException {
	 * 
	 * String searchBut2 = "//button[text()='Search ']"; WebElement searchButton2 =
	 * driver.findElement(By.xpath(searchBut2)); searchButton2.click(); // First //
	 * 
	 * 
	 * String bookNow2 =
	 * "//div[@class='top-sortby']/following-sibling::div[1]/div/div[3]/div/a[2]";
	 * 
	 * //Declare and initialise a fluent wait FluentWait<WebDriver> wait = new //
	 * FluentWait<WebDriver>(driver); //Specify the timeout of the wait //
	 * wait.withTimeout(Duration.ofSeconds(50)); //Sepcify polling time //
	 * wait.pollingEvery(Duration.ofSeconds(2)); //Specify what exceptions to ignore
	 * //wait.ignoring(NoSuchElementException.class);
	 * 
	 * //This is how we specify the condition to wait on. //This is what we will
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(bookNow2)));
	 * WebElement bookNowClickable=driver.findElement(By.xpath(bookNow2));
	 * bookNowClickable.click(); System.out.println("element clicked test 1 pass");
	 * }
	 */
	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	

}
