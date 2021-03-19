package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_ver88\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://leafground.com");
		
		Driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		
		//Click button to travel home page
		Driver.findElement(By.id("home")).click();
		
		//Thread.sleep(3000);
		
		Driver.findElement(By.linkText("Button")).click();
		
		//Thread.sleep(3000);
		
		//Find position of button (x,y)
		WebElement Position = Driver.findElement(By.id("position"));
		
		Point XYPosition = Position.getLocation();  // Point build in class for selenium to find the x,y points
		int getX = XYPosition.getX();
		int getY = XYPosition.getY();
		
		System.out.println("The Get Position Button X position is "+ getX + " and " + "Y position is "+ getY);
		
		//Find button color lightgreen
		
		WebElement ButtonColor = Driver.findElement(By.id("color"));
		String BgColor = ButtonColor.getCssValue("background-color");
		System.out.println("Button Color is : " + BgColor);
		
		
		
		//Find the height and width
		
		WebElement ButtonSize = Driver.findElement(By.id("size"));
		int hight = ButtonSize.getSize().getHeight();
		int width = ButtonSize.getSize().getWidth();
		
		System.out.println("Button hight is " + hight + " width is " + width);

	}

}
