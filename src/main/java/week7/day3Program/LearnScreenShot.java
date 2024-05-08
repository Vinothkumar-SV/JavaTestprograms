package week7.day3Program;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("./Snaps/amazon.png");
		
		FileUtils.copyFile(source, dst);
		
		
		
		WebElement fresh = driver.findElement(By.xpath("//span[text()='Fresh']"));
		
		

		File source1 = fresh.getScreenshotAs(OutputType.FILE);
		
		File dst1 = new File("./Snaps/fresh.png");
		
		FileUtils.copyFile(source1, dst1);
		

	}
}
