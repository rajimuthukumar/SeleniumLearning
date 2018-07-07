package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
		  
		  WebElement MessageBox = driver.findElement(By.id("user-message"));
		  
		  MessageBox.sendKeys(ExcelFunc.cellvalue3);
		  
		  WebElement ShowMessagebtn = driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
		  
		  ShowMessagebtn.click();
		  
		  /*int x = GetTotalbtn.getLocation().getX();
		 
		  System.out.println(x);
		  		  
		  int y = GetTotalbtn.getLocation().getY();
		  
		  System.out.println(y);
		  
		  Actions builder = new Actions(driver);
		  
		  builder.moveByOffset(368, 954).click();
		  
		  builder.perform();*/
		  
		  //driver.close();
		  
		  /*WebElement MessageBox = driver.findElement(By.id("user-message"));
		  
		  int x = MessageBox.getLocation().getX();
		  
		  System.out.println(x);
		  
		  
		  
		  int y = MessageBox.getLocation().getY();
		  
		  System.out.println(y);
		  
		  Actions builder = new Actions(driver);
		  
		  builder.moveByOffset(x, y).click();
		  
		  builder.perform();*/
		  
	  }


}
