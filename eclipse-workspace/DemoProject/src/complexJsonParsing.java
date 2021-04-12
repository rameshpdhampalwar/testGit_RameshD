import io.restassured.path.json.JsonPath;
import Files.complexJson;


public class complexJsonParsing {
	
	public static void main(String []args) {
		
		JsonPath js = new JsonPath(complexJson.complexJsonPayload());
		
		int countOfCourses = js.getInt("courses.size()");
		
		System.out.println(countOfCourses);
		
		int priceofSecondCourse = js.getInt("courses[1].price");
		
		System.out.println(priceofSecondCourse);
		
		//SumValidation.sumOfCourses();
		
	}
	

}
