package Lesson29_FileReader;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadYouTubeTutoral {
	public static void main(String[] args) {
		try(Workbook wb=WorkbookFactory.create(new File("C:\\Users\\Max\\Desktop\\ExcelFileForRead.xlsx"))){
	Sheet sheet= wb.getSheetAt(0);
				int rowStart=sheet.getFirstRowNum();
				int rowEnd=sheet.getLastRowNum();
				for(int i=rowStart;i<rowEnd;i++) {
					Row row=sheet.getRow(i);
					for (int j=row.getFirstCellNum();j<row.getLastCellNum();j++) {
						Cell cell=row.getCell(j);
						System.out.println(cell.getStringCellValue());
					}
					System.out.println("----------------------");
				}
				


		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
