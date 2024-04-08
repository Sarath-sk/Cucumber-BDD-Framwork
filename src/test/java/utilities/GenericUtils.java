package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	
	public void switchToChildWindow() {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
			
			System.out.println("You are already in offers page..!!");
		}else {
			
			Set<String> win= driver.getWindowHandles();
			Iterator<String> windows = win.iterator();
			String win1 = windows.next();
			String win2 = windows.next();
			driver.switchTo().window(win2);
		}
	}
}
