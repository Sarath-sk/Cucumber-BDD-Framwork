package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import utilities.TestBase;

public class Hooks {
	
	
	TestBase tb;
	Scenario s;
	
	public Hooks(TestBase tb) {
		this.tb = tb;
	}
	
	
	
	
	
	@After
	public void tearDown() throws IOException {
		
		tb.setup.webDriverManager().quit();
	}
	
//	@AfterStep
//	public void getScereenshot(Scenario s) {
//		//this.s = s;
//		 	
//		if(s.isFailed()) {
//			
//			
//		}
//		
//	}
	


}
