package package_MDRIm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page2_ProjectType {
	
	WebDriver driver;
	
	public Page2_ProjectType(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void MethodHome_ProjectType() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement Btncreatenew = driver.findElement(By.xpath("//*[@id=\"appian-body\"]/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/a/img"));
		
		Btncreatenew.click();
		
		Thread.sleep(5000);
		
		WebElement DDprojecttype = driver.findElement(By.id("189d67819beda8ebc9b5a2b7554f80f1_value"));
		
		DDprojecttype.click();
		
		String value = DDprojecttype.getAttribute("aria-activedescendant");
		
		System.out.println(value);
		
		Thread.sleep(2000);
		
		//WebElement select = driver.findElement(By.xpath("//*[@id=\'189d67819beda8ebc9b5a2b7554f80f1_selectedChoice\']"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(DDprojecttype).build().perform();
		
		driver.findElement(By.linkText("New Product Introduction")).click();
		
				
		//*[@id="appian-nav"]/div/div/div/nav/div[1]/ul/li[4]/a/div[2]
		
		
	}
	

}
