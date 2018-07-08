package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	WebDriver driver;
	
	public DropdownDemo(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void dropdown1() {
		

		WebElement Formlink = driver.findElement(By.linkText("Input Forms"));
	  
		Formlink.click();
		
		WebElement Dropdownmenu = driver.findElement(By.linkText("Select Dropdown List"));
		
		Dropdownmenu.click();
		
		Select drop1 = new Select(driver.findElement(By.id("select-demo")));
		
		drop1.selectByIndex(2);
		
		
		//multi select
		
		Select drop2 = new Select(driver.findElement(By.id("multi-select")));
		
		drop2.selectByIndex(0);
		
		drop2.selectByValue("Ohio");
		
		drop2.selectByIndex(1);
	}
	
}
