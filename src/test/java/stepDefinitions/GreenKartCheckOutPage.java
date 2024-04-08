package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Pages.CheckOutPage;
import io.cucumber.java.en.Then;
import utilities.TestBase;

public class GreenKartCheckOutPage {
	
	
	TestBase tb;
	CheckOutPage cop;
	
	public GreenKartCheckOutPage(TestBase tb) {
		this.tb = tb;
		cop = tb.objManager.getCheckOutPage();
	}
	
	@Then("user check out the selected items")
	public void user_check_out_the_selected_items() throws InterruptedException, IOException {
		tb.ItemTextCheckoutPage = cop.ItemTextCheckoutPage();
		//Thread.sleep(2000);
		Assert.assertEquals(tb.ItemTextHomePage, tb.ItemTextCheckoutPage);
		//Thread.sleep(2000);
		Assert.assertTrue(cop.orderButton());
		cop.OrderPlace();
//		Thread.sleep(5000);
		tb.setup.webDriverManager().getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

}
