
package Seleniumsession.Seleniumsession2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver.get("https://www.google.com");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	}
	public static WebElement waitForElementPresence(By locator,int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitforElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	
		
	}
}

