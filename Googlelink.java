package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelink {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(400, 500));
		driver.get("https://www.google.com");

		ElementUtil Eu = new ElementUtil(driver);
		/*
		 * By tagname = By.xpath("/html/body/div[1]/div[5]/div[2]"); String Text =
		 * Eu.getElement(tagname).getText(); System.out.println(Text);
		 * Eu.doClickOnElement(tagname, "Business");
		 */

		// System.out.println("-----------------------------------");

		By tag = By.name("q");
		Eu.doSendkeys(tag, "Selenium");
		Thread.sleep(3000);
		By SugList = By.xpath("//div[@class ='wM6W7d']/span");
		Eu.doClickOnElement(SugList, "selenium");

	}

}
