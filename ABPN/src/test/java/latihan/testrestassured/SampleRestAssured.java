package latihan.testrestassured;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
//import netscape.javascript.JSObject;

import static io.restassured.RestAssured.*;	

public class SampleRestAssured {
	JSONObject jObj;
	
	@BeforeTest
	public void befTest() {
		jObj = new JSONObject();
		baseURI = "http://localhost:3000";
	}
	
//	@Test(priority = 0)
//	public void testPost() {
//		
//		jObj.put("first_name", "Mafa");
//		jObj.put("last_name", "Syafa");
//		jObj.put("subject_id", 1);
//		
//		given().
//				header("Content-Type", "application/json").
//				accept(ContentType.JSON).
//				contentType(ContentType.JSON).
//				body(jObj.toJSONString()).
//			when().
//				post("/users").
//			then().
//				statusCode(201).
//				log().
//				all();
//	}
	
	@Test(priority = 0)
	public void testGet() {
		given().
			param("first_name", "Mafa").
			and().param("last_name", "Syafa").
			and().param("subject_id", 1).
				get("/users").
			then().
				statusCode(200).
				log().
				all();
	}
	
//	@Test(priority = 0)
//	public void testPatchs() {
//		
//		jObj.put("last_name", "Bagaskara");
//		
//		given().
//				header("Content-Type", "application/json").
//				accept(ContentType.JSON).
//				contentType(ContentType.JSON).
//				body(jObj.toJSONString()).
//			when().
//				patch("/users/3").
//			then().
//				statusCode(200);
//	}
	
//	@Test(priority = 0)
//	public void testPut() {
//		
//		jObj.put("last_name", "Bagaskara");
//		jObj.put("first_name", "Andhika");
//		jObj.put("subject_id", 1);
//		
//		given().
//				header("Content-Type", "application/json").
//				accept(ContentType.JSON).
//				contentType(ContentType.JSON).
//				body(jObj.toJSONString()).
//			when().
//				patch("/users/3").
//			then().
//				statusCode(200);
//	}
	
//	@Test(priority = 0)
//	public void testDelete() {
//		when().
//		delete("/users/2").
//		then().
//		statusCode(200).
//		log().
//		all();
//	}
}
