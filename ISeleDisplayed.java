package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISeleDisplayed {
	static WebDriver driver;

	static By search = By.name("search");

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean DoIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}

	public static void main(String[] args) {
		
		driver =  new ChromeDriver();
		
		
		  driver.get("https://naveenautomationlabs.com/opencart/");
		  /* boolean flag = driver.findElement(By.name("search")).isDisplayed(); if(flag) {
		 * System.out.println("element is displayed"); } else {
		 * System.out.println("element is not displayed"); }
		 */
		  
		 DoIsDisplayed(search);
		
	}

}
