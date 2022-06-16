package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        String search = "//input[@class=\"gLFyf gsfi\"]";
        driver.findElement(By.xpath(search)).sendKeys("Types of software testing");
       // driver.findElement(By.xpath(search)).clear();
        String google="//div[@class=\"FPdoLc lJ9FBc\"]/center/input[@class=\"gNO89b\"]";
        driver.findElement(By.xpath(google)).click();
       // String str="//body[@class=\"srp\"]";
      //  driver.findElement(By.xpath(str)).click();
        driver.navigate().back();
        
	}

}
