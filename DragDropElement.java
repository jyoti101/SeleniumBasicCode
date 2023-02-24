package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		

		WebElement SrcEle = driver.findElement(By.id("draggable"));
		WebElement tarEle = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		/*
		 * act.clickAndHold(SrcEle).moveToElement(tarEle) .release().build().perform();
		 */
		
		act.dragAndDrop(SrcEle, tarEle).build().perform();
		
		

	}

}
