package Seleniumsession.Seleniumsession2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitfForTitleUrlAlert {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.linkText("Register")).click();
		
		/*
		 * String actTitle = waitForTitleContains("Register", 5);
		 * System.out.println(actTitle);
		 */
	}
		public static String waitForTitleContains(String titleFractionValue, int timeout) {
			
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		 if(wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
		 
            return driver.getTitle();	
		 }
		else {
			System.out.println("Title is not visible");
			return null;
		}
}
}

