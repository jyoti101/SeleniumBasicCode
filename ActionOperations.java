package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOperations {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		
		selectSubMenu("div","Add-ons", "Student Discount");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doclick(By locator) {
		getElement(locator).click();
	}
	
	public static void selectSubMenu(String htmltag, String parentMenu, String childMenu) throws InterruptedException {
		
		By parentMenuLocator = By.xpath("//"+htmltag+"[text()='"+parentMenu+"']");
		
		By childMenuLocator = By.xpath("//"+htmltag+"[text()='"+childMenu+"']");
		
		   WebElement parentMenuElement = getElement(parentMenuLocator);
			
			Actions action = new Actions(driver);
			
			
			action.moveToElement(parentMenuElement).build().perform();
			Thread.sleep(2000);
			doclick(childMenuLocator);
	}

}
