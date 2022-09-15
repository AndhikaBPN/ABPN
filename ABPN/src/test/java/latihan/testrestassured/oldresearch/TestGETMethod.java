package latihan.testrestassured.oldresearch;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGETMethod {
	/*
	 * 
	 * token movieDB = 0c80f7f6162efaea9b974d6d505abbcb
	 * themoviedb.org
	 */
	String endpoint = "https://reqres.in/api/user?page=1";
	
	
	@Test(priority = 1)
	public void testFirst()
	{
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		
		assertEquals(statusCode, 200);
	}
	
	public void testObject()
	{
		ArrayList<ModelList> aL = new ArrayList<ModelList>();
		ArrayList<ModelSupport> aLMS = new ArrayList<>();
		ModelSupport ms = new ModelSupport();
		HashMap<String,Object> hMap = new HashMap<>();
		hMap.put("page", 1);
		hMap.put("per page","6");
		hMap.put("total","12");
		hMap.put("total page",2);
		hMap.put("data",aL);
		hMap.put("support", new ModelSupport());
		
		
	}
	
//	@Test(priority = 2)
//	public void testSecond() {
//		
//		given()
//		.get(endpoint)
//		.then()
//		.statusCode(200)
//		.body("data.id[0]", equalTo(1));
//	}
}