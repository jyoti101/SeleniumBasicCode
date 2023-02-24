package Seleniumsession.Seleniumsession2022;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllPageLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		 By FooterLinks = By.xpath("//div[contains(@class,'footer-left-section')]//a");
		 
		//List<WebElement> actinkslist = getElements(FooterLinks);
		//System.out.println(actinkslist);
		
		int eleCount = getEleCount(FooterLinks);
		System.out.println(eleCount);
		if(eleCount ==21) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
	}
	
	public static List<WebElement> getElements(By locator) {
		 return driver.findElements(locator);
	 }
	
	public static int getEleCount(By locator) {
	    return getElements(locator).size();
	}
	
	
		
		 public static List<String> getElementsTextList(By locator) {
			 List<WebElement> elementList = getElements(locator);
			 List<String> eleTextlist = new ArrayList<String>();
			 
			 
			 for(WebElement e : elementList) {
				String text = e.getText();
				System.out.println(text);
				eleTextlist.add(text);
				
			 
		 }
			 return eleTextlist;
			 
	
	}

}
