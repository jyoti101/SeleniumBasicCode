package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\0015ZL744\\Downloads\\IMG-0349.jpg");
		driver.findElement(By.xpath("//input[@value='Press']")).click();
	}
}
