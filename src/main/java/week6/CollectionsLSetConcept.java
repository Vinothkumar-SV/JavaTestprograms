package week6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsLSetConcept {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("testLeaf");

		names.add("testLeaf");

		names.add("Arish");

		System.out.println(names);

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);

		List<WebElement> findElements = driver.findElements(By.className("a-price-whole"));

		for (WebElement price : findElements) {

			String text = price.getText();

			int priceValue = Integer.parseInt(text);

			System.out.println(priceValue);

		}

	}

}
