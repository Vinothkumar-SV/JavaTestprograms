package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://leafground.com/drag.xhtml");

		WebElement drag = driver.findElement(By.xpath("//div[@id='form:conpnl']"));

		Actions builder = new Actions(driver);

		builder.dragAndDropBy(drag, 102, 0).perform();

		WebElement drag1 = driver.findElement(By.xpath("//div[@id='form:drag']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='form:drop']"));

		builder.dragAndDrop(drag1, drop).perform();

		builder.contextClick().perform();
		
		driver.navigate().to("https://leafground.com/menu.xhtml");
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Customers']"));
		
		
		WebElement profile = driver.findElement(By.xpath("//a[text()='Profile']"));
		
		builder.scrollToElement(profile).perform();
		
		
		builder.doubleClick(findElement).perform();
		
	}

}
