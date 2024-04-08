package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import Pages.HomePage;
import Pages.TopDealsPage;
import io.cucumber.java.en.Then;
import utilities.TestBase;

public class GreenKartTopDealsPage {
	
	TestBase tb;
	TopDealsPage dp;
	HomePage hp;
	
	
	public GreenKartTopDealsPage(TestBase tb) {
		this.tb = tb;
		
	}

	
	
	@Then("^user search with name (.+) in top-deals page and extract the text$")
	public void user_search_with_name_in_top_deals_page_and_extract_the_text(String shortname) throws InterruptedException {
		
		dp = tb.objManager.getTopDealsPageObject();
		dp.clickTopDealsPage();
		tb.gutil.switchToChildWindow();
		Thread.sleep(3000);
		dp.inputsearchItem(shortname);
		tb.ItemTextOffersPage = dp.getTextFromOfferPage();
		System.out.println(tb.ItemTextOffersPage);
	}
	
	
	@Then("validate text in home and top-deals page")
	public void validate_text_in_home_and_top_deals_page() {
		Assert.assertEquals(tb.ItemTextHomePage, tb.ItemTextOffersPage);
	}
}
