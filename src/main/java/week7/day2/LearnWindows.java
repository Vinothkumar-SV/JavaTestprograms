package week7.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		/*
		 * String windowHandle = driver.getWindowHandle();
		 * 
		 * System.out.println(windowHandle);
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles(); List<String> names =
		 * new ArrayList<String>(windowHandles);
		 * 
		 * driver.switchTo().window(names.get(2));
		 * 
		 * driver.close();
		 * 
		 * driver.switchTo().window(names.get(1));
		 * 
		 * driver.close();
		 * 
		 * driver.switchTo().window(names.get(0));
		 * 
		 * driver.close();
		 * 
		 */

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://leafground.com/window.xhtml");

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windows = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windows.get(1));

		String text = driver.findElement(By.xpath("//div[@class='team-box']")).getText();

		System.out.println(text);

		driver.close();

		driver.switchTo().window(windows.get(0));

		driver.close();

	}
}
