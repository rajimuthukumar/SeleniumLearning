package package1;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestForm {
	
	@Test
	public void testMethod1() throws IOException
	{
	    Base base = new Base();
	    Page funObj = new Page (base.driver);
	    funObj.func1(); 
	    ExcelFunc exeObj1 = new ExcelFunc (base.driver);
	    
	    Page2_Form exeObj = new Page2_Form (base.driver);
	    exeObj1.readExcel(1);
	    exeObj.func2();
	    
	}

}
