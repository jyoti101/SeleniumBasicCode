package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.net.UrlChecker;

public class BrowserUtil {

	 WebDriver driver;

	public WebDriver LaunchBrowser(String browsername) {
		
		switch (browsername.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\0015ZL744\\Desktop\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\0015ZL744\\Desktop\\Webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("No valid browser");

		}
		return driver;
	}
	
	public void openUrl(String URL) {
		if(URL==null) {
			System.out.println("Null Url");
			throw new FrameworkException("URLISNULL");
		}
		if(URL.length()==0) {
			System.out.println("Url is blank");
		    throw new FrameworkException("URLISBLANK");
	}
	
	if(URL.indexOf("http")!=0 && URL.indexOf("https")!=0) {
		System.out.println("http(s) is missing");
		throw new FrameworkException("HTTP(S) is missing");
	}
	
		
		driver.navigate().to(URL);
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
   public void closeBrowser() {
	   driver.close();
   }
	
}
