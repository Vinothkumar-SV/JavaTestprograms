package week6.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertConcept {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://leafground.com/alert.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Show']")).click();

		// Simple Alert: Displays an information message with an OK button.

		
//		
//	Alert simpleAlert = driver.switchTo().alert();
//		
//	
//	String simpleText = simpleAlert.getText();
//	
//	
//	simpleAlert.accept();
//	
//	
//	if (simpleText.contains("simple")) {
//		
//		System.out.println("This  is simple Alert");
//		
//	}
//	
//	
//	
//		
//		
//		
//		
//		
//		
//		// getText(): Retrieves the text displayed on the alert box.
//		// accept(): Clicks the 'OK' button on the alert.
//		
//		// Confirmation Alert: Presents a message with OK and Cancel buttons to accept
//		// or reject an option.
//
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
//		System.out.println(simpleAlert.getText());
//		simpleAlert.dismiss();
//		
//
//		// Prompt Alert: Offers an input field along with OK and Cancel buttons,
//		// allowing user input.
//		
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following::button")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		promptAlert.sendKeys("TestLeaf");
		System.out.println(promptAlert.getText());
		promptAlert.accept();
		
		//System.out.println(driver.findElement(By.id("confirm_result")).getText());
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(text2);
		
		

		// Non-Modal Alert (Sweet Alert): These are more modern, customizable alerts
		// that are part of the HTML DOM and can be inspected.

		
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']//following::button")).click();
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		// dismiss(): Clicks the 'Cancel' button, used for dismissing the alert.

		// sendKeys(String keysToSend): Sends a string input to the alert, used in
		// prompt alerts.
		
		//sel feb Ganga 

	}
}
