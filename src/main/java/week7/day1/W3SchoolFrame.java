package week7.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W3SchoolFrame {
	
	@Test
	public  void learnFrame() throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	//	WebElement findElement = driver.findElement(By.id("iframeResult"));
		
		//WebElement findElement = driver.findElement(By.name("iframeResult"));
		
		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame("iframeResult");
		
		
		driver.switchTo().frame(findElement);
		
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		
	
		alert.sendKeys("Vinoth");
		Thread.sleep(5000);
		alert.accept();
		
		
		
		
		
		
	}

}
