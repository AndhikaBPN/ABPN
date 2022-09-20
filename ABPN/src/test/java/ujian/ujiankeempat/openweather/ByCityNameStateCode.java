package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.*;
import io.restassured.http.ContentType;
import latihan.testrestassured.utils.ExcelReader;
import org.apache.poi.ss.usermodel.Row;
import java.util.Iterator;


public class ByCityNameStateCode {
	JSONObject jObj;
	
	private ExcelReader exReader;
	private Object [][] dDriven;
	private int intColumn;
	private int intRows;
	private int count=1;
	
	@BeforeTest
	public void befTest() {
		jObj = new JSONObject();
		baseURI = "https://api.openweathermap.org";
		String excelPath = ".\\data\\ABPN_UJIAN_KEEMPAT.xlsx";
		String sheetName = "ByCityNameStateCode";
		exReader = new ExcelReader(excelPath, sheetName);
		intColumn = exReader.getColCount();
		intRows = exReader.getRowCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDriven(){
		dDriven = new Object[intRows][intColumn];
		Iterator<Row> r = exReader.getIter();
		int a=0;
		int b=1;
		while(r.hasNext()) {
			Row rows = r.next();
			System.out.println();
			System.out.println("Data ke- " + b);
			for(int i=0; i<intColumn; i++) {
				dDriven[a][i] = exReader.getCellData(a, i);
				if(i==0) {
					System.out.println("city: " + dDriven[a][i]);
				}else if(i==1) {
					System.out.println("state: " + dDriven[a][i]);
				}else {
					System.out.println("country: " + dDriven[a][i]);
				}
				
			}
			System.out.println("=========================");
			a++;
			b++;
		}
		return dDriven;
	}
	
	@Test(priority = 0, dataProvider = "DataProviderFirst")
	public void testGet(String cityName, String state, String country) {
		System.out.println("=======================================");
		System.out.println("==========Log Data ke - " + (this.count++) + "==============");
		System.out.println("=======================================");
		given().
			param("q", cityName + "," + state + "," + country).and().
			param("appid", "f89a2a9e4cc7c67dc8ccc4d38f6bcbfe").
		when().
			get("/data/2.5/weather").
		then().
			statusCode(200).log().all();
	}
}
