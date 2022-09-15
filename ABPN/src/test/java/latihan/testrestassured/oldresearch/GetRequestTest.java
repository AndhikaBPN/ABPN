package latihan.testrestassured.oldresearch;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetRequestTest {
	
	@Test
	public void testFirst()
	{
		given().
//		header("Content-Type","application/json").
//		param("parameter_name","parameter_value").
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data[0]",equalTo(8)).
		body("data.first_name",hasItems("Michael","Lindsay")).
		log().all();
	}
}