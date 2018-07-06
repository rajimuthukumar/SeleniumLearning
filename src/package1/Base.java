package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;

	public Base(){
		
		System.setProperty("webdriver.chrome.driver", "D://Sindhu//Selenium//FIM//Drivers//chromedriver_win32 (1)//chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.get("http://www.seleniumeasy.com/test/");
	    
	    driver.manage().window().maximize();
	}
	
}
