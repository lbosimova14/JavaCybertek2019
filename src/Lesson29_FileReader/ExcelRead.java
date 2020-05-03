package Lesson29_FileReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	
	 public static void main(String[] args) throws Exception {
	        
	        
		 
		        
		        String filePath ="C:\\Users\\Max\\Desktop\\ExcelFileForRead.xlsx";  // path of excel file
		        
		        String sheetname = "Sheet1";  // Name of the sheet
		        
		        FileInputStream file = new FileInputStream(filePath); // reads a file
		        
		        Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
		        //XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
		        
		        
		        Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
		        // XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
		        
		        
		        Cell cell = sheet.getRow(1).getCell(1); // retrives specific cell from the speardsheet
		        
		        
		        String cellData = cell.getStringCellValue();  // converts the cell' value to STring data type
		        // cell.setCellValue("Marufjon"); this for writing, this set method only difference from read excel file
		        System.out.println(cellData);
		            
		        
		    }
	        
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//public static void main(String[] args) throws Exception {
//	String filePath="C:\\Users\\Max\\Desktop\\ExcelFileForRead.xlsx";
//	String sheetname="Sheet1"; //name of the sheet
//	FileInputStream file = new FileInputStream(filePath);//reads a file
//	Workbook excelFile=WorkbookFactory.create(file);//Workbook(Interface) is reads excel file designed for Excelfile
//	
//	//implemented XSSFWorkbook does same thing as Workbook
//	Sheet sheet= excelFile.getSheet(sheetname);//Sheet(Interface)gets the specific spread sheet from excel file
//	//XSSFSheet sheet2=excelFile.getSheet(sheetname);XSSFSheet same thing as Sheet,you can use it instead
//	//each data is specific cell in order retrive the data need call cell
//	Cell cell= sheet.getRow(1).getCell(1);//retrieve specific cell from spreadsheet(starts from zero)
//	//String cellData=cell;//not same datatype, on is String other is object that is why error giving
//	String cellData=cell.getStringCellValue();
//	System.out.println(cellData);//SDET
//	
//}

