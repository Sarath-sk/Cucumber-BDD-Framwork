package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckOutPage {
	
    WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//p[@class='product-name']")
	public WebElement Itemtext;
	
	@FindBy(how=How.XPATH, using="//button[text()='Place Order']")
	public WebElement PlaceOrderButton;
	
	@FindBy(how=How.XPATH, using="//div[@class='wrapperTwo']/div/select")
	public WebElement SelectRegion;
	
	@FindBy(how=How.XPATH, using="//input[@class='chkAgree']")
	public WebElement TermsAndConditions;
	
	@FindBy(how=How.XPATH, using="//button[text()='Proceed']")
	public WebElement ProceedButton;
	
	
	public String  ItemTextCheckoutPage() {
		return Itemtext.getText().split("-")[0].trim();
	}
	
	public void OrderPlace() {
		PlaceOrderButton.click();
		Select select = new Select(SelectRegion);
		select.selectByVisibleText("India");
		TermsAndConditions.click();
		ProceedButton.click();
		
	}
	
	public boolean orderButton() {
		return PlaceOrderButton.isDisplayed();
	}

}
