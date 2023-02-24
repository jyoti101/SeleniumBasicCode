package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramehandlingWithActions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
	
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("mainpanel");
		
		//Actions act = new Actions(driver);
		
		 // act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']")))
		 // .build().perform();
		 
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		
		
		Thread.sleep(2000);
		
		
		//act.click().moveToElement(driver.findElement(By.xpath("//a[@title='New Contact']"))).build().perform();
		
             selectCheckbox("sdf dfgh");
             selectCheckbox("tom automation");
             
		 
		
	}
	
	public static void selectCheckbox(String username) {
    driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	

}
