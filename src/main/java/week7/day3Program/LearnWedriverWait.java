package week7.day3Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWedriverWait {

	public static void main(String[] args) throws InterruptedException {

		// To Launch the driver
		ChromeDriver driver = new ChromeDriver();

		// To Maximize the Window
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		// TO Pass the Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to Find the location in the dom by using id
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		// to Find the location in the dom by using name
		String text = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']")).getText();
		System.out.println(text);
		// Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

		// to Find the location in the dom by using ClassName

		// String currentUrl1 = driver.getCurrentUrl();

		// System.out.println(currentUrl1);

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		wait.until(ExpectedConditions.invisibilityOf(submit));
		submit.click();
		
		
// To Get the currentUrl
		

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);
// to verify the Url by using if condition

		if (currentUrl.contains("login")) {
			System.out.println("Page is loaded Sucessfully");
		}


		driver.findElement(By.xpath("//a[contains(text(),'CRM/S')]")).click();

		String title = driver.getTitle();

		System.out.println(title);

		if (title.contains("opentaps")) {
			driver.navigate().back();
			System.out.println("The Lead Page is Loaded Sucessfully ");

		}

	
		
		
		
		

		

		
	}

}
