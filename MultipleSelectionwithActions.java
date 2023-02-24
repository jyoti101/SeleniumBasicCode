package Seleniumsession.Seleniumsession2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSelectionwithActions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com");

		WebElement maincat = driver.findElement(By.xpath("//a[@qa ='categoryDD']"));

		Actions act = new Actions(driver);
		act.moveToElement(maincat).build().perform();
		Thread.sleep(2000);

		List<WebElement> List1 = driver.findElements(By.xpath("//ul[@id ='navBarMegaNav']//a"));

		for (WebElement e : List1) {
			act.moveToElement(e).build().perform();
			System.out.println(e.getText());

		
		List<WebElement> List2 = driver.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]//a"));

		for (WebElement e2 : List2) {
			act.moveToElement(e2).build().perform();

			System.out.println(e2.getText());

		
		List<WebElement> List3 = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]//a"));

		for (WebElement e3 : List3) {
			act.moveToElement(e3).build().perform();

			System.out.println(e3.getText());

		}
	}
		}
	}
}