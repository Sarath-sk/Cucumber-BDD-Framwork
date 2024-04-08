package runnerFile;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="src/test/java/Features", 
				 glue ="stepDefinitions", 
				 dryRun=false,
				 tags="@Order or @Search",
				 plugin={"html:target/cucumber.html", "json:target/cucumber.json",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner extends AbstractTestNGCucumberTests{
	
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	

}
