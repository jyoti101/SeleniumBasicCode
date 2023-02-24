package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class RelativeLocator {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		
	
		driver.get("https://selectorshub.com/xpath-practice-page");
		Thread.sleep(2000);
		
		By ele = By.xpath("//a[contains(text(),'John.Smith')]");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", ""); 
		
		String rightIndex = driver.findElement(with(By.xpath("//td[normalize-space()='Admin']")).toRightOf(ele)).getText();
		System.out.println(rightIndex);	

		WebElement leftIndex = driver.findElement(with(By.tagName("input")).toLeftOf(ele));
		leftIndex.click();
		
		String AboveIndex = driver.findElement(with(By.tagName("td")).above(ele)).getText();
		System.out.println(AboveIndex);	

		String BelowIndex = driver.findElement(with(By.tagName("td")).below(ele)).getText();
		System.out.println(BelowIndex);
		
	}

	}


