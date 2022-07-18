package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.InventoryPage;

public class BaseClasses {
	static WebDriver driver;

	/*
	 * HomePage hp; InventoryPage ip;
	 */
	public void setup() {
//		PropertyManager pp = new PropertyManager();
//		String x = pp.getProperty("file");
//		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public void login() {
		
	}
	
	public void logout() {
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
}
