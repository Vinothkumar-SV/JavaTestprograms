package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribute {
	@Test(priority = 1)
	public void create() {
System.out.println("To Create the Lead");
	}

	@Test(priority = -1)
	public void Edit() {
		System.out.println("To Edit the Lead");
	}

	 @Ignore
	@Test
	public void delete() {
		 System.out.println("To Edit the Lead");

	}

	@Test(invocationCount = 5, threadPoolSize = 4)
	public void create1() {
	System.out.println("i am going run ");
		
		throw new RuntimeException();
				
	}

	@Test(dependsOnMethods = { "create1" },alwaysRun = true)
	public void delete1() {
		System.out.println("Delete1");

	}

}
