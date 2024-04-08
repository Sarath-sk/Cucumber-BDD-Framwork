package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.ObjectManager;

public class TestBase {
	
	public WebDriver driver;
	public String ItemTextHomePage;
	public String ItemTextOffersPage;
	public ObjectManager objManager;
	public setup setup;
	public GenericUtils gutil;
	public String ItemTextCheckoutPage;
	

	
	public TestBase() throws IOException {
		setup = new setup();
		objManager = new ObjectManager(setup.webDriverManager());
		gutil = new GenericUtils(setup.webDriverManager());
		
	}
	

}
