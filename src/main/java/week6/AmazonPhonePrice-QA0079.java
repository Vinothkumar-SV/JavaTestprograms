package week6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AmazonPhonePrice {

	
	@Test
	public  void Amazon() throws InterruptedException {
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("122.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "vinothkumarsv9");
		ltOptions.put("accessKey", "PC4maHjYGvBLZzGqgBgSBhsWdZbrqFB8AAikSES2crOBWUQjNn");
		ltOptions.put("project", "Untitled");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-testNG");
		browserOptions.setCapability("LT:Options", ltOptions);
		ChromeDriver driver = new ChromeDriver(browserOptions);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
//30

		List<Integer> phonePrice = new ArrayList<Integer>();

		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//30
//		for (WebElement element : priceElements) {
//			String price = element.getText().replaceAll("[^0-9]", "");// Remove non-numeric characters
//
//			int priceValue = Integer.parseInt(price);
//
//			phonePrice.add(priceValue);
//		}

		
		for (int i = 0; i < priceElements.size(); i++) {
			String price = priceElements.get(i).getText().replaceAll("[^0-9]", "");
			
			int priceValue = Integer.parseInt(price);
			phonePrice.add(priceValue);
			
			
		}
		Collections.sort(phonePrice);
		System.out.println("Sorted Order Phone Prices "+phonePrice);
		

		driver.quit();

		// 20,366 30,200 100000

	}
}
