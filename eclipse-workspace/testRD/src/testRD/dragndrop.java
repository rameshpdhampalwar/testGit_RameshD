package testRD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement image = driver.findElement(By.id("image"));
		
		WebElement box= driver.findElement(By.id("box"));
		
		Actions dragdrop = new Actions(driver);
		Thread.sleep(2000);
		//comment
		dragdrop.dragAndDrop(image, box).build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}