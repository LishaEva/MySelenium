package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PropertyManager;

public class HomePage {
	// can have locators and methods. 
	//Constructor is mandatory
	//pagefactory init Elements is not mandatory

	WebDriver driver;
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void login(String userid) {
		driver.findElement(username).sendKeys(userid);		
		//PropertyManager pm = new PropertyManager();
		//System.out.println(pm.getProperty("name"));
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();
		System.out.println("Login Successful");
	}
	
	
	
}
