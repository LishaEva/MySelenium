package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {
	 static WebDriver driver;
	 

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS); deprecated for sel4
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("hello");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		PropertyManager pm = new PropertyManager();
		System.out.println(pm.getProperty("name"));// not working  *** debug
		
	}
	
	

}
