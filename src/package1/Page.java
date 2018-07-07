package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page {
	
	WebDriver driver;

	  public Page(WebDriver driver)
	  {
	    this.driver = driver;
	  }
	  
	  public void func1() {
		  
		  WebElement Formlink = driver.findElement(By.linkText("Input Forms"));
		  
		  Formlink.click();
		  
		/*  WebElement SimpleForm = driver.findElement(By.linkText("Simple Form Demo"));
		  
		  int a = SimpleForm.getLocation().getX();
		  
		  int b = SimpleForm.getLocation().getY();
		  
		  Actions act1 = new Actions(driver);
		  
		  act1.moveByOffset(a, b).click();*/
		  
		  
		 
		  
		  WebElement SimpleForm = driver.findElement(By.linkText("Simple Form Demo"));
		  
		  SimpleForm.click();
		  
	  }

}
