package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement brand = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(brand).perform();
		
		
		
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		builder.click(findElement).perform();
		
		
		
		WebElement login = driver.findElement(By.xpath("//img[@class='-dOa_b L_FVxe']"));
		
		
		builder.moveToElement(login).perform();
		
		
		
		

	}
}


