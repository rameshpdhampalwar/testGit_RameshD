package testRD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "www.google.com";
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		
		name.click();
		
		//driver.wait(100);
		
		name.sendKeys("Ramesh D");
		
		WebElement submitButton = driver.findElement(By.id("button"));
		
		submitButton.click();
		
	    driver.quit();
	}

}
