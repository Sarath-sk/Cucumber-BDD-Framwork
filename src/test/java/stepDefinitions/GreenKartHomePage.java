package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.HomePage;
import Pages.ObjectManager;
import Pages.TopDealsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.TestBase;

public class GreenKartHomePage {

	
	TestBase tb;
	ObjectManager objManager;
	HomePage hp;
	
	
	
	public GreenKartHomePage(TestBase tb){
		this.tb = tb;
		hp = tb.objManager.getHomePageObject();
	}
	
	@Given("user is on GreenKart Homepage")
	public void user_is_on_green_kart_homepage() throws IOException {
		
		tb.setup.webDriverManager().getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/");
		//System.out.println("Given action");
	    
	}
	@When("^user search with name (.+) in homepage and extract the text$")
	public void user_search_with_name_in_homepage_and_extract_the_text(String shotname) throws InterruptedException {
		hp = tb.objManager.getHomePageObject();
		hp.inputData(shotname);
	    Thread.sleep(2000);
	    tb.ItemTextHomePage =hp.getText();
	    Thread.sleep(2000);
	    //tb.text1 = tb.driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split("-")[0].trim();
	    System.out.println(tb.ItemTextHomePage);
	}
	
	@Given("landing on GreenKart home page")
	public void landing_on_green_kart_home_page() throws IOException {
		tb.setup.webDriverManager().getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	}
	@When("user search with name {string} in homepage and increase item count by {int}")
	public void user_search_with_name_in_homepage_and_increase_item_count_by(String shotname, Integer count) throws InterruptedException {
		
		hp.inputData(shotname);
		hp.increaseItemsCount(3);
		tb.ItemTextHomePage = hp.getText();
		System.out.println(tb.ItemTextHomePage);
		hp.AddCart();
		
	}
	@When("user check the cart value for selected items")
	public void user_check_the_cart_value_for_selected_items() throws InterruptedException {
		hp.clickCart();
		
	}

}
