package package_MDRIm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseForUser {
	
	public WebDriver driver;

	public BaseForUser(){
		
		System.setProperty("webdriver.chrome.driver", "D://Sindhu//Selenium//FIM//Drivers//chromedriver_win32 (1)//chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
	    driver.get("https://jnjvldqa2.appiancloud.com/suite/sites/rim");
	    
	    driver.manage().window().maximize();
	}

}
