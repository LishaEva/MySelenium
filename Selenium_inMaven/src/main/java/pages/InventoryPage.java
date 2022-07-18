package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
	WebDriver driver;

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(this.driver, driver);
	}

	By item1 = By.xpath("//div[@class='inventory_item_name']");

	public void chooseItem()  {
		System.out.println("hello");
		//driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();		
		driver.findElement(item1).click();
		System.out.println("hellooo");
		//System.out.println(driver.findElement(item1).isSelected());
		//WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/inventory-item.html?id=4"));
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory-item.html?id=4");

		String title = driver.getTitle();
		System.out.println("title:"+title);
		Assert.assertEquals(title,"Swag Labs");
		
	}
}
