package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleAutomation {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//30  0.01
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");//30

		driver.findElement(By.className("decorativeSubmit")).click();//30

		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));

		Select obj = new Select(source);
		obj.selectByIndex(0);// if we need to select the values of random values
		obj.selectByVisibleText("Conference");
		obj.selectByValue("LEAD_DIRECTMAIL");

	}

}
