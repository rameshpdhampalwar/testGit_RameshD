package testRD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAutoComplete {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "www.google.com";
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		driver.manage().window().maximize();
		
		WebElement autoComplete = driver.findElement(By.id("autocomplete"));
		
		autoComplete.click();
		
		//driver.wait(100);
		
		autoComplete.sendKeys("1555 Park Blvd, Palo Alto");
		
		Thread.sleep(2000);
		
		WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		
		autocompleteResult.click();
		
	    driver.quit();

	}

}
