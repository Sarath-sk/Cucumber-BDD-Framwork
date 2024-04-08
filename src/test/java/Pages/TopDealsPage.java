package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopDealsPage {
	
	WebDriver driver;
	
	public TopDealsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(how=How.XPATH, using="//input[@type='search']")
	public WebElement searchbox;
	
	@FindBy(how=How.XPATH, using="//td[text()='Tomato']")
	public WebElement extractedText;
	
	@FindBy(how=How.LINK_TEXT, using="Top Deals")
	public WebElement topdealspageurl;
	
	public void clickTopDealsPage() {
	  topdealspageurl.click();
	}
	
	
	
	public void inputsearchItem(String name) {
		
		searchbox.sendKeys(name);
	}
	
	public String getTextFromOfferPage() {
		return extractedText.getText();
	}
	
	
	
}
	
	
	

