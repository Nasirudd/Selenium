package practiceSelenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelForLoop {

	public static void main(String[] args) throws IOException {

		
		// Open/Enter into workbook	
		// XSSFWorkbook  wb  = new XSSFWorkbook("./data/ReadData.xlsx");
		 
		// Get sheet
		 
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		 //Row count
				 		
		 int rowCount = sheet.getLastRowNum();
		 System.out.println(rowCount);
		 		 		 
		//column count 
		    int columnCount = sheet.getRow(0).getLastCellNum();
		   System.out.println(columnCount); 
		   
		 //open for loop for rows }
		   		   		   
		    //open forloop for column
		   		  		   		   		
		 for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
			 XSSFCell cell;	cell = row.getCell(j);
			 
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			
			
			
			
			
			
		}
		 
		   
		 
		 
		 
		 
		 
		    
	}	    
		 
		 
}	 
		 
		 
		 
		 
		 
		 

		 
		 
		 
		 
	
		

	


