package com;



import org.junit.Test;

import pages.HomePage;

public class Saucelab_POM_PageFactory extends BaseClasses {
	//SauceLabLogin obj;
	//HomePage hp;

	/*
	 * public static void main(String[] args) { obj.setup(); hp = new
	 * HomePage(driver);// using a static main method wants the homepage as static.
	 * hp.login("standard_user"); // incase if used a TestNG/Junit annotation, this
	 * may be avoided. // Lets try same using annotations }
	 */

	@Test
	public void login() {
		setup(); // no need to initialize as its extended from baseclasses 
		HomePage hp = new HomePage(driver);
		hp.login("standard_user");
		
	}
	
}
