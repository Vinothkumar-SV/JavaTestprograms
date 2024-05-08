package week7.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles", Keys.ENTER);

		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windows = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windows.get(1));

		String title = driver.getTitle();

		if (title.contains(title)) {

			System.out.println("Verified");
		}

		driver.close();

		driver.switchTo().window(windows.get(0));
		driver.close();

	}

}
