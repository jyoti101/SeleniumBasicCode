package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.manager.SeleniumManager;

public class NavigateConcept {
	 
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0015ZL744\\Desktop\\Webdriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		
		  WebDriver driver1 = new ChromeDriver();
		//driver = new ChromeDriver();
		 //String path = SeleniumManager.getInstance().getDriverPath("chromedriver");
			//System.out.println(path);
		driver.get("https://www.google.com/");
		
		driver1.get("https://www.amazon.in/");
		
		
		/*
		 * driver.get("https://www.flipkart.com/"); //driver2 = driver1;
		 */		
		
		driver.close();
		
		
		/*
		 * driver.navigate().back(); driver.navigate().refresh();
		 * driver.navigate().forward();
		 */
		
	}

}
