package package1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelFunc {
	
	static String cellvalue1,cellvalue2,cellvalue3;

	public ExcelFunc(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void readExcel(int rowcounter) throws IOException
    
    {
        XSSFWorkbook srcBook = new XSSFWorkbook("D:/eclipse ws-1/ProjectMDRIM/src/package1/TestData.xlsx");     
        XSSFSheet sourceSheet = srcBook.getSheetAt(0);
        int rownum=rowcounter;
        XSSFRow sourceRow = sourceSheet.getRow(rownum);
        XSSFCell cell1=sourceRow.getCell(0);
        XSSFCell cell2=sourceRow.getCell(1);
        XSSFCell cell3=sourceRow.getCell(2);
        cellvalue1 = cell1.toString();
        cellvalue2 = cell2.toString();
        cellvalue3 = cell3.toString();
       
    }
}
