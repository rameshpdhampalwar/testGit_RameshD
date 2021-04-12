package Files;

public class payLoad {
	
	public static String addBook(String ISBN, String Aisle ) {
		String Payload = "{\"name\":\"Learn Appium Automation with Java\",\"isbn\":\""+ISBN+"\",\"aisle\":\""+Aisle+"\",\"author\":\"John foe\"}";
		
		return Payload;
		}

	}
