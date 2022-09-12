package latihan.testrestassured.utils;

public class ExcelTest {

	public static void main(String[] args) {
		String excelPath = "C:\\Users/NEXSOFT/Documents/JAVA/Bootcamp/JavaProject/ABPN/data/TestDataDriven.xlsx";
		String sheetName = "Sheet1";
		ExcelReader excelReader = new ExcelReader(excelPath, sheetName);

		excelReader.getIter();
	}
}