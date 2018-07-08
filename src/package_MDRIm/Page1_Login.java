package package_MDRIm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1_Login {

	WebDriver driver;

	  public Page1_Login(WebDriver driver)
	  {
	    this.driver = driver;
	  }
	  
	  public void MethodLogin() {
		  
		  WebElement Txtusername = driver.findElement(By.id("username"));
		  
		  Txtusername.sendKeys(ExcelForUser.cellvalue1);
		  	  
		  WebElement Txtpassword = driver.findElement(By.id("password"));
		  
		  Txtpassword.sendKeys(ExcelForUser.cellvalue2);
		  
		  WebElement Btnsignon = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/a"));
		  
		  Btnsignon.click();
	  }

}
