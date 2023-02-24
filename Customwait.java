package Seleniumsession.Seleniumsession2022;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customwait {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		
		WebElement element = null;
		int attempts = 0;
		while(attempts<timeOut) {
			try {
			element = getElement(locator);
			System.out.println("Element is found in attempts"+attempts +"for" +locator);
			break;
			}
			catch (NoSuchElementException e) {
            System.out.println("Element is not found in attemp:" +attempts);
            TimeUtil.applyWait(intervalTime);
			}
			attempts++;
		}
		
		if(element==null) {
			System.out.println("Element is not found...");
		}
		
		return element;
	}
	
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("");
		
	}

}
