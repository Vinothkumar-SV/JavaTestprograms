package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnInvocation {
 
	

	//@Test(invocationCount = 2, timeOut =  50)
	
	@Test(invocationCount = 5,invocationTimeOut = 30,threadPoolSize = 2   )
	
	public void run() {
		System.out.println("I Run Twice within 3 seconds");
		
		ChromeDriver driver = new ChromeDriver();

	}

	/*
	 * @Test public void walk() {
	 * 
	 * }
	 * 
	 * @Test public void sleep() {
	 * 
	 * }
	 * 
	 */
	
	
}
