package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setup {
	
	WebDriver driver;
	Properties prop;
	
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
		prop = new Properties();
		prop.load(file);
		
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		return driver;
	}
	
	
}
