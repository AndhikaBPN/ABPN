package latihan.testrestassured.oldresearch;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCRUD {
	/*
	 * https://reqres.in/
	 */
	
	@Test(priority = 1)
	public void testFirstPost() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "BOIM");
		request.put("job", "SQA Engineer");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users") //POST
		.then()
		.statusCode(201)
		.log().all();
	}
	
	@Test(priority = 2)
	public void testSecondPut() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Manda");
		request.put("job", "SQA Engineer");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("https://reqres.in/api/users/2") //PUT
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority = 3)
	public void testThirdPatch() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Manda");
		request.put("job", "SQA Engineer");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://reqres.in/api/users/2") //PATCH
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority = 4)
	public void testFourthDelete() {
		
		when()
		.delete("https://reqres.in/api/users/2") //DELETE
		.then()
		.statusCode(204)
		.log().all();
	}
}