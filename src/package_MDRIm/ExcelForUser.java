package package_MDRIm;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelForUser {
	
	static String cellvalue1,cellvalue2;

	public ExcelForUser(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void MethodLoginInfo(int rowcounter) throws IOException
    
    {
        XSSFWorkbook TDBLogin = new XSSFWorkbook("D:/eclipse ws-1/ProjectMDRIM/src/package_MDRIm/TestData.xlsx");     
        XSSFSheet TDSLogin = TDBLogin.getSheetAt(0);
        int rownum=rowcounter;
        XSSFRow TDRowLogin = TDSLogin.getRow(rownum);
        XSSFCell cell1=TDRowLogin.getCell(0);
        XSSFCell cell2=TDRowLogin.getCell(1);
        
        cellvalue1 = cell1.toString();
        cellvalue2 = cell2.toString();
        
       
    }

}
