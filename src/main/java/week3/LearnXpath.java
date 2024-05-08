package week3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
	
	
	public static String model(String mod) {
		
		
		return mod;
	}
	
	
	public static void main(String[] args) {
		
		
		LearnXpath.model("TATA");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/alert.xhtml");
		
		
		
		
		
	}

}
