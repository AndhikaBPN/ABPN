package latihan.testrestassured;

import static io.restassured.RestAssured.*;	
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;

public class DaraDriven {
	JSONObject jObj;
	
	@BeforeTest
	public void befTest() {
		jObj = new JSONObject();
	}
}
