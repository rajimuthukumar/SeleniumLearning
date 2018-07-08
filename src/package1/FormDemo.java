package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormDemo {
	
	WebDriver driver;
	
	public FormDemo(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void MethodForForm() {
		
		WebElement Formlink = driver.findElement(By.linkText("Input Forms"));  
		Formlink.click();
		
		WebElement Formcomplete = driver.findElement(By.linkText("Input Form Submit"));
		Formcomplete.click();
		
		
		WebElement Txtfirstname = driver.findElement(By.name("first_name"));
		WebElement Txtlastname = driver.findElement(By.name("last_name"));
		WebElement Txtemail = driver.findElement(By.name("email"));
		WebElement Txtphone = driver.findElement(By.name("phone"));
		WebElement Txtaddress = driver.findElement(By.name("address"));
		WebElement Txtcity = driver.findElement(By.name("city"));
		Select dropdown = new Select(driver.findElement(By.name("state")));
		WebElement Txtzip = driver.findElement(By.name("zip"));
		WebElement Txtwebsite = driver.findElement(By.name("website"));
		WebElement Radiohosting = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input"));
		WebElement Txtprojectdes = driver.findElement(By.name("comment"));
		WebElement Btnsend = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));		
		
		Txtfirstname.sendKeys("Raji");
		Txtlastname.sendKeys("Muthukumar");
		Txtemail.sendKeys("mrajimailbox@gmail.com");
		Txtphone.sendKeys("9600456313");
		Txtaddress.sendKeys("5 New Street");
		Txtcity.sendKeys("Chennai");
		dropdown.selectByIndex(2);
		Txtzip.sendKeys("0431");
		Txtwebsite.sendKeys("http://www.google.com");
		Radiohosting.click();
		Txtprojectdes.sendKeys("Project description is something describes scope and availablity of resources");
		Btnsend.click();
		
		
		
	}
}
