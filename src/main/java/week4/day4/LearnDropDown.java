package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	
	public static void main(String[] args) {
		
		
		
		ChromeDriver driver = new ChromeDriver();
		// To Maximize the Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// TO Pass the Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to Find the location in the dom by using id
		// 30
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		// to Find the location in the dom by using name

		// 30
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

		// to Find the location in the dom by using ClassName

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Handling Drop Down
		
		Select  sourceDropDown = new Select(Source);
		// 1. selectByIndex()
		
		sourceDropDown.selectByIndex(1);
		
		
		sourceDropDown.selectByVisibleText("Direct Mail");
		
		
		sourceDropDown.selectByValue("LEAD_EMPLOYEE");
		
		
		
		
		
	}	
	
	
	
	
	
}
