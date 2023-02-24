package Seleniumsession.Seleniumsession2022;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import javax.management.openmbean.OpenDataException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.ssl.OpenSslAsyncPrivateKeyMethod;

public class ElementUtil {

	static WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	public String getElementText(By locator) {
		return getElement(locator).getText();

	}

	public void doClickOnElement(By locator, String linkText) {
		List<WebElement> linksList = driver.findElements(locator);
		// System.out.println(linksList);

		for (WebElement e : linksList) {
			System.out.println(e);
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}

		}

	}

	public int generateInt() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(1000);

	}

	public void doSelectDropdownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropdownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectDropdownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		;
	}

	public void doSelectValuefromdropdown(By locator, String value) {

		Select select = new Select(getElement(locator));

		List<WebElement> optionList = select.getOptions();

		for (WebElement e : optionList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;

			}
		}
	}

	public static void selectSubMenu(String htmltag, String parentMenu, String childMenu) throws InterruptedException {

		By parentMenuLocator = By.xpath("//" + htmltag + "[text()='" + parentMenu + "']");

		By childMenuLocator = By.xpath("//" + htmltag + "[text()='" + childMenu + "']");

		WebElement parentMenuElement = getElement(parentMenuLocator);

		Actions action = new Actions(driver);

		action.moveToElement(parentMenuElement).build().perform();
		Thread.sleep(2000);
		doClick(childMenuLocator);
	}

	public static WebElement waitforElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public static String waitForTitleContains(String titleFractionValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
			return driver.getTitle();
		} else {
			System.out.println("Title is not visible");
			return null;
		}
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
	
	
}
