import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import Files.reuableMethods;
//import Files.ReusableMethods;
//import files.payLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class StaticJson {
	
	@Test
	public void addBook() throws IOException {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String addBookResponse = given().log().all().header("Content-Type","application/json").
		body(GenerateStringFromResource("C:\\Users\\rames\\Desktop\\SampleJsonFile.json"))
		.when()
		.post("/Library/Addbook.php")
		.then()
		.assertThat().statusCode(200).extract().response().asString();
		
		
		JsonPath js= reuableMethods.rawToJson(addBookResponse);
		
		String bookID = js.get("ID");
		
		System.out.println("Book Id added is -"+bookID);
		
		}
	
	public static String GenerateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
	
}



