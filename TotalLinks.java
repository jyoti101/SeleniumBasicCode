package Seleniumsession.Seleniumsession2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
	List<WebElement> linksList = driver.findElements(By.tagName("a"));
	
	System.out.println(linksList.size());
	
	/*for(int i=0; i<linksList.size();i++) {
	String text = linksList.get(i).getText();
	if(!(text.length()==0)) {
	System.out.println(i + "=" +text);
	}*/
	
	int count =0;
	for(WebElement e : linksList) {
		String text = e.getText();
		if(!(text.length()==0)) {
			System.out.println( count + "=" +text);
	
	}
		count++;
	 
	}
}
}