package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qa_reloology {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://qa.reloology.com/");
		driver.findElement(By.id("user_email")).sendKeys("master@reloology.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Password@12345");
		driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		driver.findElement(By.xpath("//span[text()='Create Service Order']")).click();
	}

}
