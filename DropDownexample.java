package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownexample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_ver88\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://leafground.com");
		//http://leafground.com/pages/Dropdown.html
		
		Driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5")).click();
		
		//1) Select training program using index
		WebElement dropdown1 = Driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(3);
		//Thread.sleep(3000); //using thread if needed
	
		//2) Select training program using VisibleText
		WebElement dropdown2 = Driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Selenium");
		//Thread.sleep(3000);
		
		//3) Select training program using Value
		WebElement dropdown3 = Driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("2");
			
		//4) Get the number of drop down option
		WebElement dropdown =  Driver.findElement(By.className("dropdown"));
		Select count = new Select(dropdown);
        java.util.List<WebElement> listOfOptions = count.getOptions();	
		Object size = listOfOptions.size();
		System.out.println("Number of elements: " + size); // No of elements = 5
		
		//5) You can also use send keys to select
		WebElement example = Driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		example.sendKeys("Loadrunner");
		
		//6) Multi Select
		WebElement multi = Driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select MultiSelect = new Select(multi);				
		MultiSelect.selectByIndex(1);
		MultiSelect.selectByIndex(2);
		
	}

}