package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo {
	
	WebDriver driver;
	
	public CheckBoxDemo(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void BoxFunc()
	
		{
		
			WebElement Formlink = driver.findElement(By.linkText("Input Forms"));
		  
			Formlink.click();
		  
		
			WebElement Checkboxopt = driver.findElement(By.linkText("Checkbox Demo"));
			
			Checkboxopt.click();
			
			WebElement checkbox1 = driver.findElement(By.id("isAgeSelected"));
			
			checkbox1.click();
			
			if(checkbox1.isSelected()) {
				System.out.println("Checkbox is checked");
				}
			else {
				System.out.println("Checkbox is not selected");
			}
			
			WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[1]/label/input"));
			
			checkbox2.click();
			
			if(checkbox2.isSelected()) {
				System.out.println("Checkbox is checked");
				}
			else {
				System.out.println("Checkbox is not selected");
			}
			
			
			
		}
		
}

//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[1]/label/input