package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabLogin {
	//generic java code with methods

	public static void main(String[] args) {
		setup();
		homepage();

	}
	
	static WebDriver driver ;
	
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	public static void homepage() {
		
		WebElement loginID = driver.findElement(By.id("user-name"));
		WebElement loginPWD = driver.findElement(By.id("password"));
		String username = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText();
		String password = driver.findElement(By.className("login_password")).getText();
		
		
	System.out.println("username:"+username);
	System.out.println("password:"+password);
	loginID.sendKeys("standard_user");
	loginPWD.sendKeys("secret_sauce");
	
	//driver.findElement(By.className("submit-button btn_action")).click(); class names if have spaces,just use the part of it
	driver.findElement(By.className("submit-button")).click(); 
	 }

}
