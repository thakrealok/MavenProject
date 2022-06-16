package MainTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/input[@type='submit']")).click();
        driver.switchTo().alert();
         Alert a=driver.switchTo().alert();
         a.accept();
	}

}
