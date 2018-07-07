package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DropdownCheck {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1;

		System.setProperty("webdriver.ie.driver", "D://Sindhu//Selenium//FIM//Drivers//IEDriverServer_x64_3.13.0 (1)//IEDriverServer.exe");
		
	    driver1 = new InternetExplorerDriver();
	    
	    driver1.get("https://jnjvldqa2.appiancloud.com/suite/sites/rim`");
	    
	    driver1.manage().window().maximize();
	    
	    WebElement username = driver1.findElement(By.id("username"));
	    
	    username.sendKeys("ngnanad1");
	    
	    WebElement password = driver1.findElement(By.id("password"));
	    
	    password.sendKeys("Winner@2020");
	    
	    WebElement signon = driver1.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/a"));
	    
	    signon.click();
	    
	    Thread.sleep(5000);
	    
	    WebElement createnewstrategy = driver1.findElement(By.xpath("//*[@id=\"appian-body\"]/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/a/img"));
	    
	    createnewstrategy.click();
	    

	}

}
