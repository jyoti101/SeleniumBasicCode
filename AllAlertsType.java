package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlertsType {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement alertBtn= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement confirmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement promptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		alertBtn.click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		
		confirmBtn.click();
        Alert conf1 = driver.switchTo().alert();
       System.out.println(conf1.getText());
       conf1.dismiss();
       
       promptBtn.click();
      Alert prom1 = driver.switchTo().alert();
      System.out.println(prom1.getText());
      prom1.sendKeys("12345");
      prom1.accept();
      
       
		
		
		
		
	}
}
