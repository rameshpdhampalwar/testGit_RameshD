import org.testng.annotations.Test;
import Files.complexJson;
import io.restassured.path.json.JsonPath;

public class sumValidationOne {
	
	@Test
	public void sumVal(){
		
	int sum=0;
		
	JsonPath js = new JsonPath(complexJson.complexJsonPayload());
	
	int noOfCourses =js.getInt("courses.size()");
	
	for (int i=0; i<noOfCourses;i++) {
		
		int price = js.getInt("courses["+i+"].price");
		int copies = js.getInt("courses["+i+"].copies");
		int amount = price * copies;
		System.out.println(amount);
		sum = sum + amount;
			
	}
	
	System.out.println(sum);
	}

}
