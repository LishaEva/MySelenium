package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.InventoryPage;

public class Saucelab_POMTypeLogin extends BaseClasses {
	

	/*
	 * public static void main(String[] args) { obj.setup(); hp = new
	 * HomePage(driver);// using a static main method wants the homepage as static.
	 * hp.login("standard_user"); // incase if used a TestNG/Junit annotation, this
	 * may be avoided. // Lets try same using annotations }
	 */

	 @Before
	  public void setEnv() {
		 setup();
	 }
	 
	@Test
	public void login()  {
		
		HomePage hp = new HomePage(driver);
		hp.login("standard_user");
		InventoryPage ip = new InventoryPage(driver);
		// intialize to use the method not necessary to declare anywhere
		ip.findAllItems();
		ip.findAllPrice();
		ip.chooseItem();
		ip.addtoCart();
		ip.cartStatus();
		//ip.AddAllItemsLessthan20(); yet to fix
		ip.checkout();
		
		//

	}
	/*
	 * @After public void clear() { closeBrowser();
	 * 
	 * }
	 */

}
