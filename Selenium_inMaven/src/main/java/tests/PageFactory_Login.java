package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PageFactory;

public class PageFactory_Login {
	 WebDriver driver;

@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		HomePage_PageFactory hp = new HomePage_PageFactory(driver);
		hp.login("standard_user");
		
}
}
