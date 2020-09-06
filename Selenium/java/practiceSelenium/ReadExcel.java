package practiceSelenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		
		
		
	// Open/Enter into workbook	
	 XSSFWorkbook  wb  = new XSSFWorkbook("./data/ReadData.xlsx");
	
	//Get Sheet
	XSSFSheet sheet = wb.getSheet("Sheet2");
		
	//Get row
	XSSFRow row = sheet.getRow(1);
	
	//get column
	XSSFCell cell = row.getCell(1);
	
	//Actions --Read value
	
	String value =cell.getStringCellValue();
	System.out.println(value);
		
		
		
		
		

	}

	public String[][] readExcel() {
		// TODO Auto-generated method stub
		return null;
	}

}
