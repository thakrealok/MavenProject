package Pages;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private static WebElement element =null;
    
	public static WebElement Search_box(WebDriver driver) {
		
		element=driver.findElement(By.name("q"));
		return element;
	}
    public static WebElement Search_button(WebDriver driver) {
	    element=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@type='submit' and @class='gNO89b']"));
	    return element;
  }
    public static WebElement actual_result(WebDriver driver) {
    	element=driver.findElement(By.xpath("//h3[text()='Amazon.com. Spend less. Smile more.']"));
		return element;
    	
    }
}
