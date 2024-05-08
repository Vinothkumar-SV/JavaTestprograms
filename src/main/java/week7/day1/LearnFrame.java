package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/frame.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// driver.switchTo().frame(0);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		driver.switchTo().defaultContent();

		// count frame

		// driver.switchTo().frame(1);

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));

		driver.switchTo().frame(frame2);

		String text = driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();

		System.out.println(text);

		driver.switchTo().defaultContent();

		WebElement frame3a = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));

		driver.switchTo().frame(frame3a);
		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));

		WebElement frame3b = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));

		driver.switchTo().frame(frame3b);

		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		driver.switchTo().parentFrame();

		click.click();

	}

}
