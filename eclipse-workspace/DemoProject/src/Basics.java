import Files.addPlace;
import Files.reuableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(addPlace.addPlaceBody())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		

		System.out.println(response);
		
		JsonPath js= new JsonPath(response);
		
		String place_id = js.getString("place_id");
	
		System.out.println(place_id);
		
		// Update Place
		
		String newAddress ="Summer walk, Africa";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+place_id+"\",\r\n" + 
				"\"address\":\""+ newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").when().put("maps/api/place/update/json").then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated")).extract()
		.response().toString();
		
		//getPlace
		
		String getPlaceRespone = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = reuableMethods.rawToJson(getPlaceRespone);
		
		//JsonPath js1= new JsonPath(getPlaceRespone);
		
		String updatedAddress = js1.getString("address");
		
		System.out.println(updatedAddress);
		
		Assert.assertEquals(updatedAddress, newAddress);
		
				
	}

}
