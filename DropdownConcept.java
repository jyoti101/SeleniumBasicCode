package Seleniumsession.Seleniumsession2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLTableRowElement;

public class DropdownConcept {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		/*
		 * ElementUtil eu = new ElementUtil(driver); eu.maximizeBrowser(); By countryDrp
		 * = By.id("Form_getForm_Country");
		 * 
		 * eu.doSelectValuefromdropdown(countryDrp, "India");
		 */
		
		List<WebElement> CountryList = driver.findElements(By.xpath("//select[@id ='Form_getForm_Country']/option "));
                    /*int count = 0;  
		             for(WebElement e : CountryList){
                    	String text = e.getText();
                    	if(!(text.length()==0)) {
                			System.out.println( count + "=" +text);
                    	
                     }
		             count++;*/
		
        for(int i = 0; i<=CountryList.size(); i++){
        	String text = CountryList.get(i).getText();
        	System.out.println(text);
        }
	}
	}

