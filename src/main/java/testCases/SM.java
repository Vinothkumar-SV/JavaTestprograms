package testCases;

import org.testng.annotations.Test;

public class SM {
	@Test(invocationCount = 2, threadPoolSize = 2  , invocationTimeOut = 3000)
	public void run() {
		System.out.println("I Run Twice within 3 seconds");

	}

}
