package Pages;

import org.openqa.selenium.WebDriver;

import utilities.GenericUtils;

public class ObjectManager {
	
	WebDriver driver;
	HomePage hp;
	TopDealsPage td;
	CheckOutPage cop;
	
	
	
	public ObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePageObject() {
		hp = new HomePage(driver);
		return hp;
	}
	
	public TopDealsPage getTopDealsPageObject() {
		td = new TopDealsPage(driver);
		return td;
	}
	
	public CheckOutPage getCheckOutPage() {
		cop = new CheckOutPage(driver);
		return cop;
	}
	
}
