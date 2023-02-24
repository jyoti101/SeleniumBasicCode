package Seleniumsession.Seleniumsession2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectDropdown {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
	   //driver.manage().window().setSize(new Dimension(4000, 5000));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	
	
	By choiceList = By.xpath("//span[@class ='comboTreeItemTitle']");
	
	
	
	   
}

		public static void selectChoice(By locator, String choice) {
		 List<WebElement> List = driver.findElements(locator);
		
		 for(WebElement e : List) {
			String text = e.getText();
			if(text.equals(choice)) {
				e.click();
				break;
			}
		 }
		}

	}
	

