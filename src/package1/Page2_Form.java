package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import package1.ExcelFunc;

public class Page2_Form {
	
	WebDriver driver;

	  public Page2_Form(WebDriver driver)
	  {
	    this.driver = driver;
	  }
	  
	  public void func2() {
		  
		  WebElement ValueA = driver.findElement(By.id("sum1"));
		  
		  ValueA.sendKeys(ExcelFunc.cellvalue1);
		  
		  WebElement ValueB = driver.findElement(By.id("sum2"));
		  
		  ValueB.sendKeys(ExcelFunc.cellvalue2);
		  
		  WebElement GetTotalbtn = driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
		  
		  GetTotalbtn.click();
		  
	  }


}
