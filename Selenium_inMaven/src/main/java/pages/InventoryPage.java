package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		//driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();		
		driver.findElement(item1).click();		
		//System.out.println(driver.findElement(item1).isSelected());
		//WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/inventory-item.html?id=4"));
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory-item.html?id=4");

		String title = driver.getTitle();
		System.out.println("title:"+title);
		Assert.assertEquals(title,"Swag Labs");
		
	}
	
	 By addtoCart = By.xpath("//button[contains(text(),'Add to cart')]");
	public void addtoCart() {
		driver.findElement(addtoCart).click();
		
	}
	// Locators for cartStatus method:
	By cart = By.className("shopping_cart_link");
	//By checkout = By.xpath("//button[@id='checkout']"); //works
	//By checkout = By.xpath("//button[@name='checkout']"); //works	
	//By checkout = By.xpath("//button[text()='Checkout']");//works--> case sensitive
	By checkout = By.xpath("//*[contains(text(),'Checkout')]");
	//WebElement m = driver.findElement (By.xpath ("//*[contains(text(),'Get started ')]"));
	By cartItemCount = By.className("shopping_cart_badge");
	
	public void cartStatus() {
		driver.findElement(cart).click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");
		String ItemsCount = driver.findElement(cartItemCount).getText();
		System.out.println("Number of items in Cart:"+ ItemsCount);
	}
	
	public void checkout() {
		//Assert.assertTrue(driver.findElement(checkout).isDisplayed());
		Assert.assertTrue(driver.findElement(checkout).isEnabled());
		driver.findElement(checkout).click();
		
	}
	
	
	public void findAllItems() {
		//List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item']"));// all dat--> price,title,description for all!
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		System.out.println("AllItems :"+items);
		 for (WebElement result:items) {
	            System.out.println(result.getText());               
	        }
		
	}
	
	
	public void findAllPrice() {
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		for( WebElement price : pricelist) {			
			System.out.println(price.getText().substring(1)); // removing the $ symbol			
		}
	}
	
	public void AddAllItemsLessthan20() {
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		List<WebElement> AddToCart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
	
		for(int i=0;i<pricelist.size();i++) {			
					String price = pricelist.get(i).getText().replace("$", "");
					System.out.println("PriceAmount"+price);
					
					if(Integer.parseInt(price)<20) {
						System.out.println("inside condition");
						AddToCart.get(i).click();
						
					}
		}	
	}
}
