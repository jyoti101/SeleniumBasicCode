package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		DoLogin("admin", "admin","the-internet.herokuapp.com/basic_auth");
		System.out.println("Successfully logged in");

	}

	public static boolean DoLogin(String username, String password, String url) {
		driver.get("https://" + username + ":" + password + "@" + url);
		String msg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		if (msg.contains("Congratulations! You must have the proper credentials.")) {
			return true;
		}
		return false;

	}
}
