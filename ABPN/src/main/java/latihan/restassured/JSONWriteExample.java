package latihan.restassured;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//import restassured.ModelList;
//import restassured.ModelSupport;

public class JSONWriteExample {

	public static void main(String[] args) throws FileNotFoundException 
    {
        // creating JSONObject
//		ArrayList<ModelList> aL = new ArrayList<>();
//		ArrayList<ModelSupport> aLMS = new ArrayList<>();
//		ModelSupport ms = new ModelSupport();
		
//		HashMap<String,Object> hMap = new HashMap<>();
//		hMap.put("page", 1);
//		hMap.put("per page","6");
//		hMap.put("total","12");
//		hMap.put("total page",2);
//		hMap.put("data",aL);
//		hMap.put("support", new ModelSupport());
		
        JSONObject jo = new JSONObject();
          
        // putting data to JSONObject
        jo.put("firstName", "John");
        jo.put("lastName", "Smith");
        jo.put("age", 25);
          
        // for address data, first create LinkedHashMap
        Map m = new LinkedHashMap(4);
        m.put("streetAddress", "21 2nd Street");
        m.put("city", "New York");
        m.put("state", "NY");
        m.put("postalCode", 10021);
          
        // putting address to JSONObject
        jo.put("address", m);
          
        // for phone numbers, first create JSONArray 
        JSONArray ja = new JSONArray();
          
        m = new LinkedHashMap(2);
        m.put("type", "home");
        m.put("number", "212 555-1234");
          
        // adding map to list
        ja.add(m);
          
        m = new LinkedHashMap(2);
        m.put("type", "fax");
        m.put("number", "212 555-1234");
          
        // adding map to list
        ja.add(m);
          
        // putting phoneNumbers to JSONObject
        jo.put("phoneNumbers", ja);
          
        // writing JSON to file:"JSONExample.json" in cwd
        PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(jo.toJSONString());
          
        pw.flush();
        pw.close();
    }
}