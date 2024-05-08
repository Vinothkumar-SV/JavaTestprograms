package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {

		// initialize Chrome Driver

		ChromeDriver driver = new ChromeDriver();

		// load the url

		driver.get("https://www.leafground.com/select.xhtml");

		// to Maximize the window

		driver.manage().window().maximize();


		driver.findElement(By.xpath("//h5[text()='Choose your preferred country.']//following::label")).click();
Thread.sleep(10000);
		WebElement country = driver.findElement(By.xpath("//li[text()='Brazil']"));
		
		
		String text = country.getText();
		
		if (text.contains("Brazi")) {
			
			System.out.println(text+"    Country has selected as Brazil ");
			
		}
		
		country.click();
		
		
		
		
		
		

	}
}
