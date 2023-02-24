package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverBasics {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "edge";
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\0015ZL744\\Desktop\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\0015ZL744\\Desktop\\Webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			// driver.get("https://www.google.com/");
			break;
		default:
			System.out.println("No valid browser");

		}

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\0015ZL744\\Desktop\\Webdriver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		// System.out.println(title);
		if (title.equals("Facebook – log in or sign up")) {
			System.out.println("title is correct");
		} else {
			System.out.println("Invalid title");
		}

		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		String PS=  driver.getPageSource();
		// System.out.println(PS);
		
		
	}
}
