package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleinFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//firefox driver name geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\T Shankavi\\Documents\\Firefoxdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		//enter a search element
		//driver.findElement(By.name("q")).sendKeys("Shankavi");
		
		//insert additional enter option
		driver.findElement(By.name("q")).sendKeys("Shankavi"+Keys.ENTER);
		
		//driver.close();// or else use driver.quit() to close the open window

	}

}
