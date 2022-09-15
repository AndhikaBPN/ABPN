package latihan.testrestassured.oldresearch;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderOld {
	XSSFWorkbook wBook ;
	XSSFSheet sheet ;	
	
	public ExcelReaderOld(String excelPath, String sheetName) {
		try {
			wBook = new XSSFWorkbook(excelPath);
			sheet = wBook.getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(""+e.getMessage());
			System.out.println(""+e.getCause());
		}
		
	}

//	public static void main(String[] args) {
//		getRowCount();
//		getCellData();
//	}
//	
//	public static void getCellData()
//	{
//		String pathFile = "./Data/DataDriven.xlsx";
//		try {
//			XSSFWorkbook wBook = new XSSFWorkbook(pathFile);
//			XSSFSheet sheet = wBook.getSheet("Sheet1");
//			
//			String value = sheet.getRow(1).getCell(0).getStringCellValue();
//			System.out.println(value);
//			
//		} catch (IOException e) {
//				System.out.println(""+e.getMessage());
//				System.out.println(""+e.getCause());
//		}
//	}
//	public static void getRowCount()
//	{
//		String pathFile = "./Data/DataDriven.xlsx";
//		try {
//			XSSFWorkbook wBook = new XSSFWorkbook(pathFile);
//			XSSFSheet sheet = wBook.getSheet("Sheet1");
//			
//			int rowCount = sheet.getPhysicalNumberOfRows();
//			System.out.println(rowCount);
//			
//		} catch (IOException e) {
//				System.out.println(""+e.getMessage());
//				System.out.println(""+e.getCause());
//		}
//	}
}