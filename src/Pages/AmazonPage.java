package Pages;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage {

	 private static WebElement element =null;
	 
	 public static WebElement today_deals(WebDriver driver) {
		  return element = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]"));
		 
		 
	 }
	 public static void customer_service(WebDriver driver) {
		 element=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]"));
		 element.click();
		 
	 }
	 public static WebElement registry(WebDriver driver) {
		 element=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]"));
		return element;
		 
	 }
	 public static void gift_cards(WebDriver driver) {
		 element=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]"));
		 element.click();
		 
	 }
	 public static WebElement sell(WebDriver driver) {
		 element=driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]"));
		return element;
		 
	 }
	 
	 public static WebElement search(WebDriver driver) {
		 element=driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']"));
		return element;
		 
	 }
	 
	 public static WebElement click(WebDriver driver) {
		 element=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		return element;
		 
	 }
}
