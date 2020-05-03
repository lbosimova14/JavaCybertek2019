package Lesson29_FileReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
public static void main(String[] args) throws Exception {
	String filePath ="C:\\Users\\Max\\Desktop\\ExcelFileForRead.xlsx";  // path of excel file
    
    String sheetname = "Sheet1";  // Name of the sheet
    
    FileInputStream file = new FileInputStream(filePath); // reads a file
    
    Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
    //XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
  //implemented XSSFWorkbook does same thing as Workbook
    
    
    Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
    // XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
    
  //each data is specific cell in order retrive the data need call cell
    Cell cell = sheet.getRow(1).getCell(0); // retrives specific cell from the speardsheet
    
    cell.setCellValue("Marufjon"); // it reads that cell value as "Marufjon". BUT it DOES Not change the original value in excel file
    
    String cellData = cell.toString(); 
    System.out.println(cellData);
    
    
    
}

	
}
/*
 * 
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelWrite {
    public static void main(String[] args) throws Exception {
        
        
        String filePath ="/Users/cybertekstudios/Desktop/TestData.xlsx";  // path of excel file
        
        String sheetname = "Sheet1";  // Name of the sheet
        
        FileInputStream file = new FileInputStream(filePath); // reads a file
        
        Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
        //XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
        
        
        Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
        // XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
        
        
        Cell cell = sheet.getRow(1).getCell(0); // retrives specific cell from the speardsheet
        
        cell.setCellValue("Marufjon"); // it reads that cell value as "Marufjon". BUT it DOES Not change the original value in excel file
        
        String cellData = cell.toString();
        System.out.println(cellData);
        
        
        
    }*/
 

