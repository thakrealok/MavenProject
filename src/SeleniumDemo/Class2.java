package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athakre\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com");
		//String search = "//input[@id='twotabsearchtextbox']";
		 //driver.findElement(By.xpath(search)).sendKeys("Shoes For Boys");
		 //String str="//input[@id='nav-search-submit-button']";
		 //driver.findElement(By.xpath(str)).click();
		 //String s="//div//img[@class='s-image']";
		 //driver.findElement(By.xpath(s)).click();
		 //driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("Shoes For Boys");
		 //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @class='nav-input  nav-progressive-attribute']")).sendKeys("Shoes For Boys");
		 //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @tabindex='0']")).sendKeys("Shoes For Boys");
		 //driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]")).sendKeys("Shoes For Boys");
		 //driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Gift Cards']")).click();
         //driver.findElement(By.xpath("//div[@id='nav-xshop']//a[text()='New Releases']//following-sibling::a")).click();
		 //driver.findElement(By.xpath("//a[text()='Customer Service']//preceding-sibling::a[1]")).click();
         String hpDrpDown="//div[@class='nav-search-scope nav-sprite']";
		String selection="//select[@id='searchDropdownBox']/option";
		WebElement hpDrpDn=driver.findElement(By.xpath(hpDrpDown));
		hpDrpDn.click();
		Thread.sleep(20);
		List<WebElement> element=driver.findElements(By.xpath(selection));
		  if(element.size()!= 0) {
			  System.out.println(element.size()+"  element found by TagName as a \n");
			  for(WebElement inputElement:element) {
				  System.out.println(inputElement.getText());
				  
			  }
		  }else {
			  System.out.println("No data present in dropdowm");
		  }
	}

}
