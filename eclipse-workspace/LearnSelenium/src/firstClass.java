import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//rames//Downloads//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.quit();

	}

}
