package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageFactory {

	WebDriver driver;
	
	
	 @FindBy(id="user-name")
	 WebElement username;
	 @FindBy(id="password")
	 WebElement password1;
	 @FindBy(className="submit-button")
	 WebElement password;
	
	public HomePage_PageFactory(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String userid) {
		username.sendKeys(userid);		
		password.sendKeys("secret_sauce");
	}
	
	
}
