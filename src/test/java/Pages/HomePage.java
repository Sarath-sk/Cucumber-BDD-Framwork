package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	@FindBy(how=How.XPATH, using="//input[@type='search']")
	public WebElement searchbox;
	
	@FindBy(how=How.XPATH, using="//h4[@class='product-name']")
	public WebElement searchItemText;
	
	@FindBy(how=How.XPATH, using="//a[@class='increment']")
	public WebElement ItemCountIncrement;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Cart']")
	public WebElement CartNavigation;
	
	@FindBy(how=How.XPATH, using="//button[text()='ADD TO CART']")
	public WebElement AddToCartButton;
	
	@FindBy(how=How.XPATH, using="//button[text()='PROCEED TO CHECKOUT']")
	public WebElement Checkout;
	
	
	
	
	
	public void inputData(String name) {
		System.out.println(name);
		searchbox.sendKeys(name);
	}
	
	public String  getText() {
		return searchItemText.getText().split("-")[0].trim();
	}
	
	
	public void increaseItemsCount(Integer count) throws InterruptedException {
		for(int i=0;i<count;i++) {
			//ItemCountIncrement.click();
			driver.findElement(By.xpath("//a[@class='increment']")).click();
			Thread.sleep(2000);
		}
	}
	
	public void clickCart() {
		CartNavigation.click();
		Checkout.click();
	}
	
	
	public void AddCart() {
		AddToCartButton.click();
	}

}
