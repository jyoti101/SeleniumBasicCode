package Seleniumsession.Seleniumsession2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By checkBoxBtn = By.name("agree");

		By ContinueBtn = By.xpath("//input[@value='Continue']");
		By message = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

		By cnfmessage = By.tagName("h1");

		ElementUtil Eu = new ElementUtil(driver);
		Eu.doSendkeys(firstName, "Test");
		Eu.doSendkeys(lastName, "user");
		int RandInt = Eu.generateInt();
		Eu.doSendkeys(Email, "username" +RandInt + "@gmail.com");
		Eu.doSendkeys(Telephone, "9876543210");
		Eu.doSendkeys(password, "Login123");
		Eu.doSendkeys(confirmPassword, "Login123");
		Eu.doClick(checkBoxBtn);
		Eu.doClick(ContinueBtn);


		String confirmRegMsg = Eu.doGetElementText(cnfmessage);

		if (confirmRegMsg.contains("Your Account Has Been Created!")) {
			System.out.println("Account created successfully");

		} else {
			System.out.println("User is already registered");
		}

		
	}

}
