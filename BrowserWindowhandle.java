package Seleniumsession.Seleniumsession2022;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parentWindow = driver.getWindowHandle();
		Thread.sleep(5000);
		
		WebElement facebook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement linkedin = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		facebook.click();
		linkedin.click();
		youtube.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			
			       if(!windowId.equals(parentWindow)) {
				    driver.close();
			}

		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}
}