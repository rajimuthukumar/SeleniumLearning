package package_MDRIm;

import java.io.IOException;

import org.testng.annotations.Test;
import package_MDRIm.ExcelForUser;
import package_MDRIm.BaseForUser;
import package_MDRIm.Page1_Login;

public class TestingMDRIM {
	
	@Test
	public void testMethod1() throws IOException, InterruptedException
	{
	    BaseForUser base = new BaseForUser();
	    Page1_Login loginObj= new Page1_Login (base.driver);
	    ExcelForUser excelObj=new ExcelForUser(base.driver);
	    Page2_ProjectType createObj=new Page2_ProjectType(base.driver);
	    
	    excelObj.MethodLoginInfo(1);
	    loginObj.MethodLogin();
	    createObj.MethodHome_ProjectType();
	    
	    

	    
	}

}
